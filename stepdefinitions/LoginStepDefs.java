package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;
import utilities.ExcelUtil;

import java.util.List;
import java.util.Map;

public class LoginStepDefs {
    String path = "src/test/resources/testData/testData.xlsx";
    String sheetName = "Sayfa1";
    ExcelUtil excelUtil =new ExcelUtil(path,sheetName);

    List<Map<String, String>> loginData = excelUtil.getDataList();

    LoginPage loginPage=new LoginPage();

    //steps

    @Then("kullanicinin Login to your account yazisinin gorunur oldugunu test eder")
    public void kullanicinin_login_to_your_account_yazisinin_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(loginPage.loginYourAccountText.isDisplayed());
    }

    @Then("kullanici dogru email ve sifreyi girer")
    public void kullanici_dogru_email_ve_sifreyi_girer(io.cucumber.datatable.DataTable dataTable) {
        
      List<String> loginCredentials = dataTable.row(1); 
      loginPage.loginemailElement.sendKeys(loginCredentials.get(0)); //practicebatch44@gmail.com
      loginPage.loginPasswordBox.sendKeys(loginCredentials.get(1)); //123456

    }


    @Then("kullanici login butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {
        loginPage.loginButton.click();
    }
    @Then("kullanici oturum actigini test eder\\(Logged in as username)")
    public void kullanici_oturum_actigini_test_eder_logged_in_as_username() {
        Assert.assertTrue(loginPage.loginYourAccountText.isDisplayed());
    }
    @Then("kullanici logout butonuna basar")
    public void kullanici_logout_butonuna_basar() {
        loginPage.logoutButton.click();

    } 

    @Then("kullanici dogru email {string} ve sifreyi {string} girer")
    public void kullaniciDogruEmailVeSifreyiGirer(String email, String psw) {
        loginPage.loginemailElement.sendKeys(email);
        loginPage.loginPasswordBox.sendKeys(psw);
    }

    @Then("kullanici dogru email ve sifreyi excel ile girer")
    public void kullaniciDogruEmailVeSifreyiExcelIleGirer() {
    

        loginPage.loginemailElement.sendKeys(loginData.get(0).get("Email"));
        loginPage.loginPasswordBox.sendKeys(loginData.get(0).get("Password"));


    }

    @Then("kullanici yanlis email ve sifreyi excel ile girer")
    public void kullaniciYanlisEmailVeSifreyiExcelIleGirer() {
        loginPage.loginemailElement.sendKeys(loginData.get(1).get("Email")); //bu satirlardaki data invalid
        loginPage.loginPasswordBox.sendKeys(loginData.get(1).get("Password")); //bu satirlardaki data invalid
    }

    @Then("kullanici Your email or password is incorrect! yazisinin goruldugunu test eder")
    public void kullaniciYourEmailOrPasswordIsIncorrectYazisininGoruldugunuTestEder() {

        Assert.assertTrue(loginPage.negativeLoginText.isDisplayed());
    }
}
