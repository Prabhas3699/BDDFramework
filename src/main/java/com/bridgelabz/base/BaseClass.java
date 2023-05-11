package com.bridgelabz.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {
    public static WebDriver driver;
    public static Properties properties;
    public Actions actions=null;
    public JavascriptExecutor js = (JavascriptExecutor) driver;

    public BaseClass() {
        properties = new Properties();
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("src/main/java/com/bridgelabz/config/Application.properties");
            properties.load(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // for launching the browser
    public void initialization() {
        String browserName = properties.getProperty("browser");
        if (browserName.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions option = new ChromeOptions();
            option.addArguments("--disable-notifications");
            driver = new ChromeDriver(option);

        } else if (browserName.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            WebDriverManager.chromedriver().setup();
            ChromeOptions option = new ChromeOptions();
            option.addArguments("--disable-notifications");
            driver = new ChromeDriver(option);
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
}
