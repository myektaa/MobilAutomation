package virgosol.tests.exc.config;

public class AppiumConfig {

    private String platformName;
    private String automationName;
    private String deviceName;
    private String appPackage;
    private String appActivity;
    private String appiumServerUrl;

    public String getPlatformName() {
        return platformName;
    }

    public String getAutomationName() {
        return automationName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getAppPackage() {
        return appPackage;
    }

    public String getAppActivity() {
        return appActivity;
    }

    public String getAppiumServerUrl() {
        return appiumServerUrl;
    }
}