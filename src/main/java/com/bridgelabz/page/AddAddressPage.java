package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddAddressPage extends BaseClass {
    private By addAddress=By.xpath("//div[@id='ya-myab-plus-address-icon']");
    private By name =By.xpath("//input[@id='address-ui-widgets-enterAddressFullName']");
    private By mobileno=By.xpath("//input[@id='address-ui-widgets-enterAddressPhoneNumber']");
    private By pincode=By.xpath("//input[@id='address-ui-widgets-enterAddressPostalCode']");
    private By flatno=By.xpath("//input[@id='address-ui-widgets-enterAddressLine1']");
    private By area=By.xpath("//input[@id='address-ui-widgets-enterAddressLine2']");
    private By landmark=By.xpath("//input[@id='address-ui-widgets-landmark']");
    private By city=By.xpath("//input[@id='address-ui-widgets-enterAddressCity']");
    private By state=By.xpath("(//span[@class='a-button-text a-declarative'])[2]");
    private By stateName=By.xpath("//span[contains(text(),'TAMIL NADU')]");
    private By getAddAddress=By.xpath("(//input[@class='a-button-input'])[4]");

    public void gotoAddAddress(String nam,String mobile,String pin,String flat,String are,String land,String cit){
        driver.findElement(addAddress).click();
        driver.findElement(name).sendKeys(nam);
        driver.findElement(mobileno).sendKeys(mobile);
        driver.findElement(pincode).sendKeys(pin);
        driver.findElement(flatno).sendKeys(flat);
        driver.findElement(area).sendKeys(are);
        driver.findElement(landmark).sendKeys(land);
        driver.findElement(city).sendKeys(cit);
        actions=new Actions(driver);
        WebElement stat=driver.findElement(state);
        actions.moveToElement(stat).perform();
        driver.findElement(stateName).click();
        driver.findElement(getAddAddress).click();
    }

    public String getAddAddressPageTitle(){
        return driver.getTitle();
    }
    public void closeDriver(){
        driver.close();
    }
}
