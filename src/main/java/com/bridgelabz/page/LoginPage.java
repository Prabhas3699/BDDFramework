package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.By;

public class LoginPage extends BaseClass{

    private By signIn=By.xpath("(//span[@class='nav-action-inner'])[2]");
    private By mobileNo=By.id("ap_email");
    private By continu=By.id("continue");
    private By password=By.id("ap_password");
    private By loginBtn=By.id("signInSubmit");

    public LoginPage() {
        BaseClass baseClass = new BaseClass();
        baseClass.initialization();
    }

    public void launchURL(String url){
        driver.get(url);
    }

    public void clickOnSignIn(){
        driver.findElement(signIn).click();
    }

    public void enterMobilePwd(String mobile, String pwd){
        driver.findElement(mobileNo).sendKeys(mobile);
        driver.findElement(continu).click();
        driver.findElement(password).sendKeys(pwd);
    }

    public HomePage login(){
        driver.findElement(loginBtn).click();
        return new HomePage();
    }
    public HomePage initialLogin(String url, String uname, String pwd){
        driver.get(url);
        driver.findElement(signIn).click();
        driver.findElement(mobileNo).sendKeys(uname);
        driver.findElement(continu).click();
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(loginBtn).click();
        return new HomePage();

    }

    public String getLoginPageTitle(){
        return driver.getTitle();
    }

    public void closeDriver(){
        driver.close();
    }
}
