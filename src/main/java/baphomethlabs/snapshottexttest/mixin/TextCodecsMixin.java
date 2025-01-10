package baphomethlabs.snapshottexttest.mixin;

import net.minecraft.text.Text;
import net.minecraft.text.TextCodecs;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(TextCodecs.class)
public abstract class TextCodecsMixin {

    @Redirect(
        method = "method_54172",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/text/Text;getLiteralString()Ljava/lang/String;"
        )
    )
    private static String getLiteralStringOverride(Text text) {
        return null;
    }

}