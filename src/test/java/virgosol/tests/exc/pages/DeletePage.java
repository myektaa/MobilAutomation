package virgosol.tests.exc.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import virgosol.tests.exc.locator.Locator;

public class DeletePage extends BasePage{

    private final By deleteListNote = AppiumBy.className(Locator.get("DeletePage","deleteListNote"));
    private final By deleteButton = AppiumBy.accessibilityId(Locator.get("DeletePage", "deleteButton"));
    private final By deleteConfirmButton = AppiumBy.androidUIAutomator(Locator.get("DeletePage", "deleteConfirmButton"));
    private final By verifyList = AppiumBy.androidUIAutomator(Locator.get("DeletePage", "verifyList"));

    public DeletePage(AndroidDriver driver) {
        super(driver);
    }

    public void clickNoteDetailDelete(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(deleteListNote)).click();
    }

    public void clickDeleteButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(deleteButton)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(deleteConfirmButton)).click();
    }

    public void verifyNoteDeleted() {
        int noteCount = driver.findElements(verifyList).size();
        Assert.assertEquals(0, noteCount);
        System.out.println("Not başarıyla silinmiştir!");
    }

}
