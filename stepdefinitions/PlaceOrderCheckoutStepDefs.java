package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MainPageFunctionalities;
import pages.PlaceOrderCheckoutPage;
import pages.SubscriptionPage;
import utilities.ReusableMethods;

import java.util.Random;

public class PlaceOrderCheckoutStepDefs {

    PlaceOrderCheckoutPage placeOrderCheckoutPage= new PlaceOrderCheckoutPage();
    SubscriptionPage subscriptionPage=new SubscriptionPage();
    MainPageFunctionalities mainPageFunctionalities= new MainPageFunctionalities();


    @Then("kullanici sepete urun ekler")
    public void kullanici_sepete_urun_ekler() {
        ReusableMethods.jsScroll();
        Random randomNum = new Random();
        int i = randomNum.nextInt(placeOrderCheckoutPage.addToCartButtons.size());
        placeOrderCheckoutPage.addToCartButtons.get(i).click();
    }
    @Then("kullanici anasayfadaki cart butona tiklar")
    public void kullanici_anasayfadaki_cart_butona_tiklar() {
        placeOrderCheckoutPage.cartButtonHomePage.click();
    }

    @Then("kullanici sepet sayfasina urunun eklendigini test eder")
    public void kullanici_sepet_sayfasina_urunun_eklendigini_test_eder() {
        Assert.assertEquals(1,subscriptionPage.productsInCart.size());
    }
    @Then("kullanici sayfadaki Proceed To Checkout a tiklar")
    public void kullanici_sayfadaki_proceed_to_checkout_a_tiklar() {

        placeOrderCheckoutPage.proceedToCheckoutButton.click();
    }

    @And("kullanici acilan pencerede Register-Login e tiklar")
    public void kullaniciAcilanPenceredeRegisterLoginETiklar() {

        placeOrderCheckoutPage.registerLoginButton.click();
    }

    @And("kullanici New User Signup daki name ve email bilgilerini girer")
    public void kullaniciNewUserSignupDakiNameVeEmailBilgileriniGirer() {
        mainPageFunctionalities.nameBox.sendKeys(Faker.instance().name().fullName());
        mainPageFunctionalities.emailBox.sendKeys(Faker.instance().internet().emailAddress());
    }
    @Then("kullanici signup butona tiklar")
    public void kullanici_signup_butona_tiklar() {
        mainPageFunctionalities.accountCreatSignupButton.click();

    }
    @Then("kullanici adres detaylarini ve siparisini gorur")
    public void kullanici_adres_detaylarini_ve_siparisini_gorur() {
        Assert.assertTrue(placeOrderCheckoutPage.addressVerificationText.isDisplayed());
    }
    @Then("kullanici description in comment text areaya yorum girer ve place order a tiklar")
    public void kullanici_description_in_comment_text_areaya_yorum_girer_ve_place_order_a_tiklar() {
        placeOrderCheckoutPage.messageBox.sendKeys("Hello world");
        placeOrderCheckoutPage.placeOrderButton.click();
    }
    @Then("kullanici odeme bilgilerini; Name on Card, Card Number, CVC, Expiration date doldurur")
    public void kullanici_odeme_bilgilerini_name_on_card_card_number_cvc_expiration_date_doldurur() {

        placeOrderCheckoutPage.nameOnCard.sendKeys("elif");
        placeOrderCheckoutPage.cardNumberBox.sendKeys("12345");
        placeOrderCheckoutPage.cvcBox.sendKeys("546");
        placeOrderCheckoutPage.expirationMonth.sendKeys("10");
        placeOrderCheckoutPage.expirationYear.sendKeys("2025");
    }
    @Then("kullanici Pay and Confirm Order butona tiklar")
    public void kullanici_pay_and_confirm_order_butona_tiklar() {
        placeOrderCheckoutPage.payAndConfirmOrderButton.click();
    }
    @Then("kullanici success message Your order has been placed successfully")
    public void kullanici_success_message_your_order_has_been_placed_successfully() {
        Assert.assertTrue(placeOrderCheckoutPage.orderPlacedText.isDisplayed());
    }
    @Then("kullanici Delete Account butana tiklar")
    public void kullanici_delete_account_butana_tiklar() {
        placeOrderCheckoutPage.deleteAccountButton.click();
    }

}
