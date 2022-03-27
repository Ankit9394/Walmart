package EcommWal_Test_Pages;

import EcommWal_Test_Base.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class EcommWal_My_List_Test extends TestBase {
    @Test
    public void MyListsPagecreateList() throws Throwable
    {
        getEcommWal_sign_up_page().hoveroveronSignInLink();
        getEcommWal_sign_in_page().getSignInlink().click();
        getEcommWal_sign_in_page().getEmailID().sendKeys(prop.getProperty("email"));
        getEcommWal_sign_in_page().getPasswordInPage().sendKeys(prop.getProperty("passwordin"));
        getEcommWal_sign_in_page().getSignInButton().click();
        getEcommWal_my_account_page().getMyAccountLink().click();

        getEcommWal_my_list_page().getMyListLink().click();
        getEcommWal_my_list_page().getWriteListname().sendKeys("hello");
        getEcommWal_my_list_page().getSaveList().click();
        File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("C://Users//Dipali Tailor//Desktop//img23.png"));

    }
    @Test
            public void myListPageSearchBox() throws IOException {
    getEcommWal_sign_up_page().hoveroveronSignInLink();
    getEcommWal_sign_in_page().getSignInlink().click();
    getEcommWal_sign_in_page().getEmailID().sendKeys(prop.getProperty("email"));
    getEcommWal_sign_in_page().getPasswordInPage().sendKeys(prop.getProperty("passwordin"));
    getEcommWal_sign_in_page().getSignInButton().click();
    getEcommWal_my_account_page().getMyAccountLink().click();
    getEcommWal_my_list_page().getMyListLink().click();
    getEcommWal_my_list_page().getWriteListname().sendKeys(Keys.PAGE_DOWN);
    getEcommWal_my_list_page().getSearchbox().sendKeys("apple");
    getEcommWal_my_list_page().getSearchBtn().click();
    getEcommWal_my_list_page().getOranges().getText();
        String a="apple, Seedless";
    Assert.assertTrue(	getEcommWal_my_list_page().getOranges().getText().contains(a));

        File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("C://Users//Dipali Tailor//Desktop//img23.png"));
}

}
