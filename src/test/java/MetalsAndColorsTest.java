import entities.User;
import org.testng.annotations.Test;
import site.JDIsite;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

public class MetalsAndColorsTest implements BaseTest {

    @Test
    public void openJDITestSite() {
        JDIsite.open();
        JDIsite.login(User.ROMAN);
        assertThat(JDIsite.getFullName(), equalToIgnoringCase(User.ROMAN.getUserFullName()));
    }

}
