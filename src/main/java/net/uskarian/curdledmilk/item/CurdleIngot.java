package net.uskarian.curdledmilk.item;

import net.minecraft.item.Item;
import net.uskarian.curdledmilk.Main;

public class CurdleIngot extends Item{
    public CurdleIngot() {
        this.setUnlocalizedName("curdle_ingot");
        this.setCreativeTab(Main.tabName);
        this.setTextureName(Main.MODID + ":" + "curdle_ingot");
    }
}

