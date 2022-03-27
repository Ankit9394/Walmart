package EcommWal_Page_objects;

import EcommWal_Test_Base.TestBase;
import org.apache.bcel.generic.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EcommWal_Sign_Up_Page extends TestBase {
    public WebDriver driver; //initialize the driver first

    public EcommWal_Sign_Up_Page(WebDriver driver){ //create constructor and pass driver as parameter in constructor
        this.driver= driver;// global variable = local variable
        PageFactory.initElements(driver, this);
        //this.driver to initialize global variables with the current value of constructor
        //local variable we initialize by making the object of that particular constructor but java will confuse
        // if the global and local variable names are same and that is why we use this keyword to differentiate them and
        // after that we have to make their value equal so we will write,
        //global var=local var
    }

    @FindBy(xpath = "//span[contains(text(),'My account')]")

    public WebElement myAccountlink;
        public WebElement getMyAccountlink(){
            return  myAccountlink;
        }

        public void hoveroveronSignInLink(){
        Actions action= new Actions(driver);
        action.moveToElement(getMyAccountlink()).build().perform();
    }

    @FindBy(xpath = "//a[contains(text(),'Join now')]")
    public WebElement joinNowLink;
        public WebElement getJoinNowLink(){
            return joinNowLink;
        }

    @FindBy(id = "firstName")
    public WebElement FirstName;
        public WebElement getFirstName(){
            return FirstName;
        }
     @FindBy(id = "lastName")
    public WebElement lastname;
        public WebElement getLastname(){
            return  lastname;
        }

    @FindBy(id ="phoneNumber")
    public WebElement phoneNumber;
        public WebElement getPhoneNumber() {
        return phoneNumber;
    }

    @FindBy(id = "email")
    public WebElement emailID;
        public WebElement getEmailID() {
        return emailID;
    }

    @FindBy(id="password")
    public WebElement password;
        public WebElement getPassword(){
            return password;
        }

    @FindBy(id = "TAndC")
    public WebElement checkBoxCreateAccount;
        public WebElement getCheckBoxCreateAccount(){
            return checkBoxCreateAccount;
        }


    @FindBy(id="marketingPreference")
    public WebElement checkBoxFlyer;
        public WebElement getCheckBoxFlyer(){
            return checkBoxFlyer;
        }

    @FindBy(xpath = "//button[contains(text(),'Create account')]")
    public WebElement createAccountButton;
        public WebElement getCreateAccountButton(){
            return createAccountButton;
        }

    @FindBy(xpath = "//span[contains(text(),'Show')]")
    public WebElement passwordShowbutton;
        public WebElement getPasswordShowbutton(){
            return passwordShowbutton;
        }

        @FindBy(xpath = "//div[@class=\"password-strength-label\"]")
    public WebElement passwordStrenght;
        public WebElement getPasswordStrenght(){
            return passwordStrenght;
        }
       /* public void messageVerify(){
           String s= passwordStrenght.getText();
            Assert.assertTrue();
        }*/
}



