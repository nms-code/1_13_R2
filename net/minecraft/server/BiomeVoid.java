package net.minecraft.server;

public final class BiomeVoid extends BiomeBase {

    public BiomeVoid() {
        super((new BiomeBase.a()).a(new WorldGenSurfaceComposite<>(BiomeVoid.aF, BiomeVoid.aj)).a(BiomeBase.Precipitation.NONE).a(BiomeBase.Geography.NONE).a(0.1F).b(0.2F).c(0.5F).d(0.5F).a(4159204).b(329011).a((String) null));
        this.a(WorldGenStage.Decoration.TOP_LAYER_MODIFICATION, a(WorldGenerator.N, WorldGenFeatureConfiguration.e, BiomeVoid.n, WorldGenFeatureDecoratorConfiguration.e));
    }
}
