package at.chaosfield.openradio.integration;

import net.minecraftforge.fml.common.Loader;

/**
 * Created by Jakob Riepler (XDjackieXD)
 */
public class Init{
    public static boolean isActAddLoaded = Loader.isModLoaded("actuallyadditions");
    public static String[] actAddLaserRelayEnergy = {"actuallyadditions:blockLaserRelay", "actuallyadditions:blockLaserRelayAdvanced", "actuallyadditions:blockLaserRelayExtreme"};
    public static String[] actAddLaserRelayItem = {"actuallyadditions:blockLaserRelayItem", "actuallyadditions:blockLaserRelayItemWhitelist"};
}
