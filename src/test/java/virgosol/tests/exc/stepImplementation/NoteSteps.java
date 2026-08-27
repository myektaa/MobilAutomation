package virgosol.tests.exc.stepImplementation;

import com.thoughtworks.gauge.Step;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import virgosol.tests.exc.driver.DriverManager;
import virgosol.tests.exc.pages.CreatePage;
import virgosol.tests.exc.pages.DeletePage;
import virgosol.tests.exc.pages.ReadPage;
import virgosol.tests.exc.pages.UpdatePage;

import java.io.IOException;

public class NoteSteps {

    private AndroidDriver driver;
    private CreatePage createPage;
    private ReadPage readPage;
    private UpdatePage updatePage;
    private DeletePage deletePage;

    @Step("Uygulama cihaz üzerinde başlatılır")
    public void openApp() throws IOException {
        DriverManager.driverManage();
        driver = (AndroidDriver) DriverManager.getDriver();
        createPage = new CreatePage(driver);
        readPage = new ReadPage(driver);
        updatePage = new UpdatePage(driver);
        deletePage = new DeletePage(driver);
    }

    @Step("Yeni not ekleme butonuna tıklanır")
    public void clickAddButton() {
        createPage.clickClose();
        createPage.clickAddNote();
    }

    @Step("İçerik alanına Süt, Yumurta, Ekmek yazılır")
    public void enterTextContent() {
        createPage.enterContent();
    }

    @Step("Not kaydedilir ve ana listeye dönülür")
    public void saveNotesButton() {
        createPage.saveNote();
        createPage.clickBack();
    }

    @Step("Not doğrulanır")
    public void verifyNote() {
        readPage.verifyNoteText();
    }

    @Step("Listede eklenen nota tıklanır")
    public void clickNewNote() {
        readPage.clickNoteDetail();
    }

    @Step("Not detay sayfasında notun eksiksiz geldiği doğrulanır")
    public void checkNoteDetailText() {
        readPage.checkNoteDetail();
    }

    @Step("Mevcut notun içerik alanı temizlenir")
    public void clearNote() {
        updatePage.clickEditButton();
        updatePage.clickContentFieldUpdate();
    }

    @Step("İçerik alanına Peynir, Zeytin, Domates yazılır")
    public void updateNoteText() {
        updatePage.updateContentText();
    }

    @Step("Güncellemeler kaydedilir ve ana sayfaya dönülür")
    public void updateChanges() {
        updatePage.updateNewTextNote();
        updatePage.backToMainPage();
    }

    @Step("Listeden ilgili nota tıklanır")
    public void clickNoteDetailToDelete() {
        deletePage.clickNoteDetailDelete();
    }

    @Step("Sil butonuna basılarak işlem onaylanır")
    public void clickDeleteButton() {
        deletePage.clickDeleteButton();
    }

    @Step("Notun ana listeden kalktığı doğrulanır")
    public void verifyDeleteNote() {
        deletePage.verifyNoteDeleted();
    }
}