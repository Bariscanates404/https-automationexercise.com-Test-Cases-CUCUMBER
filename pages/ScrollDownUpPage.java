package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class ScrollDownUpPage {
    public ScrollDownUpPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id="scrollUp")
    //@FindBy(xpath = "//*[@class='fa fa-angle-up']")
    public WebElement scrollUpArrow;

    @FindBy (xpath = "(//h2)[3]")
    public WebElement verificationText1;  //Full-Fledged practice website for Automation Engineers

    @FindBy (xpath = "(//h2)[2]")
    public WebElement verificationText2;   //Full-Fledged practice website for Automation Engineers

    @FindBy (xpath = "(//h2)[1]")
    public WebElement verificationText3;   //Full-Fledged practice website for Automation Engineers

    //anasayfada 3 sekmede de ortak olan text in birden fazla locate i var hepsini yazdim ben, ve hepsine baktim
    //kodu yazarken de o anda hangi sekmedeki text i gorurse ona baksin dedim
}
