package com.github.shehanperera.qatools.selenium.utilities;

import io.qameta.allure.Attachment;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

    protected WebDriver driver;
    protected ConfigDataProvider config;

    @BeforeMethod
    public void setup() {
        config = new ConfigDataProvider();
        driver = BrowserFactory.startApplication(driver, config.getBrowser());

    }

    @AfterMethod
    public void tearDownMethod(ITestResult result) {

        Helper.captureScreenshots(driver);
        if (result.getStatus() == ITestResult.FAILURE) {
            Helper.captureScreenshots(driver);
        }
        BrowserFactory.quitBrowser(driver);
    }
}
