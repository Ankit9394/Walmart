package EcommWal_Page_objects;

import EcommWal_Test_Base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EcommWal_Sign_In_Page extends TestBase {

    public WebDriver driver;

    public EcommWal_Sign_In_Page(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "username")
    public WebElement emailID;
    public WebElement getEmailID(){
        return emailID;
    }

@FindBy(id = "password")
    public WebElement passwordInPage;
    public WebElement getPasswordInPage(){
        return passwordInPage;
    }

@FindBy(xpath="//button[contains(text(),'Sign in')]")
    public WebElement signInlink;
    public WebElement getSignInlink(){
        return signInlink;
    }
@FindBy(xpath = "//button[contains(text(),'Sign in')]")
    public WebElement signInButton;
    public WebElement getSignInButton(){
        return signInButton;
    }

}
