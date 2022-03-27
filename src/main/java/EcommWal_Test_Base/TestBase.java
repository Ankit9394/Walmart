package EcommWal_Test_Base;

import EcommWal_Page_objects.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
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

    public EcommWal_Sign_In_Page ecommWal_sign_in_page;
    public EcommWal_Sign_In_Page getEcommWal_sign_in_page(){
        return ecommWal_sign_in_page;
    }

    public EcommWal_My_Account_page ecommWal_my_account_page;
    public EcommWal_My_Account_page getEcommWal_my_account_page(){
        return ecommWal_my_account_page;
    }

    public EcommWal_History_Page ecommWal_history_page;
    public EcommWal_History_Page getEcommWal_history_page(){
        return ecommWal_history_page;
    }
    public EcommWal_SearchOrder_Page ecommWal_searchOrder_page;
    public EcommWal_SearchOrder_Page getEcommWal_searchOrder_page(){
        return ecommWal_searchOrder_page;
    }
    public Ecomm_Wal_Address_Page ecomm_wal_address_page;
    public Ecomm_Wal_Address_Page getEcomm_wal_address_page(){
        return ecomm_wal_address_page;
    }

    public EcommWal_My_List_Page ecommWal_my_list_page;
    public EcommWal_My_List_Page getEcommWal_my_list_page(){
        return ecommWal_my_list_page;
    }
    public EcommWal_My_Recommenadation_Page ecommWal_my_recommenadation_page;
    public EcommWal_My_Recommenadation_Page getEcommWal_my_recommenadation_page(){
        return ecommWal_my_recommenadation_page;
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
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    WebDriverWait wait = new WebDriverWait(driver,30);
   // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().deleteAllCookies();

    driver.get(prop.getProperty("url"));

    ecommWal_sign_up_page = new EcommWal_Sign_Up_Page(driver);
    ecommWal_sign_in_page =new EcommWal_Sign_In_Page(driver);
    ecommWal_my_account_page = new EcommWal_My_Account_page(driver);
    ecommWal_history_page=new EcommWal_History_Page(driver);
    ecommWal_searchOrder_page= new EcommWal_SearchOrder_Page(driver);
    ecomm_wal_address_page= new Ecomm_Wal_Address_Page(driver);
    ecommWal_my_list_page = new EcommWal_My_List_Page(driver);
    ecommWal_my_recommenadation_page= new EcommWal_My_Recommenadation_Page(driver);
}
    @AfterMethod
    public void tearDown(){
   driver.close();
    }
}
