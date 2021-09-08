package site.forms;

import com.epam.jdi.light.elements.common.Label;
import com.epam.jdi.light.elements.composite.Form;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.ui.html.elements.common.Link;
import com.epam.jdi.light.ui.html.elements.common.TextField;
import entities.User;

public class LoginForm extends Form<User> {

    @FindBy(id = "user-icon")
    private Link userIcon;

    @FindBy(id = "name")
    private TextField name;

    @FindBy(id = "password")
    private TextField password;

    @FindBy(id = "user-name")
    private Label userFullName;

    public Link getUserIcon() {
        return userIcon;
    }

    public Label getUserFullName() {
        return userFullName;
    }
}
