import com.epam.jdi.light.driver.WebDriverUtils;
import com.epam.jdi.light.elements.init.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import site.JDIsite;

public interface BaseTest {

    @BeforeSuite(alwaysRun = true)
    static void setUp() {
        PageFactory.initElements(JDIsite.class);
    }

    @AfterSuite(alwaysRun = true)
    static void tearDown() {
        WebDriverUtils.killAllSeleniumDrivers();
    }

}
