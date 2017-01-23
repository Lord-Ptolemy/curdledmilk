package net.uskarian.curdledmilk.item;

import net.minecraft.item.ItemHoe;
import net.uskarian.curdledmilk.Main;

public class CurdleHoe extends ItemHoe {
    public CurdleHoe(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName("curdle_hoe");
        this.setCreativeTab(Main.tabName);
        this.setTextureName(Main.MODID + ":" + "curdle_hoe");
    }
}