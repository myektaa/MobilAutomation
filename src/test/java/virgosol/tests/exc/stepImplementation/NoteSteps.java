package virgosol.tests.exc.stepImplementation;

import com.thoughtworks.gauge.Step;
import io.appium.java_client.android.AndroidDriver;
import virgosol.tests.exc.driver.DriverManager;
import virgosol.tests.exc.pages.CreatePage;

import java.io.IOException;

public class NoteSteps {

    private AndroidDriver driver;
    private CreatePage createPage;


    @Step("Uygulama cihaz üzerinde başlatılır")
    public void openApp() throws IOException {
        DriverManager.driverManage();
        driver = (AndroidDriver) DriverManager.getDriver();
        createPage = new CreatePage(driver);
    }

    @Step("Uygulamanın açıldığı doğrulanır")
    public void verificationOpenApp() {
        createPage.clickClose();
    }

    @Step("Yeni not ekleme butonuna tıklanır")
    public void clickAddButton() {
        createPage.clickAddNote();
    }

    @Step("Başlık alanına Alışveriş Listesi yazılır")
    public void implementation4() {
        createPage.enterTitle();
    }

    @Step("İçerik alanına Süt, Yumurta, Ekmek yazılır")
    public void implementation5() {
        createPage.enterContent();
    }

    @Step("Not kaydedilir, ana listeye dönülür ve not doğrulanır")
    public void implementation6() {

    }

    @Step("Listeden Alışveriş Listesi başlıklı nota tıklanır")
    public void implementation7() {

    }

    @Step("Not detay sayfasında başlığın ve içeriğin eksiksiz geldiği doğrulanır")
    public void implementation8() {

    }

    @Step("Mevcut notun içerik alanı temizlenir")
    public void implementation9() {

    }

    @Step("İçerik alanına Süt, Yumurta, Ekmek, Peynir yazılır")
    public void implementation10() {

    }

    @Step("Güncellemeler kaydedilir")
    public void implementation11() {

    }

    @Step("Listeden ilgili nota tıklanır")
    public void implementation12() {

    }

    @Step("Sil butonuna basılarak işlem onaylanır")
    public void implementation13() {

    }

    @Step("Notun ana listeden kalktığı doğrulanır")
    public void implementation14() {

    }
}