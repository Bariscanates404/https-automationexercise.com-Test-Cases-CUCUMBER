package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ContactUsFormPage;
import utilities.Driver;

public class ContactUsFormStepDefs {

    ContactUsFormPage contactUsFormPage=new ContactUsFormPage();

    @Then("kullanici Contact Us butonuna tiklar")
    public void kullanici_contact_us_butonuna_tiklar() {
        contactUsFormPage.contactUsButton.click();
    }

    @Then("kullanici GET IN TOUCH in gorunur oldugunu test eder")
    public void kullanici_get_in_touch_in_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(contactUsFormPage.getInTouchText.isDisplayed());
    }

    @Then("kullanici name, email, subject ve message bilgilerini girer")
    public void kullanici_name_email_subject_ve_message_bilgilerini_girer() {
    //    contactUsFormPage.nameText.sendKeys(Faker.instance().name().firstName());
    //    contactUsFormPage.emailBox.sendKeys(Faker.instance().internet().emailAddress());
    //    contactUsFormPage.subjectBox.sendKeys("selamlar Batch44");
    //    contactUsFormPage.messageBox.sendKeys("iyi ki bu projeyi sizlerle baslattim, ama sizsiz bitirdim :)");

        // yukardaki 4 satiri farkli sekilde yazabiliriz

        Driver.waitAndSendText(contactUsFormPage.nameText,Faker.instance().name().firstName() );
        Driver.waitAndSendText(contactUsFormPage.emailBox,Faker.instance().internet().emailAddress());
        Driver.waitAndSendText(contactUsFormPage.subjectBox, "selamlar Batch44");
        Driver.waitAndSendText(contactUsFormPage.messageBox, "iyi ki bu projeyi sizlerle baslattim, ama sizsiz bitirdim :)");

    }

    @Then("kullanici dosya sec butonundan dosya yukler")
    public void kullaniciDosyaSecButonundanDosyaYukler() {
        // String pathOfImage = "src/test/resources/testData/testData.xlsx";
        // yukarida oldugu gibi daha once kullandigimiz exceli kullanabiliriz

        // String pathOfImage = System.getProperty("user.home")+"..dosya yolu...."
        // yukarida oldugu gibi farkli olsun istersek bilgisayarda masaustunde herhengi bir dosyayi, dosya yolu gosterip cagirabiliriz

        // ben proje icinde olmasini tercih ettigim icin src de testData package de datalarimi depoluyorum..

        String pathOfImage = "C:\\Users\\asus\\IdeaProjects\\practiceCucumber_automationexercise\\src\\test\\resources\\testData\\imageUpload.jpg";
        Driver.waitAndSendText(contactUsFormPage.uploadFile, pathOfImage);
    }

    @Then("kullanici Submit butonuna tiklar")
    public void kullanici_submit_butonuna_tiklar() {
        contactUsFormPage.submitFile.click();
    }

    @Then("kullanici acilan pencerede OK butonuna tiklar")
    public void kullanici_acilan_pencerede_ok_butonuna_tiklar() {
        Driver.wait(3);
        Driver.getDriver().switchTo().alert().accept(); //OK butonu -> accept
        // sitede burada fail veriyor, alerti kabul etmiyor..
        // ancak driver class da maximize yoruma alinirsa (70.satir); pass oluyor OK butonuna basiyor,
        // driver maximize iken alerti maximize etmeye calisiyor, o yuzden fail oluyor..
        // ama her soru icin degistirelemeyeceginden buna gerek yoktur, sitede bug vardir demek daha mantikli..

    }

    @Then("kullanici 'Success! Your details have been submitted successfully.'mesajini test eder")
    public void kullanici_success_your_details_have_been_submitted_successfully_mesajini_test_eder() {
        Assert.assertTrue(contactUsFormPage.successMessage.isDisplayed());
    }

    @Then("kullanici Home butonuna tiklar ve sonrasinda anasayfanin acildigini test eder")
    public void kullaniciHomeButonunaTiklarVeSonrasindaAnasayfaninAcildiginiTestEder() {
        contactUsFormPage.homeButton.click();
        String pageTitle= Driver.getDriver().getTitle();
        Assert.assertEquals("automationexercise", pageTitle);
    }


}
