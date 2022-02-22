package com.github.shehanperera.qatools.selenium.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserFactory {

    public static WebDriver startApplication(WebDriver driver, String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            String projectLocation = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", projectLocation+"/drivers/chromedriver");
            driver = new ChromeDriver();

        } else if (browserName.equalsIgnoreCase("firefox")) {
            String projectLocation = System.getProperty("user.dir");
            System.setProperty("webdriver.firefox.driver", projectLocation+"/drivers/geckodriver");
            driver = new FirefoxDriver();

        } else {
            System.out.println("Not support for " + browserName);
        }
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30 ,TimeUnit.SECONDS);
        return driver;

    }

    public static void quitBrowser(WebDriver driver) {
        driver.quit();
    }

}
