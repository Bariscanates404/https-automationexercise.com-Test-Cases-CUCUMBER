package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ProductsPage {

    public ProductsPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//i[@class='material-icons card_travel']")
    public WebElement productButton;

    @FindBy(xpath = "//h2[contains(text(),'All Products')]")
    public WebElement allProductsText;

    @FindBy(xpath = "//div[@class='productinfo text-center']")
    public List<WebElement> productList;

    @FindBy(xpath = "//a[@href='/product_details/1']")
    public WebElement viewProductButton1;

    @FindBy(xpath = "//h2[contains(text(),'Blue Top')]")
    public WebElement ProductName;

    @FindBy(xpath = "//p[contains(text(),'Category')]")
    public WebElement Category;

    @FindBy(xpath = "//span[contains(text(),'Rs. 500')]")
    public WebElement Price;

    @FindBy(xpath = "//b[contains(text(),'Availability:')]")
    public WebElement Availability;

    @FindBy(xpath = "//b[contains(text(),'Condition')]")
    public WebElement Condition;

    @FindBy (xpath = "//b[contains(text(),'Brand')]")
    public WebElement Brand;

    @FindBy(xpath = "//div[@class ='product-information']")
    public List<WebElement> productInformationList;

    @FindBy (xpath = "//*[@class='fa fa-plus-square']")
    public List<WebElement> viewProductHomePage;

    //TC13
    @FindBy (id = "quantity")
    public WebElement quantityBox;

    @FindBy(xpath = "//*[@type='button']")
    public WebElement addToCartButtonProduct;

    @FindBy(linkText = "View Cart")
    public WebElement viewCartButtonProduct;


    @FindBy(xpath = "//*[@class='disabled']")
    public WebElement quantityBoxInCart;

    //TC17

    @FindBy(xpath = "//a[@class='cart_quantity_delete']" )
    public WebElement deleteButton_first;

    @FindBy(xpath = "//*[@class='fa fa-times']")
    public WebElement deleteButton_second;

    @FindBy(xpath = "//*[text()='Cart is empty!']")
    public  WebElement cartEmptyText;

    //TC18

    @FindBy (xpath = "//*[text()='Category']")
    public WebElement categoryText;

    @FindBy (xpath = "//*[@class='collapsed']")
    public List<WebElement> categories;  //women, men, kids

    @FindBy(xpath = "//a[@href='#Women']")
    public WebElement womanCategory;

    @FindBy(xpath = "(//div[@class='panel-body'])[1]")
    public List<WebElement> womenSubCategories;

    @FindBy (xpath = "//a[@href='/category_products/1']")
    public  WebElement dressProducts;

    @FindBy (xpath = "//a[@href='/category_products/2']")
    public  WebElement topsProducts;

    @FindBy (xpath = "//a[@href='/category_products/7']")
    public  WebElement sareeProducts;

    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement productText;
    //3 subCategory icinde textler farkli olsa da locateleri ayni..1 kere yazmak yeterli..
    //ayni zamanda men kategorileri acildiginda da textler ayni locate e sahip
    //brands de secilen kategorileri acildiginda text ayni locate e sahip

    @FindBy (xpath = "//a[@href='#Men']")
    public WebElement menCategory;

    @FindBy(xpath = "(//div[@class='panel-body'])[2]")
    public List<WebElement> menSubCategories;

    @FindBy (xpath = "//a[@href='/category_products/3']")
    public WebElement TshirtsProducts;

    @FindBy(xpath = "//a[@href='/category_products/6']")
    public WebElement jeansProduct;

    //TC19

    @FindBy(xpath = "//h2[.='Brands']")
    public WebElement brands;

    @FindBy(xpath = "//div[@class='brands-name']")
    public List<WebElement> brandsList;
    // markalari liste olarak alamadim, liste olarak random icinden sectirdim ama size: 1 cikiyor, sanirim siteden kaynakli.
    // .bu yuzden kodu baside indirgeyerek revize ettim

    @FindBy(xpath = "//a[@href='/product_details/1']")
    public WebElement viewProductButtonfirst;

    @FindBy (xpath = "//a[@href='/brand_products/Polo']")
    public WebElement poloProducts;

    @FindBy(xpath = "//*[text()='Brand - Polo Products']")
    public WebElement poloProductsText;

    @FindBy (xpath = "//*[text()='Brand - H&M Products']")
    public WebElement hmProductsText;

    @FindBy(xpath = "//a[@href='/brand_products/H&M']")
    public WebElement hmproducts;


    //TC21

    @FindBy(xpath="//a[@href='#reviews']")
    public WebElement productReview;

    @FindBy(xpath="//input[@id='name']")
    public WebElement nameBox;

    @FindBy(xpath="//input[@id='email']")
    public WebElement emailBox;

    @FindBy(xpath="//textarea[@id='review']")
    public WebElement reviewArea;

    @FindBy(xpath="//button[@id='button-review']")
    public WebElement submitButton;

    @FindBy(xpath="//a[@href='/product_details/4']")
    public WebElement productDetail;

    @FindBy(xpath="//div[@class='alert-success alert']")
    public WebElement successMessage;

    //TC22

    @FindBy(xpath = "//*[text()='recommended items']")
    public WebElement recommendedItems;

    @FindBy(xpath = "(//*[@class='btn btn-default add-to-cart'])[72]")
    public WebElement recommendedAddToCart;

    @FindBy(id="cart_info")
    public WebElement productInChart;

    @FindBy(xpath= "(//a[@href='/view_cart'])[2]")
    public WebElement viewCart;

}
