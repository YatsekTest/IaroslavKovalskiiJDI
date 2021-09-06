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
    public RadioButtons summaryOdd;

    @FindBy(name = "custom_radio_even")
    public RadioButtons summaryEven;

    @UI("p.checkbox > [type=checkbox]")
    public Checklist elementsChecklist;

    @JDropdown(root = "div[id=colors]",
            value = ".filter-option",
            list = "li",
            expand = ".caret")
    public Dropdown colors;

    @JDropdown(root = "div[id=metals]",
            value = "button.btn.dropdown-toggle",
            list = "li",
            expand = ".caret")
    public Dropdown metals;

    @JDropdown(root = "div[id=vegetables]",
            value = "button.btn.btn-default",
            list = "li",
            expand = ".caret")
    public Dropdown vegetables;

    @FindBy(id = "submit-button")
    public Button submitButton;

    @Override
    public void submit(MetalAndColors metalAndColors) {
        summaryOdd.select(metalAndColors.summary[0]);
        summaryEven.select(metalAndColors.summary[1]);
        for (String element : metalAndColors.elementsChecklist) {
            elementsChecklist.select(element);
        }
        colors.select(metalAndColors.colors);
        metals.select(metalAndColors.metals);
        vegetables.select("Vegetables");
        for (String vegetable : metalAndColors.vegetables) {
            vegetables.select(vegetable);
        }
        submitButton.click();
    }

}
