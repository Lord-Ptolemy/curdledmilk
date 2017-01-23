package net.uskarian.curdledmilk.item;

import net.minecraft.item.ItemSpade;
import net.uskarian.curdledmilk.Main;

public class CurdleSpade extends ItemSpade {
    public CurdleSpade(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName("curdle_spade");
        this.setCreativeTab(Main.tabName);
        this.setTextureName(Main.MODID + ":" + "curdle_spade");
    }
}