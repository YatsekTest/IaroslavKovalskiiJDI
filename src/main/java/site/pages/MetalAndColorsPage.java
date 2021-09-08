package site.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import site.forms.MetalAndColorsForm;

@Url("metals-colors.html")
@Title("Metal and Colors")
public class MetalAndColorsPage extends WebPage {

    @UI(".form")
    public static MetalAndColorsForm metalAndColorsForm;

}
