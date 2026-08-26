package virgosol.tests.exc.config;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class ConfigReader {

    public static AppiumConfig getConfig() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        InputStream inputStream = ConfigReader.class.getClassLoader().getResourceAsStream("config.json");
        return objectMapper.readValue(inputStream, AppiumConfig.class);
    }
}