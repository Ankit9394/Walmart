package EcommWal_Test_Pages;

import EcommWal_Test_Base.TestBase;
import org.testng.annotations.Test;

public class Ecomm_SearchOrder_Test extends TestBase {
    @Test
    public void searchItem(){
        getEcommWal_sign_up_page().hoveroveronSignInLink();
        getEcommWal_sign_in_page().getSignInlink().click();
        getEcommWal_sign_in_page().getEmailID().sendKeys(prop.getProperty("email"));
        getEcommWal_sign_in_page().getPasswordInPage().sendKeys(prop.getProperty("passwordin"));
        getEcommWal_sign_in_page().getSignInButton().click();
        getEcommWal_searchOrder_page().getSearchField().sendKeys("men hair gel");
        getEcommWal_searchOrder_page().getSearchbutton().click();
        getEcommWal_searchOrder_page().getMenHairGelProduct().click();
    }
@Test
    public void ProductInfoVerify(){
        searchItem();
        getEcommWal_searchOrder_page().getProductImage().isDisplayed();
        getEcommWal_searchOrder_page().getProductPrice().isDisplayed();
        getEcommWal_searchOrder_page().getProductRatings().isDisplayed();
        getEcommWal_searchOrder_page().getProductTitle().isDisplayed();
}
    @Test
    public void searchproductwithcategorykeyword()
    {
        getEcommWal_searchOrder_page().getSearchField().sendKeys("mens Beauty");
        getEcommWal_searchOrder_page().getSearchbutton().click();

    }
    @Test
    public void ClickSearchButtonWithBlankspace()
    {
        getEcommWal_searchOrder_page().getSearchbutton().click();
    }

    @Test
    public void SearchbuttonwithInvaliData()
    {
        getEcommWal_searchOrder_page().getSearchField().sendKeys("facebook");
        getEcommWal_searchOrder_page().getSearchbutton().click();
    }
    @Test
    public void AddToCartItem(){
        getEcommWal_searchOrder_page().getSearchField().sendKeys("men hair gel");
        getEcommWal_searchOrder_page().getSearchbutton().click();
        getEcommWal_searchOrder_page().getMenHairGelProduct().click();
        getEcommWal_searchOrder_page().getAddToCart().click();
        getEcommWal_searchOrder_page().getCheckOutLink().click();
        getEcommWal_searchOrder_page().getPlusSign().click();
        getEcommWal_searchOrder_page().getProceedToCheckout().click();
        getEcommWal_searchOrder_page().getCheckOutGuest().click();
        getEcommWal_searchOrder_page().getClickOnCart().click();
    }
}
