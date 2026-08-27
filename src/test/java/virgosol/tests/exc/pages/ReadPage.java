package virgosol.tests.exc.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import virgosol.tests.exc.locator.Locator;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static junit.framework.Assert.assertEquals;

public class ReadPage extends BasePage {

    private final By actualNoteText = AppiumBy.androidUIAutomator(Locator.get("ReadPage", "actualNoteText"));
    private final String expectedNoteText = Locator.get("ReadPage", "expectedNoteText");

    public ReadPage(AndroidDriver driver) {
        super(driver);
    }

    public void verificationNoteText() {

        String actualText = wait.until(ExpectedConditions.visibilityOfElementLocated(actualNoteText)).getText();

        System.out.println("Beklenen text: " + expectedNoteText);
        System.out.println("Gerçek text: " + actualText);

        assertEquals(expectedNoteText, actualText);
    }

}
