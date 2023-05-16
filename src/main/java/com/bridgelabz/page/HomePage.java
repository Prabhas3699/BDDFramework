package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BaseClass {
    private By addresslink = By.xpath("//span[contains(text(),'Select your address')]");
    private By getAddresslink = By.xpath("//a[contains(text(),'Add an address or pick-up point')]");


    public void gotoAddressPage() {
        driver.findElement(addresslink).click();
        actions=new Actions(driver);
        WebElement getAddress=driver.findElement(getAddresslink);
        actions.doubleClick(getAddress).perform();
    }
    public String getHomePageTitle(){
        return driver.getTitle();
    }
    public void closeDriver(){
        driver.close();
    }
}