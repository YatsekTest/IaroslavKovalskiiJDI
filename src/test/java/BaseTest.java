import com.epam.jdi.light.driver.WebDriverUtils;
import com.epam.jdi.light.elements.init.PageFactory;
import com.epam.jdi.light.logger.LogLevels;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import site.JDIsite;

import static com.epam.jdi.light.settings.WebSettings.logger;

public interface BaseTest {

    @BeforeSuite(alwaysRun = true)
    static void setUp() {
        logger.setLogLevel(LogLevels.STEP);
        PageFactory.initElements(JDIsite.class);
        JDIsite.jdiHomePage.open();
    }

//    @AfterSuite(alwaysRun = true)
//    static void tearDown() {
//        WebDriverUtils.killAllSeleniumDrivers();
//    }

}
