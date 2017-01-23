package net.uskarian.curdledmilk.block;

import net.uskarian.curdledmilk.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CurdleBlock extends Block {

    public CurdleBlock() {
        super(Material.cake);
        this.setBlockName("curdle_block");
        this.setBlockTextureName(Main.MODID + ":" + "curdle_block");
        this.setCreativeTab(Main.tabName);
        this.setHardness(2.0F);
        this.setResistance(6.0F);
        this.setLightLevel(1.0F);
        this.setHarvestLevel("pickaxe", 0);
        this.setStepSound(soundTypeMetal);
    }
}