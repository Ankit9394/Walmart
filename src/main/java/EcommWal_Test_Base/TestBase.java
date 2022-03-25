package EcommWal_Test_Base;

import EcommWal_Page_objects.EcommWal_Sign_Up_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public WebDriver driver;
    public Properties prop;


    public EcommWal_Sign_Up_Page ecommWal_sign_up_page;
    public EcommWal_Sign_Up_Page getEcommWal_sign_up_page(){
           return  ecommWal_sign_up_page;
    }



public TestBase()  {

    prop = new Properties();
    FileInputStream file= null;
    try {
        file = new FileInputStream("C:\\Users\\Dipali Tailor\\IdeaProjects\\EcommWalmart\\src\\main\\java\\propertiesFile\\config.properties");
        prop.load(file);
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
}

@BeforeMethod
public void DriverSetup(){
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dipali Tailor\\Desktop\\New folder (2)\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
   // driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().deleteAllCookies();

    driver.get(prop.getProperty("url"));

    ecommWal_sign_up_page = new EcommWal_Sign_Up_Page(driver);




}


    @AfterMethod
    public void tearDown(){

    driver.close();
    }








}
