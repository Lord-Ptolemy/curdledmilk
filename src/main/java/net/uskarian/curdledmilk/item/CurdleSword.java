package net.uskarian.curdledmilk.item;

import net.minecraft.item.ItemSword;
import net.uskarian.curdledmilk.Main;

public class CurdleSword extends ItemSword {
    public CurdleSword(ToolMaterial material) {
        super(material);
        this.setUnlocalizedName("curdle_sword");
        this.setCreativeTab(Main.tabName);
        this.setTextureName(Main.MODID + ":" + "curdle_sword");
    }
}