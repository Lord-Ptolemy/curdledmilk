package net.uskarian.curdledmilk.item;

import net.minecraft.item.Item;
import net.uskarian.curdledmilk.Main;

public class Curdle extends Item{
    public Curdle() {
        this.setUnlocalizedName("curdle");
        this.setCreativeTab(Main.tabName);
        this.setTextureName(Main.MODID + ":" + "curdle");
    }
}
