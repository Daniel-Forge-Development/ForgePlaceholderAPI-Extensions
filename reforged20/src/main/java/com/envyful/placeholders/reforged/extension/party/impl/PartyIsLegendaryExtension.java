package com.envyful.placeholders.reforged.extension.party.impl;

import com.envyful.placeholders.reforged.extension.party.PartyReforgedExtension;
import com.google.common.collect.Lists;
import com.pixelmonmod.pixelmon.api.pokemon.Pokemon;
import net.minecraft.server.level.ServerPlayer;

import java.util.List;

public class PartyIsLegendaryExtension extends PartyReforgedExtension {

    private static final String NAME = "is_legendary";
    private static final int PRIORITY = 1;
    private static final List<String> DESCRIPTION = Lists.newArrayList("Gets if the pokemon is legendary");
    private static final List<String> EXAMPLES = Lists.newArrayList("%reforged_party_slot_1_is_legendary%");

    public PartyIsLegendaryExtension() {
        super(NAME, PRIORITY, DESCRIPTION, EXAMPLES);
    }

    @Override
    protected String parse(ServerPlayer player, String placeholder, Pokemon pokemon) {
        if (pokemon == null) {
            return "N/A";
        }

        return pokemon.isLegendary() + "";
    }
}
