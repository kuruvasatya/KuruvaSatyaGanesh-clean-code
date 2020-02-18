package com.KuruvaSatyaGanesh.ConstructionCost;

public class MaterialStandards {

    public enum Standards {
        standardMaterial, AboveStandardMaterial, HighStandardMaterial;
    }

    public static void getMaterialType() {
        Standards[] standards = Standards.values();
        for (Standards s : standards) {
            System.out.println("Type '" + s + "' for " + s);
        }
    }
}
