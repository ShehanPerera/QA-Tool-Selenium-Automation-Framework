package com.github.shehanperera.qatools.selenium.pages;

import com.github.shehanperera.qatools.selenium.utilities.ActionCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManagerHomePage extends ActionCommands {

    private WebDriver driver;
    private By banner = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee");
    private By tabledata_ManagerID = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td");
    private By link_NewCustomer = By.linkText("New Customer");

    public ManagerHomePage(WebDriver driver){
        this.driver = driver;
    }
    public void verifyHomePageBanner(String expectedHeader){
        verifyText(driver,banner,expectedHeader);
    }
    public void verifyManagerID(String expectedManagerID){
        verifyText(driver,tabledata_ManagerID,expectedManagerID);
    }
    public void clickNewCustomer(){
        click(driver,link_NewCustomer);
    }

}
