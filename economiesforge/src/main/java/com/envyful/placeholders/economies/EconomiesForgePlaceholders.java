package com.envyful.placeholders.economies;

import com.envyful.papi.api.manager.AbstractPlaceholderManager;
import com.envyful.placeholders.economies.extensions.eco.*;
import net.minecraft.entity.player.EntityPlayerMP;

public class EconomiesForgePlaceholders extends AbstractPlaceholderManager<EntityPlayerMP> {

    private static final String IDENTIFIER = "forgeeconomies";
    private static final String[] AUTHORS = new String[] { "Envyful" };
    private static final String VERSION = "2.8.4";
    private static final String NAME = "forgeeconomies";

    public EconomiesForgePlaceholders() {
        super(IDENTIFIER, AUTHORS, VERSION, NAME, EntityPlayerMP.class);

        this.registerPlaceholder(new BalanceExtension());
        this.registerPlaceholder(new BalanceFormattedExtension());
        this.registerPlaceholder(new BaltopExtension());
        this.registerPlaceholder(new DisplayNameExtension());
        this.registerPlaceholder(new PluralDisplayNameExtension());
        this.registerPlaceholder(new SymbolExtension());
    }
}
