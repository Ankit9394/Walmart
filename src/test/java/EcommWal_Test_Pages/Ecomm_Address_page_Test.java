package EcommWal_Test_Pages;

import EcommWal_Test_Base.TestBase;
import org.testng.annotations.Test;

public class Ecomm_Address_page_Test extends TestBase {

    @Test
    public void addressesFormwithValidData(){
        getEcommWal_sign_up_page().hoveroveronSignInLink();
        getEcommWal_sign_in_page().getSignInlink().click();
        getEcommWal_sign_in_page().getEmailID().sendKeys(prop.getProperty("email"));
        getEcommWal_sign_in_page().getPasswordInPage().sendKeys(prop.getProperty("passwordin"));
        getEcommWal_sign_in_page().getSignInButton().click();
        getEcommWal_my_account_page().getMyAccountLink().click();
        getEcomm_wal_address_page().getAddressesLink().click();
        getEcomm_wal_address_page().getAddAddressLinkClick().click();
        getEcomm_wal_address_page().getFirstName().sendKeys("Bhargav");
        getEcomm_wal_address_page().getLastName().sendKeys("Patel");
        getEcomm_wal_address_page().getAddressField().sendKeys("28 Wahba Way");
        getEcomm_wal_address_page().getCity().sendKeys("Toronto");
        getEcomm_wal_address_page().getTerritory().sendKeys("Ontario");
        getEcomm_wal_address_page().getPostalCode().sendKeys("N5W 0A6");
        getEcomm_wal_address_page().getPhoneNumber().sendKeys("2265030003");
        getEcomm_wal_address_page().getSaveButton().click();
    }

    @Test
    public void addressFormInvalidData(){
        getEcommWal_sign_up_page().hoveroveronSignInLink();
        getEcommWal_sign_in_page().getSignInlink().click();
        getEcommWal_sign_in_page().getEmailID().sendKeys(prop.getProperty("email"));
        getEcommWal_sign_in_page().getPasswordInPage().sendKeys(prop.getProperty("passwordin"));
        getEcommWal_sign_in_page().getSignInButton().click();
        getEcommWal_my_account_page().getMyAccountLink().click();
        getEcomm_wal_address_page().getAddressesLink().click();
        getEcomm_wal_address_page().getAddAddressLinkClick().click();
        getEcomm_wal_address_page().getFirstName().sendKeys("Bhargav");
        getEcomm_wal_address_page().getLastName().sendKeys("Patel");
        getEcomm_wal_address_page().getAddressField().sendKeys("xyz");
        getEcomm_wal_address_page().getCity().sendKeys("Tor");
        getEcomm_wal_address_page().getTerritory().sendKeys("pakistan");
        getEcomm_wal_address_page().getPostalCode().sendKeys("N5W");
        getEcomm_wal_address_page().getPhoneNumber().sendKeys("22650300030020");
        getEcomm_wal_address_page().getSaveButton().click();
    }
}
