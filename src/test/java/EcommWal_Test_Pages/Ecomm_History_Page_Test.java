package EcommWal_Test_Pages;

import EcommWal_Test_Base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Ecomm_History_Page_Test extends TestBase {

    @Test
    public void verifyTextHistoryPage() throws InterruptedException {
        getEcommWal_sign_up_page().hoveroveronSignInLink();
        getEcommWal_sign_in_page().getSignInlink().click();
        getEcommWal_sign_in_page().getEmailID().sendKeys(prop.getProperty("email"));
        getEcommWal_sign_in_page().getPasswordInPage().sendKeys(prop.getProperty("passwordin"));
        getEcommWal_sign_in_page().getSignInButton().click();
        Thread.sleep(2000);
        getEcommWal_my_account_page().getMyAccountLink().click();
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)","");
        getEcommWal_history_page().getOrderHistorylink().click();
    }
    @Test
    public void selectyearFromDropDown() throws InterruptedException {
        getEcommWal_sign_up_page().hoveroveronSignInLink();
        getEcommWal_sign_in_page().getSignInlink().click();
        getEcommWal_sign_in_page().getEmailID().sendKeys(prop.getProperty("email"));
        getEcommWal_sign_in_page().getPasswordInPage().sendKeys(prop.getProperty("passwordin"));
        getEcommWal_sign_in_page().getSignInButton().click();
        Thread.sleep(2000);
        getEcommWal_my_account_page().getMyAccountLink().click();
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)","");
        getEcommWal_history_page().getOrderHistorylink().click();
        getEcommWal_history_page().dropDownHandle();

    }




}
