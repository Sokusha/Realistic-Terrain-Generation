package rtg.world.biome.realistic.vanilla;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenTrees;

import rtg.api.biome.BiomeConfig;
import rtg.world.biome.deco.*;
import rtg.world.gen.surface.vanilla.SurfaceVanillaMesaPlateauF;
import rtg.world.gen.terrain.vanilla.TerrainVanillaMesaPlateauF;

public class RealisticBiomeVanillaMesaPlateauF extends RealisticBiomeVanillaBase {

    public static IBlockState topBlock = BiomeGenBase.mesaPlateau_F.topBlock;
    public static IBlockState fillerBlock = BiomeGenBase.mesaPlateau_F.fillerBlock;

    public RealisticBiomeVanillaMesaPlateauF(BiomeConfig config) {

        super(config,
            BiomeGenBase.mesaPlateau_F,
            BiomeGenBase.river,
            new TerrainVanillaMesaPlateauF(true, 35f, 160f, 60f, 40f, 69f),
            new SurfaceVanillaMesaPlateauF(config, Blocks.sand.getStateFromMeta(1), Blocks.sand.getStateFromMeta(1), 0)
        );

        this.noLakes = true;

        DecoShrub decoShrub = new DecoShrub();
        decoShrub.chance = 10;
        addDeco(decoShrub);

        DecoCactus decoCactus = new DecoCactus();
        decoCactus.strengthFactor = 25f;
        decoCactus.soilBlock = Blocks.sand;
        decoCactus.soilMeta = (byte) 1;
        decoCactus.sandOnly = false;
        decoCactus.maxRiver = 0.8f;
        addDeco(decoCactus);

        DecoReed decoReed = new DecoReed();
        decoReed.loops = 5;
        decoReed.maxRiver = 0.8f;
        addDeco(decoReed);

        DecoDeadBush decoDeadBush = new DecoDeadBush();
        decoDeadBush.strengthFactor = 5f;
        addDeco(decoDeadBush);

        DecoTree decoTree = new DecoTree(new WorldGenTrees(false));
        decoTree.loops = 20;
        decoTree.treeType = DecoTree.TreeType.WORLDGEN;
        decoTree.treeCondition = DecoTree.TreeCondition.X_DIVIDED_BY_STRENGTH;
        decoTree.distribution = new DecoTree.Distribution(24f, 1f, 0f);
        decoTree.treeConditionChance = 0;
        decoTree.treeConditionFloat = 4f;
        decoTree.treeConditionNoise = 0f;
        decoTree.minY = 74;
        addDeco(decoTree);
    }
}
