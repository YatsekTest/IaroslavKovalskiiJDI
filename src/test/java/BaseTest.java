import com.epam.jdi.light.driver.WebDriverUtils;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.init.PageFactory;
import com.epam.jdi.light.logger.LogLevels;
import entities.User;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import site.JDIsite;

import static com.epam.jdi.light.settings.WebSettings.logger;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static site.JDIsite.*;
import static site.JDIsite.metalAndColorsPage;

public interface BaseTest {

    @BeforeSuite(alwaysRun = true)
    default void setUp() {
        logger.setLogLevel(LogLevels.STEP);
        PageFactory.initElements(JDIsite.class);
        JDIsite.open();
        login(User.ROMAN);
        loginForm.getUserFullName().is().displayed();
        assertThat(getFullName(), equalToIgnoringCase(User.ROMAN.getUserFullName()));
        metalAndColorsPage.open();
        metalAndColorsPage.checkOpened();
    }

    @AfterMethod
    default void updatePage() {
        WebPage.refresh();
    }

    @AfterSuite(alwaysRun = true)
    default void tearDown() {
        WebDriverUtils.killAllSeleniumDrivers();
    }

}
