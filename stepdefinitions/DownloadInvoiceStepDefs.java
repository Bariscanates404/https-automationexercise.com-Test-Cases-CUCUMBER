package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.DownloadInvoicePage;
import utilities.Driver;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DownloadInvoiceStepDefs {
    DownloadInvoicePage downloadInvoicePage=new DownloadInvoicePage();

    @Then("kullanici Download invoice butona tiklar")
    public void kullanici_download_invoice_butona_tiklar() {

        downloadInvoicePage.downloadInvoice.click();
    }

    @Then("kullanici faturanin indirildigini test eder")
    public void kullanici_faturanin_indirildigini_test_eder() {
        Driver.wait(5);

        String date = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());
        String expectedPath = System.getProperty("user.dir") + "/Downloads/invoice.txt";

        boolean doesExist = Files.exists(Paths.get(expectedPath));
        Assert.assertTrue(doesExist);
    }
}
