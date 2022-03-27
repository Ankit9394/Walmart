package EcommWal_Page_objects;

import EcommWal_Test_Base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EcommWal_My_Recommenadation_Page extends TestBase {
    public WebDriver driver;

    public  EcommWal_My_Recommenadation_Page(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//ul[@class='nav-list marg-b-1unit']//li//a[contains(text(),'My Recommendations')]")
    private WebElement myReccomendationLink;
    public WebElement getMyReccomendationLink() {
        return myReccomendationLink;
    }

    @FindBy(xpath="//span[contains(text(),'You may like these top items')]")
    private WebElement textMyReco;
    public WebElement getTextMyReco() {
        return textMyReco;
    }


}
