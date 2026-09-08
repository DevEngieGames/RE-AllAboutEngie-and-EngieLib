package engiegames.engies_chaos.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelShadowEngieSharkEntity<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("engies_chaos", "model_shadow_engie_shark_entity"), "main");
	public final ModelPart Root;
	public final ModelPart Head;
	public final ModelPart Headset;
	public final ModelPart AngelHat;
	public final ModelPart Hat;
	public final ModelPart Chains;
	public final ModelPart L1;
	public final ModelPart L2;
	public final ModelPart L3;
	public final ModelPart L4;
	public final ModelPart L5;
	public final ModelPart L6;
	public final ModelPart L7;
	public final ModelPart L8;
	public final ModelPart R1;
	public final ModelPart R2;
	public final ModelPart R3;
	public final ModelPart R4;
	public final ModelPart R5;
	public final ModelPart R6;
	public final ModelPart R7;
	public final ModelPart R8;
	public final ModelPart Ear1;
	public final ModelPart Ear2;
	public final ModelPart Body;
	public final ModelPart Scarf;
	public final ModelPart RightScarf;
	public final ModelPart RightScarf2;
	public final ModelPart RightScarf3;
	public final ModelPart RightScarf4;
	public final ModelPart RightScarf5;
	public final ModelPart RightScarf6;
	public final ModelPart RightScarf7;
	public final ModelPart RightScarf8;
	public final ModelPart RightScarf9;
	public final ModelPart LeftScarf;
	public final ModelPart LeftScarf2;
	public final ModelPart LeftScarf3;
	public final ModelPart LeftScarf4;
	public final ModelPart LeftScarf5;
	public final ModelPart LeftScarf6;
	public final ModelPart LeftScarf7;
	public final ModelPart LeftScarf8;
	public final ModelPart LeftScarf9;
	public final ModelPart FinBack;
	public final ModelPart tail;
	public final ModelPart base;
	public final ModelPart base2;
	public final ModelPart mid1;
	public final ModelPart mid1a;
	public final ModelPart mid2;
	public final ModelPart mid2a;
	public final ModelPart tip;
	public final ModelPart tip2;
	public final ModelPart Ring;
	public final ModelPart Ring2;
	public final ModelPart Ring3;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;

	public ModelShadowEngieSharkEntity(ModelPart root) {
		this.Root = root.getChild("Root");
		this.Head = this.Root.getChild("Head");
		this.Headset = this.Head.getChild("Headset");
		this.AngelHat = this.Head.getChild("AngelHat");
		this.Hat = this.AngelHat.getChild("Hat");
		this.Chains = this.AngelHat.getChild("Chains");
		this.L1 = this.Chains.getChild("L1");
		this.L2 = this.L1.getChild("L2");
		this.L3 = this.L2.getChild("L3");
		this.L4 = this.L3.getChild("L4");
		this.L5 = this.L4.getChild("L5");
		this.L6 = this.L5.getChild("L6");
		this.L7 = this.L6.getChild("L7");
		this.L8 = this.L7.getChild("L8");
		this.R1 = this.Chains.getChild("R1");
		this.R2 = this.R1.getChild("R2");
		this.R3 = this.R2.getChild("R3");
		this.R4 = this.R3.getChild("R4");
		this.R5 = this.R4.getChild("R5");
		this.R6 = this.R5.getChild("R6");
		this.R7 = this.R6.getChild("R7");
		this.R8 = this.R7.getChild("R8");
		this.Ear1 = this.Head.getChild("Ear1");
		this.Ear2 = this.Head.getChild("Ear2");
		this.Body = this.Root.getChild("Body");
		this.Scarf = this.Body.getChild("Scarf");
		this.RightScarf = this.Scarf.getChild("RightScarf");
		this.RightScarf2 = this.RightScarf.getChild("RightScarf2");
		this.RightScarf3 = this.RightScarf2.getChild("RightScarf3");
		this.RightScarf4 = this.RightScarf3.getChild("RightScarf4");
		this.RightScarf5 = this.RightScarf4.getChild("RightScarf5");
		this.RightScarf6 = this.RightScarf5.getChild("RightScarf6");
		this.RightScarf7 = this.RightScarf6.getChild("RightScarf7");
		this.RightScarf8 = this.RightScarf7.getChild("RightScarf8");
		this.RightScarf9 = this.RightScarf8.getChild("RightScarf9");
		this.LeftScarf = this.Scarf.getChild("LeftScarf");
		this.LeftScarf2 = this.LeftScarf.getChild("LeftScarf2");
		this.LeftScarf3 = this.LeftScarf2.getChild("LeftScarf3");
		this.LeftScarf4 = this.LeftScarf3.getChild("LeftScarf4");
		this.LeftScarf5 = this.LeftScarf4.getChild("LeftScarf5");
		this.LeftScarf6 = this.LeftScarf5.getChild("LeftScarf6");
		this.LeftScarf7 = this.LeftScarf6.getChild("LeftScarf7");
		this.LeftScarf8 = this.LeftScarf7.getChild("LeftScarf8");
		this.LeftScarf9 = this.LeftScarf8.getChild("LeftScarf9");
		this.FinBack = this.Body.getChild("FinBack");
		this.tail = this.Body.getChild("tail");
		this.base = this.tail.getChild("base");
		this.base2 = this.base.getChild("base2");
		this.mid1 = this.base2.getChild("mid1");
		this.mid1a = this.mid1.getChild("mid1a");
		this.mid2 = this.mid1a.getChild("mid2");
		this.mid2a = this.mid2.getChild("mid2a");
		this.tip = this.mid2a.getChild("tip");
		this.tip2 = this.tip.getChild("tip2");
		this.Ring = this.tip2.getChild("Ring");
		this.Ring2 = this.tip2.getChild("Ring2");
		this.Ring3 = this.tip2.getChild("Ring3");
		this.LeftArm = this.Root.getChild("LeftArm");
		this.RightArm = this.Root.getChild("RightArm");
		this.LeftLeg = this.Root.getChild("LeftLeg");
		this.RightLeg = this.Root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Root = partdefinition.addOrReplaceChild("Root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Head = Root.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(65, 1).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(97, 1).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)).texOffs(87, 113)
						.addBox(-2.0F, -3.0F, -6.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0001F)).texOffs(88, 118).addBox(-2.0F, -2.5F, -5.75F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0001F)),
				PartPose.offset(0.0F, -24.0F, 0.0F));
		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(99, 113).addBox(-1.5099F, -1.0F, -1.0074F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0301F, -1.5F, -3.9476F, 0.0F, 0.9599F, 0.0F));
		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(119, 114).addBox(-1.5F, -1.0F, -0.9964F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0449F, -1.5F, -3.9476F, 0.0F, -0.9599F, 0.0F));
		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(109, 113).addBox(-1.5F, -1.0F, -0.9964F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0449F, -2.0F, -4.1976F, 0.0F, -0.9599F, 0.0F));
		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(99, 113).addBox(-1.5099F, -1.0F, -1.0074F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0301F, -2.0F, -4.1976F, 0.0F, 0.9599F, 0.0F));
		PartDefinition Headset = Head.addOrReplaceChild("Headset",
				CubeListBuilder.create().texOffs(0, 95).addBox(4.0053F, 0.2316F, -2.0F, 1.3F, 4.0F, 4.0F, new CubeDeformation(0.025F)).texOffs(15, 98).addBox(4.0553F, 1.0316F, -1.2F, 1.4F, 2.4F, 2.4F, new CubeDeformation(0.025F)).texOffs(23, 94)
						.addBox(4.0053F, -0.2684F, -2.0F, 0.8F, 5.0F, 4.0F, new CubeDeformation(0.05F)).texOffs(12, 88).addBox(4.0053F, 0.2316F, -2.5F, 0.8F, 4.0F, 5.0F, new CubeDeformation(0.05F)).texOffs(15, 98)
						.addBox(-5.4947F, 1.0316F, -1.2F, 1.4F, 2.4F, 2.4F, new CubeDeformation(0.025F)).texOffs(0, 95).addBox(-5.2947F, 0.2316F, -2.0F, 1.3F, 4.0F, 4.0F, new CubeDeformation(0.025F)).texOffs(23, 94).mirror()
						.addBox(-4.7947F, -0.2684F, -2.0F, 0.8F, 5.0F, 4.0F, new CubeDeformation(0.05F)).mirror(false).texOffs(12, 88).addBox(-4.7947F, 0.2316F, -2.5F, 0.8F, 4.0F, 5.0F, new CubeDeformation(0.05F)).texOffs(13, 55)
						.addBox(-4.3947F, -2.0184F, -1.0F, 0.4F, 2.95F, 2.0F, new CubeDeformation(0.0F)).texOffs(19, 56).addBox(-4.7697F, -2.5434F, -0.5F, 0.5F, 0.5F, 1.0F, new CubeDeformation(0.025F)).texOffs(19, 56)
						.addBox(4.2303F, -2.5434F, -0.5F, 0.5F, 0.5F, 1.0F, new CubeDeformation(0.025F)).texOffs(16, 56).addBox(-4.7947F, -2.4184F, 0.5F, 0.3F, 2.15F, 0.5F, new CubeDeformation(0.0F)).texOffs(16, 56)
						.addBox(-4.7947F, -2.4184F, -1.0F, 0.3F, 2.15F, 0.5F, new CubeDeformation(0.0F)).texOffs(16, 56).addBox(4.5053F, -2.4184F, -1.0F, 0.3F, 2.15F, 0.5F, new CubeDeformation(0.0F)).texOffs(16, 56)
						.addBox(4.5053F, -2.4184F, 0.5F, 0.3F, 2.15F, 0.5F, new CubeDeformation(0.0F)).texOffs(13, 55).addBox(4.0053F, -2.0184F, -1.0F, 0.4F, 2.95F, 2.0F, new CubeDeformation(0.0F)).texOffs(3, 53)
						.addBox(-4.2447F, -2.1684F, -1.0F, 8.5F, 0.4F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 50).addBox(-4.6447F, -2.5684F, -1.0F, 9.3F, 0.3F, 0.5F, new CubeDeformation(0.0F)).texOffs(20, 50)
						.addBox(-4.6447F, -2.5684F, 0.5F, 9.3F, 0.3F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.0053F, -6.2316F, 0.0F));
		PartDefinition AngelHat = Head.addOrReplaceChild("AngelHat", CubeListBuilder.create(), PartPose.offset(0.125F, -1.75F, 0.0F));
		PartDefinition Hat = AngelHat.addOrReplaceChild("Hat",
				CubeListBuilder.create().texOffs(0, 11).addBox(-9.0F, -1.0F, -9.0F, 18.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 11).addBox(-8.0F, -1.5F, -8.0F, 16.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-7.0F, -2.0F, -7.0F, 14.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 17).addBox(-6.0F, -2.5F, -6.0F, 12.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(-4.0F, -3.5F, -4.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 23).addBox(-2.0F, -4.5F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.125F, -3.0F, 0.0F));
		PartDefinition cube_r5 = Hat.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 30).addBox(-3.0F, 0.5F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, 1.5F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 23).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(-4.0F, 1.0F, -4.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 17).addBox(-6.0F, 2.0F, -6.0F, 12.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-7.0F, 2.5F, -7.0F, 14.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 11).addBox(-8.0F, 3.0F, -8.0F, 16.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(-9.0F, 3.5F, -9.0F, 18.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.5F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r6 = Hat.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 20).addBox(-2.0F, -0.5F, -4.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 17).addBox(-4.0F, 0.5F, -6.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-5.0F, 1.0F, -7.0F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 11).addBox(-6.0F, 1.5F, -8.0F, 12.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(-7.0F, 2.0F, -9.0F, 14.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r7 = Hat.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 20).addBox(-2.0F, -0.5F, -4.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 17).addBox(-4.0F, 0.5F, -6.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-5.0F, 1.0F, -7.0F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 11).addBox(-6.0F, 1.5F, -8.0F, 12.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(-7.0F, 2.0F, -9.0F, 14.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition Chains = AngelHat.addOrReplaceChild("Chains", CubeListBuilder.create(), PartPose.offset(0.125F, 3.0F, 0.0F));
		PartDefinition L1 = Chains.addOrReplaceChild("L1", CubeListBuilder.create().texOffs(127, 125).addBox(-0.075F, -0.075F, -0.025F, 0.4F, 0.4F, 0.05F, new CubeDeformation(0.025F)), PartPose.offset(8.625F, -6.125F, -0.025F));
		PartDefinition L2 = L1.addOrReplaceChild("L2", CubeListBuilder.create().texOffs(127, 125).addBox(-0.2F, -0.025F, -0.025F, 0.4F, 0.4F, 0.05F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.125F, 0.275F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition L3 = L2.addOrReplaceChild("L3", CubeListBuilder.create().texOffs(127, 125).addBox(-0.2F, -0.025F, -0.025F, 0.4F, 0.4F, 0.05F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0F, 0.325F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition L4 = L3.addOrReplaceChild("L4", CubeListBuilder.create().texOffs(127, 125).addBox(-0.2F, -0.025F, -0.025F, 0.4F, 0.4F, 0.05F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0F, 0.325F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition L5 = L4.addOrReplaceChild("L5", CubeListBuilder.create().texOffs(127, 125).addBox(-0.2F, -0.025F, -0.025F, 0.4F, 0.4F, 0.05F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0F, 0.325F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition L6 = L5.addOrReplaceChild("L6", CubeListBuilder.create().texOffs(127, 125).addBox(-0.2F, -0.025F, -0.025F, 0.4F, 0.4F, 0.05F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0F, 0.325F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition L7 = L6.addOrReplaceChild("L7", CubeListBuilder.create().texOffs(127, 125).addBox(-0.2F, -0.025F, -0.025F, 0.4F, 0.4F, 0.05F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0F, 0.325F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition L8 = L7.addOrReplaceChild("L8", CubeListBuilder.create().texOffs(127, 125).addBox(-0.2F, -0.025F, -0.025F, 0.4F, 0.4F, 0.05F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0F, 0.325F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r8 = L8.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(42, 0).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.75F)), PartPose.offsetAndRotation(0.0F, 0.4F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition R1 = Chains.addOrReplaceChild("R1", CubeListBuilder.create().texOffs(127, 125).addBox(-0.325F, -0.075F, -0.025F, 0.4F, 0.4F, 0.05F, new CubeDeformation(0.025F)), PartPose.offset(-9.125F, -6.125F, -0.025F));
		PartDefinition R2 = R1.addOrReplaceChild("R2", CubeListBuilder.create().texOffs(127, 125).addBox(-0.2F, -0.025F, -0.025F, 0.4F, 0.4F, 0.05F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(-0.125F, 0.275F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition R3 = R2.addOrReplaceChild("R3", CubeListBuilder.create().texOffs(127, 125).addBox(-0.2F, -0.025F, -0.025F, 0.4F, 0.4F, 0.05F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0F, 0.325F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition R4 = R3.addOrReplaceChild("R4", CubeListBuilder.create().texOffs(127, 125).addBox(-0.2F, -0.025F, -0.025F, 0.4F, 0.4F, 0.05F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0F, 0.325F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition R5 = R4.addOrReplaceChild("R5", CubeListBuilder.create().texOffs(127, 125).addBox(-0.2F, -0.025F, -0.025F, 0.4F, 0.4F, 0.05F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0F, 0.325F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition R6 = R5.addOrReplaceChild("R6", CubeListBuilder.create().texOffs(127, 125).addBox(-0.2F, -0.025F, -0.025F, 0.4F, 0.4F, 0.05F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0F, 0.325F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition R7 = R6.addOrReplaceChild("R7", CubeListBuilder.create().texOffs(127, 125).addBox(-0.2F, -0.025F, -0.025F, 0.4F, 0.4F, 0.05F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0F, 0.325F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition R8 = R7.addOrReplaceChild("R8", CubeListBuilder.create().texOffs(127, 125).addBox(-0.2F, -0.025F, -0.025F, 0.4F, 0.4F, 0.05F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0F, 0.325F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r9 = R8.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(42, 0).mirror().addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.75F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.4F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition Ear1 = Head.addOrReplaceChild("Ear1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.025F, -9.0F, 3.0F, -0.9163F, 0.4363F, 0.0F));
		PartDefinition cube_r10 = Ear1.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(122, 73).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.975F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));
		PartDefinition cube_r11 = Ear1.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(122, 65).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));
		PartDefinition Ear2 = Head.addOrReplaceChild("Ear2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.975F, -9.0F, 3.0F, -0.9163F, -0.4363F, 0.0F));
		PartDefinition cube_r12 = Ear2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(122, 73).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.975F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));
		PartDefinition cube_r13 = Ear2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(122, 65).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));
		PartDefinition Body = Root.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(81, 17).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(81, 33).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, -18.0F, 0.0F));
		PartDefinition Scarf = Body.addOrReplaceChild("Scarf",
				CubeListBuilder.create().texOffs(0, 68).addBox(0.725F, -2.5F, 3.875F, 2.55F, 2.0F, 0.525F, new CubeDeformation(0.0F)).texOffs(0, 68).addBox(-3.275F, -2.5F, 3.875F, 2.55F, 2.0F, 0.525F, new CubeDeformation(0.0F)).texOffs(1, 72)
						.addBox(-4.25F, -0.5F, -3.475F, 8.5F, 2.0F, 6.925F, new CubeDeformation(0.0F)).texOffs(4, 75).addBox(-4.25F, 1.325F, -1.575F, 8.5F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 71)
						.addBox(-4.525F, -2.0F, -4.525F, 9.05F, 2.525F, 9.05F, new CubeDeformation(0.0F)).texOffs(5, 74).addBox(-3.525F, -3.0F, -3.525F, 7.05F, 1.025F, 7.05F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -6.0F, 0.0F));
		PartDefinition cube_r14 = Scarf.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(5, 74).addBox(-4.225F, -0.6625F, -2.0F, 8.45F, 1.325F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4315F, 2.6042F, -2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r15 = Scarf.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(5, 74).addBox(-4.225F, -0.6625F, -2.0F, 8.45F, 1.325F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.4315F, -2.6208F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r16 = Scarf.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(2, 73).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0091F, -2.1409F, 3.675F, 1.5708F, -0.7854F, -1.5708F));
		PartDefinition cube_r17 = Scarf.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(2, 73).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0091F, -2.1409F, -3.675F, 1.5708F, 0.7854F, -1.5708F));
		PartDefinition cube_r18 = Scarf.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(2, 73).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.6659F, -2.1409F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r19 = Scarf.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(2, 73).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.6591F, -2.1409F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition RightScarf = Scarf.addOrReplaceChild("RightScarf", CubeListBuilder.create().texOffs(0, 4).addBox(-1.275F, -0.1F, -0.1625F, 2.55F, 2.5F, 0.325F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -2.4F, 4.5625F, 0.4363F, -0.2618F, 0.0873F));
		PartDefinition RightScarf2 = RightScarf.addOrReplaceChild("RightScarf2", CubeListBuilder.create().texOffs(0, 4).addBox(-1.375F, -0.1F, -0.1625F, 2.75F, 2.5F, 0.325F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, 0.0436F, 0.0F));
		PartDefinition RightScarf3 = RightScarf2.addOrReplaceChild("RightScarf3", CubeListBuilder.create().texOffs(0, 4).addBox(-1.475F, -0.1F, -0.1625F, 2.95F, 2.5F, 0.325F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, 0.0436F, 0.0F));
		PartDefinition RightScarf4 = RightScarf3.addOrReplaceChild("RightScarf4", CubeListBuilder.create().texOffs(0, 4).addBox(-1.575F, -0.1F, -0.1625F, 3.15F, 2.5F, 0.325F, new CubeDeformation(0.075F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, 0.0436F, 0.0F));
		PartDefinition RightScarf5 = RightScarf4.addOrReplaceChild("RightScarf5", CubeListBuilder.create().texOffs(0, 4).addBox(-1.675F, -0.1F, -0.1625F, 3.35F, 2.5F, 0.325F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, 0.0436F, 0.0F));
		PartDefinition RightScarf6 = RightScarf5.addOrReplaceChild("RightScarf6", CubeListBuilder.create().texOffs(0, 4).addBox(-1.775F, -0.1F, -0.1625F, 3.55F, 2.5F, 0.325F, new CubeDeformation(0.125F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, 0.0436F, 0.0F));
		PartDefinition RightScarf7 = RightScarf6.addOrReplaceChild("RightScarf7", CubeListBuilder.create().texOffs(0, 4).addBox(-1.875F, -0.1F, -0.1625F, 3.75F, 2.5F, 0.325F, new CubeDeformation(0.15F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, 0.0436F, 0.0F));
		PartDefinition RightScarf8 = RightScarf7.addOrReplaceChild("RightScarf8", CubeListBuilder.create().texOffs(0, 4).addBox(-1.975F, -0.1F, -0.1625F, 3.95F, 2.5F, 0.325F, new CubeDeformation(0.175F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, 0.0436F, 0.0F));
		PartDefinition RightScarf9 = RightScarf8.addOrReplaceChild("RightScarf9", CubeListBuilder.create().texOffs(0, 4).addBox(-2.075F, -0.1F, -0.1625F, 4.15F, 2.5F, 0.325F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, 0.0436F, 0.0F));
		PartDefinition LeftScarf = Scarf.addOrReplaceChild("LeftScarf", CubeListBuilder.create().texOffs(0, 4).addBox(-1.275F, -0.1F, -0.1625F, 2.55F, 2.5F, 0.325F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -2.4F, 4.5625F, 0.4363F, 0.2618F, -0.0873F));
		PartDefinition LeftScarf2 = LeftScarf.addOrReplaceChild("LeftScarf2", CubeListBuilder.create().texOffs(0, 4).addBox(-1.375F, -0.1F, -0.1625F, 2.75F, 2.5F, 0.325F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, -0.0436F, 0.0F));
		PartDefinition LeftScarf3 = LeftScarf2.addOrReplaceChild("LeftScarf3", CubeListBuilder.create().texOffs(0, 4).addBox(-1.475F, -0.1F, -0.1625F, 2.95F, 2.5F, 0.325F, new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, -0.0436F, 0.0F));
		PartDefinition LeftScarf4 = LeftScarf3.addOrReplaceChild("LeftScarf4", CubeListBuilder.create().texOffs(0, 4).addBox(-1.575F, -0.1F, -0.1625F, 3.15F, 2.5F, 0.325F, new CubeDeformation(0.075F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, -0.0436F, 0.0F));
		PartDefinition LeftScarf5 = LeftScarf4.addOrReplaceChild("LeftScarf5", CubeListBuilder.create().texOffs(0, 4).addBox(-1.675F, -0.1F, -0.1625F, 3.35F, 2.5F, 0.325F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, -0.0436F, 0.0F));
		PartDefinition LeftScarf6 = LeftScarf5.addOrReplaceChild("LeftScarf6", CubeListBuilder.create().texOffs(0, 4).addBox(-1.775F, -0.1F, -0.1625F, 3.55F, 2.5F, 0.325F, new CubeDeformation(0.125F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, -0.0436F, 0.0F));
		PartDefinition LeftScarf7 = LeftScarf6.addOrReplaceChild("LeftScarf7", CubeListBuilder.create().texOffs(0, 4).addBox(-1.875F, -0.1F, -0.1625F, 3.75F, 2.5F, 0.325F, new CubeDeformation(0.15F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, -0.0436F, 0.0F));
		PartDefinition LeftScarf8 = LeftScarf7.addOrReplaceChild("LeftScarf8", CubeListBuilder.create().texOffs(0, 4).addBox(-1.975F, -0.1F, -0.1625F, 3.95F, 2.5F, 0.325F, new CubeDeformation(0.175F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, -0.0436F, 0.0F));
		PartDefinition LeftScarf9 = LeftScarf8.addOrReplaceChild("LeftScarf9", CubeListBuilder.create().texOffs(0, 4).addBox(-2.075F, -0.1F, -0.1625F, 4.15F, 2.5F, 0.325F, new CubeDeformation(0.2F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, -0.0436F, 0.0F));
		PartDefinition FinBack = Body.addOrReplaceChild("FinBack", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.625F, -2.025F, 3.175F, -2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r20 = FinBack.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(122, 73).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.975F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));
		PartDefinition cube_r21 = FinBack.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(122, 65).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));
		PartDefinition tail = Body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(0.0F, 6.565F, 1.4355F));
		PartDefinition base = tail.addOrReplaceChild("base", CubeListBuilder.create().texOffs(1, 130).addBox(-3.0F, -3.1875F, 0.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, -0.4363F, 0.0F));
		PartDefinition sidefin_r1 = base.addOrReplaceChild("sidefin_r1", CubeListBuilder.create().texOffs(1, 140).mirror().addBox(-3.5F, -0.5F, -2.0F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.0F, 3.9019F, 5.583F, 0.2849F, 0.274F, -0.7459F));
		PartDefinition sidefin_r2 = base.addOrReplaceChild("sidefin_r2", CubeListBuilder.create().texOffs(1, 140).addBox(-3.5F, -0.5F, -2.0F, 7.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 3.6161F, 5.4646F, 0.2849F, -0.274F, 0.7459F));
		PartDefinition base2 = base.addOrReplaceChild("base2", CubeListBuilder.create().texOffs(1, 130).addBox(-3.0F, -3.1875F, 0.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.5156F, -0.1745F, -0.4363F, 0.0F));
		PartDefinition dorsal_r1 = base2.addOrReplaceChild("dorsal_r1", CubeListBuilder.create().texOffs(23, 130).addBox(-1.0F, -3.5F, -2.0F, 2.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.8732F, 5.0541F, -0.7854F, 0.0F, 0.0F));
		PartDefinition mid1 = base2.addOrReplaceChild("mid1", CubeListBuilder.create().texOffs(1, 130).addBox(-3.0F, -3.1875F, 0.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.5156F, -0.1745F, -0.4363F, 0.0F));
		PartDefinition mid1a = mid1.addOrReplaceChild("mid1a", CubeListBuilder.create().texOffs(1, 130).addBox(-3.0F, -3.1875F, 0.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.5156F, 0.0F, -0.4363F, -0.1745F));
		PartDefinition sidefin_r3 = mid1a.addOrReplaceChild("sidefin_r3", CubeListBuilder.create().texOffs(13, 159).mirror().addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.4922F, 2.4309F, 3.2402F, 0.0246F, 0.5108F, -0.2081F));
		PartDefinition sidefin_r4 = mid1a.addOrReplaceChild("sidefin_r4", CubeListBuilder.create().texOffs(13, 159).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4609F, 2.4243F, 3.2223F, 0.0246F, -0.5108F, 0.2081F));
		PartDefinition mid2 = mid1a.addOrReplaceChild("mid2", CubeListBuilder.create().texOffs(1, 145).addBox(-2.5F, -2.6563F, 0.0F, 5.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.5156F, 0.0F, -0.4363F, -0.1745F));
		PartDefinition mid2a = mid2.addOrReplaceChild("mid2a", CubeListBuilder.create().texOffs(1, 145).addBox(-2.5F, -2.6563F, 0.0F, 5.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.5156F, 0.2094F, -0.4363F, -0.2182F));
		PartDefinition dorsal_r2 = mid2a.addOrReplaceChild("dorsal_r2", CubeListBuilder.create().texOffs(31, 141).addBox(-0.5F, -2.5F, -1.5F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0509F, 3.0559F, -0.7854F, 0.0F, 0.0F));
		PartDefinition tip = mid2a.addOrReplaceChild("tip", CubeListBuilder.create().texOffs(29, 159).addBox(-1.5F, -1.5938F, 0.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.5156F, 0.1396F, -0.4363F, 0.0F));
		PartDefinition tip2 = tip.addOrReplaceChild("tip2", CubeListBuilder.create().texOffs(29, 159).addBox(-1.5938F, -1.5938F, 0.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 3.5156F, 0.0F, -0.4363F, 0.0F));
		PartDefinition shark_r1 = tip2.addOrReplaceChild("shark_r1", CubeListBuilder.create().texOffs(1, 154).addBox(-0.5F, -2.5F, -2.5F, 1.0F, 5.0F, 5.0F, new CubeDeformation(-0.025F)),
				PartPose.offsetAndRotation(-0.0297F, 1.2454F, 3.3058F, -0.7854F, 0.0F, 0.0F));
		PartDefinition shark_r2 = tip2.addOrReplaceChild("shark_r2", CubeListBuilder.create().texOffs(19, 145).addBox(-0.5F, -4.0F, -2.5F, 1.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0313F, -2.4669F, 4.3687F, -0.7854F, 0.0F, 0.0F));
		PartDefinition Ring = tip2.addOrReplaceChild("Ring", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.34F, 8.0552F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r22 = Ring.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(124, 110).addBox(-0.75F, -0.75F, -0.25F, 1.5F, 1.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition Ring2 = tip2.addOrReplaceChild("Ring2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.04F, 6.5552F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r23 = Ring2.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(124, 110).addBox(-0.8F, -0.75F, -0.25F, 1.5F, 1.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.05F, 0.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition Ring3 = tip2.addOrReplaceChild("Ring3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.46F, 5.1302F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r24 = Ring3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(124, 110).addBox(-0.8F, -0.75F, -0.25F, 1.5F, 1.5F, 0.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -0.05F, 0.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition LeftArm = Root.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(97, 49).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(113, 49).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(4.0F, -22.0F, 0.0F));
		PartDefinition cube_r25 = LeftArm.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.5F, 10.25F, -1.6F, 3.1416F, 0.0F, 2.8362F));
		PartDefinition cube_r26 = LeftArm.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, -0.5F, -2.0875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).texOffs(0, 26).addBox(-0.5F, -0.5F, 0.0125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).texOffs(0, 26)
						.addBox(-0.5F, -0.5F, -0.9875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).texOffs(0, 26).addBox(-0.5F, -0.5F, 1.0875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(3.5F, 10.25F, -0.0125F, 0.0F, 0.0F, 0.3054F));
		PartDefinition RightArm = Root.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(105, 17).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(105, 33).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(-4.0F, -22.0F, 0.0F));
		PartDefinition cube_r27 = RightArm.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, -0.5F, -2.0875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).texOffs(0, 26).addBox(-0.5F, -0.5F, -1.0125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).texOffs(0, 26)
						.addBox(-0.5F, -0.5F, -0.0125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).texOffs(0, 26).addBox(-0.5F, -0.5F, 1.0875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-3.5F, 10.25F, -0.0125F, 3.1416F, 0.0F, 2.8362F));
		PartDefinition cube_r28 = RightArm.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 26).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(-0.5F, 10.25F, -1.6F, 0.0F, 0.0F, 0.3054F));
		PartDefinition LeftLeg = Root.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(81, 49).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(65, 49).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(2.0F, -12.0F, 0.0F));
		PartDefinition RightLeg = Root.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(65, 17).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(65, 33).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)),
				PartPose.offset(-2.0F, -12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 130, 195);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}