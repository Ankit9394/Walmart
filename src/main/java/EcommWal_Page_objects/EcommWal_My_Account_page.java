package EcommWal_Page_objects;

import EcommWal_Test_Base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EcommWal_My_Account_page extends TestBase {

    public WebDriver driver;

    public EcommWal_My_Account_page(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);

    }
    @FindBy(xpath="//span[@data-automation=\"account-user-name\"]")
    public WebElement userAccountVerify;
    public WebElement getUserAccountVerify(){
        return userAccountVerify;
    }

    public void verifyUrl() throws InterruptedException {

        Thread.sleep(2000);
        String s =driver.getCurrentUrl();
        Assert.assertEquals(s,"https://www.walmart.ca/my-account");

    }


    @FindBy(xpath = "//span[contains(text(),'My account')]")
    public WebElement myAccountLink;
    public WebElement getMyAccountLink(){
        return myAccountLink;
    }
@FindBy(xpath = "//a[contains(text(),'Profile Settings')]")
    public WebElement profileSettingLink;
    public WebElement getProfileSettingLink(){
        return profileSettingLink;
}
    public void verifyUrlProfile(){
        String s =driver.getCurrentUrl();
        Assert.assertEquals(s,"https://www.walmart.ca/my-account/personal-settings");
    }



}
