package EcommWal_Test_Pages;

import EcommWal_Test_Base.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class EcommWal_Sign_Up_Test extends TestBase {

@Test
    public void myAccountLinkHoverOver() throws InterruptedException {
    getEcommWal_sign_up_page().hoveroveronSignInLink();
    getEcommWal_sign_up_page().getJoinNowLink().click();
}

@Test //
    public void createAccountValidData() throws InterruptedException {
    getEcommWal_sign_up_page().hoveroveronSignInLink();
    getEcommWal_sign_up_page().getJoinNowLink().click();

    getEcommWal_sign_up_page().getFirstName().sendKeys("Bhargav");
    getEcommWal_sign_up_page().getLastname().sendKeys("patel");
    getEcommWal_sign_up_page().getPhoneNumber().sendKeys("2265036995");
    getEcommWal_sign_up_page().getEmailID().sendKeys("ankitrana2315@gmail.com");
    getEcommWal_sign_up_page().getPassword().sendKeys("Ankit2315#");

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,600)", "");

    Thread.sleep(2000);
    getEcommWal_sign_up_page().getCheckBoxCreateAccount().click();
    getEcommWal_sign_up_page().getCheckBoxFlyer().click();
    getEcommWal_sign_up_page().getCreateAccountButton().click();
}
    @Test
public void createAccountInvalidFname() throws InterruptedException {
            getEcommWal_sign_up_page().hoveroveronSignInLink();
            getEcommWal_sign_up_page().getJoinNowLink().click();

            getEcommWal_sign_up_page().getFirstName().sendKeys("B");
            getEcommWal_sign_up_page().getLastname().sendKeys("patel");
            getEcommWal_sign_up_page().getPhoneNumber().sendKeys("2265036995");
            getEcommWal_sign_up_page().getEmailID().sendKeys("ankitrana2315@gmail.com");
            getEcommWal_sign_up_page().getPassword().sendKeys("Ankit2315#");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)", "");

            Thread.sleep(1000);
            getEcommWal_sign_up_page().getCheckBoxCreateAccount().click();
            getEcommWal_sign_up_page().getCheckBoxFlyer().click();
            getEcommWal_sign_up_page().getCreateAccountButton().click();
    }

@Test
    public void createAccountFnameBlank() throws InterruptedException {
        getEcommWal_sign_up_page().hoveroveronSignInLink();
        getEcommWal_sign_up_page().getJoinNowLink().click();

        getEcommWal_sign_up_page().getFirstName().sendKeys("");
        getEcommWal_sign_up_page().getLastname().sendKeys("patel");
        getEcommWal_sign_up_page().getPhoneNumber().sendKeys("2265036995");
        getEcommWal_sign_up_page().getEmailID().sendKeys("ankitrana2315@gmail.com");
        getEcommWal_sign_up_page().getPassword().sendKeys("Ankit2315#");

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,600)", "");
        Thread.sleep(1000);
        getEcommWal_sign_up_page().getCheckBoxCreateAccount().click();
        getEcommWal_sign_up_page().getCheckBoxFlyer().click();
        getEcommWal_sign_up_page().getCreateAccountButton().click();
}

@Test
    public void createAccountInvalidLastname() throws InterruptedException {


        getEcommWal_sign_up_page().hoveroveronSignInLink();
        getEcommWal_sign_up_page().getJoinNowLink().click();

        getEcommWal_sign_up_page().getFirstName().sendKeys("Bhargav");
        getEcommWal_sign_up_page().getLastname().sendKeys("p");
        getEcommWal_sign_up_page().getPhoneNumber().sendKeys("2265036995");
        getEcommWal_sign_up_page().getEmailID().sendKeys("ankitrana2315@gmail.com");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", getEcommWal_sign_up_page().getCheckBoxCreateAccount());
        getEcommWal_sign_up_page().getPassword().sendKeys("Ankit2315#");
        Thread.sleep(2000);
        getEcommWal_sign_up_page().getCheckBoxCreateAccount().click();
        getEcommWal_sign_up_page().getCheckBoxFlyer().click();
        getEcommWal_sign_up_page().getCreateAccountButton().click();

}

@Test
    public void createAccountLastnameBlank() throws InterruptedException {

        getEcommWal_sign_up_page().hoveroveronSignInLink();
        getEcommWal_sign_up_page().getJoinNowLink().click();

        getEcommWal_sign_up_page().getFirstName().sendKeys("Bhargav");
        getEcommWal_sign_up_page().getLastname().sendKeys("");
        getEcommWal_sign_up_page().getPhoneNumber().sendKeys("2265036995");
        getEcommWal_sign_up_page().getEmailID().sendKeys("ankitrana2315@gmail.com");
       // js.executeScript("arguments[0].scrollIntoView();", getEcommWal_sign_up_page().getCheckBoxCreateAccount());
        getEcommWal_sign_up_page().getPassword().sendKeys("Ankit2315#");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)", "");
    //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    Thread.sleep(2000);
        getEcommWal_sign_up_page().getCheckBoxCreateAccount().click();
        getEcommWal_sign_up_page().getCheckBoxFlyer().click();
        getEcommWal_sign_up_page().getCreateAccountButton().click();
}
@Test
    public void createAccountInvalidPnumber() throws InterruptedException {
    getEcommWal_sign_up_page().hoveroveronSignInLink();
    getEcommWal_sign_up_page().getJoinNowLink().click();

    getEcommWal_sign_up_page().getFirstName().sendKeys("Bhargav");
    getEcommWal_sign_up_page().getLastname().sendKeys("Patel");
    getEcommWal_sign_up_page().getPhoneNumber().sendKeys("226503699");
    getEcommWal_sign_up_page().getEmailID().sendKeys("ankitrana2315@gmail.com");
    // js.executeScript("arguments[0].scrollIntoView();", getEcommWal_sign_up_page().getCheckBoxCreateAccount());
    getEcommWal_sign_up_page().getPassword().sendKeys("Ankit2315#");
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,600)", "");
    //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    Thread.sleep(2000);
    getEcommWal_sign_up_page().getCheckBoxCreateAccount().click();
    getEcommWal_sign_up_page().getCheckBoxFlyer().click();
    getEcommWal_sign_up_page().getCreateAccountButton().click();
}
@Test
    public void createAccountPnumberBlank() throws InterruptedException, IOException {

    getEcommWal_sign_up_page().hoveroveronSignInLink();
    getEcommWal_sign_up_page().getJoinNowLink().click();

    getEcommWal_sign_up_page().getFirstName().sendKeys("Bhargav");
    getEcommWal_sign_up_page().getLastname().sendKeys("Patel");
    getEcommWal_sign_up_page().getPhoneNumber().sendKeys("");
    getEcommWal_sign_up_page().getEmailID().sendKeys("ankitrana2315@gmail.com");
    getEcommWal_sign_up_page().getPassword().sendKeys("Ankit2315#");
    File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(screen, new File("C://Users//Dipali Tailor//Desktop//Walmart work//phonenumber.jpg"));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,600)", "");

    Thread.sleep(1000);
    getEcommWal_sign_up_page().getCheckBoxCreateAccount().click();
    getEcommWal_sign_up_page().getCheckBoxFlyer().click();
    getEcommWal_sign_up_page().getCreateAccountButton().click();

}
@Test
    public void createAccountInvalidEmail() throws IOException, InterruptedException {
    getEcommWal_sign_up_page().hoveroveronSignInLink();
    getEcommWal_sign_up_page().getJoinNowLink().click();

    getEcommWal_sign_up_page().getFirstName().sendKeys("Bhargav");
    getEcommWal_sign_up_page().getLastname().sendKeys("Patel");
    getEcommWal_sign_up_page().getPhoneNumber().sendKeys("");
    getEcommWal_sign_up_page().getEmailID().sendKeys("ankitrana2315.com");
    getEcommWal_sign_up_page().getPassword().sendKeys("Ankit2315#");
    File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(screen, new File("C://Users//Dipali Tailor//Desktop//Walmart work//InvalidEmail.jpg"));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,600)", "");

    Thread.sleep(1000);
    getEcommWal_sign_up_page().getCheckBoxCreateAccount().click();
    getEcommWal_sign_up_page().getCheckBoxFlyer().click();
    getEcommWal_sign_up_page().getCreateAccountButton().click();

}
@Test
    public void createAccountEmailBlank() throws IOException, InterruptedException {
    getEcommWal_sign_up_page().hoveroveronSignInLink();
    getEcommWal_sign_up_page().getJoinNowLink().click();

    getEcommWal_sign_up_page().getFirstName().sendKeys("Bhargav");
    getEcommWal_sign_up_page().getLastname().sendKeys("Patel");
    getEcommWal_sign_up_page().getPhoneNumber().sendKeys("2265036905");
    getEcommWal_sign_up_page().getEmailID().sendKeys("");
    getEcommWal_sign_up_page().getPassword().sendKeys("Ankit2315#");

    File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(screen, new File("C://Users//Dipali Tailor//Desktop//Walmart work//EmailBlank.jpg"));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,600)", "");

    Thread.sleep(1000);
    getEcommWal_sign_up_page().getCheckBoxCreateAccount().click();
    getEcommWal_sign_up_page().getCheckBoxFlyer().click();
    getEcommWal_sign_up_page().getCreateAccountButton().click();
}

@Test
    public void createAccountInvalidPassword() throws IOException, InterruptedException {
    getEcommWal_sign_up_page().hoveroveronSignInLink();
    getEcommWal_sign_up_page().getJoinNowLink().click();

    getEcommWal_sign_up_page().getFirstName().sendKeys("Bhargav");
    getEcommWal_sign_up_page().getLastname().sendKeys("Patel");
    getEcommWal_sign_up_page().getPhoneNumber().sendKeys("2265036905");
    getEcommWal_sign_up_page().getEmailID().sendKeys("ankitrana2315@gmail.com");
    getEcommWal_sign_up_page().getPassword().sendKeys("Ankit");

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,600)", "");

    File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(screen, new File("C://Users//Dipali Tailor//Desktop//Walmart work//InvalidPassword.jpg"));
    Thread.sleep(1000);
    getEcommWal_sign_up_page().getCheckBoxCreateAccount().click();
    getEcommWal_sign_up_page().getCheckBoxFlyer().click();
    getEcommWal_sign_up_page().getCreateAccountButton().click();
}

@Test
public void createAccountPasswordBlank() throws IOException, InterruptedException {
    getEcommWal_sign_up_page().hoveroveronSignInLink();
    getEcommWal_sign_up_page().getJoinNowLink().click();

    getEcommWal_sign_up_page().getFirstName().sendKeys("Bhargav");
    getEcommWal_sign_up_page().getLastname().sendKeys("Patel");
    getEcommWal_sign_up_page().getPhoneNumber().sendKeys("2265036905");
    getEcommWal_sign_up_page().getEmailID().sendKeys("ankitrana2315@gmail.com");
    getEcommWal_sign_up_page().getPassword().sendKeys("");

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,600)", "");

    Thread.sleep(1000);
    File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(screen, new File("C://Users//Dipali Tailor//Desktop//Walmart work//PasswordBlank.jpg"));
    getEcommWal_sign_up_page().getCheckBoxCreateAccount().click();
    getEcommWal_sign_up_page().getCheckBoxFlyer().click();
    getEcommWal_sign_up_page().getCreateAccountButton().click();
    Thread.sleep(1000);
}

@Test

public void createAccountPasswordVisible() throws IOException, InterruptedException {
    getEcommWal_sign_up_page().hoveroveronSignInLink();
    getEcommWal_sign_up_page().getJoinNowLink().click();

    getEcommWal_sign_up_page().getFirstName().sendKeys("Bhargav");
    getEcommWal_sign_up_page().getLastname().sendKeys("Patel");
    getEcommWal_sign_up_page().getPhoneNumber().sendKeys("2265036905");
    getEcommWal_sign_up_page().getEmailID().sendKeys("ankitrana2315@gmail.com");
    getEcommWal_sign_up_page().getPassword().sendKeys("Ankit2315#");
    Thread.sleep(1000);
    getEcommWal_sign_up_page().getPasswordShowbutton().click();

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,600)", "");

    Thread.sleep(2000);
    //File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    //FileUtils.copyFile(screen, new File("C://Users//Dipali Tailor//Desktop//Walmart work//PasswordBlank.jpg"));
    getEcommWal_sign_up_page().getCheckBoxCreateAccount().click();
    getEcommWal_sign_up_page().getCheckBoxFlyer().click();
    getEcommWal_sign_up_page().getCreateAccountButton().click();

}
@Test
        public void createAccountStrongPassCheck() throws InterruptedException {

    getEcommWal_sign_up_page().hoveroveronSignInLink();
    getEcommWal_sign_up_page().getJoinNowLink().click();

    getEcommWal_sign_up_page().getFirstName().sendKeys("Bhargav");
    getEcommWal_sign_up_page().getLastname().sendKeys("Patel");
    getEcommWal_sign_up_page().getPhoneNumber().sendKeys("2265036905");
    getEcommWal_sign_up_page().getEmailID().sendKeys("ankitrana2315@gmail.com");
    getEcommWal_sign_up_page().getPassword().sendKeys("Ankit2315#");
    Thread.sleep(2000);

    getEcommWal_sign_up_page().getPasswordShowbutton().click();
    Assert.assertTrue(getEcommWal_sign_up_page().getPasswordStrenght().isDisplayed());

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,600)", "");

    Thread.sleep(2000);

    getEcommWal_sign_up_page().getCheckBoxCreateAccount().click();
    getEcommWal_sign_up_page().getCheckBoxFlyer().click();
    getEcommWal_sign_up_page().getCreateAccountButton().click();

}
@Test
public void createAccountCheckboxVerify() throws InterruptedException {

    getEcommWal_sign_up_page().hoveroveronSignInLink();
    getEcommWal_sign_up_page().getJoinNowLink().click();

    getEcommWal_sign_up_page().getFirstName().sendKeys("Bhargav");
    getEcommWal_sign_up_page().getLastname().sendKeys("Patel");
    getEcommWal_sign_up_page().getPhoneNumber().sendKeys("2265036905");
    getEcommWal_sign_up_page().getEmailID().sendKeys("ankitrana2315@gmail.com");
    getEcommWal_sign_up_page().getPassword().sendKeys("Ankit123#");
    Thread.sleep(2000);

    getEcommWal_sign_up_page().getPasswordShowbutton().click();
    Assert.assertTrue(getEcommWal_sign_up_page().getPasswordStrenght().isDisplayed());

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,600)", "");

    Thread.sleep(2000);
    getEcommWal_sign_up_page().getCheckBoxCreateAccount().click();
    Assert.assertTrue(getEcommWal_sign_up_page().getCheckBoxCreateAccount().isSelected());
    getEcommWal_sign_up_page().getCheckBoxFlyer().click();
    getEcommWal_sign_up_page().getCreateAccountButton().click();

}





}
