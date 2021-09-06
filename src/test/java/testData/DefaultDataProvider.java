package testData;

import com.google.common.collect.ImmutableList;
import entities.MetalAndColors;

import java.util.Collections;

public class DefaultDataProvider {

    public static MetalAndColors METAL_AND_COLORS = new MetalAndColors().set(c -> {
                c.summaryOdd = "3";
                c.summaryEven = "6";
                c.elementsChecklist = ImmutableList.of("Wind", "Fire");
                c.colors = "Green";
                c.metals = "Selen";
                c.vegetables = ImmutableList.of("Tomato", "Vegetables");
            }
    );

    public static MetalAndColors METAL_AND_COLORS_WRONG = new MetalAndColors().set(c -> {
                c.summaryOdd = "2";
                c.summaryEven = "5";
                c.elementsChecklist = ImmutableList.of("Wind", "Fire");
                c.colors = "Red";
                c.metals = "Selen";
                c.vegetables = ImmutableList.of("Tomato", "Vegetables");
            }
    );

}
