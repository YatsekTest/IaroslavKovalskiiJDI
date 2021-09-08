package testData;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import entities.MetalAndColors;
import org.testng.annotations.DataProvider;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class MetalsAndColorsDataProvider {

    private static Object[][] dataObject;
    public static HashMap<String, MetalAndColors> testData;
    private static final String jsonPath = "src/main/resources/JDI_ex8_metalsColorsDataSet.json";

    @DataProvider
    public static Object[][] dataFromJsonFile() {
        Type testDataType = new TypeToken<HashMap<String, MetalAndColors>>() {
        }.getType();
        try (JsonReader reader = new JsonReader(new FileReader(jsonPath))) {
            testData = new Gson().fromJson(reader, testDataType);
            int i = 0;
            dataObject = new Object[testData.size()][1];
            for (Map.Entry<String, MetalAndColors> entry : testData.entrySet()) {
                dataObject[i][0] = entry.getValue();
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataObject;
    }

}