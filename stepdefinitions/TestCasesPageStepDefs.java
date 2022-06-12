package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.TestCasesPage;

public class TestCasesPageStepDefs {
    TestCasesPage testcasesPage=new TestCasesPage();

    @Then("Test Cases butonuna tiklar")
    public void testCasesButonunaTiklar() {

        testcasesPage.testCasesButton.click();
    }

    @Then("kullanicinin test page sayfalarina dogru yoneldiginin basarili oldugunu test eder")
    public void kullanicininTestPageSayfalarinaDogruYoneldigininBasariliOldugunuTestEder() {
        Assert.assertTrue(testcasesPage.testCasesText.isDisplayed());

    }
}
