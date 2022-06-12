package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.ProductsPage;
import pages.SubscriptionPage;
import utilities.Driver;
import utilities.ReusableMethods;
import java.util.Random;

public class ProductsPageStepDefs {

    ProductsPage productsPage = new ProductsPage();
    SubscriptionPage subscriptionPage = new SubscriptionPage();
    Random randomNum = new Random(); //bircok kez kullanacagiz, class seviyesinde yaptik
    Actions actions = new Actions(Driver.getDriver());

    //TC08_verify all products product detail page

    @Then("kullanici Products butonuna tiklar")
    public void kullanici_products_butonuna_tiklar() {
        productsPage.productButton.click();
    }

    @Then("kullanici ALL PRODUCTS sayfasina basariyla yonlendirildigini test eder")
    public void kullanici_all_products_sayfasina_basariyla_yonlendirildigini_test_eder() {
        Assert.assertTrue(productsPage.allProductsText.isDisplayed());
    }


    @Then("kullanici urun listesini gorur")
    public void kullanici_urun_listesini_gorur() {
        Assert.assertEquals(34, productsPage.productList.size());
    }

    @Then("kullanici ilk urunde View Product a tiklar")
    public void kullanici_ilk_urunde_view_product_a_tiklar() {
        productsPage.viewProductButton1.click();
    }

    @Then("kullanici, urun detay sayfasina yonlendirilir")
    public void kullanici_urun_detay_sayfasina_yonlendirilir() {
        String expectedUrl = "https://www.automationexercise.com/product_details/1";
        Assert.assertEquals(expectedUrl, Driver.getDriver().getCurrentUrl());
    }

    @Then("kullanici ayrintilarin\\(urun adi, kategori, fiyat, bulunabilirlik, durum, marka) gorunur oldugunu test eder")
    public void kullanici_ayrintilarin_urun_adi_kategori_fiyat_bulunabilirlik_durum_marka_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(productsPage.ProductName.isDisplayed());
        Assert.assertTrue(productsPage.Category.isDisplayed());
        Assert.assertTrue(productsPage.Price.isDisplayed());
        Assert.assertTrue(productsPage.Availability.isDisplayed());
        Assert.assertTrue(productsPage.Condition.isDisplayed());
        Assert.assertTrue(productsPage.Brand.isDisplayed());

    }

    //TC12_Add Products in Cart

    @Then("kullanici ilk urune hover over yapar ve tiklayarak sepete ekler")
    public void kullanici_ilk_urune_hover_over_yapar_ve_tiklayarak_sepete_ekler() {

        ReusableMethods.hover(subscriptionPage.firstProduct);
        Driver.wait(4);
        subscriptionPage.addToCartButton.click();
        Driver.wait(4);
    }

    @Then("kullanici continue shopping butona tiklar")
    public void kullanici_continue_shopping_butona_tiklar() {
        subscriptionPage.continueButton.click();
    }

    @Then("kullanici ikinci urune hover over yapar ve tiklayarak sepete ekler")
    public void kullanici_ikinci_urune_hover_over_yapar_ve_tiklayarak_sepete_ekler() {

        Driver.wait(4);
        ReusableMethods.hover(subscriptionPage.secondProduct);
        Driver.wait(4);
        subscriptionPage.addToCartButton2.click();
    }

    @Then("kullanici view cart butona tiklar")
    public void kullanici_view_cart_butona_tiklar() {
        subscriptionPage.cartButton.click();
    }

    @Then("kullanici her iki urunun de sepete eklendigini test eder")
    public void kullanici_her_iki_urunun_de_sepete_eklendigini_test_eder() {
        Assert.assertEquals(2, subscriptionPage.productsInCart.size());
    }

    @Then("kullanici prices, quantity ve total price degerlerini test eder")
    public void kullanici_prices_quantity_ve_total_price_degerlerini_test_eder() {

        //Price-> Rs.500     quantity -> 1      Total -> Rs.500   digital omayan her karakteri kaldirabiliriz..

        int firstPrice = Integer.parseInt(subscriptionPage.firstPrice.getText().replaceAll("[^0-9]", ""));

        int secondPrice = Integer.parseInt(subscriptionPage.secondPrice.getText().replaceAll("[^0-9]", ""));

        String firstTotalPrice = subscriptionPage.firstTotolPrice.getText().replaceAll("[^0-9]", "");

        String secondTotalPrice = subscriptionPage.secondTotolPrice.getText().replaceAll("[^0-9]", "");

        Assert.assertEquals(500, firstPrice);
        Assert.assertEquals(400, secondPrice);
        Assert.assertEquals("1", subscriptionPage.firstQuantity.getText());
        Assert.assertEquals("1", subscriptionPage.secondQuantity.getText());
        Assert.assertEquals("500", firstTotalPrice);
        Assert.assertEquals("400", secondTotalPrice);
    }


    @Then("ana sayfada herhangi bir urune tiklar")
    public void anaSayfadaHerhangiBirUruneTiklar() {
        int i = randomNum.nextInt(productsPage.viewProductHomePage.size());
        productsPage.viewProductHomePage.get(i).click();
        Driver.wait(4);
    }

    @Then("kullanici urun detayinin acildigini gorur")
    public void kullaniciUrunDetayininAcildiginiGorur() {

        String titlePage = Driver.getDriver().getTitle();
        System.out.println("titlePage = " + titlePage);
        Driver.wait(4);
        Assert.assertTrue(titlePage.contains("Product Details"));
    }

    @Then("kullanici miktari dorde cikarir")
    public void kullaniciMiktariDordeCikarir() {
        productsPage.quantityBox.clear();
        productsPage.quantityBox.sendKeys("4");
    }

    @Then("kullanici add to cart butona tiklar")
    public void kullaniciAddToCartButonaTiklar() {
        productsPage.addToCartButtonProduct.click();
    }

    @Then("kullanici Added olunca view cart butona tiklar")
    public void kullaniciAddedOluncaViewCartButonaTiklar() {

        productsPage.viewCartButtonProduct.click();
        Driver.wait(4);
    }

    @Then("kullanici urunun sepet sayfasinda artirilan miktar kadar goruntulendigini test eder")
    public void kullaniciUrununSepetSayfasindaArtirilanMiktarKadarGoruntulendiginiTestEder() {

        String quantity = productsPage.quantityBoxInCart.getText();
        Driver.wait(4);
        Assert.assertEquals("4", quantity);
    }


    //TC17_Remove Product Cart

    @Then("kullanici belirli bir urune gelen X butonuna tiklar")
    public void kullaniciBelirliBirUruneGelenXButonunaTiklar() {
        Driver.wait(2);
        productsPage.deleteButton_first.click();
        Driver.wait(2);
    }

    @Then("kullanici urunun sepetten cikarildigini test eder")
    public void kullaniciUrununSepettenCikarildiginiTestEder() {
        Driver.wait(1);
        Assert.assertTrue(productsPage.cartEmptyText.isDisplayed());
    }


    //TC18_View Category Products

    @Then("kullanici sol tarafta kategorilerin gorunur oldugunu test eder")
    public void kullaniciSolTaraftaKategorilerinGorunurOldugunuTestEder() {
        actions.sendKeys(Keys.PAGE_DOWN);
        Driver.wait(2);
        Assert.assertTrue(productsPage.categoryText.isDisplayed());
        Driver.wait(2);
    }

    @Then("kullanici Women kategorisine tiklar")
    public void kullaniciWomenKategorisineTiklar() {
        productsPage.womanCategory.click();
    }

    @Then("kullanici Women kategorisi altindaki herhangi bir kategori baglantisina tiklar")
    public void kullaniciWomenKategorisiAltindakiHerhangiBirKategoriBaglantisinaTiklar() {
        int i = randomNum.nextInt(productsPage.womenSubCategories.size());
        productsPage.womenSubCategories.get(i).click();
    }

    @Then("kullanici kategori sayfasinin goruldugunu test eder")
    public void kullaniciKategoriSayfasininGoruldugunuTestEder() {
        Assert.assertTrue(productsPage.productText.isDisplayed());
    }

    @Then("kullanici Women kategorisindeki hangi alt basligi secerse, acilan sayfada ona gore kategori basligi test eder")
    public void kullaniciWomenKategorisindekiHangiAltBasligiSecerseAcilanSayfadaOnaGoreKategoriBasligiTestEder() {
        productsPage.womanCategory.click();
        int i = randomNum.nextInt(productsPage.womenSubCategories.size());
        productsPage.womenSubCategories.get(i).click();
        Assert.assertTrue(productsPage.productText.isDisplayed());
    }

    @Then("kullanici sol tarafta Men kategorisi altindaki herhangi bir kategori baglantisina tiklar")
    public void kullaniciSolTaraftaMenKategorisiAltindakiHerhangiBirKategoriBaglantisinaTiklar() {
        int i = randomNum.nextInt(productsPage.menSubCategories.size());
        productsPage.menSubCategories.get(i).click();
    }

    @Then("kullanici Men kategorisindeki hangi alt basligi secerse, acilan sayfada ona gore kategori basligi test eder")
    public void kullaniciMenKategorisindekiHangiAltBasligiSecerseAcilanSayfadaOnaGoreKategoriBasligiTestEder() {
        productsPage.menCategory.click();
        int i = randomNum.nextInt(productsPage.menSubCategories.size());
        productsPage.menSubCategories.get(i).click();
        Assert.assertTrue(productsPage.productText.isDisplayed());
    }


    //TC19_View And Cart Brand Products

    @And("kullanici sol tarafta brands in goruldugunu test eder")
    public void kullaniciSolTaraftaBrandsInGoruldugunuTestEder() {
        Assert.assertTrue(productsPage.brands.isDisplayed());
        System.out.println("brands size :" + productsPage.brandsList.size()); //1
    }

    @And("kullanici herhangi bir marka ismini tiklar")
    public void kullaniciHerhangiBirMarkaIsminiTiklar() {
        actions.sendKeys(Keys.PAGE_DOWN);
        int randomSelect = randomNum.nextInt(productsPage.brandsList.size());
        productsPage.brandsList.get(randomSelect).click();
    }

    @And("kullanici marka sayfasina yonlendirildigini ve marka urunlerinin goruntulendigini test eder")
    public void kullaniciMarkaSayfasinaYonlendirildiginiVeMarkaUrunlerininGoruntulendiginiTestEder() {
        Assert.assertTrue(productsPage.productText.isDisplayed());
    }

    @And("kullanici sol tarafta baska bir marka baglantisini tiklar")
    public void kullaniciSolTaraftaBaskaBirMarkaBaglantisiniTiklar() {
        productsPage.hmproducts.click();

    }
        @And("kullanici o marka sayfasina yonlendirildigini ve marka urunlerinin goruntulendigini test eder")
        public void kullaniciOMarkaSayfasinaYonlendirildiginiVeMarkaUrunlerininGoruntulendiginiTestEder () {
        Assert.assertTrue(productsPage.productText.isDisplayed());
        }


    //TC21_Add Review on Product

    @Then("kullanici View Product butonuna tiklar")
    public void kullaniciViewProductButonunaTiklar() {
        productsPage.viewProductButton1.click();
    }

    @Then("kullnaici Write Your Review gorunur oldugunu test eder")
    public void kullnaiciWriteYourReviewGorunurOldugunuTestEder() {
        Assert.assertTrue(productsPage.productReview.isDisplayed());
    }

    @Then("kullanici name, email ve review bilgilerini gider")
    public void kullaniciNameEmailVeReviewBilgileriniGider() {
        productsPage.nameBox.sendKeys(Faker.instance().name().fullName());
        productsPage.emailBox.sendKeys(Faker.instance().internet().emailAddress());
        productsPage.reviewArea.sendKeys("I love your products...");
    }

    @Then("kullanici yorum gondermek icin Submit butonuna tiklar")
    public void kullaniciYorumGondermekIcinSubmitButonunaTiklar() {
        productsPage.submitButton.click();
    }

    @Then("kullanici Thank you for your review mesajinin gorunur oldugunu test eder")
    public void kullaniciThankYouForYourReviewMesajininGorunurOldugunuTestEder() {

        Assert.assertTrue(productsPage.successMessage.isDisplayed());
    }

    //TC22_Add to Cart of from Recommended Items

    @Then("kullanici sayfada scroll down yapar")
    public void kullaniciSayfadaScrollDownYapar() {
        ReusableMethods.scrollToElement(productsPage.recommendedItems);
    }

    @Then("kullanici RECOMMENDED ITEMS in gorunur oldugunu test eder")
    public void kullaniciRECOMMENDEDITEMSInGorunurOldugunuTestEder() {
        Assert.assertTrue(productsPage.recommendedItems.isDisplayed());

    }

    @Then("kullanici onerilen urun icin Add To Cart a tiklar")
    public void kullaniciOnerilenUrunIcinAddToCartATiklar() {
        Driver.wait(3);
        productsPage.recommendedAddToCart.click();
        Driver.wait(3);
    }


    @Then("kullanici sonrasinda view cart butona tiklar")
    public void kullaniciSonrasindaViewCartButonaTiklar() {
        productsPage.viewCart.click();
    }
}