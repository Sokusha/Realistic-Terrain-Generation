package rtg.config;

import java.util.ArrayList;

import net.minecraftforge.common.config.Configuration;

import rtg.api.biome.BiomeConfig;
import rtg.api.biome.BiomeConfigProperty;
import rtg.api.biome.abyssalcraft.config.*;
import rtg.api.biome.biomesoplenty.config.*;
import rtg.api.biome.buildcraft.config.BiomeConfigBC;
import rtg.api.biome.buildcraft.config.BiomeConfigBCDesertOilField;
import rtg.api.biome.buildcraft.config.BiomeConfigBCOceanOilField;
import rtg.api.biome.flowercraft.config.BiomeConfigFC;
import rtg.api.biome.flowercraft.config.BiomeConfigFCPhantasia;
import rtg.api.biome.highlands.config.*;
import rtg.api.biome.minestrappolation.config.BiomeConfigMS;
import rtg.api.biome.minestrappolation.config.BiomeConfigMSRedwoodForest;
import rtg.api.biome.minestrappolation.config.BiomeConfigMSTheFrost;
import rtg.api.biome.thaumcraft.config.BiomeConfigTC;
import rtg.api.biome.thaumcraft.config.BiomeConfigTCEerie;
import rtg.api.biome.thaumcraft.config.BiomeConfigTCMagicalForest;
import rtg.api.biome.thaumcraft.config.BiomeConfigTCTaintedLand;
import rtg.api.biome.vanilla.config.*;

public class BiomeConfigManager {

    public static void initBiomeConfigs() {

        initBiomeConfigsAC();
        initBiomeConfigsBOP();
        initBiomeConfigsBC();
        initBiomeConfigsHL();
        initBiomeConfigsMS();
        initBiomeConfigsTC();
        initBiomeConfigsFC();
        initBiomeConfigsVanilla();
    }

    public static void initBiomeConfigsAC() {

        BiomeConfigAC.biomeConfigACCoraliumInfestedSwamp = new BiomeConfigACCoraliumInfestedSwamp();
        BiomeConfigAC.biomeConfigACDarklands = new BiomeConfigACDarklands();
        BiomeConfigAC.biomeConfigACDarklandsForest = new BiomeConfigACDarklandsForest();
        BiomeConfigAC.biomeConfigACDarklandsHighland = new BiomeConfigACDarklandsHighland();
        BiomeConfigAC.biomeConfigACDarklandsMountains = new BiomeConfigACDarklandsMountains();
        BiomeConfigAC.biomeConfigACDarklandsPlains = new BiomeConfigACDarklandsPlains();
    }

    public static void initBiomeConfigsBOP() {

        BiomeConfigBOP.biomeConfigBOPAlps = new BiomeConfigBOPAlps();
        BiomeConfigBOP.biomeConfigBOPBambooForest = new BiomeConfigBOPBambooForest();
        BiomeConfigBOP.biomeConfigBOPBayou = new BiomeConfigBOPBayou();
        BiomeConfigBOP.biomeConfigBOPBog = new BiomeConfigBOPBog();
        BiomeConfigBOP.biomeConfigBOPBorealForest = new BiomeConfigBOPBorealForest();
        BiomeConfigBOP.biomeConfigBOPBrushland = new BiomeConfigBOPBrushland();
        BiomeConfigBOP.biomeConfigBOPChaparral = new BiomeConfigBOPChaparral();
        BiomeConfigBOP.biomeConfigBOPCherryBlossomGrove = new BiomeConfigBOPCherryBlossomGrove();
        BiomeConfigBOP.biomeConfigBOPColdDesert = new BiomeConfigBOPColdDesert();
        BiomeConfigBOP.biomeConfigBOPConiferousForest = new BiomeConfigBOPConiferousForest();
        BiomeConfigBOP.biomeConfigBOPCoralReef = new BiomeConfigBOPCoralReef();
        BiomeConfigBOP.biomeConfigBOPCrag = new BiomeConfigBOPCrag();
        BiomeConfigBOP.biomeConfigBOPDeadForest = new BiomeConfigBOPDeadForest();
        BiomeConfigBOP.biomeConfigBOPDeadSwamp = new BiomeConfigBOPDeadSwamp();
        BiomeConfigBOP.biomeConfigBOPEucalyptusForest = new BiomeConfigBOPEucalyptusForest();
        BiomeConfigBOP.biomeConfigBOPFen = new BiomeConfigBOPFen();
        BiomeConfigBOP.biomeConfigBOPFlowerField = new BiomeConfigBOPFlowerField();
        BiomeConfigBOP.biomeConfigBOPFlowerIsland = new BiomeConfigBOPFlowerIsland();
        BiomeConfigBOP.biomeConfigBOPGlacier = new BiomeConfigBOPGlacier();
        BiomeConfigBOP.biomeConfigBOPGrassland = new BiomeConfigBOPGrassland();
        BiomeConfigBOP.biomeConfigBOPGravelBeach = new BiomeConfigBOPGravelBeach();
        BiomeConfigBOP.biomeConfigBOPGrove = new BiomeConfigBOPGrove();
        BiomeConfigBOP.biomeConfigBOPHeathland = new BiomeConfigBOPHeathland();
        BiomeConfigBOP.biomeConfigBOPHighland = new BiomeConfigBOPHighland();
        BiomeConfigBOP.biomeConfigBOPKelpForest = new BiomeConfigBOPKelpForest();
        BiomeConfigBOP.biomeConfigBOPLandOfLakes = new BiomeConfigBOPLandOfLakes();
        BiomeConfigBOP.biomeConfigBOPLavenderFields = new BiomeConfigBOPLavenderFields();
        BiomeConfigBOP.biomeConfigBOPLushDesert = new BiomeConfigBOPLushDesert();
        BiomeConfigBOP.biomeConfigBOPLushSwamp = new BiomeConfigBOPLushSwamp();
        BiomeConfigBOP.biomeConfigBOPMapleWoods = new BiomeConfigBOPMapleWoods();
        BiomeConfigBOP.biomeConfigBOPMarsh = new BiomeConfigBOPMarsh();
        BiomeConfigBOP.biomeConfigBOPMeadow = new BiomeConfigBOPMeadow();
        BiomeConfigBOP.biomeConfigBOPMoor = new BiomeConfigBOPMoor();
        BiomeConfigBOP.biomeConfigBOPMountain = new BiomeConfigBOPMountain();
        BiomeConfigBOP.biomeConfigBOPMountainFoothills = new BiomeConfigBOPMountainFoothills();
        BiomeConfigBOP.biomeConfigBOPMysticGrove = new BiomeConfigBOPMysticGrove();
        BiomeConfigBOP.biomeConfigBOPOasis = new BiomeConfigBOPOasis();
        BiomeConfigBOP.biomeConfigBOPOminousWoods = new BiomeConfigBOPOminousWoods();
        BiomeConfigBOP.biomeConfigBOPOrchard = new BiomeConfigBOPOrchard();
        BiomeConfigBOP.biomeConfigBOPOriginIsland = new BiomeConfigBOPOriginIsland();
        BiomeConfigBOP.biomeConfigBOPOutback = new BiomeConfigBOPOutback();
        BiomeConfigBOP.biomeConfigBOPOvergrownCliffs = new BiomeConfigBOPOvergrownCliffs();
        BiomeConfigBOP.biomeConfigBOPPrairie = new BiomeConfigBOPPrairie();
        BiomeConfigBOP.biomeConfigBOPQuagmire = new BiomeConfigBOPQuagmire();
        BiomeConfigBOP.biomeConfigBOPRainforest = new BiomeConfigBOPRainforest();
        BiomeConfigBOP.biomeConfigBOPRedwoodForest = new BiomeConfigBOPRedwoodForest();
        BiomeConfigBOP.biomeConfigBOPSacredSprings = new BiomeConfigBOPSacredSprings();
        BiomeConfigBOP.biomeConfigBOPSeasonalForest = new BiomeConfigBOPSeasonalForest();
        BiomeConfigBOP.biomeConfigBOPShield = new BiomeConfigBOPShield();
        BiomeConfigBOP.biomeConfigBOPShrubland = new BiomeConfigBOPShrubland();
        BiomeConfigBOP.biomeConfigBOPSnowyConiferousForest = new BiomeConfigBOPSnowyConiferousForest();
        BiomeConfigBOP.biomeConfigBOPSnowyForest = new BiomeConfigBOPSnowyForest();
        BiomeConfigBOP.biomeConfigBOPSteppe = new BiomeConfigBOPSteppe();
        BiomeConfigBOP.biomeConfigBOPTemperateRainforest = new BiomeConfigBOPTemperateRainforest();
        BiomeConfigBOP.biomeConfigBOPTropicalIsland = new BiomeConfigBOPTropicalIsland();
        BiomeConfigBOP.biomeConfigBOPTropicalRainforest = new BiomeConfigBOPTropicalRainforest();
        BiomeConfigBOP.biomeConfigBOPTundra = new BiomeConfigBOPTundra();
        BiomeConfigBOP.biomeConfigBOPVolcanicIsland = new BiomeConfigBOPVolcanicIsland();
        BiomeConfigBOP.biomeConfigBOPWasteland = new BiomeConfigBOPWasteland();
        BiomeConfigBOP.biomeConfigBOPWetland = new BiomeConfigBOPWetland();
        BiomeConfigBOP.biomeConfigBOPWoodland = new BiomeConfigBOPWoodland();
        BiomeConfigBOP.biomeConfigBOPXericShrubland = new BiomeConfigBOPXericShrubland();
    }

    public static void initBiomeConfigsBC() {

        BiomeConfigBC.biomeConfigBCDesertOilField = new BiomeConfigBCDesertOilField();
        BiomeConfigBC.biomeConfigBCOceanOilField = new BiomeConfigBCOceanOilField();
    }

    public static void initBiomeConfigsHL() {

        BiomeConfigHL.biomeConfigHLAdirondacks = new BiomeConfigHLAdirondacks();
        BiomeConfigHL.biomeConfigHLAdirondacksFoothills = new BiomeConfigHLAdirondacksFoothills();
        BiomeConfigHL.biomeConfigHLAlps = new BiomeConfigHLAlps();
        BiomeConfigHL.biomeConfigHLAlpsFoothills = new BiomeConfigHLAlpsFoothills();
        BiomeConfigHL.biomeConfigHLBadlands = new BiomeConfigHLBadlands();
        BiomeConfigHL.biomeConfigHLBadlandsFoothills = new BiomeConfigHLBadlandsFoothills();
        BiomeConfigHL.biomeConfigHLBaldHill = new BiomeConfigHLBaldHill();
        BiomeConfigHL.biomeConfigHLBambooForest = new BiomeConfigHLBambooForest();
        BiomeConfigHL.biomeConfigHLDryForest = new BiomeConfigHLDryForest();
        BiomeConfigHL.biomeConfigHLDunes = new BiomeConfigHLDunes();
        BiomeConfigHL.biomeConfigHLGreyMountains = new BiomeConfigHLGreyMountains();
        BiomeConfigHL.biomeConfigHLGreyMountainsFoothills = new BiomeConfigHLGreyMountainsFoothills();
        BiomeConfigHL.biomeConfigHLHighlands = new BiomeConfigHLHighlands();
        BiomeConfigHL.biomeConfigHLLake = new BiomeConfigHLLake();
        BiomeConfigHL.biomeConfigHLLowlands = new BiomeConfigHLLowlands();
        BiomeConfigHL.biomeConfigHLMeadow = new BiomeConfigHLMeadow();
        BiomeConfigHL.biomeConfigHLMojave = new BiomeConfigHLMojave();
        BiomeConfigHL.biomeConfigHLPinelands = new BiomeConfigHLPinelands();
        BiomeConfigHL.biomeConfigHLPoplarHills = new BiomeConfigHLPoplarHills();
        BiomeConfigHL.biomeConfigHLRedwoodForest = new BiomeConfigHLRedwoodForest();
        BiomeConfigHL.biomeConfigHLTropicalHills = new BiomeConfigHLTropicalHills();
        BiomeConfigHL.biomeConfigHLTropicalIslands = new BiomeConfigHLTropicalIslands();
    }

    public static void initBiomeConfigsMS() {

        BiomeConfigMS.biomeConfigMSRedwoodForest = new BiomeConfigMSRedwoodForest();
        BiomeConfigMS.biomeConfigMSTheFrost = new BiomeConfigMSTheFrost();
    }

    public static void initBiomeConfigsTC() {

        BiomeConfigTC.biomeConfigTCEerie = new BiomeConfigTCEerie();
        BiomeConfigTC.biomeConfigTCMagicalForest = new BiomeConfigTCMagicalForest();
        BiomeConfigTC.biomeConfigTCTaintedLand = new BiomeConfigTCTaintedLand();
    }

    public static void initBiomeConfigsFC() {

        BiomeConfigFC.biomeConfigFCPhantasia = new BiomeConfigFCPhantasia();
    }

    public static void initBiomeConfigsVanilla() {

        BiomeConfigVanilla.biomeConfigVanillaBeach = new BiomeConfigVanillaBeach();
        BiomeConfigVanilla.biomeConfigVanillaBirchForest = new BiomeConfigVanillaBirchForest();
        BiomeConfigVanilla.biomeConfigVanillaBirchForestHills = new BiomeConfigVanillaBirchForestHills();
        BiomeConfigVanilla.biomeConfigVanillaColdBeach = new BiomeConfigVanillaColdBeach();
        BiomeConfigVanilla.biomeConfigVanillaColdTaiga = new BiomeConfigVanillaColdTaiga();
        BiomeConfigVanilla.biomeConfigVanillaColdTaigaHills = new BiomeConfigVanillaColdTaigaHills();
        BiomeConfigVanilla.biomeConfigVanillaDeepOcean = new BiomeConfigVanillaDeepOcean();
        BiomeConfigVanilla.biomeConfigVanillaDesert = new BiomeConfigVanillaDesert();
        BiomeConfigVanilla.biomeConfigVanillaDesertHills = new BiomeConfigVanillaDesertHills();
        BiomeConfigVanilla.biomeConfigVanillaExtremeHills = new BiomeConfigVanillaExtremeHills();
        BiomeConfigVanilla.biomeConfigVanillaExtremeHillsEdge = new BiomeConfigVanillaExtremeHillsEdge();
        BiomeConfigVanilla.biomeConfigVanillaExtremeHillsPlus = new BiomeConfigVanillaExtremeHillsPlus();
        BiomeConfigVanilla.biomeConfigVanillaForest = new BiomeConfigVanillaForest();
        BiomeConfigVanilla.biomeConfigVanillaForestHills = new BiomeConfigVanillaForestHills();
        BiomeConfigVanilla.biomeConfigVanillaFrozenOcean = new BiomeConfigVanillaFrozenOcean();
        BiomeConfigVanilla.biomeConfigVanillaFrozenRiver = new BiomeConfigVanillaFrozenRiver();
        BiomeConfigVanilla.biomeConfigVanillaIcePlains = new BiomeConfigVanillaIcePlains();
        BiomeConfigVanilla.biomeConfigVanillaIceMountains = new BiomeConfigVanillaIceMountains();
        BiomeConfigVanilla.biomeConfigVanillaJungle = new BiomeConfigVanillaJungle();
        BiomeConfigVanilla.biomeConfigVanillaJungleEdge = new BiomeConfigVanillaJungleEdge();
        BiomeConfigVanilla.biomeConfigVanillaJungleHills = new BiomeConfigVanillaJungleHills();
        BiomeConfigVanilla.biomeConfigVanillaMegaTaiga = new BiomeConfigVanillaMegaTaiga();
        BiomeConfigVanilla.biomeConfigVanillaMegaTaigaHills = new BiomeConfigVanillaMegaTaigaHills();
        BiomeConfigVanilla.biomeConfigVanillaMesa = new BiomeConfigVanillaMesa();
        BiomeConfigVanilla.biomeConfigVanillaMesaPlateau = new BiomeConfigVanillaMesaPlateau();
        BiomeConfigVanilla.biomeConfigVanillaMesaPlateauF = new BiomeConfigVanillaMesaPlateauF();
        BiomeConfigVanilla.biomeConfigVanillaMushroomIsland = new BiomeConfigVanillaMushroomIsland();
        BiomeConfigVanilla.biomeConfigVanillaMushroomIslandShore = new BiomeConfigVanillaMushroomIslandShore();
        BiomeConfigVanilla.biomeConfigVanillaOcean = new BiomeConfigVanillaOcean();
        BiomeConfigVanilla.biomeConfigVanillaPlains = new BiomeConfigVanillaPlains();
        BiomeConfigVanilla.biomeConfigVanillaRiver = new BiomeConfigVanillaRiver();
        BiomeConfigVanilla.biomeConfigVanillaRoofedForest = new BiomeConfigVanillaRoofedForest();
        BiomeConfigVanilla.biomeConfigVanillaSavanna = new BiomeConfigVanillaSavanna();
        BiomeConfigVanilla.biomeConfigVanillaSavannaPlateau = new BiomeConfigVanillaSavannaPlateau();
        BiomeConfigVanilla.biomeConfigVanillaStoneBeach = new BiomeConfigVanillaStoneBeach();
        BiomeConfigVanilla.biomeConfigVanillaSwampland = new BiomeConfigVanillaSwampland();
        BiomeConfigVanilla.biomeConfigVanillaTaiga = new BiomeConfigVanillaTaiga();
        BiomeConfigVanilla.biomeConfigVanillaTaigaHills = new BiomeConfigVanillaTaigaHills();
        BiomeConfigVanilla.biomeConfigVanillaSunflowerPlains = new BiomeConfigVanillaSunflowerPlains();
        BiomeConfigVanilla.biomeConfigVanillaDesertM = new BiomeConfigVanillaDesertM();
        BiomeConfigVanilla.biomeConfigVanillaExtremeHillsM = new BiomeConfigVanillaExtremeHillsM();
        BiomeConfigVanilla.biomeConfigVanillaFlowerForest = new BiomeConfigVanillaFlowerForest();
        BiomeConfigVanilla.biomeConfigVanillaTaigaM = new BiomeConfigVanillaTaigaM();
        BiomeConfigVanilla.biomeConfigVanillaSwamplandM = new BiomeConfigVanillaSwamplandM();
        BiomeConfigVanilla.biomeConfigVanillaIcePlainsSpikes = new BiomeConfigVanillaIcePlainsSpikes();
        BiomeConfigVanilla.biomeConfigVanillaJungleM = new BiomeConfigVanillaJungleM();
        BiomeConfigVanilla.biomeConfigVanillaJungleEdgeM = new BiomeConfigVanillaJungleEdgeM();
        BiomeConfigVanilla.biomeConfigVanillaBirchForestM = new BiomeConfigVanillaBirchForestM();
        BiomeConfigVanilla.biomeConfigVanillaBirchForestHillsM = new BiomeConfigVanillaBirchForestHillsM();
        BiomeConfigVanilla.biomeConfigVanillaRoofedForestM = new BiomeConfigVanillaRoofedForestM();
        BiomeConfigVanilla.biomeConfigVanillaColdTaigaM = new BiomeConfigVanillaColdTaigaM();
        BiomeConfigVanilla.biomeConfigVanillaMegaSpruceTaiga = new BiomeConfigVanillaMegaSpruceTaiga();
        BiomeConfigVanilla.biomeConfigVanillaRedwoodTaigaHills = new BiomeConfigVanillaRedwoodTaigaHills();
        BiomeConfigVanilla.biomeConfigVanillaExtremeHillsPlusM = new BiomeConfigVanillaExtremeHillsPlusM();
        BiomeConfigVanilla.biomeConfigVanillaSavannaM = new BiomeConfigVanillaSavannaM();
        BiomeConfigVanilla.biomeConfigVanillaSavannaPlateauM = new BiomeConfigVanillaSavannaPlateauM();
        BiomeConfigVanilla.biomeConfigVanillaMesaBryce = new BiomeConfigVanillaMesaBryce();
        BiomeConfigVanilla.biomeConfigVanillaMesaPlateauFM = new BiomeConfigVanillaMesaPlateauFM();
        BiomeConfigVanilla.biomeConfigVanillaMesaPlateauM = new BiomeConfigVanillaMesaPlateauM();
    }

    public static void setBiomeConfigsFromUserConfigs(BiomeConfig[] biomeConfigs, Configuration config) {

        for (int i = 0; i < biomeConfigs.length; i++) {

            String categoryName = "biome." + biomeConfigs[i].modSlug + "." + biomeConfigs[i].biomeSlug;
            ArrayList<BiomeConfigProperty> properties = biomeConfigs[i].getProperties();

            for (int j = 0; j < properties.size(); j++) {

                BiomeConfigProperty prop = properties.get(j);

                switch (prop.type) {

                    case INTEGER:

                        prop.valueInt = config.getInt(
                            prop.name,
                            categoryName,
                            prop.valueInt,
                            prop.minValue,
                            prop.maxValue,
                            prop.description
                        );

                        break;

                    case BOOLEAN:

                        prop.valueBoolean = config.getBoolean(
                            prop.name,
                            categoryName,
                            prop.valueBoolean,
                            prop.description
                        );

                        break;

                    case STRING:

                        prop.valueString = config.getString(
                            prop.name,
                            categoryName,
                            prop.valueString,
                            prop.description
                        );

                        break;
                    default:
                        throw new RuntimeException("BiomeConfigProperty type not supported.");
                }
            }
        }
    }
}
