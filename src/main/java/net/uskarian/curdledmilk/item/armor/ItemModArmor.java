package net.uskarian.curdledmilk.item.armor;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import net.uskarian.curdledmilk.Main;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;

public class ItemModArmor extends ItemArmor {

    private String unlocalizedName;
    private final String textureName;

    public ItemModArmor (String unlocalizedName, ArmorMaterial material, String textureName, int type) {
        super(material, 0, type);
        this.textureName = textureName;
        this.setUnlocalizedName(unlocalizedName);
        this.unlocalizedName = unlocalizedName;
        this.setTextureName(Main.MODID + ":" + unlocalizedName);
        this.setCreativeTab(Main.tabName);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        return Main.MODID + ":textures/models/armor/" + this.textureName + "_layer_" + (this.armorType == 2 ? "2" : "1") + ".png";
    }

    @Override
    public void registerIcons(IIconRegister register)
    {
        this.itemIcon = register.registerIcon(Main.MODID + ":" + unlocalizedName);
    }
}