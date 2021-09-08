package site;

import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import entities.User;
import site.forms.LoginForm;
import site.forms.MetalAndColorsForm;
import site.pages.JDIHomePage;
import site.pages.MetalAndColorsPage;

@JSite("https://jdi-testing.github.io/jdi-light/")
public class JDIsite {

    public static JDIHomePage jdiHomePage;
    public static LoginForm loginForm;
    public static MetalAndColorsPage metalAndColorsPage;

    public static MetalAndColorsForm metalAndColorsForm;

    public static void open() {
        jdiHomePage.open();
    }

    public static void login(User user) {
        jdiHomePage.login(user);
    }

    public static String getFullName() {
        return jdiHomePage.getUserFullName();
    }

}
