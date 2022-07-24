package com.envyful.placeholders.reforged.extension;

import com.envyful.papi.api.manager.extensions.type.SimpleExtension;
import com.google.common.collect.Lists;
import com.pixelmonmod.pixelmon.api.pokemon.species.Pokedex;
import com.pixelmonmod.pixelmon.api.storage.PlayerPartyStorage;
import com.pixelmonmod.pixelmon.api.storage.StorageProxy;
import net.minecraft.entity.player.ServerPlayerEntity;

import java.util.List;

public class DexPercentageUnformattedExtension extends SimpleExtension<ServerPlayerEntity> {

    private static final String NAME = "dex_perecentage_unformatted";
    private static final int PRIORITY = 1;
    private static final List<String> DESCRIPTION = Lists.newArrayList("Gets the player's dex completion percentage");
    private static final List<String> EXAMPLES = Lists.newArrayList("%reforged_dex_perecentage_unformatted%");

    public DexPercentageUnformattedExtension() {
        super(NAME, PRIORITY, DESCRIPTION, EXAMPLES);
    }

    @Override
    public String parse(ServerPlayerEntity player, String placeholder) {
        PlayerPartyStorage party = StorageProxy.getParty(player);

        return String.format(
                "%.2f",
                ((party.playerPokedex.countCaught() + 0.000) / Pokedex.pokedexSize) * 100
        );
    }
}
