package com.github.shehanperera.qatools.selenium.pages;

import com.github.shehanperera.qatools.selenium.utilities.ActionCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddCustomerPage extends ActionCommands {

    private WebDriver driver;
    private By textField_CustomerName = By.name("name");
    private By radio_GenderMale = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]");
    private By radio_GenderFemale = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]");
    private By input_Birthday = By.id("dob");
    private By textArea_Address = By.name("addr");
    private By textField_City = By.name("city");
    private By textField_State = By.name("state");
    private By textField_PIN = By.name("pinno");
    private By textField_PhoneNumber = By.name("telephoneno");
    private By textField_Email = By.name("emailid");
    private By textField_Password = By.name("password");
    private By button_Submit = By.name("sub");
    private By button_Reset = By.name("res");
    private By tableData_CustomerName = By.xpath("//table[@id='customer']/tbody/tr[5]/td[2]");
    private By tableData_CustomerID = By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]");

    public AddCustomerPage(WebDriver driver){
        this.driver = driver;
    }
    public void typeCustomerName(String customerName){
        type(driver,textField_CustomerName,customerName);
    }
    public void clickGender(String gender){
        if(gender.equalsIgnoreCase("male")){
            click(driver,radio_GenderMale);
        }else if(gender.equalsIgnoreCase("female")){
            click(driver,radio_GenderFemale);
        }
    }
    public void typeBirthday(String birthday){
        type(driver,input_Birthday,birthday);
    }
    public void typeAddress(String address){
        type(driver,textArea_Address,address);
    }
    public void typeCity(String city){
        type(driver,textField_City,city);
    }
    public void typeState(String state){
        type(driver,textField_State,state);
    }
    public void typePIN(String PIN){
        type(driver,textField_PIN,PIN);
    }
    public void typePhoneNumber(String phoneNumber){
        type(driver,textField_PhoneNumber,phoneNumber);
    }
    public void typeEmail(String email){
        type(driver,textField_Email,email);
    }
    public void typePassword(String password){
        type(driver,textField_Password,password);
    }
    public void clickSubmit(){
        click(driver,button_Submit);
    }
    public void clickReset(){
        click(driver,button_Reset);
    }
    public void verifyCustomerName(String customerName){
        verifyText(driver,tableData_CustomerName,customerName);

    }
    public String getCustomerID(){
        return getText(driver,tableData_CustomerID);
    }

}
