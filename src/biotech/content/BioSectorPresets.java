package biotech.content;

import mindustry.content.SectorPresets;
import mindustry.content.Weathers;
import mindustry.type.SectorPreset;
import mindustry.type.Weather;

public class BioSectorPresets {
    public static SectorPreset
        ankle, crus, femur;

    public static void load(){
        ankle = new SectorPreset("ankle", BioPlanets.andori, 1){{
            alwaysUnlocked = true;
            difficulty = 1;
        }};

        crus = new SectorPreset("crus",BioPlanets.andori, 34){{
            alwaysUnlocked = false;
            captureWave = 26;
        }};

        femur = new SectorPreset("femur", BioPlanets.andori, 53){{
            alwaysUnlocked = false;
            captureWave = 12;
        }};
    }
}
