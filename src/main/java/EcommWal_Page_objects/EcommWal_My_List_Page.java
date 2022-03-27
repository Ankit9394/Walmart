package EcommWal_Page_objects;

import EcommWal_Test_Base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EcommWal_My_List_Page extends TestBase {
    public WebDriver driver;

    public EcommWal_My_List_Page (WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//ul[@class='nav-list marg-b-1unit']//li//a[contains(text(),'My Lists')]")
    private WebElement myListLink;
    public WebElement getMyListLink() {
        return myListLink;
    }

    @FindBy(id="save-list-input")
    private WebElement writeListname;

    public WebElement getWriteListname() {
        return writeListname;
    }

    @FindBy(id="save-list-button")
    private WebElement saveList;

    public WebElement getSaveList() {
        return saveList;
    }

    @FindBy(name="embedded-search-form-input")
    private WebElement searchbox;

    public WebElement getSearchbox() {
        return searchbox;
    }

    @FindBy(xpath="//button[contains(text(),'Search')]")
    private WebElement searchBtn;

    public WebElement getSearchBtn() {
        return searchBtn;
    }
    @FindBy(xpath="//h2[contains(text(),'Orange, Seedless')]")
    private WebElement oranges;

    public WebElement getOranges() {
        return oranges;
    }
}

