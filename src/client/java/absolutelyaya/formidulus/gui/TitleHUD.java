package absolutelyaya.formidulus.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.ColorHelper;
import net.minecraft.util.math.random.Random;

import java.util.ArrayDeque;
import java.util.Queue;

public class TitleHUD
{
	static Random rand = Random.create();
	static boolean forceDelete;
	static float delay;
	static TextObject activeTextObject, lastTextObject = new TextObject(null).color(0xffffff).typeSpeed(30f).displayDuration(5f).deleteSpeed(100f);
	static Queue<TextObject> textQueue = new ArrayDeque<>();
	static String targetText = "", curText = "";
	
	public static void render(DrawContext context, float delta)
	{
		Screen screen = MinecraftClient.getInstance().currentScreen;
		if(screen != null && screen.shouldPause())
			return;
		int width = context.getScaledWindowWidth(), height = context.getScaledWindowHeight();
		MatrixStack matrices = context.getMatrices();
		TextRenderer renderer = MinecraftClient.getInstance().textRenderer;
		
		if(activeTextObject == null && !textQueue.isEmpty())
		{
			activeTextObject = textQueue.poll().complete(lastTextObject);
			targetText = activeTextObject.text();
			delay = activeTextObject.delay();
		}
		
		if(activeTextObject == null)
			return;
		//big typer title update
		if(delay <= 0f)
		{
			int curLength = curText.length(), targetLength = targetText.length();
			if(curLength > 0 && (targetLength < curLength || forceDelete))
			{
				curText = curText.substring(0, curLength - 1);
				delay += 10f / activeTextObject.deleteSpeed();
				if(curLength - 1 == 0)
				{
					lastTextObject = activeTextObject;
					activeTextObject = null;
					return;
				}
			}
			else if(targetLength > curLength)
			{
				if(forceDelete) //if this is reached, curString has to be empty
					forceDelete = false;
				curText = targetText.substring(0, curLength + 1);
				delay += 10f / activeTextObject.typeSpeed() + (rand.nextFloat() - 0.5f) * activeTextObject.instability();
				if(curLength + 1 == targetLength)
					delay += activeTextObject.displayDuration();
			}
		}
		if(targetText.length() - curText.length() != 0 || delay > 0)
			delay -= delta / 10f;
		else if(!targetText.isEmpty() && delay <= 0f)
		{
			forceDelete = true;
			delay = activeTextObject.displayDuration();
			targetText = "";
		}
		//render big title
		if(!curText.isEmpty())
		{
			matrices.push();
			matrices.translate(width / 2f, height - 74, 10);
			matrices.scale(2f, 2f, 2f);
			RenderSystem.enableBlend();
			Text t = Text.of(curText);
			if(activeTextObject.font() != null)
				t = t.getWithStyle(Style.EMPTY.withFont(activeTextObject.font())).getFirst();
			context.drawText(renderer, t, -renderer.getWidth(t) / 2, 0, activeTextObject.color(), false);
			if(activeTextObject.jitter())
			{
				for (int i = 1; i < 3; i++)
				{
					matrices.push();
					matrices.translate((rand.nextFloat() - 0.5f) * i, (rand.nextFloat() - 0.5f) * i, -i);
					context.drawText(renderer, t, -renderer.getWidth(t) / 2, 0,
							ColorHelper.Argb.fromFloats(1f / i, Math.max(1f - 0.2f * i, 0.25f), 0f, (0.1f * i) + (i - 1) * 0.3f), false);
					matrices.pop();
				}
			}
			matrices.pop();
		}
	}
	
	public static TextObject makeTextObject(String text)
	{
		return new TextObject(text);
	}
	
	public static void queueTitle(TextObject text)
	{
		if(text.clearPreceding)
		{
			textQueue.clear();
			if(!curText.isEmpty())
				forceDelete = true;
			delay = 0f;
		}
		textQueue.add(text);
	}
	
	public static final class TextObject
	{
		final String text;
		float delay = 0;
		float instability = 0;
		float typeSpeed = -1;
		float displayDuration = -1;
		float deleteSpeed = -1;
		int color = -1;
		Identifier font = null;
		boolean jitter;
		boolean clearPreceding;
		
		public TextObject(String text)
		{
			this.text = text;
		}
		
		public String text()
		{
			return text;
		}
		
		public float typeSpeed()
		{
			return typeSpeed;
		}
		
		public TextObject typeSpeed(float f)
		{
			typeSpeed = Math.max(f, 1f);
			return this;
		}
		
		public float displayDuration()
		{
			return displayDuration;
		}
		
		public TextObject displayDuration(float f)
		{
			displayDuration = Math.max(f, 0f);
			return this;
		}
		
		public float deleteSpeed()
		{
			return deleteSpeed;
		}
		
		public TextObject deleteSpeed(float f)
		{
			deleteSpeed = Math.max(f, 1f);
			return this;
		}
		
		public float delay()
		{
			return delay;
		}
		
		public TextObject delay(float f)
		{
			delay = f;
			return this;
		}
		
		public float instability()
		{
			return instability;
		}
		
		public TextObject instability(float f)
		{
			instability = f;
			return this;
		}
		
		public int color()
		{
			return color;
		}
		
		public TextObject color(int c)
		{
			color = c;
			return this;
		}
		
		public Identifier font()
		{
			return font;
		}
		
		public TextObject font(Identifier id)
		{
			font = id;
			return this;
		}
		
		public boolean jitter()
		{
			return jitter;
		}
		
		public TextObject jitter(boolean b)
		{
			jitter = b;
			return this;
		}
		
		public boolean clearPreceding()
		{
			return clearPreceding;
		}
		
		public TextObject clearPreceding(boolean b)
		{
			clearPreceding = b;
			return this;
		}
		
		public TextObject complete(TextObject previous)
		{
			if(typeSpeed == -1)
				typeSpeed(previous.typeSpeed());
			if(displayDuration == -1)
				displayDuration(previous.displayDuration());
			if(deleteSpeed == -1)
				deleteSpeed(previous.deleteSpeed());
			if(color == -1)
				color(previous.color());
			return this;
		}
	}
}
