package virgosol.tests.exc.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import virgosol.tests.exc.locator.Locator;

public class UpdatePage extends BasePage{

    private final By editButtonUpdate = AppiumBy.accessibilityId(Locator.get("UpdatePage", "editButtonUpdate"));
    private final By contentFieldUpdatePage = AppiumBy.className(Locator.get("UpdatePage", "contentFieldUpdatePage"));
    private final String contentUpdate = Locator.get("UpdatePage", "contentUpdate");
    private final By saveButtonUpdate = AppiumBy.accessibilityId(Locator.get("UpdatePage", "saveButtonUpdate"));
    private final By backButtonUpdate = AppiumBy.androidUIAutomator(Locator.get("UpdatePage", "backButtonUpdate"));

    public UpdatePage(AndroidDriver driver) {
        super(driver);
    }

    public void clickEditButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(editButtonUpdate)).click();
    }

    public void clickContentFieldUpdate(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(contentFieldUpdatePage)).clear();
    }

    public void updateContentText(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(contentFieldUpdatePage)).sendKeys(contentUpdate);
    }

    public void updateNewTextNote(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(saveButtonUpdate)).click();
    }

    public void backToMainPage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(backButtonUpdate)).click();
    }

}
