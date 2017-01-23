package net.uskarian.curdledmilk.item;

import net.minecraft.item.ItemPickaxe;
import net.uskarian.curdledmilk.Main;

public class CurdlePickaxe extends ItemPickaxe {
    public CurdlePickaxe(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName("curdle_pickaxe");
        this.setCreativeTab(Main.tabName);
        this.setTextureName(Main.MODID + ":" + "curdle_pickaxe");
    }
}