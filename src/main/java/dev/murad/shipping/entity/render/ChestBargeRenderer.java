package dev.murad.shipping.entity.render;

import dev.murad.shipping.ShippingMod;
import dev.murad.shipping.entity.custom.barge.ChestBargeEntity;
import dev.murad.shipping.entity.models.ChestBargeModel;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.model.EntityModel;
import net.minecraft.resources.ResourceLocation;

public class ChestBargeRenderer extends VesselRenderer<ChestBargeEntity> {
    private static final ResourceLocation BARGE_TEXTURE =
            new ResourceLocation(ShippingMod.MOD_ID, "textures/entity/barge.png");

    private final EntityModel model = new ChestBargeModel();

    public ChestBargeRenderer(EntityRenderDispatcher p_i46179_1_) {
        super(p_i46179_1_);
    }

    @Override
    public ResourceLocation getTextureLocation(ChestBargeEntity entity) {
        return BARGE_TEXTURE;
    }

    @Override
    public EntityModel getModel(ChestBargeEntity entity) {
        return model;
    }
}
