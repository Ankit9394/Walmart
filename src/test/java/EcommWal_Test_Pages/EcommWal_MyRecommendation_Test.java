package EcommWal_Test_Pages;

import EcommWal_Test_Base.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class EcommWal_MyRecommendation_Test extends TestBase {

    @Test
    public void myRecommendation_page() throws Throwable
    {

        getEcommWal_sign_up_page().hoveroveronSignInLink();
        getEcommWal_sign_in_page().getSignInlink().click();
        getEcommWal_sign_in_page().getEmailID().sendKeys(prop.getProperty("email"));
        getEcommWal_sign_in_page().getPasswordInPage().sendKeys(prop.getProperty("passwordin"));
        getEcommWal_sign_in_page().getSignInButton().click();
        getEcommWal_my_account_page().getMyAccountLink().click();
        getEcommWal_my_recommenadation_page().getMyReccomendationLink();
        File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("C://Users//Dipali Tailor//Desktop//img23.png"));
    }

    @Test
    public void myRecommendationpagetextverify() throws Throwable
    {
        String expectedText="People with a similar purchase history also bought:";

        getEcommWal_sign_up_page().hoveroveronSignInLink();
        getEcommWal_sign_in_page().getSignInlink().click();
        getEcommWal_sign_in_page().getEmailID().sendKeys(prop.getProperty("email"));
        getEcommWal_sign_in_page().getPasswordInPage().sendKeys(prop.getProperty("passwordin"));
        getEcommWal_sign_in_page().getSignInButton().click();
        getEcommWal_my_account_page().getMyAccountLink().click();
        getEcommWal_my_recommenadation_page().getMyReccomendationLink();
        getEcommWal_my_recommenadation_page().getTextMyReco().getText();
        Assert.assertTrue(getEcommWal_my_recommenadation_page().getTextMyReco().getText().contains(expectedText));
        File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("C://Users//Dipali Tailor//Desktop//img23.png"));
    }
}
