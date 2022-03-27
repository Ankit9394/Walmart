package EcommWal_Page_objects;

import EcommWal_Test_Base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EcommWal_SearchOrder_Page extends TestBase {
    public WebDriver driver;

    public EcommWal_SearchOrder_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "EcommWal_SearchOrder_Page")
    public WebElement searchField;

    public WebElement getSearchField() {
        return searchField;
    }

    @FindBy(xpath = "//button[@class='css-1v9c0kj e1xoeh2i2']")
    public WebElement searchbutton;

    public WebElement getSearchbutton() {
        return searchbutton;
    }

    @FindBy(xpath = "//p[contains(text(),\"L'Oréal Paris Men Expert Sculpting Paste, Hair Sty\")]")
    public WebElement menHairGelProduct;

    public WebElement getMenHairGelProduct() {
        return menHairGelProduct;
    }

    @FindBy(xpath = "//h1[contains(text(),\"L'Oréal Paris Men Expert Sculpting Paste, Hair Sty\")]")
    public WebElement productTitle;

    public WebElement getProductTitle() {
        return productTitle;
    }

    @FindBy(xpath = "(//div[@class='css-dj933 e1sr67l90'])[1]")
    public WebElement productRatings;

    public WebElement getProductRatings() {
        return productRatings;
    }

    @FindBy(xpath = "(//span[@class='css-2vqe5n esdkp3p0'])[1]")
    public WebElement productPrice;

    public WebElement getProductPrice() {
        return productPrice;
    }

    @FindBy(xpath = "(//div[@class='css-128ipej'])[1]")

    public WebElement productImage;

    public WebElement getProductImage() {
        return productImage;
    }

    @FindBy(xpath = "//button[contains(text(),'Add to cart')]")
    private WebElement addToCart;

    public WebElement getAddToCart() {
        return addToCart;
    }
    @FindBy(xpath = "//button[contains(text(),'Checkout')]")
    private WebElement checkOutLink;
    public WebElement  getCheckOutLink(){
        return checkOutLink;
    }

    @FindBy(xpath="(//button[@class='e5qqw234 css-1gezpl6 edzik9p0'])[1]")
    private WebElement plusSign;
    public WebElement getPlusSign(){
        return plusSign;
    }

    @FindBy(xpath = "//button[contains(text(),'Proceed to checkout')]")
    private WebElement proceedToCheckout;
    public WebElement getProceedToCheckout(){
        return proceedToCheckout;
    }
    @FindBy(xpath="//button[contains(text(),'Checkout as a guest')]")
    private WebElement checkOutGuest;
    public WebElement getCheckOutGuest(){
        return checkOutGuest;
    }
    @FindBy(xpath="(//a[contains(text(),'View cart')])[2]")
    private WebElement clickOnCart;
    public WebElement getClickOnCart(){
        return clickOnCart;
    }
}