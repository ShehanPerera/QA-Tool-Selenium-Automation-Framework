package com.github.shehanperera.qatools.selenium.testcases;

import com.aventstack.extentreports.ExtentTest;
import com.github.shehanperera.qatools.selenium.pages.LoginPage;
import com.github.shehanperera.qatools.selenium.pages.ManagerHomePage;
import com.github.shehanperera.qatools.selenium.utilities.BaseClass;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
    private ExtentTest testLogger;

    @Test
    @Description("Verify Login")
    @Epic("Req-1")
    @Severity(SeverityLevel.BLOCKER)
    public void loginTest(){
        LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
        loginPage.openLoginPage();
        loginPage.typeUserID(config.getUserID());
        loginPage.typePassword(config.getUserPassword());
        loginPage.clickLoginButton();
        ManagerHomePage managerHomePage = PageFactory.initElements(driver,ManagerHomePage.class);
        managerHomePage.verifyManagerID("Manger Id : "+config.getUserID());
        managerHomePage.verifyHomePageBanner("Welcome To Manager's Page of Guru99 Bank");
    }

}
