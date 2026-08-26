package virgosol.tests.exc.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import virgosol.tests.exc.locator.Locator;

public class CreatePage extends BasePage {

    private final By addNoteButton = AppiumBy.androidUIAutomator(Locator.get("CreatePage", "addNoteButton"));
    private final By titleField = AppiumBy.className(Locator.get("CreatePage", "titleField"));
    private final By contentField = AppiumBy.androidUIAutomator(Locator.get("CreatePage", "contentField"));
    private final By saveButton = AppiumBy.accessibilityId(Locator.get("CreatePage", "saveButton"));
    private final By closeButton = AppiumBy.androidUIAutomator(Locator.get("CreatePage", "closeButton"));
    private final String title = Locator.get("CreatePage", "title");
    private final String content = Locator.get("CreatePage", "content");

    public void clickClose() {
        driver.findElement(closeButton).click();
    }

    public CreatePage(AndroidDriver driver) {
        super(driver);
    }

    public void clickAddNote() {
        driver.findElement(addNoteButton).click();
    }

    public void enterTitle() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(titleField)).sendKeys(title);
    }

    public void enterContent() {
        driver.findElement(contentField).sendKeys(content);
    }

    public void saveNote() {
        driver.findElement(saveButton).click();
    }

    public boolean isAddNoteButtonDisplayed() {
        return driver.findElement(addNoteButton).isDisplayed();
    }
}