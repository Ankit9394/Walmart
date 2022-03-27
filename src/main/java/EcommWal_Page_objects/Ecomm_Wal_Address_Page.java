package EcommWal_Page_objects;

import EcommWal_Test_Base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Ecomm_Wal_Address_Page extends TestBase {

    public WebDriver driver;

    public Ecomm_Wal_Address_Page(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);


    }

    @FindBy(xpath="//a[contains(text(),'Addresses')]")
    private WebElement addressesLink;
    public WebElement getAddressesLink(){
        return addressesLink;
    }

    @FindBy(xpath="//button[contains(text(),'Add address')]")
    private WebElement addAddressLinkClick;
    public WebElement getAddAddressLinkClick(){
        return addAddressLinkClick;
    }
    @FindBy(id = "firstName")
    private WebElement firstName;
    public WebElement getFirstName(){
        return firstName;
    }

    @FindBy(id = "lastName")
    private WebElement lastName;
    public WebElement getLastName(){
        return lastName;
    }

    @FindBy(id = "address1")
    private WebElement addressField;
    public WebElement getAddressField(){
        return addressField;
    }

    @FindBy(id = "city")
    private WebElement city;
    public WebElement getCity(){
        return city;
    }

    @FindBy(id = "province")
    private WebElement territory;
    public WebElement getTerritory(){
        return territory;
    }
    public void dropDownProvince(){
        Select s= new Select(territory);
        s.selectByVisibleText("Ontario");
    }

    @FindBy(id = "postalCode")
    private WebElement postalCode;
    public WebElement getPostalCode(){
        return postalCode;
    }
     @FindBy(id = "phoneNumber")
    private WebElement phoneNumber;
    public WebElement getPhoneNumber(){
        return phoneNumber;
    }

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    private WebElement saveButton;
    public WebElement getSaveButton(){
        return saveButton;
    }



}
