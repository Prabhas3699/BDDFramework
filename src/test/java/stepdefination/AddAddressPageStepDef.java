package stepdefination;

import com.bridgelabz.page.AddAddressPage;
import com.bridgelabz.page.HomePage;
import com.bridgelabz.page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddAddressPageStepDef {
    LoginPage loginPage=new LoginPage();
    HomePage homePage=new HomePage();
    AddAddressPage addAddressPage=new AddAddressPage();
    @Given("launch url {string} and login using mobile number {string} and password {string} and click on select your address")
    public void setAddAddressPage(String url, String mobileno, String password) {
        loginPage.initialLogin(url,mobileno,password);
        homePage.gotoAddressPage();
    }
    @When("enter the address details name {string} , mobile number {string} , pincode {string} , flat no. & building {string} , area {string} , landmark {string} , town {string}")
    public void enter_the_address_details(String nam,String mobile,String pin,String flat,String are,String land,String cit) {
        addAddressPage.gotoAddAddress(nam,mobile,pin,flat,are,land,cit);
    }
    @And("verify address page title {string}")
    public void verify_address_page_title(String title) throws InterruptedException {
        Thread.sleep(3000);
        String addAddressPageTitle=addAddressPage.getAddAddressPageTitle();
        Assert.assertEquals(title,addAddressPageTitle);
    }
    @Then("add address page close drive")
    public void add_address_page_close_drive() {
        addAddressPage.closeDriver();
    }

}
