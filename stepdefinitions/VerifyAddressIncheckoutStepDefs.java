package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.FillDetailsPage;
import pages.VerifyAddressIncheckoutPage;
import utilities.Driver;

public class VerifyAddressIncheckoutStepDefs {

    String address= "Techproed, Park Street, Number: 1564";
    String country= "United States";
    String state= "Texas";
    String city= "Dallas";

    VerifyAddressIncheckoutPage verifyAddressIncheckoutPage =new VerifyAddressIncheckoutPage();
    FillDetailsPage fillDetailsPage=new FillDetailsPage();

    @Then("kullanici adress bilgilerini doldurur")
    public void kullaniciAdressBilgileriniDoldurur() {
        fillDetailsPage.firstNameBox.sendKeys("Elif");
        fillDetailsPage.lastNameBox.sendKeys(Faker.instance().name().lastName());
        fillDetailsPage.companyBox.sendKeys("techpro");
        fillDetailsPage.addressBox.sendKeys(address);
        Driver.selectByIndex(fillDetailsPage.countryDropdown,1);
        fillDetailsPage.stateBox.sendKeys(state);
        fillDetailsPage.cityBox.sendKeys(city);
        fillDetailsPage.zipcodeBox.sendKeys(Faker.instance().address().zipCode());
        fillDetailsPage.mobileNumberBox.sendKeys(Faker.instance().phoneNumber().cellPhone());
    }

    @Then("kullanici girilen adres bilgilerinin ayni oldugunu test eder")
    public void kullaniciGirilenAdresBilgilerininAyniOldugunuTestEder() {

        Assert.assertTrue(verifyAddressIncheckoutPage.deliveryAddress.getText().contains(address));
        Assert.assertTrue(verifyAddressIncheckoutPage.deliveryAddress.getText().contains(country));
        Assert.assertTrue(verifyAddressIncheckoutPage.deliveryAddress.getText().contains(state));
        Assert.assertTrue(verifyAddressIncheckoutPage.deliveryAddress.getText().contains(city));

        Assert.assertTrue(verifyAddressIncheckoutPage.addressInvoice.getText().contains(address));
        Assert.assertTrue(verifyAddressIncheckoutPage.addressInvoice.getText().contains(country));
        Assert.assertTrue(verifyAddressIncheckoutPage.addressInvoice.getText().contains(state));
        Assert.assertTrue(verifyAddressIncheckoutPage.addressInvoice.getText().contains(city));
    }

}
