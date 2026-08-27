package virgosol.tests.exc.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import virgosol.tests.exc.locator.Locator;

public class CreatePage extends BasePage {

    private final By addNoteButton = AppiumBy.androidUIAutomator(Locator.get("CreatePage", "addNoteButton"));
    private final By contentField = AppiumBy.androidUIAutomator(Locator.get("CreatePage", "contentField"));
    private final By saveButton = AppiumBy.accessibilityId(Locator.get("CreatePage", "saveButton"));
    private final By backButton = AppiumBy.androidUIAutomator(Locator.get("CreatePage","backButton"));
    private final By closeButton = AppiumBy.androidUIAutomator(Locator.get("CreatePage", "closeButton"));
    private final By secondCloseButton = AppiumBy.androidUIAutomator(Locator.get("CreatePage", "secondCloseButton"));
    private final String content = Locator.get("CreatePage", "content");

    public void clickClose() {
        wait.until(ExpectedConditions.elementToBeClickable(closeButton)).click();
    }

    public CreatePage(AndroidDriver driver) {
        super(driver);
    }

    public void clickAddNote() {
        wait.until(ExpectedConditions.elementToBeClickable(addNoteButton)).click();
    }

    public void enterContent() {
        wait.until(ExpectedConditions.elementToBeClickable(contentField)).sendKeys(content);
    }

    public void saveNote() {
        wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
    }

    public void clickBack(){
        wait.until(ExpectedConditions.elementToBeClickable(secondCloseButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(backButton)).click();
    }
}