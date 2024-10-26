package absolutelyaya.formidulus.gui.screen;

import absolutelyaya.formidulus.Formidulus;
import absolutelyaya.formidulus.block.BossSpawnerBlockEntity;
import absolutelyaya.formidulus.datagen.Lang;
import absolutelyaya.formidulus.entities.boss.BossType;
import absolutelyaya.formidulus.network.ModifyBossSpawnerPayload;
import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.AlwaysSelectedEntryListWidget;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class BossSpawnerScreen extends Screen implements Lang
{
	BossTypeList typeList;
	NumberField numberField;
	
	final BlockPos pos;
	int respawnDelay;
	BossType bossType;
	
	public BossSpawnerScreen(BossSpawnerBlockEntity spawner)
	{
		super(Text.translatable(SCREEN_BOSS_SPAWNER_TITLE));
		this.pos = spawner.getPos();
		respawnDelay = spawner.getRespawnDelay();
		bossType = spawner.getBossType();
	}
	
	@Override
	protected void init()
	{
		super.init();
		if(client == null)
			return;
		int y = height / 15 + 1;
		if(numberField == null)
			numberField = new NumberField(client.textRenderer, width / 2 - 100, height / 2 - 132, 200, 20, Text.of(String.valueOf(respawnDelay)));
		numberField.setPosition(width / 2 - 100, y);
		addDrawableChild(numberField);
		if(typeList == null)
			typeList = new BossTypeList(client, 200, height / 3 * 2, height / 2 - 96, 22, bossType);
		typeList.setPosition(width / 2 - 100, y = y + 37);
		typeList.setHeight(height - y - 42);
		addDrawableChild(typeList);
		addDrawableChild(ButtonWidget.builder(Text.translatable(SCREEN_BOSS_SPAWNER_CLOSE), i -> close())
								 .dimensions(width / 2 - 100, height - 32, 200, 20).build());
	}
	
	@Override
	public void render(DrawContext context, int mouseX, int mouseY, float delta)
	{
		super.render(context, mouseX, mouseY, delta);
		MatrixStack matices = context.getMatrices();
		matices.push();
		matices.translate(width / 2f - 100, Math.floor(height / 15f) - textRenderer.fontHeight, 0);
		context.drawText(textRenderer, Text.translatable(SCREEN_BOSS_SPAWNER_RESPAWN_DELAY), 0, 0, 0xffffff, true);
		matices.translate(0, 35, 0);
		context.drawText(textRenderer, Text.translatable(SCREEN_BOSS_SPAWNER_BOSS_TYPE), 0, 0, 0xffffff, true);
		matices.pop();
	}
	
	@Override
	public void close()
	{
		super.close();
		BossTypeList.Entry typeEntry = typeList.getSelectedOrNull();
		ClientPlayNetworking.send(new ModifyBossSpawnerPayload(pos, typeEntry != null ? typeEntry.value.id() : bossType.id(), numberField.getNumber()));
	}
	
	static class BossTypeList extends AlwaysSelectedEntryListWidget<BossTypeList.Entry>
	{
		public BossTypeList(MinecraftClient minecraftClient, int width, int height, int y, int itemHeight, BossType selected)
		{
			super(minecraftClient, width, height, y, itemHeight);
			for (BossType type : BossType.getAllTypes().values())
			{
				Entry e = new Entry(client, type);
				addEntry(e);
				if(type.equals(selected))
					setSelected(e);
			}
		}
		
		@Override
		public int getRowWidth()
		{
			return width;
		}
		
		static class Entry extends AlwaysSelectedEntryListWidget.Entry<BossTypeList.Entry>
		{
			final MinecraftClient client;
			final BossType value;
			final Text label;
			
			Entry(MinecraftClient client, BossType value)
			{
				this.value = value;
				this.label = Text.of(value.id());
				this.client = client;
			}
			
			@Override
			public Text getNarration()
			{
				return label;
			}
			
			@Override
			public void render(DrawContext context, int index, int y, int x, int entryWidth, int entryHeight, int mouseX, int mouseY, boolean hovered, float tickDelta)
			{
				context.enableScissor(x, y, x + entryWidth - 1, y + entryWidth - 1);
				context.drawText(client.textRenderer, label, x + 2, y + (int)(entryHeight / 2f - 4), hovered ? 0xffffff : 0x888888, true);
				context.disableScissor();
			}
		}
	}
	
	static class NumberField extends TextFieldWidget
	{
		
		public NumberField(TextRenderer textRenderer, int x, int y, int width, int height, Text text)
		{
			super(textRenderer, x, y, width, height, text);
			setText(text.getString());
			setPlaceholder(Text.translatable(SCREEN_BOSS_SPAWNER_RESPAWN_DELAY));
		}
		
		@Override
		public boolean charTyped(char chr, int modifiers)
		{
			if(Character.isDigit(chr))
				return super.charTyped(chr, modifiers);
			else
				return false;
		}
		
		public int getNumber()
		{
			if(getText().isEmpty())
				return 0;
			try
			{
				return Integer.parseInt(getText());
			}
			catch (NumberFormatException exception)
			{
				Formidulus.LOGGER.error("Failed to parse int for Boss Spawner Respawn Delay", exception);
				return 12000;
			}
		}
	}
}
