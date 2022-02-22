package com.github.shehanperera.qatools.selenium.testcases;

import com.github.shehanperera.qatools.selenium.pages.AddCustomerPage;
import com.github.shehanperera.qatools.selenium.pages.LoginPage;
import com.github.shehanperera.qatools.selenium.pages.ManagerHomePage;
import com.github.shehanperera.qatools.selenium.utilities.BaseClass;
import io.qameta.allure.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AddCustomerTest extends BaseClass {

    @Test
    @Description("Verify Add Customer")
    @Epic("Req-2")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("Add customer")
    public void addCustomerTest(){
        PageFactory.initElements(driver,LoginPage.class).openLoginPage();
        PageFactory.initElements(driver, LoginPage.class).loginFuction(config.getUserID(),config.getUserPassword());
        PageFactory.initElements(driver,ManagerHomePage.class).clickNewCustomer();
        AddCustomerPage addCustomerPage = PageFactory.initElements(driver,AddCustomerPage.class);
        addCustomerPage.typeCustomerName(config.getCustomerName());
        addCustomerPage.clickGender(config.getGender());
        addCustomerPage.typeBirthday(config.getBirthday());
        addCustomerPage.typeAddress(config.getAddress());
        addCustomerPage.typeCity(config.getCity());
        addCustomerPage.typeState(config.getState());
        addCustomerPage.typePIN(config.getPIN());
        addCustomerPage.typePhoneNumber(config.getPhoneNumber());
        addCustomerPage.typeEmail(config.getEmail());
        addCustomerPage.typePassword(config.getPassword());
        addCustomerPage.clickSubmit();
        addCustomerPage.verifyCustomerName(config.getCustomerName());
    }
}
