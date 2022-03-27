package EcommWal_Page_objects;

import EcommWal_Test_Base.TestBase;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EcommWal_History_Page extends TestBase {
    public WebDriver driver;

    public EcommWal_History_Page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

@FindBy(xpath= "//p[contains(text(),'Order History')]")
    public WebElement orderHistorylink;
    public  WebElement getOrderHistorylink(){
        return orderHistorylink;
    }
@FindBy(xpath="//h1[contains(text(),'Order History')]")
public WebElement orderMessageVerify;
    public WebElement getOrderMessageVerify(){
        return orderMessageVerify;
    }
public void orderHistoryVerifyTitle(){


}

@FindBy(xpath="//select[@id='view-orders-from-label']")
    public WebElement dropdownYearSelect;
    public WebElement getDropdownYearSelect(){
        return dropdownYearSelect;
    }
public void dropDownHandle() {
    //Select s = new Select(driver.findElement(By.xpath("//select[@id='view-orders-from-label']")));
    Select s= new Select(driver.findElement(By.xpath("//select[@id='view-orders-from-label']")));
s.selectByVisibleText("2021");
}
}