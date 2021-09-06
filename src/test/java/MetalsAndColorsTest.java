import entities.MetalAndColors;
import entities.User;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static site.JDIsite.*;
import static testData.DefaultDataProvider.METAL_AND_COLORS;
import static testData.DefaultDataProvider.METAL_AND_COLORS_WRONG;

public class MetalsAndColorsTest implements BaseTest {

    @Test
    public void openJDITestSite() {
        login(User.ROMAN);
        loginForm.userFullName.is().displayed();
        assertThat(getFullName(), equalToIgnoringCase(User.ROMAN.getUserFullName()));
        metalAndColorsPage.open();
        metalAndColorsPage.checkOpened();

        metalAndColorsForm.submit(METAL_AND_COLORS);
        metalAndColorsForm.check(METAL_AND_COLORS);
    }

}
