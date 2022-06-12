package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.SearchProductsPage;

public class SearchProductsStepDefs {

    SearchProductsPage searchProductsPage = new SearchProductsPage();

    @Then("kullanici arama girisine urun adini girer ve arama dugmesine tiklar")
    public void kullanici_arama_girisine_urun_adini_girer_ve_arama_dugmesine_tiklar() {
        searchProductsPage.searchProduct.sendKeys("Blue Top");
        searchProductsPage.searchButton.click();
    }


    @And("kullanici SEARCHED PRODUCTS gorunur oldugunu test eder")
    public void kullaniciSEARCHEDPRODUCTSGorunurOldugunuTestEder() {
        Assert.assertTrue(searchProductsPage.searchedProductsText.isDisplayed());
    }

    @And("aramayla ilgili tum urunlerin gorunur oldugunu test eder")
    public void aramaylaIlgiliTumUrunlerinGorunurOldugunuTestEder() {
        Assert.assertTrue(searchProductsPage.blueTop.isDisplayed());
    }


    @Then("kullanici product page de iken cart butona tiklar")
    public void kullanici_product_page_de_iken_cart_butona_tiklar() {
        searchProductsPage.cartButtonHomePage.click();

    }
    @Then("kullanici cart page in gorunur oldugunu test eder")
    public void kullanici_cart_page_in_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(searchProductsPage.shoppingCartText.isDisplayed());
    }


}
