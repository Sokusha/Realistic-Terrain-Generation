package rtg.world.gen.surface;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.ChunkPrimer;

import rtg.api.biome.BiomeConfig;
import rtg.util.CellNoise;
import rtg.util.CliffCalculator;
import rtg.util.OpenSimplexNoise;

public class SurfaceRedDesert extends SurfaceBase {

    private IBlockState cliffBlock1;
    private IBlockState cliffBlock2;
    private IBlockState bottomBlock;

    public SurfaceRedDesert(BiomeConfig config) {

        super(config, Blocks.sand.getStateFromMeta(1), Blocks.sand.getStateFromMeta(1));

        bottomBlock = Blocks.sandstone.getDefaultState();
        cliffBlock1 = Blocks.stained_hardened_clay.getDefaultState();
    }

    @Override
    public void paintTerrain(ChunkPrimer primer, int i, int j, int x, int y, int depth, World world, Random rand, OpenSimplexNoise simplex, CellNoise cell, float[] noise, float river, BiomeGenBase[] base) {

        float c = CliffCalculator.calc(x, y, noise);
        boolean cliff = c > 1.4f ? true : false;

        for (int k = 255; k > -1; k--) {
            Block b = primer.getBlockState((y * 16 + x) * 256 + k).getBlock();
            if (b == Blocks.air) {
                depth = -1;
            }
            else if (b == Blocks.stone) {
                depth++;

                if (cliff) {
                    if (depth < 6) {
                        primer.setBlockState((y * 16 + x) * 256 + k, cliffBlock1.getBlock().getStateFromMeta((byte) 14));
                    }
                }
                else if (depth < 6) {
                    if (depth == 0 && k > 61) {
                        primer.setBlockState((y * 16 + x) * 256 + k, topBlock);
                    }
                    else if (depth < 4) {
                        primer.setBlockState((y * 16 + x) * 256 + k, fillerBlock);
                    }
                    else {
                        primer.setBlockState((y * 16 + x) * 256 + k, bottomBlock.getBlock().getDefaultState());
                    }
                }
            }
        }
    }
}
