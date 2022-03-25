package EcommWal_Page_objects;

import EcommWal_Test_Base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EcommWal_Sign_Up_Page extends TestBase {
    public WebDriver driver; //initialize the driver first

    public EcommWal_Sign_Up_Page(WebDriver driver){ //create constructor and pass driver as parameter in constructor
        this.driver= driver;// global variable = local variable
        PageFactory.initElements(driver, this);
        //this.driver to initialize global variables with the current value of constructor
        //local variable we initialize by making the object of that particular constructor but java will confuse
        // if the global and local variable names are same and that is why we use this keyword to differentiate them and
        // after that we have to make their value equal so we will write,
        //global var=local var
    }




}
