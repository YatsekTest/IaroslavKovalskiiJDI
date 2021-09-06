package testData;

import entities.MetalAndColors;

public class DefaultDataProvider {

    public static MetalAndColors METAL_AND_COLORS = new MetalAndColors().set(c -> {
                c.summary = new String[]{"3", "6"};
                c.elementsChecklist = new String[]{"Wind", "Fire"};
                c.colors = "Green";
                c.metals = "Selen";
                c.vegetables = new String[]{"Tomato", "Onion"};
            }
    );

    public static MetalAndColors METAL_AND_COLORS_WRONG = new MetalAndColors().set(c -> {
                c.summary = new String[]{"2", "5"};
                c.elementsChecklist = new String[]{"Water", "Earth"};
                c.colors = "Red";
                c.metals = "Gold";
                c.vegetables = new String[]{"Tomato", "Vegetables"};
            }
    );

}
