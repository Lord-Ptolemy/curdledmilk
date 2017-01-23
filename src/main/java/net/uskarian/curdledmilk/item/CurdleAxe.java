package net.uskarian.curdledmilk.item;

import net.minecraft.item.ItemAxe;
import net.uskarian.curdledmilk.Main;

public class CurdleAxe extends ItemAxe {
    public CurdleAxe (ToolMaterial material) {
        super(material);
        this.setUnlocalizedName("curdle_axe");
        this.setCreativeTab(Main.tabName);
        this.setTextureName(Main.MODID + ":" + "curdle_axe");
    }
}