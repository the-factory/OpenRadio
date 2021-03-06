package at.chaosfield.openradio.integration.actuallyAdditions;

import at.chaosfield.openradio.OpenRadio;
import at.chaosfield.openradio.init.Items;
import de.ellpeck.actuallyadditions.api.ActuallyAdditionsAPI;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Jakob Riepler (XDjackieXD)
 */
public class BookletEntry{
    public static void init(){
        ActuallyAdditionsAPI.methodHandler.generateBookletChapter(
                "openradio.laserrelay",
                ActuallyAdditionsAPI.entryMisc,
                new ItemStack(Items.laserItem),
                ActuallyAdditionsAPI.methodHandler.generatePicturePage(1, new ResourceLocation(OpenRadio.MODID, "textures/gui/actAddPageLaserRelay.png"), 118).addTextReplacement("<laserMaxDistance>", (int)((OpenRadio.instance.settings.LensMultiplierTier[2] + 1) * 2 * OpenRadio.instance.settings.LaserMaxDistanceTier[2]))
        );
    }
}
