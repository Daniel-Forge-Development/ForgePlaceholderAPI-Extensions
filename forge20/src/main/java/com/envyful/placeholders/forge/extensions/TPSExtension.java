package com.envyful.placeholders.forge.extensions;

import com.envyful.papi.api.manager.extensions.type.SimpleExtension;
import com.google.common.collect.Lists;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.server.ServerLifecycleHooks;

import java.util.List;

public class TPSExtension extends SimpleExtension<ServerPlayer> {

    private static final String NAME = "tps";
    private static final int PRIORITY = 1;
    private static final List<String> DESCRIPTION = Lists.newArrayList("Gets the server's TPS");
    private static final List<String> EXAMPLES = Lists.newArrayList("%forge_tps%");

    public TPSExtension() {
        super(NAME, PRIORITY, DESCRIPTION, EXAMPLES);
    }

    @Override
    public String parse(ServerPlayer player, String placeholder) {
        double meanTickTime = mean(ServerLifecycleHooks.getCurrentServer().tickTimes) * 1.0E-6D;
        double meanTPS = Math.min(1000.0 / meanTickTime, 20);
        return String.format("%.2f", meanTPS);
    }

    private long mean(long[] values) {
        long sum = 0L;
        for (long v : values) {
            sum += v;
        }
        return sum / values.length;
    }
}
