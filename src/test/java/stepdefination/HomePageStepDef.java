package stepdefination;

import com.bridgelabz.page.HomePage;
import com.bridgelabz.page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomePageStepDef {

    LoginPage loginPage=new LoginPage();
    HomePage homePage=new HomePage();

    @Given("launch url {string} and login using mobile number {string} and password {string}")
    public void setHomePage(String url, String mobile, String password) {
        loginPage.initialLogin(url,mobile,password);
    }
    @When("click on select your address")
    public void click_on_select_your_address() {
        homePage.gotoAddressPage();
    }

    @And("Verify Home page Title {string}")
    public void verify_login_page_title(String title) throws InterruptedException {
        Thread.sleep(3000);
        String homePageTitle=homePage.getHomePageTitle();
        Assert.assertEquals(title,homePageTitle);
    }
    @Then("home page close driver")
    public void login_page_close_driver() {
        homePage.closeDriver();
    }
}
