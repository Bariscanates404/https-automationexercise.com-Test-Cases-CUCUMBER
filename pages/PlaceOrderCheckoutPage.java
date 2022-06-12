package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class PlaceOrderCheckoutPage {

    public PlaceOrderCheckoutPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='btn btn-default add-to-cart']")
    public List<WebElement> addToCartButtons;

    @FindBy (xpath = "//*[@class='fa fa-shopping-cart']")
    public WebElement cartButtonHomePage;

    @FindBy (xpath = "//*[@class='active']")
    public WebElement shoppingCartText;

    @FindBy (xpath = "//*[@class='btn btn-default check_out']")
    public WebElement proceedToCheckoutButton;

    @FindBy (partialLinkText = "Register")
    public WebElement registerLoginButton;

    @FindBy(xpath = "//*[@class='fa fa-shopping-cart']")
    public WebElement cartButtonCheckout;  // xpath yukaridaki ile ayni gorunse de bazen index den dolayi farklilik olabiliyor

    @FindBy(xpath ="//*[@class='heading']")
    public WebElement addressVerificationText;

    @FindBy(name="message")
    public WebElement messageBox;

    @FindBy(xpath = "//*[@class='btn btn-default check_out']")
    public WebElement placeOrderButton;

    @FindBy(name="name_on_card")
    public WebElement nameOnCard;

    @FindBy(name="card_number")
    public WebElement cardNumberBox;

    @FindBy(name = "cvc")
    public WebElement cvcBox;

    @FindBy (name="expiry_month")
    public WebElement expirationMonth;

    @FindBy(name="expiry_year")
    public WebElement expirationYear;

    @FindBy(xpath = "//*[@class='form-control btn btn-primary submit-button']")
    public WebElement payAndConfirmOrderButton;

    @FindBy(xpath = "(//b)[2]")
    public WebElement orderPlacedText;

    @FindBy(xpath = "(//a)[6]")
    public WebElement deleteAccountButton;


}
