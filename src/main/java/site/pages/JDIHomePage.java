package site.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import entities.User;
import site.forms.LoginForm;

@Url("index.html")
@Title("Home page")
public class JDIHomePage extends WebPage {

    @UI("#login-form")
    public LoginForm loginForm;

    public void login(User user) {
        loginForm.getUserIcon().click();
        loginForm.login(user);
    }

    public String getUserFullName() {
        return loginForm.getUserFullName().getText();
    }

}
