package absolutelyaya.formidulus.registries;

import absolutelyaya.formidulus.Formidulus;
import net.minecraft.block.entity.BannerPattern;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class FormidableBannerPatterns
{
	public static final RegistryKey<BannerPattern> EYES = RegistryKey.of(RegistryKeys.BANNER_PATTERN, Formidulus.identifier("eyes"));
	
	public static final TagKey<BannerPattern> EYES_TAG = TagKey.of(RegistryKeys.BANNER_PATTERN, Formidulus.identifier("eyes"));
}
