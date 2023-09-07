package com.envyful.placeholders.reforged.extension.party.impl;

import com.envyful.placeholders.reforged.extension.party.PartyReforgedExtension;
import com.google.common.collect.Lists;
import com.pixelmonmod.pixelmon.api.pokemon.Pokemon;
import net.minecraft.entity.player.ServerPlayerEntity;

import java.util.List;

public class PartyEggStepsExtension extends PartyReforgedExtension {

    private static final String NAME = "egg_steps";
    private static final int PRIORITY = 1;
    private static final List<String> DESCRIPTION = Lists.newArrayList("Get the egg steps of a party pokemon");
    private static final List<String> EXAMPLES = Lists.newArrayList("%reforged_party_slot_1_egg_steps%");

    public PartyEggStepsExtension() {
        super(NAME, PRIORITY, DESCRIPTION, EXAMPLES);
    }

    @Override
    protected String parse(ServerPlayerEntity player, String placeholder, Pokemon pokemon) {
        if (pokemon == null) {
            return "N/A";
        }

        return String.valueOf(pokemon.getEggSteps());
    }
}
