package site;

import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import entities.User;
import site.pages.JDIHomePage;

@JSite("https://jdi-testing.github.io/jdi-light/")
public class JDIsite {

    private static JDIHomePage jdiHomePage;

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
