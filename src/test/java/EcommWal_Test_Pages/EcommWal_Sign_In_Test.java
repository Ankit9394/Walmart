package EcommWal_Test_Pages;

import EcommWal_Test_Base.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class EcommWal_Sign_In_Test extends TestBase {


    @Test
    public void signInPageTest() {
        getEcommWal_sign_up_page().hoveroveronSignInLink();
        getEcommWal_sign_in_page().getSignInlink().click();
        getEcommWal_sign_in_page().getEmailID().sendKeys(prop.getProperty("email"));
        getEcommWal_sign_in_page().getPasswordInPage().sendKeys(prop.getProperty("passwordin"));
        getEcommWal_sign_in_page().getSignInButton().click();
    }

    @Test
    public void InvalidEmailId() throws IOException {
        getEcommWal_sign_up_page().hoveroveronSignInLink();
        getEcommWal_sign_in_page().getSignInlink().click();
        getEcommWal_sign_in_page().getEmailID().sendKeys("b4u303");
        getEcommWal_sign_in_page().getPasswordInPage().sendKeys("Ankit123#");
        File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screen, new File("C://Users//Dipali Tailor//Desktop//Walmart work//InvalidEmailsigninpage.jpg"));
        getEcommWal_sign_in_page().getSignInButton().click();
    }

    @Test
    public void emailblank() throws IOException {
        getEcommWal_sign_up_page().hoveroveronSignInLink();
        getEcommWal_sign_in_page().getSignInlink().click();
        getEcommWal_sign_in_page().getEmailID().sendKeys("");
        getEcommWal_sign_in_page().getPasswordInPage().sendKeys("Ankit123#");
        File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screen, new File("C://Users//Dipali Tailor//Desktop//Walmart work//BlankEmailsigninpage.jpg"));
        getEcommWal_sign_in_page().getSignInButton().click();
    }

    @Test
    public void passwordInvalid() throws IOException {
        getEcommWal_sign_up_page().hoveroveronSignInLink();
        getEcommWal_sign_in_page().getSignInlink().click();
        getEcommWal_sign_in_page().getEmailID().sendKeys("b4u303@gmail.com");
        getEcommWal_sign_in_page().getPasswordInPage().sendKeys("Ankit");
        File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screen, new File("C://Users//Dipali Tailor//Desktop//Walmart work//passwordSigninpage.jpg"));
        getEcommWal_sign_in_page().getSignInButton().click();
    }
@Test
public void passwordBlank() throws IOException {
    getEcommWal_sign_up_page().hoveroveronSignInLink();
    getEcommWal_sign_in_page().getSignInlink().click();
    getEcommWal_sign_in_page().getEmailID().sendKeys("b4u303@gmail.com");
    getEcommWal_sign_in_page().getPasswordInPage().sendKeys("");
    File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(screen, new File("C://Users//Dipali Tailor//Desktop//Walmart work//blankpasswordSigninpage.jpg"));
    getEcommWal_sign_in_page().getSignInButton().click();
    }

    @Test
    public void signInVerifyWoPasswordEmail() throws IOException {
        getEcommWal_sign_up_page().hoveroveronSignInLink();
        getEcommWal_sign_in_page().getSignInlink().click();
        getEcommWal_sign_in_page().getEmailID().sendKeys("");
        getEcommWal_sign_in_page().getPasswordInPage().sendKeys("");
        File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screen, new File("C://Users//Dipali Tailor//Desktop//Walmart work//withoutpassemailSigninpage.jpg"));
        getEcommWal_sign_in_page().getSignInButton().click();
    }


}