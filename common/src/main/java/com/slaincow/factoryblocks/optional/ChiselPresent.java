package com.slaincow.factoryblocks.optional;

import dev.architectury.injectables.annotations.ExpectPlatform;

public class ChiselPresent {
    @ExpectPlatform
    public static boolean isModLoaded(String modId) {
        // This method body will be injected by Architectury at runtime.
        // You must implement this method in your common platform code (see below).
        throw new AssertionError();
    }
}
