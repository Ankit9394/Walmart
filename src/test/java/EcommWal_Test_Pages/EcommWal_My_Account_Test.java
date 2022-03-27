package EcommWal_Test_Pages;

import EcommWal_Test_Base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EcommWal_My_Account_Test extends TestBase {


    @Test
    public void myAccountPage() throws InterruptedException {
        getEcommWal_sign_up_page().hoveroveronSignInLink();
        getEcommWal_sign_in_page().getSignInlink().click();
        getEcommWal_sign_in_page().getEmailID().sendKeys(prop.getProperty("email"));
        getEcommWal_sign_in_page().getPasswordInPage().sendKeys(prop.getProperty("passwordin"));
        getEcommWal_sign_in_page().getSignInButton().click();
        Thread.sleep(3000);
        Assert.assertTrue(getEcommWal_my_account_page().getUserAccountVerify().isDisplayed());
    }

@Test
    public void verifyurlMyAccountPage() throws InterruptedException {
    getEcommWal_sign_up_page().hoveroveronSignInLink();
    getEcommWal_sign_in_page().getSignInlink().click();
    getEcommWal_sign_in_page().getEmailID().sendKeys(prop.getProperty("email"));
    getEcommWal_sign_in_page().getPasswordInPage().sendKeys(prop.getProperty("passwordin"));
    getEcommWal_sign_in_page().getSignInButton().click();
    Thread.sleep(7000);
    getEcommWal_my_account_page().getMyAccountLink().click();
    getEcommWal_my_account_page().verifyUrl();
}

@Test
    public void verifyProfileSettingPage() throws InterruptedException {
    getEcommWal_sign_up_page().hoveroveronSignInLink();
    getEcommWal_sign_in_page().getSignInlink().click();
    getEcommWal_sign_in_page().getEmailID().sendKeys(prop.getProperty("email"));
    getEcommWal_sign_in_page().getPasswordInPage().sendKeys(prop.getProperty("passwordin"));
    getEcommWal_sign_in_page().getSignInButton().click();
    Thread.sleep(7000);
    getEcommWal_my_account_page().getMyAccountLink().click();
    JavascriptExecutor js= (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,350)","");

    getEcommWal_my_account_page().getProfileSettingLink().click();
    getEcommWal_my_account_page().verifyUrlProfile();

}

}