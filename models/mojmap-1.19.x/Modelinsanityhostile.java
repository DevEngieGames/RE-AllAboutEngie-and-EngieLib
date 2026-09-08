// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelinsanityhostile<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "insanityhostile"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart Scarf;
	private final ModelPart RightScarf;
	private final ModelPart RightScarf2;
	private final ModelPart RightScarf3;
	private final ModelPart RightScarf4;
	private final ModelPart RightScarf5;
	private final ModelPart RightScarf6;
	private final ModelPart RightScarf7;
	private final ModelPart RightScarf8;
	private final ModelPart RightScarf9;
	private final ModelPart LeftScarf;
	private final ModelPart LeftScarf2;
	private final ModelPart LeftScarf3;
	private final ModelPart LeftScarf4;
	private final ModelPart LeftScarf5;
	private final ModelPart LeftScarf6;
	private final ModelPart LeftScarf7;
	private final ModelPart LeftScarf8;
	private final ModelPart LeftScarf9;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;

	public Modelinsanityhostile(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
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
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(32, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(64, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)).texOffs(1, -1)
						.addBox(2.0F, -5.0F, -4.225F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(1, -1)
						.addBox(-2.0F, -5.0F, -4.225F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)).texOffs(0, 10)
						.addBox(-4.025F, -1.6F, -4.025F, 8.05F, 1.525F, 8.05F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(48, 16)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 32)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Scarf = Body.addOrReplaceChild("Scarf",
				CubeListBuilder.create().texOffs(0, 8)
						.addBox(-4.275F, -1.0F, -4.125F, 8.55F, 1.0F, 8.55F, new CubeDeformation(0.0F)).texOffs(1, 11)
						.addBox(-4.25F, -0.5F, -3.475F, 8.5F, 2.0F, 6.925F, new CubeDeformation(0.05F)).texOffs(0, 9)
						.addBox(-4.25F, 1.325F, -1.575F, 8.5F, 2.0F, 3.0F, new CubeDeformation(0.05F)).texOffs(0, 9)
						.addBox(-4.5F, -1.475F, -4.475F, 9.0F, 2.0F, 9.0F, new CubeDeformation(0.1F)).texOffs(0, 9)
						.addBox(-3.525F, -2.6F, -3.525F, 7.05F, 0.025F, 7.05F, new CubeDeformation(0.05F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Scarf.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 9).addBox(-4.225F, -0.6625F, -2.0F, 8.45F, 1.325F, 4.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0F, 1.4315F, 2.6042F, -2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r2 = Scarf.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 9).addBox(-4.225F, -0.6625F, -2.0F, 8.45F, 1.325F, 4.0F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0F, 1.4315F, -2.6208F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Scarf.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0091F, -1.7409F, 3.675F, 1.5708F, -0.7854F, -1.5708F));

		PartDefinition cube_r4 = Scarf.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0091F, -1.7409F, -3.675F, 1.5708F, 0.7854F, -1.5708F));

		PartDefinition cube_r5 = Scarf.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(-3.6659F, -1.7409F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r6 = Scarf.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 8).addBox(-0.5F, -0.725F, -4.025F, 1.0F, 1.45F, 8.05F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(3.6591F, -1.7409F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition RightScarf = Scarf.addOrReplaceChild("RightScarf",
				CubeListBuilder.create().texOffs(0, 9).addBox(-1.275F, -0.1F, -0.1625F, 2.55F, 2.5F, 0.325F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -1.4F, 4.5625F, 0.5236F, -0.0873F, 0.0873F));

		PartDefinition RightScarf2 = RightScarf.addOrReplaceChild("RightScarf2",
				CubeListBuilder.create().texOffs(0, 9).addBox(-1.375F, -0.1F, -0.1625F, 2.75F, 2.5F, 0.325F,
						new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, 0.0F, 0.0436F));

		PartDefinition RightScarf3 = RightScarf2.addOrReplaceChild("RightScarf3",
				CubeListBuilder.create().texOffs(0, 9).addBox(-1.475F, -0.1F, -0.1625F, 2.95F, 2.5F, 0.325F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, 0.0F, 0.0436F));

		PartDefinition RightScarf4 = RightScarf3.addOrReplaceChild("RightScarf4",
				CubeListBuilder.create().texOffs(0, 9).addBox(-1.575F, -0.1F, -0.1625F, 3.15F, 2.5F, 0.325F,
						new CubeDeformation(0.075F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, 0.0873F, 0.0F, 0.0436F));

		PartDefinition RightScarf5 = RightScarf4.addOrReplaceChild("RightScarf5",
				CubeListBuilder.create().texOffs(0, 9).addBox(-1.675F, -0.1F, -0.1625F, 3.35F, 2.5F, 0.325F,
						new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1745F, 0.0F, 0.0436F));

		PartDefinition RightScarf6 = RightScarf5.addOrReplaceChild("RightScarf6",
				CubeListBuilder.create().texOffs(0, 9).addBox(-1.775F, -0.1F, -0.1625F, 3.55F, 2.5F, 0.325F,
						new CubeDeformation(0.125F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1745F, 0.0F, 0.0436F));

		PartDefinition RightScarf7 = RightScarf6.addOrReplaceChild("RightScarf7",
				CubeListBuilder.create().texOffs(0, 9).addBox(-1.875F, -0.1F, -0.1625F, 3.75F, 2.5F, 0.325F,
						new CubeDeformation(0.15F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1745F, 0.0F, 0.0436F));

		PartDefinition RightScarf8 = RightScarf7.addOrReplaceChild("RightScarf8",
				CubeListBuilder.create().texOffs(0, 9).addBox(-1.975F, -0.1F, -0.1625F, 3.95F, 2.5F, 0.325F,
						new CubeDeformation(0.175F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1745F, 0.0F, 0.0436F));

		PartDefinition RightScarf9 = RightScarf8.addOrReplaceChild("RightScarf9", CubeListBuilder.create().texOffs(0, 9)
				.addBox(-0.5747F, 0.9923F, -0.3124F, 1.0F, 1.0F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 9)
				.addBox(-0.5747F, 1.8923F, -0.3124F, 1.0F, 1.0F, 0.325F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1745F, 0.0F, 0.0436F));

		PartDefinition cube_r7 = RightScarf9.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 9)
				.addBox(-1.9811F, 0.4047F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(-0.1F)).texOffs(0, 9)
				.addBox(-1.9784F, -0.4922F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1481F, 1.583F, -0.1317F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r8 = RightScarf9.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 9)
				.addBox(1.1265F, 0.4239F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(-0.1F)).texOffs(0, 9)
				.addBox(1.1239F, -0.473F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1481F, 1.583F, -0.1317F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r9 = RightScarf9.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 9)
				.addBox(-3.5292F, 0.774F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(-0.1F)).texOffs(0, 9)
				.addBox(-3.5043F, -0.1144F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1481F, 1.583F, -0.1317F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r10 = RightScarf9.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 9)
				.addBox(2.7168F, 0.8332F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(-0.1F)).texOffs(0, 9)
				.addBox(2.6919F, -0.0553F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1481F, 1.583F, -0.1317F, 0.0F, 0.0F, -0.3054F));

		PartDefinition LeftScarf = Scarf.addOrReplaceChild("LeftScarf",
				CubeListBuilder.create().texOffs(0, 9).addBox(-1.275F, -0.1F, -0.1625F, 2.55F, 2.5F, 0.325F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -1.4F, 4.5625F, 0.5236F, 0.0873F, -0.0873F));

		PartDefinition LeftScarf2 = LeftScarf.addOrReplaceChild("LeftScarf2",
				CubeListBuilder.create().texOffs(0, 9).addBox(-1.375F, -0.1F, -0.1625F, 2.75F, 2.5F, 0.325F,
						new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, 0.0F, -0.0436F));

		PartDefinition LeftScarf3 = LeftScarf2.addOrReplaceChild("LeftScarf3",
				CubeListBuilder.create().texOffs(0, 9).addBox(-1.475F, -0.1F, -0.1625F, 2.95F, 2.5F, 0.325F,
						new CubeDeformation(0.05F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1309F, 0.0F, -0.0436F));

		PartDefinition LeftScarf4 = LeftScarf3.addOrReplaceChild("LeftScarf4",
				CubeListBuilder.create().texOffs(0, 9).addBox(-1.575F, -0.1F, -0.1625F, 3.15F, 2.5F, 0.325F,
						new CubeDeformation(0.075F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, 0.0873F, 0.0F, -0.0436F));

		PartDefinition LeftScarf5 = LeftScarf4.addOrReplaceChild("LeftScarf5",
				CubeListBuilder.create().texOffs(0, 9).addBox(-1.675F, -0.1F, -0.1625F, 3.35F, 2.5F, 0.325F,
						new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1745F, 0.0F, -0.0436F));

		PartDefinition LeftScarf6 = LeftScarf5.addOrReplaceChild("LeftScarf6",
				CubeListBuilder.create().texOffs(0, 9).addBox(-1.775F, -0.1F, -0.1625F, 3.55F, 2.5F, 0.325F,
						new CubeDeformation(0.125F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1745F, 0.0F, -0.0436F));

		PartDefinition LeftScarf7 = LeftScarf6.addOrReplaceChild("LeftScarf7",
				CubeListBuilder.create().texOffs(0, 9).addBox(-1.875F, -0.1F, -0.1625F, 3.75F, 2.5F, 0.325F,
						new CubeDeformation(0.15F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1745F, 0.0F, -0.0436F));

		PartDefinition LeftScarf8 = LeftScarf7.addOrReplaceChild("LeftScarf8",
				CubeListBuilder.create().texOffs(0, 9).addBox(-1.975F, -0.1F, -0.1625F, 3.95F, 2.5F, 0.325F,
						new CubeDeformation(0.175F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1745F, 0.0F, -0.0436F));

		PartDefinition LeftScarf9 = LeftScarf8.addOrReplaceChild("LeftScarf9", CubeListBuilder.create().texOffs(0, 9)
				.addBox(-0.5748F, 0.9923F, -0.3124F, 1.0F, 1.0F, 0.325F, new CubeDeformation(0.0F)).texOffs(0, 9)
				.addBox(-0.5748F, 1.8923F, -0.3124F, 1.0F, 1.0F, 0.325F, new CubeDeformation(-0.1F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 0.0F, -0.1745F, 0.0F, -0.0436F));

		PartDefinition cube_r11 = LeftScarf9.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 9)
				.addBox(-1.9811F, 0.4047F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(-0.1F)).texOffs(0, 9)
				.addBox(-1.9784F, -0.4922F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1481F, 1.583F, -0.1317F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r12 = LeftScarf9.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 9)
				.addBox(1.1265F, 0.4239F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(-0.1F)).texOffs(0, 9)
				.addBox(1.1239F, -0.473F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1481F, 1.583F, -0.1317F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r13 = LeftScarf9.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 9)
				.addBox(-3.5292F, 0.774F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(-0.1F)).texOffs(0, 9)
				.addBox(-3.5043F, -0.1144F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1481F, 1.583F, -0.1317F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r14 = LeftScarf9.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 9)
				.addBox(2.7168F, 0.8332F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(-0.1F)).texOffs(0, 9)
				.addBox(2.6919F, -0.0553F, -0.1807F, 1.0F, 1.0F, 0.325F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.1481F, 1.583F, -0.1317F, 0.0F, 0.0F, -0.3054F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(32, 16)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 32)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-2.0F, 12.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(48, 48)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 48)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(2.0F, 12.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(72, 16)
						.addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(72, 32)
						.addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(-4.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(64, 48)
						.addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(80, 48)
						.addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(4.0F, 2.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}