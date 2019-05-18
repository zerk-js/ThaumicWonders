package com.verdantartifice.thaumicwonders.client.renderers.models.gear;

import java.util.HashMap;
import java.util.Map;

import org.lwjgl.opengl.GL11;

import com.verdantartifice.thaumicwonders.common.items.armor.ItemVoidFortressArmor;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import thaumcraft.client.renderers.models.gear.ModelCustomArmor;

/**
 * ModelVoidFortressArmor - Daedalus4096
 * Created using Tabula 7.0.0
 */
public class ModelVoidFortressArmor extends ModelCustomArmor {
    protected static final Map<Integer, Integer> HAS_SET = new HashMap<Integer, Integer>();
    
    public ModelRenderer Mask;
    public ModelRenderer FrontHornL1;
    public ModelRenderer FrontHornR1;
    public ModelRenderer Helmet;
    public ModelRenderer HelmetR;
    public ModelRenderer HelmetL;
    public ModelRenderer HelmetB;
    public ModelRenderer Visor;
    public ModelRenderer MBelt;
    public ModelRenderer MBeltL;
    public ModelRenderer MBeltR;
    public ModelRenderer Chestplate;
    public ModelRenderer Scroll;
    public ModelRenderer Backplate;
    public ModelRenderer Book;
    public ModelRenderer ShoulderR;
    public ModelRenderer GauntletR;
    public ModelRenderer GauntletStrapR1;
    public ModelRenderer GauntletStrapR2;
    public ModelRenderer ShoulderplateRTop;
    public ModelRenderer ShoulderplateR1;
    public ModelRenderer ShoulderplateR2;
    public ModelRenderer ShoulderL;
    public ModelRenderer GauntletL;
    public ModelRenderer GauntletStrapL1;
    public ModelRenderer GauntletStrapL2;
    public ModelRenderer ShoulderplateLTop;
    public ModelRenderer ShoulderplateL1;
    public ModelRenderer ShoulderplateL2;
    public ModelRenderer LegPanelR1;
    public ModelRenderer LegPanelR2;
    public ModelRenderer LegPanelR3;
    public ModelRenderer LegPanelR4;
    public ModelRenderer LegPanelR5;
    public ModelRenderer LegPanelR6;
    public ModelRenderer SidePanelR1;
    public ModelRenderer SidePanelR2;
    public ModelRenderer SidePanelR3;
    public ModelRenderer BackPanelR1;
    public ModelRenderer BackPanelR2;
    public ModelRenderer BackPanelR3;
    public ModelRenderer LegPanelL1;
    public ModelRenderer LegPanelL2;
    public ModelRenderer LegPanelL3;
    public ModelRenderer LegPanelL4;
    public ModelRenderer LegPanelL5;
    public ModelRenderer LegPanelL6;
    public ModelRenderer SidePanelL1;
    public ModelRenderer SidePanelL2;
    public ModelRenderer SidePanelL3;
    public ModelRenderer BackPanelL1;
    public ModelRenderer BackPanelL2;
    public ModelRenderer BackPanelL3;
    public ModelRenderer FrontHornR2;
    public ModelRenderer FrontHornL2;
    public ModelRenderer SideHornR1;
    public ModelRenderer SideHornR2;
    public ModelRenderer SideHornL1;
    public ModelRenderer SideHornL2;
    public ModelRenderer ShoulderOrnamentR;
    public ModelRenderer ShoulderOrnamentL;
    public ModelRenderer ArmBladeR1;
    public ModelRenderer ArmBladeR2;
    public ModelRenderer ArmBladeL1;
    public ModelRenderer ArmBladeL2;
    public ModelRenderer HelmCordR;
    public ModelRenderer HelmCordL;
    public ModelRenderer ChestCordR;
    public ModelRenderer ChestCordL;
    public ModelRenderer BeltCord;
    public ModelRenderer ShoulderplateRMid;
    public ModelRenderer ShoulderplateLMid;

    public ModelVoidFortressArmor(float f) {
        super(f, 0, 128, 64);
        this.textureWidth = 128;
        this.textureHeight = 64;
        
        this.SideHornR2 = new ModelRenderer(this, 39, 11);
        this.SideHornR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SideHornR2.addBox(-12.3F, -5.2F, -0.5F, 3, 1, 1, 0.0F);
        this.setRotateAngle(SideHornR2, 0.0F, 0.0F, 0.5235987755982988F);
        this.GauntletStrapR2 = new ModelRenderer(this, 84, 31);
        this.GauntletStrapR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.GauntletStrapR2.addBox(-1.5F, 6.5F, -2.5F, 3, 1, 5, 0.0F);
        this.Scroll = new ModelRenderer(this, 34, 27);
        this.Scroll.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Scroll.addBox(-2.0F, 9.5F, 4.0F, 8, 3, 3, 0.0F);
        this.setRotateAngle(Scroll, 0.0F, 0.0F, 0.19198621771937624F);
        this.GauntletStrapL1 = new ModelRenderer(this, 84, 31);
        this.GauntletStrapL1.mirror = true;
        this.GauntletStrapL1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.GauntletStrapL1.addBox(-1.5F, 3.5F, -2.5F, 3, 1, 5, 0.0F);
        this.ShoulderplateL2 = new ModelRenderer(this, 94, 45);
        this.ShoulderplateL2.mirror = true;
        this.ShoulderplateL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderplateL2.addBox(2.5F, 1.5F, -3.5F, 1, 5, 7, 0.0F);
        this.setRotateAngle(ShoulderplateL2, 0.0F, 0.0F, -0.3490658503988659F);
        this.ShoulderplateRTop = new ModelRenderer(this, 110, 37);
        this.ShoulderplateRTop.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderplateRTop.addBox(-5.5F, -2.5F, -3.5F, 2, 1, 7, 0.0F);
        this.setRotateAngle(ShoulderplateRTop, 0.0F, 0.0F, 0.3490658503988659F);
        this.HelmetR = new ModelRenderer(this, 21, 13);
        this.HelmetR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HelmetR.addBox(-6.5F, -3.0F, -4.5F, 1, 5, 9, 0.0F);
        this.setRotateAngle(HelmetR, 0.0F, 0.0F, 0.5235987755982988F);
        this.GauntletL = new ModelRenderer(this, 114, 26);
        this.GauntletL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.GauntletL.addBox(1.5F, 3.5F, -2.5F, 2, 6, 5, 0.0F);
        this.SidePanelL3 = new ModelRenderer(this, 0, 31);
        this.SidePanelL3.mirror = true;
        this.SidePanelL3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SidePanelL3.addBox(-0.5F, 5.5F, -2.5F, 1, 3, 5, 0.0F);
        this.setRotateAngle(SidePanelL3, 0.0F, 0.0F, -0.4363323129985824F);
        this.ShoulderOrnamentR = new ModelRenderer(this, 79, 13);
        this.ShoulderOrnamentR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderOrnamentR.addBox(-2.0F, -1.0F, -3.0F, 2, 2, 1, 0.0F);
        this.ChestCordL = new ModelRenderer(this, 20, 6);
        this.ChestCordL.mirror = true;
        this.ChestCordL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ChestCordL.addBox(2.5F, 1.0F, -5.0F, 1, 4, 1, 0.0F);
        this.FrontHornL1 = new ModelRenderer(this, 30, 6);
        this.FrontHornL1.mirror = true;
        this.FrontHornL1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FrontHornL1.addBox(1.5F, -8.0F, -7.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(FrontHornL1, -0.17453292519943295F, 0.0F, 0.0F);
        this.ShoulderplateR1 = new ModelRenderer(this, 110, 45);
        this.ShoulderplateR1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderplateR1.addBox(-4.5F, -1.5F, -3.5F, 1, 4, 7, 0.0F);
        this.setRotateAngle(ShoulderplateR1, 0.0F, 0.0F, 0.3490658503988659F);
        this.LegPanelL6 = new ModelRenderer(this, 0, 43);
        this.LegPanelL6.mirror = true;
        this.LegPanelL6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegPanelL6.addBox(1.0F, 4.5F, -1.5F, 2, 3, 1, 0.0F);
        this.setRotateAngle(LegPanelL6, -0.4363323129985824F, 0.0F, 0.0F);
        this.ShoulderR = new ModelRenderer(this, 56, 35);
        this.ShoulderR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderR.addBox(-3.5F, -2.5F, -2.5F, 5, 5, 5, 0.0F);
        this.LegPanelL1 = new ModelRenderer(this, 0, 51);
        this.LegPanelL1.mirror = true;
        this.LegPanelL1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegPanelL1.addBox(-2.0F, 0.5F, -3.5F, 3, 4, 1, 0.0F);
        this.setRotateAngle(LegPanelL1, -0.4363323129985824F, 0.0F, 0.0F);
        this.LegPanelL5 = new ModelRenderer(this, 0, 43);
        this.LegPanelL5.mirror = true;
        this.LegPanelL5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegPanelL5.addBox(1.0F, 2.5F, -2.5F, 2, 3, 1, 0.0F);
        this.setRotateAngle(LegPanelL5, -0.4363323129985824F, 0.0F, 0.0F);
        this.LegPanelR6 = new ModelRenderer(this, 0, 43);
        this.LegPanelR6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegPanelR6.addBox(-3.0F, 4.5F, -1.5F, 2, 3, 1, 0.0F);
        this.setRotateAngle(LegPanelR6, -0.4363323129985824F, 0.0F, 0.0F);
        this.GauntletStrapR1 = new ModelRenderer(this, 84, 31);
        this.GauntletStrapR1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.GauntletStrapR1.addBox(-1.5F, 3.5F, -2.5F, 3, 1, 5, 0.0F);
        this.SidePanelR3 = new ModelRenderer(this, 0, 31);
        this.SidePanelR3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SidePanelR3.addBox(-0.5F, 5.5F, -2.5F, 1, 3, 5, 0.0F);
        this.setRotateAngle(SidePanelR3, 0.0F, 0.0F, 0.4363323129985824F);
        this.SideHornL1 = new ModelRenderer(this, 30, 6);
        this.SideHornL1.mirror = true;
        this.SideHornL1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SideHornL1.addBox(6.5F, -7.2F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(SideHornL1, 0.0F, 0.0F, -0.3490658503988659F);
        this.Mask = new ModelRenderer(this, 52, 2);
        this.Mask.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Mask.addBox(-4.5F, -5.0F, -4.6F, 9, 5, 1, 0.0F);
        this.ArmBladeL2 = new ModelRenderer(this, 79, 17);
        this.ArmBladeL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ArmBladeL2.addBox(4.5F, 5.5F, -0.5F, 1, 3, 1, 0.0F);
        this.ShoulderplateLTop = new ModelRenderer(this, 110, 37);
        this.ShoulderplateLTop.mirror = true;
        this.ShoulderplateLTop.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderplateLTop.addBox(3.5F, -2.5F, -3.5F, 2, 1, 7, 0.0F);
        this.setRotateAngle(ShoulderplateLTop, 0.0F, 0.0F, -0.3490658503988659F);
        this.ArmBladeR1 = new ModelRenderer(this, 79, 17);
        this.ArmBladeR1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ArmBladeR1.addBox(-4.5F, 6.5F, -0.5F, 1, 3, 1, 0.0F);
        this.HelmCordR = new ModelRenderer(this, 25, 6);
        this.HelmCordR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HelmCordR.addBox(-4.5F, -5.0F, -5.6F, 1, 6, 1, 0.0F);
        this.HelmetL = new ModelRenderer(this, 21, 13);
        this.HelmetL.mirror = true;
        this.HelmetL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HelmetL.addBox(5.5F, -3.0F, -4.5F, 1, 5, 9, 0.0F);
        this.setRotateAngle(HelmetL, 0.0F, 0.0F, -0.5235987755982988F);
        this.Chestplate = new ModelRenderer(this, 56, 45);
        this.Chestplate.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Chestplate.addBox(-4.0F, 1.0F, -4.0F, 8, 7, 2, 0.0F);
        this.Book = new ModelRenderer(this, 100, 8);
        this.Book.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Book.addBox(1.0F, -0.3F, 4.0F, 5, 7, 2, 0.0F);
        this.setRotateAngle(Book, 0.0F, 0.0F, 0.767944870877505F);
        this.BackPanelL2 = new ModelRenderer(this, 0, 18);
        this.BackPanelL2.mirror = true;
        this.BackPanelL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BackPanelL2.addBox(-2.0F, 2.5F, 1.5F, 5, 3, 1, 0.0F);
        this.setRotateAngle(BackPanelL2, 0.4363323129985824F, 0.0F, 0.0F);
        this.BeltCord = new ModelRenderer(this, 15, 6);
        this.BeltCord.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BeltCord.addBox(-1.0F, -2.5F, -4.5F, 1, 7, 1, 0.0F);
        this.setRotateAngle(BeltCord, -0.4363323129985824F, 0.0F, 0.0F);
        this.SideHornL2 = new ModelRenderer(this, 39, 11);
        this.SideHornL2.mirror = true;
        this.SideHornL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SideHornL2.addBox(9.3F, -5.2F, -0.5F, 3, 1, 1, 0.0F);
        this.setRotateAngle(SideHornL2, 0.0F, 0.0F, -0.5235987755982988F);
        this.LegPanelR5 = new ModelRenderer(this, 0, 43);
        this.LegPanelR5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegPanelR5.addBox(-3.0F, 2.5F, -2.5F, 2, 3, 1, 0.0F);
        this.setRotateAngle(LegPanelR5, -0.4363323129985824F, 0.0F, 0.0F);
        this.BackPanelL3 = new ModelRenderer(this, 0, 18);
        this.BackPanelL3.mirror = true;
        this.BackPanelL3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BackPanelL3.addBox(-2.0F, 4.5F, 0.5F, 5, 3, 1, 0.0F);
        this.setRotateAngle(BackPanelL3, 0.4363323129985824F, 0.0F, 0.0F);
        this.LegPanelL4 = new ModelRenderer(this, 0, 43);
        this.LegPanelL4.mirror = true;
        this.LegPanelL4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegPanelL4.addBox(1.0F, 0.5F, -3.5F, 2, 3, 1, 0.0F);
        this.setRotateAngle(LegPanelL4, -0.4363323129985824F, 0.0F, 0.0F);
        this.ArmBladeL1 = new ModelRenderer(this, 79, 17);
        this.ArmBladeL1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ArmBladeL1.addBox(3.5F, 6.5F, -0.5F, 1, 3, 1, 0.0F);
        this.HelmetB = new ModelRenderer(this, 41, 21);
        this.HelmetB.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HelmetB.addBox(-4.5F, -3.0F, 5.5F, 9, 5, 1, 0.0F);
        this.setRotateAngle(HelmetB, 0.5235987755982988F, 0.0F, 0.0F);
        this.FrontHornR2 = new ModelRenderer(this, 39, 6);
        this.FrontHornR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FrontHornR2.addBox(-3.0F, -7.0F, -10.5F, 1, 1, 3, 0.0F);
        this.setRotateAngle(FrontHornR2, -0.2617993877991494F, 0.0F, 0.0F);
        this.MBelt = new ModelRenderer(this, 56, 55);
        this.MBelt.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.MBelt.addBox(-4.0F, 8.0F, -3.0F, 8, 4, 1, 0.0F);
        this.LegPanelR3 = new ModelRenderer(this, 0, 56);
        this.LegPanelR3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegPanelR3.addBox(-1.0F, 6.5F, -1.5F, 3, 3, 1, 0.0F);
        this.setRotateAngle(LegPanelR3, -0.4363323129985824F, 0.0F, 0.0F);
        this.HelmCordL = new ModelRenderer(this, 25, 6);
        this.HelmCordL.mirror = true;
        this.HelmCordL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HelmCordL.addBox(3.5F, -5.0F, -5.6F, 1, 6, 1, 0.0F);
        this.LegPanelR4 = new ModelRenderer(this, 0, 43);
        this.LegPanelR4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegPanelR4.addBox(-3.0F, 0.5F, -3.5F, 2, 3, 1, 0.0F);
        this.setRotateAngle(LegPanelR4, -0.4363323129985824F, 0.0F, 0.0F);
        this.ShoulderplateR2 = new ModelRenderer(this, 94, 45);
        this.ShoulderplateR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderplateR2.addBox(-3.5F, 1.5F, -3.5F, 1, 5, 7, 0.0F);
        this.setRotateAngle(ShoulderplateR2, 0.0F, 0.0F, 0.3490658503988659F);
        this.ArmBladeR2 = new ModelRenderer(this, 79, 17);
        this.ArmBladeR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ArmBladeR2.addBox(-5.5F, 5.5F, -0.5F, 1, 3, 1, 0.0F);
        this.BackPanelR1 = new ModelRenderer(this, 0, 18);
        this.BackPanelR1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BackPanelR1.addBox(-3.0F, 0.5F, 2.5F, 5, 3, 1, 0.0F);
        this.setRotateAngle(BackPanelR1, 0.4363323129985824F, 0.0F, 0.0F);
        this.Visor = new ModelRenderer(this, 21, 0);
        this.Visor.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Visor.addBox(-4.5F, -6.0F, -6.5F, 9, 1, 2, 0.0F);
        this.MBeltR = new ModelRenderer(this, 76, 44);
        this.MBeltR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.MBeltR.addBox(-5.0F, 8.0F, -3.0F, 1, 3, 6, 0.0F);
        this.LegPanelR2 = new ModelRenderer(this, 0, 51);
        this.LegPanelR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegPanelR2.addBox(-1.0F, 3.5F, -2.5F, 3, 4, 1, 0.0F);
        this.setRotateAngle(LegPanelR2, -0.4363323129985824F, 0.0F, 0.0F);
        this.ShoulderOrnamentL = new ModelRenderer(this, 79, 13);
        this.ShoulderOrnamentL.mirror = true;
        this.ShoulderOrnamentL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderOrnamentL.addBox(0.0F, -1.0F, -3.0F, 2, 2, 1, 0.0F);
        this.BackPanelR3 = new ModelRenderer(this, 0, 18);
        this.BackPanelR3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BackPanelR3.addBox(-3.0F, 4.5F, 0.5F, 5, 3, 1, 0.0F);
        this.setRotateAngle(BackPanelR3, 0.4363323129985824F, 0.0F, 0.0F);
        this.LegPanelL2 = new ModelRenderer(this, 0, 51);
        this.LegPanelL2.mirror = true;
        this.LegPanelL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegPanelL2.addBox(-2.0F, 3.5F, -2.5F, 3, 4, 1, 0.0F);
        this.setRotateAngle(LegPanelL2, -0.4363323129985824F, 0.0F, 0.0F);
        this.ChestCordR = new ModelRenderer(this, 20, 6);
        this.ChestCordR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ChestCordR.addBox(-3.5F, 1.0F, -5.0F, 1, 4, 1, 0.0F);
        this.SideHornR1 = new ModelRenderer(this, 30, 6);
        this.SideHornR1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SideHornR1.addBox(-8.5F, -7.2F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(SideHornR1, 0.0F, 0.0F, 0.3490658503988659F);
        this.SidePanelR2 = new ModelRenderer(this, 0, 31);
        this.SidePanelR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SidePanelR2.addBox(-1.5F, 3.5F, -2.5F, 1, 3, 5, 0.0F);
        this.setRotateAngle(SidePanelR2, 0.0F, 0.0F, 0.4363323129985824F);
        this.GauntletR = new ModelRenderer(this, 100, 26);
        this.GauntletR.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.GauntletR.addBox(-3.5F, 3.5F, -2.5F, 2, 6, 5, 0.0F);
        this.ShoulderL = new ModelRenderer(this, 56, 35);
        this.ShoulderL.mirror = true;
        this.ShoulderL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderL.addBox(-1.5F, -2.5F, -2.5F, 5, 5, 5, 0.0F);
        this.FrontHornR1 = new ModelRenderer(this, 30, 6);
        this.FrontHornR1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FrontHornR1.addBox(-3.5F, -8.0F, -7.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(FrontHornR1, -0.17453292519943295F, 0.0F, 0.0F);
        this.BackPanelR2 = new ModelRenderer(this, 0, 18);
        this.BackPanelR2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BackPanelR2.addBox(-3.0F, 2.5F, 1.5F, 5, 3, 1, 0.0F);
        this.setRotateAngle(BackPanelR2, 0.4363323129985824F, 0.0F, 0.0F);
        this.SidePanelL1 = new ModelRenderer(this, 0, 22);
        this.SidePanelL1.mirror = true;
        this.SidePanelL1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SidePanelL1.addBox(1.5F, 0.5F, -2.5F, 1, 4, 5, 0.0F);
        this.setRotateAngle(SidePanelL1, 0.0F, 0.0F, -0.4363323129985824F);
        this.FrontHornL2 = new ModelRenderer(this, 39, 6);
        this.FrontHornL2.mirror = true;
        this.FrontHornL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.FrontHornL2.addBox(2.0F, -7.0F, -10.5F, 1, 1, 3, 0.0F);
        this.setRotateAngle(FrontHornL2, -0.2617993877991494F, 0.0F, 0.0F);
        this.ShoulderplateLMid = new ModelRenderer(this, 110, 37);
        this.ShoulderplateLMid.mirror = true;
        this.ShoulderplateLMid.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderplateLMid.addBox(3.5F, 2.5F, -3.5F, 2, 1, 7, 0.0F);
        this.setRotateAngle(ShoulderplateLMid, 0.0F, 0.0F, -0.3490658503988659F);
        this.Backplate = new ModelRenderer(this, 36, 45);
        this.Backplate.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Backplate.addBox(-4.0F, 1.0F, 2.0F, 8, 11, 2, 0.0F);
        this.LegPanelR1 = new ModelRenderer(this, 0, 51);
        this.LegPanelR1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegPanelR1.addBox(-1.0F, 0.5F, -3.5F, 3, 4, 1, 0.0F);
        this.setRotateAngle(LegPanelR1, -0.4363323129985824F, 0.0F, 0.0F);
        this.GauntletStrapL2 = new ModelRenderer(this, 84, 31);
        this.GauntletStrapL2.mirror = true;
        this.GauntletStrapL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.GauntletStrapL2.addBox(-1.5F, 6.5F, -2.5F, 3, 1, 5, 0.0F);
        this.MBeltL = new ModelRenderer(this, 76, 44);
        this.MBeltL.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.MBeltL.addBox(4.0F, 8.0F, -3.0F, 1, 3, 6, 0.0F);
        this.SidePanelR1 = new ModelRenderer(this, 0, 22);
        this.SidePanelR1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SidePanelR1.addBox(-2.5F, 0.5F, -2.5F, 1, 4, 5, 0.0F);
        this.setRotateAngle(SidePanelR1, 0.0F, 0.0F, 0.4363323129985824F);
        this.Helmet = new ModelRenderer(this, 41, 8);
        this.Helmet.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Helmet.addBox(-4.5F, -9.0F, -4.5F, 9, 4, 9, 0.0F);
        this.ShoulderplateL1 = new ModelRenderer(this, 110, 45);
        this.ShoulderplateL1.mirror = true;
        this.ShoulderplateL1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderplateL1.addBox(3.5F, -1.5F, -3.5F, 1, 4, 7, 0.0F);
        this.setRotateAngle(ShoulderplateL1, 0.0F, 0.0F, -0.3490658503988659F);
        this.SidePanelL2 = new ModelRenderer(this, 0, 31);
        this.SidePanelL2.mirror = true;
        this.SidePanelL2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.SidePanelL2.addBox(0.5F, 3.5F, -2.5F, 1, 3, 5, 0.0F);
        this.setRotateAngle(SidePanelL2, 0.0F, 0.0F, -0.4363323129985824F);
        this.ShoulderplateRMid = new ModelRenderer(this, 110, 37);
        this.ShoulderplateRMid.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ShoulderplateRMid.addBox(-5.5F, 2.5F, -3.5F, 2, 1, 7, 0.0F);
        this.setRotateAngle(ShoulderplateRMid, 0.0F, 0.0F, 0.3490658503988659F);
        this.BackPanelL1 = new ModelRenderer(this, 0, 18);
        this.BackPanelL1.mirror = true;
        this.BackPanelL1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BackPanelL1.addBox(-2.0F, 0.5F, 2.5F, 5, 3, 1, 0.0F);
        this.setRotateAngle(BackPanelL1, 0.4363323129985824F, 0.0F, 0.0F);
        this.LegPanelL3 = new ModelRenderer(this, 0, 56);
        this.LegPanelL3.mirror = true;
        this.LegPanelL3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegPanelL3.addBox(-2.0F, 6.5F, -1.5F, 3, 3, 1, 0.0F);
        this.setRotateAngle(LegPanelL3, -0.4363323129985824F, 0.0F, 0.0F);
        
        this.bipedHeadwear.cubeList.clear();
        this.bipedHead.cubeList.clear();
        this.bipedHead.addChild(this.Helmet);
        this.bipedHead.addChild(this.HelmetR);
        this.bipedHead.addChild(this.HelmetL);
        this.bipedHead.addChild(this.HelmetB);
        this.bipedHead.addChild(this.Visor);
        this.bipedHead.addChild(this.Mask);
        this.bipedHead.addChild(this.FrontHornR1);
        this.bipedHead.addChild(this.FrontHornR2);
        this.bipedHead.addChild(this.FrontHornL1);
        this.bipedHead.addChild(this.FrontHornL2);
        this.bipedHead.addChild(this.SideHornR1);
        this.bipedHead.addChild(this.SideHornR2);
        this.bipedHead.addChild(this.SideHornL1);
        this.bipedHead.addChild(this.SideHornL2);
        this.bipedHead.addChild(this.HelmCordR);
        this.bipedHead.addChild(this.HelmCordL);
        
        this.bipedBody.cubeList.clear();
        this.bipedBody.addChild(this.MBelt);
        this.bipedBody.addChild(this.MBeltL);
        this.bipedBody.addChild(this.MBeltR);
        this.bipedBody.addChild(this.Chestplate);
        this.bipedBody.addChild(this.Scroll);
        this.bipedBody.addChild(this.Backplate);
        this.bipedBody.addChild(this.Book);
        this.bipedBody.addChild(this.ChestCordR);
        this.bipedBody.addChild(this.ChestCordL);
        
        this.bipedRightArm.cubeList.clear();
        this.bipedRightArm.addChild(this.ShoulderR);
        this.bipedRightArm.addChild(this.ShoulderOrnamentR);
        this.bipedRightArm.addChild(this.GauntletR);
        this.bipedRightArm.addChild(this.GauntletStrapR1);
        this.bipedRightArm.addChild(this.GauntletStrapR2);
        this.bipedRightArm.addChild(this.ShoulderplateRTop);
        this.bipedRightArm.addChild(this.ShoulderplateRMid);
        this.bipedRightArm.addChild(this.ShoulderplateR1);
        this.bipedRightArm.addChild(this.ShoulderplateR2);
        this.bipedRightArm.addChild(this.ArmBladeR1);
        this.bipedRightArm.addChild(this.ArmBladeR2);
        
        this.bipedLeftArm.cubeList.clear();
        this.bipedLeftArm.addChild(this.ShoulderL);
        this.bipedLeftArm.addChild(this.ShoulderOrnamentL);
        this.bipedLeftArm.addChild(this.GauntletL);
        this.bipedLeftArm.addChild(this.GauntletStrapL1);
        this.bipedLeftArm.addChild(this.GauntletStrapL2);
        this.bipedLeftArm.addChild(this.ShoulderplateLTop);
        this.bipedLeftArm.addChild(this.ShoulderplateLMid);
        this.bipedLeftArm.addChild(this.ShoulderplateL1);
        this.bipedLeftArm.addChild(this.ShoulderplateL2);
        this.bipedLeftArm.addChild(this.ArmBladeL1);
        this.bipedLeftArm.addChild(this.ArmBladeL2);
        
        this.bipedRightLeg.cubeList.clear();
        this.bipedRightLeg.addChild(this.LegPanelR1);
        this.bipedRightLeg.addChild(this.LegPanelR2);
        this.bipedRightLeg.addChild(this.LegPanelR3);
        this.bipedRightLeg.addChild(this.LegPanelR4);
        this.bipedRightLeg.addChild(this.LegPanelR5);
        this.bipedRightLeg.addChild(this.LegPanelR6);
        this.bipedRightLeg.addChild(this.SidePanelR1);
        this.bipedRightLeg.addChild(this.SidePanelR2);
        this.bipedRightLeg.addChild(this.SidePanelR3);
        this.bipedRightLeg.addChild(this.BackPanelR1);
        this.bipedRightLeg.addChild(this.BackPanelR2);
        this.bipedRightLeg.addChild(this.BackPanelR3);
        this.bipedRightLeg.addChild(this.BeltCord);
        
        this.bipedLeftLeg.cubeList.clear();
        this.bipedLeftLeg.addChild(this.LegPanelL1);
        this.bipedLeftLeg.addChild(this.LegPanelL2);
        this.bipedLeftLeg.addChild(this.LegPanelL3);
        this.bipedLeftLeg.addChild(this.LegPanelL4);
        this.bipedLeftLeg.addChild(this.LegPanelL5);
        this.bipedLeftLeg.addChild(this.LegPanelL6);
        this.bipedLeftLeg.addChild(this.SidePanelL1);
        this.bipedLeftLeg.addChild(this.SidePanelL2);
        this.bipedLeftLeg.addChild(this.SidePanelL3);
        this.bipedLeftLeg.addChild(this.BackPanelL1);
        this.bipedLeftLeg.addChild(this.BackPanelL2);
        this.bipedLeftLeg.addChild(this.BackPanelL3);
    }
    
    protected void checkSet(Entity entity) {
        if (entity instanceof EntityLivingBase && entity.ticksExisted % 20 == 0) {
            EntityLivingBase elb = (EntityLivingBase)entity;
            int set = 0;
            
            EntityEquipmentSlot[] slots = new EntityEquipmentSlot[] { EntityEquipmentSlot.CHEST, EntityEquipmentSlot.LEGS, EntityEquipmentSlot.HEAD };
            for (EntityEquipmentSlot slot : slots) {
                ItemStack piece = elb.getItemStackFromSlot(slot);
                if (piece != null && piece.getItem() instanceof ItemVoidFortressArmor) {
                    set++;
                }
            }
            
            if (set > 0) {
                HAS_SET.put(Integer.valueOf(elb.getEntityId()), Integer.valueOf(set));
            } else {
                HAS_SET.remove(Integer.valueOf(elb.getEntityId()));
            }
        }
    }

    @Override
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        this.checkSet(entityIn);
        int set = HAS_SET.getOrDefault(Integer.valueOf(entityIn.getEntityId()), Integer.valueOf(-1)).intValue();
        
        this.Book.isHidden = (set < 2);
        this.SideHornR1.isHidden = (set < 2);
        this.SideHornR2.isHidden = (set < 2);
        this.SideHornL1.isHidden = (set < 2);
        this.SideHornL2.isHidden = (set < 2);
        this.ShoulderplateRTop.isHidden = (set < 2);
        this.ShoulderplateRMid.isHidden = (set < 2);
        this.ShoulderplateR1.isHidden = (set < 2);
        this.ShoulderOrnamentR.isHidden = (set < 2);
        this.ShoulderOrnamentL.isHidden = (set < 2);
        this.ShoulderplateLTop.isHidden = (set < 2);
        this.ShoulderplateLMid.isHidden = (set < 2);
        this.ShoulderplateL1.isHidden = (set < 2);
        this.SidePanelR2.isHidden = (set < 2);
        this.SidePanelL2.isHidden = (set < 2);

        this.Scroll.isHidden = (set < 3);
        this.FrontHornR1.isHidden = (set < 3);
        this.FrontHornR2.isHidden = (set < 3);
        this.FrontHornL1.isHidden = (set < 3);
        this.FrontHornL2.isHidden = (set < 3);
        this.ShoulderplateR2.isHidden = (set < 3);
        this.ShoulderplateL2.isHidden = (set < 3);
        this.SidePanelR3.isHidden = (set < 3);
        this.SidePanelL3.isHidden = (set < 3);
        this.HelmCordR.isHidden = (set < 3);
        this.HelmCordL.isHidden = (set < 3);
        this.ChestCordR.isHidden = (set < 3);
        this.ChestCordL.isHidden = (set < 3);
        this.BeltCord.isHidden = (set < 3);
        this.ArmBladeR1.isHidden = (set < 3);
        this.ArmBladeR2.isHidden = (set < 3);
        this.ArmBladeL1.isHidden = (set < 3);
        this.ArmBladeL2.isHidden = (set < 3);
        
        this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
        GL11.glPushMatrix();
        if (this.isChild) {
            GL11.glScalef(0.75F, 0.75F, 0.75F);
            GL11.glTranslatef(0.0F, 16.0F * scale, 0.0F);
            this.bipedHead.render(scale);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(0.5F, 0.5F, 0.5F);
            GL11.glTranslatef(0.0F, 24.0F * scale, 0.0F);
            this.bipedBody.render(scale);
            this.bipedRightArm.render(scale);
            this.bipedLeftArm.render(scale);
            this.bipedRightLeg.render(scale);
            this.bipedLeftLeg.render(scale);
            this.bipedHeadwear.render(scale);
        } else {
            this.bipedHead.render(scale);
            this.bipedBody.render(scale);
            this.bipedRightArm.render(scale);
            this.bipedLeftArm.render(scale);
            this.bipedRightLeg.render(scale);
            this.bipedLeftLeg.render(scale);
            this.bipedHeadwear.render(scale);
        }
        GL11.glPopMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

