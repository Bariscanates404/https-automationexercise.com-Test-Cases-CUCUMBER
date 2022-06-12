package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.SubscriptionPage;
import utilities.ReusableMethods;

public class SubscriptionStepDefs {

    SubscriptionPage subscriptionPage=new SubscriptionPage();

    //TC10_subscription_in_home_page

    @Then("kullanici sayfada footer a erismek icin scroll down yapar")
    public void kullanici_sayfada_footer_a_erismek_icin_scroll_down_yapar() {

     ReusableMethods.jsScroll();
    }
    @Then("subscription\\(abonelik) textinin gorunur oldugunu test eder")
    public void subscription_abonelik_textinin_gorunur_oldugunu_test_eder() {

        Assert.assertTrue(subscriptionPage.subciptionText.isDisplayed());
    }
    @Then("kullanici girise e-posta adresini girer ve arrow butona tiklar")
    public void kullanici_girise_e_posta_adresini_girer_ve_arrow_butona_tiklar() {
        subscriptionPage.susbscribeEmail.sendKeys("practicebatch44@gmail.com");
        subscriptionPage.susbscribeArrowButton.click();
    }
    @Then("you have been successfully subscribed! basari mesajini gorundugunu test eder")
    public void you_have_been_successfully_subscribed_basari_mesajini_gorundugunu_test_eder() {

        Assert.assertTrue(subscriptionPage.susbscribeSuccessMessage.isDisplayed());
    }


    //TC11_subscription_in_cart_page

    @And("kullanici cart butona tiklar")
    public void kullaniciCartButonaTiklar() {
        subscriptionPage.cartButton.click();

    }


}
