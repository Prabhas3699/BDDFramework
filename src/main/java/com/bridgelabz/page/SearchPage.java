package com.bridgelabz.page;

import com.bridgelabz.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

public class SearchPage extends BaseClass {
    private By searchBar= By.xpath("//input[@id='twotabsearchtextbox']");
    private By searchTab= By.xpath("//input[@id='nav-search-submit-button']");
    private By productName= By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]");
    private By addToCart= By.xpath("//input[@id='add-to-cart-button']");

    public void clickOnSearch(String product){
        actions=new Actions(driver);
        WebElement search=driver.findElement(searchBar);
        actions.doubleClick(search).perform();
        driver.findElement(searchBar).sendKeys(product);
        driver.findElement(searchTab).click();
    }
    public void clickOnProduct(){
        js.executeScript("window.scrollBy(0, 300)");
        driver.findElement(productName).click();
        String parentWindowHandleId = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(parentWindowHandleId)) {
                driver.switchTo().window(windowHandle);
            }
        }
        WebElement cart=driver.findElement(addToCart);
        int x=cart.getLocation().getX();
        int y=cart.getLocation().getY();
        js.executeScript("window.scrollBy("+x+","+y+")");
        driver.findElement(addToCart).click();
    }
    public String getSearchPageTitle(){
        return driver.getTitle();
    }

    public void closeDriver(){
        driver.close();
    }
    public void quitDriver(){
        driver.quit();
    }
}
