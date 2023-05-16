package stepdefination;

import com.bridgelabz.page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginPageStepDef {

    LoginPage loginPage=new LoginPage();

    @Given("launch url {string}")
    public void launch_url(String url) {
        loginPage.launchURL(url);
    }
    @When("click on Sign in")
    public void click_on_sign_in() {
        loginPage.clickOnSignIn();
    }
    @And("Enter mobile number {string} and password {string}")
    public void enter_mobile_number_and_password(String mobile, String password) {
        loginPage.enterMobilePwd(mobile,password);
    }
    @Then("Verify Login page Title {string}")
    public void verify_login_page_title(String title) throws InterruptedException {
        Thread.sleep(3000);
        String loginPageTitle=loginPage.getLoginPageTitle();
        Assert.assertEquals(title,loginPageTitle);
    }
    @Then("login and redirect to homepage")
    public void login_and_redirect_to_homepage() {
        loginPage.login();
    }
    @Then("login page close driver")
    public void login_page_close_driver() {
        loginPage.closeDriver();
    }
}
