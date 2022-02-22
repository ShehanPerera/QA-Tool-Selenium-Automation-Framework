package com.github.shehanperera.qatools.selenium.utilities;

import java.io.*;
import java.util.Properties;

public class ConfigDataProvider {

    Properties properties;
    Properties setProperies;
    OutputStream output;

    public ConfigDataProvider() {
        String projectLocation = System.getProperty("user.dir");
        String confFile = projectLocation + "/config/config.properties";
        try {
            File conf = new File(confFile);
            FileInputStream fileInputStream = new FileInputStream(conf);
            properties = new Properties();
            properties.load(fileInputStream);
            //output = new FileOutputStream(confFile);
        }catch (Exception e){
            System.out.println();
        }

    }
    public String getBrowser(){

        return properties.getProperty("Browser");
    }
    public String getUserID(){

        return properties.getProperty("userID");
    }
    public String getUserPassword(){

        return properties.getProperty("userPassword");
    }
    private String getCustomerData(){
        return properties.getProperty("customerdata");
    }
    public String getCustomerName(){
        return getCustomerData().split(",")[0];
    }
    public String getGender(){
        return getCustomerData().split(",")[1];
    }
    public String getBirthday(){
        return getCustomerData().split(",")[2];
    }
    public String getAddress(){
        return getCustomerData().split(",")[3];
    }
    public String getCity(){
        return getCustomerData().split(",")[4];
    }
    public String getState(){
        return getCustomerData().split(",")[5];
    }
    public String getPIN(){
        return getCustomerData().split(",")[6];
    }
    public String getPhoneNumber(){
        return getCustomerData().split(",")[7];
    }
    public String getEmail(){
        return getCustomerData().split(",")[8];
    }
    public String getPassword(){
        return getCustomerData().split(",")[9];
    }
    public void setCustomerID(String customerID){
        try {
            properties.store(output,customerID);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
