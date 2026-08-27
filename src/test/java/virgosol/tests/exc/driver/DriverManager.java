package virgosol.tests.exc.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.WebDriverWait;
import virgosol.tests.exc.config.AppiumConfig;
import virgosol.tests.exc.config.ConfigReader;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {

    private static AppiumDriver driver;

    public static void driverManage() throws IOException {

        AppiumConfig config = ConfigReader.getConfig();

        UiAutomator2Options options = new UiAutomator2Options();

        options.setPlatformName(config.getPlatformName());
        options.setAutomationName(config.getAutomationName());
        options.setDeviceName(config.getDeviceName());
        options.setAppPackage(config.getAppPackage());
        options.setAppActivity(config.getAppActivity());

        driver = new AndroidDriver(new URL(config.getAppiumServerUrl()),options);

    }

    public static AppiumDriver getDriver(){
        return driver;
    }

    public static void quitDriver(){
        if(driver!=null){
            driver.quit();
            driver = null;
        }
    }

}
