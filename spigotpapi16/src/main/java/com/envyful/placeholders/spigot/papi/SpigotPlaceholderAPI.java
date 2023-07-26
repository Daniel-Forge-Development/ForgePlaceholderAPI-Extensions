package com.envyful.placeholders.spigot.papi;

import com.envyful.papi.api.manager.AbstractPlaceholderManager;
import com.envyful.placeholders.spigot.papi.extension.SpigotPAPIExtension;
import net.minecraft.entity.player.ServerPlayerEntity;

public class SpigotPlaceholderAPI extends AbstractPlaceholderManager<ServerPlayerEntity> {

    private static final String IDENTIFIER = "spigotpapi";
    private static final String[] AUTHORS = new String[] { "Envyful" };
    private static final String VERSION = "3.0.0";
    private static final String NAME = "spigotpapi";

    public SpigotPlaceholderAPI() {
        super(IDENTIFIER, AUTHORS, VERSION, NAME, ServerPlayerEntity.class);

        this.registerPlaceholder(new SpigotPAPIExtension());
    }
}
