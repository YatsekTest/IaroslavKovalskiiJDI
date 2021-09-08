package testData;

import entities.MetalAndColors;

public class DefaultDataProvider {

    public static MetalAndColors METAL_AND_COLORS = new MetalAndColors().set(c -> {
                c.setSummary(new int[]{3, 6});
                c.setElements(new String[]{"Wind", "Fire"});
                c.setColor("Green");
                c.setMetals("Selen");
                c.setVegetables(new String[]{"Tomato", "Onion"});
            }
    );

    public static MetalAndColors METAL_AND_COLORS_WRONG = new MetalAndColors().set(c -> {
                c.setSummary(new int[]{5, 7});
                c.setElements(new String[]{"Water", "Earth"});
                c.setColor("Green");
                c.setMetals("Selen");
                c.setVegetables(new String[]{"Tomato", "Vegetables"});
            }
    );

}
