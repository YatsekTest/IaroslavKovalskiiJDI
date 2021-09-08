package site.forms;

import com.epam.jdi.light.elements.complex.Checklist;
import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.JDropdown;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.complex.RadioButtons;
import entities.MetalAndColors;

public class MetalAndColorsForm extends Form<MetalAndColors> {

    @FindBy(name = "custom_radio_odd")
    private RadioButtons summaryOdd;

    @FindBy(name = "custom_radio_even")
    private RadioButtons summaryEven;

    @UI("p.checkbox > [type=checkbox]")
    private Checklist elementsChecklist;

    @JDropdown(root = "div[id=colors]",
            value = ".filter-option",
            list = "li",
            expand = ".caret")
    private Dropdown colors;

    @JDropdown(root = "div[id=metals]",
            value = "button.btn.dropdown-toggle",
            list = "li",
            expand = ".caret")
    private Dropdown metals;

    @JDropdown(root = "div[id=vegetables]",
            value = "button.btn.btn-default",
            list = "li",
            expand = ".caret")
    private Dropdown vegetables;

    @FindBy(id = "submit-button")
    private Button submitButton;

    @Override
    public void submit(MetalAndColors metalAndColors) {
        summaryOdd.select(String.valueOf(metalAndColors.getSummary()[0]));
        summaryEven.select(String.valueOf(metalAndColors.getSummary()[1]));
        elementsChecklist.select(metalAndColors.getElements());
        colors.select(metalAndColors.getColor());
        metals.select(metalAndColors.getMetals());
        vegetables.expand();
        vegetables.select("Vegetables");
        vegetables.select(metalAndColors.getVegetables());
        submitButton.click();
    }

}
