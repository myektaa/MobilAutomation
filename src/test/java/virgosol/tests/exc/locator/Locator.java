package virgosol.tests.exc.locator;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;

public class Locator {

    private static JsonNode locators;

    static {
        try {
            ObjectMapper mapper = new ObjectMapper();

            InputStream inputStream = Locator.class.getClassLoader().getResourceAsStream("locators.json");

            locators = mapper.readTree(inputStream);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String get(String page, String element) {
        return locators.get(page).get(element).asText();
    }
}