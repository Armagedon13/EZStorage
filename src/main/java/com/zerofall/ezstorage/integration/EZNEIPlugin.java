package com.zerofall.ezstorage.integration;

import codechicken.nei.api.API;
import codechicken.nei.api.IConfigureNEI;
import cpw.mods.fml.common.Optional;

/**
 * NEI plugin entry point.
 * Declared in mcmod.info or via @NEIPlugin annotation — whichever the project uses.
 * This class is loaded by NEI via the "NEIPlugin" mcmod.info key, or auto-discovered
 * if it implements IConfigureNEI.
 */
@Optional.Interface(modid = "NotEnoughItems", iface = "codechicken.nei.api.IConfigureNEI")
public class EZNEIPlugin implements IConfigureNEI {

    @Override
    public void loadConfig() {
        API.registerNEIGuiHandler(new EZNEIHandler());
    }

    @Override
    public String getName() {
        return "EZStorage";
    }

    @Override
    public String getVersion() {
        return "1.0";
    }
}
