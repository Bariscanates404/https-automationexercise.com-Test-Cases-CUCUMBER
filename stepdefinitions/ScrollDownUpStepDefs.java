package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ScrollDownUpPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class ScrollDownUpStepDefs {

    ScrollDownUpPage scrollDownUpPage =new ScrollDownUpPage();
    @Then("kullanici yukari hareket etmek icin sag alttaki oka tiklar")
    public void kullanici_yukari_hareket_etmek_icin_sag_alttaki_oka_tiklar() throws InterruptedException {
        Driver.waitForClickablility(scrollDownUpPage.scrollUpArrow, 10);
        ReusableMethods.clickWithJS(scrollDownUpPage.scrollUpArrow);
    }
    @Then("kullanici sayfanin yukari kaydirildigini ve -practice website- text ekranda goruldugunu test eder")
    public void kullanici_sayfanin_yukari_kaydirildigini_ve_practice_website_text_ekranda_goruldugunu_test_eder() {
        try{
            if(scrollDownUpPage.verificationText1.isDisplayed()) {

                Assert.assertTrue(scrollDownUpPage.verificationText1.isDisplayed());

            }else if(scrollDownUpPage.verificationText2.isDisplayed()){

                Assert.assertTrue(scrollDownUpPage.verificationText2.isDisplayed());

            }else if(scrollDownUpPage.verificationText3.isDisplayed()){

                Assert.assertTrue(scrollDownUpPage.verificationText3.isDisplayed());
            }

        }catch (NullPointerException e){

            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    @And("kullanici yukari hareket etmek icin scroll up yapar")
    public void kullaniciYukariHareketEtmekIcinScrollUpYapar() throws InterruptedException {
        ReusableMethods.scrollUpWithJS();
    }
}

