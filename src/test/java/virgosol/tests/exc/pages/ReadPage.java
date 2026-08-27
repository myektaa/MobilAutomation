package virgosol.tests.exc.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import virgosol.tests.exc.locator.Locator;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static junit.framework.Assert.assertEquals;

public class ReadPage extends BasePage {

    private final By actualNoteText = AppiumBy.className(Locator.get("ReadPage", "actualNoteText"));
    private final String expectedNoteText = Locator.get("ReadPage", "expectedNoteText");
    private final By listNoteDetail = AppiumBy.className(Locator.get("ReadPage","listNoteDetail"));
    private final By checkNoteDetail = AppiumBy.className(Locator.get("ReadPage", "checkNoteDetail"));

    public ReadPage(AndroidDriver driver) {
        super(driver);
    }

    public void verifyNoteText() {

        String actualText = wait.until(ExpectedConditions.visibilityOfElementLocated(actualNoteText)).getText();

        System.out.println("Beklenen text: " + expectedNoteText);
        System.out.println("Gerçek text: " + actualText);

        assertEquals(expectedNoteText, actualText);
    }

    public void clickNoteDetail(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(listNoteDetail)).click();
    }

    public void checkNoteDetail(){
        String checkNoteDetailText = wait.until(ExpectedConditions.visibilityOfElementLocated(checkNoteDetail)).getText();
        System.out.println("Detay içindeki not: " + checkNoteDetailText);
    }

}
