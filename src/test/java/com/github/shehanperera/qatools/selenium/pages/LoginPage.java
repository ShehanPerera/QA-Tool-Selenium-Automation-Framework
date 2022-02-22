package com.github.shehanperera.qatools.selenium.pages;

import com.github.shehanperera.qatools.selenium.utilities.ActionCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends ActionCommands {

    private WebDriver driver;

    private By textfield_UserID = By.name("uid");
    private By textfield_Password= By.name("password");
    private By button_Login= By.name("btnLogin");
    private By button_Reset = By.name("btnReset");

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void openLoginPage(){
        openurl(driver,"https://demo.guru99.com/V4/index.php");
    }
    public void typeUserID(String userID){
        type(driver,textfield_UserID,userID);
    }
    public void typePassword(String password){
        type(driver,textfield_Password,password);
    }
    public void clickLoginButton(){
        click(driver,button_Login);
    }
    public void clickResetButton(){
        click(driver,button_Reset);
    }
    public void loginFuction(String username,String password){
        typeUserID(username);
        typePassword(password);
        clickLoginButton();
    }
}
