package mc.mdteam.extras.client.variant;

import mc.mdteam.extras.AITExtras;
import mc.mdteam.extras.tardis.variant.DimensionalVariant;
import mc.mdteam.extras.tardis.variant.EleventhVariant;
import mdteam.ait.client.models.exteriors.ExteriorModel;
import mdteam.ait.client.models.exteriors.PoliceBoxModel;
import mdteam.ait.client.registry.exterior.ClientExteriorVariantSchema;
import net.minecraft.util.Identifier;

public class ClientEleventhVariant extends ClientExteriorVariantSchema {
    public static final Identifier TEXTURE = new Identifier(AITExtras.MOD_ID, "textures/exterior/" + "eleventh" + ".png");
    public static final Identifier EMISSION = new Identifier(AITExtras.MOD_ID, "textures/exterior/" + "eleventh" + "_emission" + ".png");

    public ClientEleventhVariant() {
        super(EleventhVariant.REFERENCE);
    }

    @Override
    public Identifier texture() {
        return TEXTURE;
    }

    @Override
    public Identifier emission() {
        return EMISSION;
    }

    @Override
    public ExteriorModel model() {
        return new PoliceBoxModel(PoliceBoxModel.getTexturedModelData().createModel());
    }
}
