import entities.MetalAndColors;
import org.testng.annotations.Test;
import testData.MetalsAndColorsDataProvider;

import static site.JDIsite.metalAndColorsForm;
import static testData.DefaultDataProvider.METAL_AND_COLORS;
import static testData.DefaultDataProvider.METAL_AND_COLORS_WRONG;

public class MetalsAndColorsTest implements BaseTest {

    @Test(dataProviderClass = MetalsAndColorsDataProvider.class,
            dataProvider = "dataFromJsonFile")
    public void metalAndColorsFormTest(MetalAndColors metalAndColors) {
        metalAndColorsForm.submit(metalAndColors);
        metalAndColorsForm.check(metalAndColors);
    }

    @Test
    public void metalAndColorsWrongDataTest() {
        metalAndColorsForm.submit(METAL_AND_COLORS);
        metalAndColorsForm.check(METAL_AND_COLORS_WRONG);
    }

}
