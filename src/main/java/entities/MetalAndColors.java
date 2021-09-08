package entities;

import com.epam.jdi.tools.DataClass;

public class MetalAndColors extends DataClass<MetalAndColors> {

    private int[] summary;
    private String[] elements;
    private String color;
    private String metals;
    private String[] vegetables;

    public int[] getSummary() {
        return summary;
    }

    public String[] getElements() {
        return elements;
    }

    public String getColor() {
        return color;
    }

    public String getMetals() {
        return metals;
    }

    public String[] getVegetables() {
        return vegetables;
    }

    public void setSummary(int[] summary) {
        this.summary = summary;
    }

    public void setElements(String[] elements) {
        this.elements = elements;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMetals(String metals) {
        this.metals = metals;
    }

    public void setVegetables(String[] vegetables) {
        this.vegetables = vegetables;
    }
}
