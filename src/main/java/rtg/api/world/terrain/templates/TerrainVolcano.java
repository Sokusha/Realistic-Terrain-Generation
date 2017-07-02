package rtg.api.world.terrain.templates;

import rtg.api.world.IRTGWorld;
import rtg.api.world.terrain.TerrainBase;

public class TerrainVolcano extends TerrainBase {

    public TerrainVolcano() {

    }

    @Override
    public float generateNoise(IRTGWorld rtgWorld, int x, int y, float border, float river) {

        return terrainVolcano(x, y, rtgWorld.simplex(), rtgWorld.cell(), border, 70f);
    }
}
