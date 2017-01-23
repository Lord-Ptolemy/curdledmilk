package net.uskarian.curdledmilk;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.*;
import net.minecraft.block.Block;
import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.item.ItemArmor.*;
import net.minecraft.init.*;
import net.minecraftforge.common.util.*;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.Mod.EventHandler;
import net.uskarian.curdledmilk.block.CurdleBlock;
import net.uskarian.curdledmilk.item.*;
import net.uskarian.curdledmilk.item.armor.*;

@Mod(modid="curdledmilk", name="Curdled Milk", version="1.0")
public class Main {
    public static String MODID = "curdledmilk";
    public static String VERSION = "1.0";

    public static CreativeTabs tabName = new CreativeTabs("tabName") {
        public Item getTabIconItem() {
            return Items.milk_bucket;
        }
    };

    public static ItemArmor curdle_helmet;
    public static ItemArmor curdle_chestplate;
    public static ItemArmor curdle_leggings;
    public static ItemArmor curdle_boots;

    public static ArmorMaterial curdleHelmetMaterial = EnumHelper.addArmorMaterial("curdle_helmet", 1, new int[]{1,3,2,1}, 15);
    public static ArmorMaterial curdleChestplateMaterial = EnumHelper.addArmorMaterial("curdle_chestplate", 1, new int[]{1,3,2,1}, 15);
    public static ArmorMaterial curdleLeggingsMaterial = EnumHelper.addArmorMaterial("curdle_leggings", 1, new int[]{1,3,2,1}, 15);
    public static ArmorMaterial curdleBootsMaterial = EnumHelper.addArmorMaterial("curdle_boots", 1, new int[]{1,3,2,1}, 15);

    public static final Item.ToolMaterial curdleAxeMaterial = EnumHelper.addToolMaterial("curdleAxeMaterial", 1, 1, 0.5F, 0.5F, 30);
    public static final Item.ToolMaterial curdlePickaxeMaterial = EnumHelper.addToolMaterial("curdlePickaxeMaterial", 1, 1, 0.5F, 0.5F, 30);
    public static final Item.ToolMaterial curdleSpadeMaterial = EnumHelper.addToolMaterial("curdleSpadeMaterial", 1, 1, 0.5F, 0.5F, 30);
    public static final Item.ToolMaterial curdleSwordMaterial = EnumHelper.addToolMaterial("curdleSwordMaterial", 1, 1, 0.5F, 0.5F, 30);
    public static final Item.ToolMaterial curdleHoeMaterial = EnumHelper.addToolMaterial("curdleHoeMaterial", 1, 1, 0.5F, 0.5F, 30);

    public static Item curdle_axe;
    public static Item curdle_pickaxe;
    public static Item curdle_spade;
    public static Item curdle_sword;
    public static Item curdle_hoe;

    public static Item curdle_ingot;
    public static Item curdle;
    public static Block curdle_block;



    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        GameRegistry.registerBlock(curdle_block = new CurdleBlock(), "curdle_block");
        GameRegistry.registerItem(curdle_axe = new CurdleAxe(curdleAxeMaterial), "curdle_axe");
        GameRegistry.registerItem(curdle_pickaxe = new CurdlePickaxe(curdlePickaxeMaterial), "curdle_pickaxe");
        GameRegistry.registerItem(curdle_spade = new CurdleSpade(curdleSpadeMaterial), "curdle_spade");
        GameRegistry.registerItem(curdle_sword = new CurdleSword(curdleSwordMaterial), "curdle_sword");
        GameRegistry.registerItem(curdle_hoe = new CurdleHoe(curdleHoeMaterial), "curdle_hoe");
        GameRegistry.registerItem(curdle_ingot = new CurdleIngot(), "curdle_ingot");
        GameRegistry.registerItem(curdle = new Curdle(), "curdle");

        GameRegistry.registerItem(curdle_helmet = new ItemModArmor("curdle_helmet", curdleHelmetMaterial, "curdle", 0), "curdle_helmet"); //0 for helmet
        GameRegistry.registerItem(curdle_chestplate = new ItemModArmor("curdle_chestplate", curdleChestplateMaterial, "curdle", 1), "curdle_chestplate"); // 1 for chestplate
        GameRegistry.registerItem(curdle_leggings = new ItemModArmor("curdle_leggings", curdleLeggingsMaterial, "curdle", 2), "curdle_leggings"); // 2 for leggings
        GameRegistry.registerItem(curdle_boots = new ItemModArmor("curdle_boots", curdleBootsMaterial, "curdle", 3), "curdle_boots"); // 3 for boots

        GameRegistry.addRecipe(new ItemStack(curdle_axe, 1), "## ", "#I ", " I ", '#', new ItemStack(curdle_ingot), 'I', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(curdle_pickaxe, 1), "###", " I ", " I ", '#', new ItemStack(curdle_ingot), 'I', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(curdle_spade, 1), " # ", " I ", " I ", '#', new ItemStack(curdle_ingot), 'I', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(curdle_sword, 1), " # ", " # ", " I ", '#', new ItemStack(curdle_ingot), 'I', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(curdle_hoe, 1), "## ", " I ", " I ", '#', new ItemStack(curdle_ingot), 'I', new ItemStack(Items.stick));
        GameRegistry.addRecipe(new ItemStack(curdle_block, 1), "###", "###", "###", '#', new ItemStack(curdle_ingot));
        GameRegistry.addRecipe(new ItemStack(curdle_helmet, 1), "###", "# #", "   ", '#', new ItemStack(curdle_ingot));
        GameRegistry.addRecipe(new ItemStack(curdle_chestplate, 1), "# #", "###", "###", '#', new ItemStack(curdle_ingot));
        GameRegistry.addRecipe(new ItemStack(curdle_leggings, 1), "###", "# #", "# #", '#', new ItemStack(curdle_ingot));
        GameRegistry.addRecipe(new ItemStack(curdle_boots, 1), "# #", "# #", "   ", '#', new ItemStack(curdle_ingot));
        GameRegistry.addRecipe(new ItemStack(curdle_ingot, 1), "###", "###", "###", '#', new ItemStack(curdle));
        GameRegistry.addShapelessRecipe(new ItemStack(curdle_ingot, 9), new ItemStack(curdle_block, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(curdle, 4), new ItemStack(curdle_ingot, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(curdle, 4), new ItemStack(Items.milk_bucket, 1), new ItemStack(Items.sugar, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(curdle, 4), new ItemStack(Items.milk_bucket, 1), new ItemStack(Items.dye, 1, 0));

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}