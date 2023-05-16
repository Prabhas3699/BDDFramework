package stepdefination;

import com.bridgelabz.page.AddAddressPage;
import com.bridgelabz.page.HomePage;
import com.bridgelabz.page.LoginPage;
import com.bridgelabz.page.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SearchPageStepDef {
    LoginPage loginPage=new LoginPage();
    HomePage homePage=new HomePage();
    AddAddressPage addAddressPage=new AddAddressPage();
    SearchPage searchPage=new SearchPage();
    @Given("launch url {string} and login using mobile number {string} and password {string} and click on select your address and enter the address details name {string} , mobile number {string} , pincode {string} , flat no. & building {string} , area {string} , landmark {string} , town {string}")
    public void setSearchPage(String url, String mobilenum, String password,String nam,String mobile,String pin,String flat,String are,String land,String cit) {
        loginPage.initialLogin(url,mobilenum,password);
        homePage.gotoAddressPage();
        addAddressPage.gotoAddAddress(nam,mobile,pin,flat,are,land,cit);
    }
    @When("click on search bar and search for product {string}")
    public void click_on_search_bar_and_search_for_product(String product) {
        searchPage.clickOnSearch(product);
    }
    @And("click on product and add the product to the cart")
    public void click_on_product_and_add_the_product_to_the_cart() {
        searchPage.clickOnProduct();
    }
    @Then("verify search page title {string}")
    public void verify_search_page_title(String title) throws InterruptedException {
        Thread.sleep(3000);
        String searchPageTitle=searchPage.getSearchPageTitle();
        Assert.assertEquals(title,searchPageTitle);
    }
    @Then("search page close drive")
    public void search_page_close_drive() {
        searchPage.closeDriver();
    }
    @Then("search page quit drive")
    public void search_page_quit_drive() {
        searchPage.quitDriver();
    }
}
