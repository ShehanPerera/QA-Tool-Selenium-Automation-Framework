package com.github.shehanperera.qatools.selenium.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ActionCommands {

    protected void openurl(WebDriver driver,String URL){
        driver.get(URL);
    }
    protected void click (WebDriver driver, By locator){
        WebElement element = driver.findElement(locator);
        element.click();
    }
    protected void type (WebDriver driver,By locator,String input){
        try {
            WebElement element = driver.findElement(locator);
            element.sendKeys(input);
        }catch (NoSuchElementException e){
            System.out.println("No such a element "+ e.getMessage());
            throw e;
        }
    }
    protected void verifyText(WebDriver driver,By locator,String expectedResults){
        WebElement element = driver.findElement(locator);
        Assert.assertEquals(element.getText(),expectedResults);
    }
    protected void clearText(WebDriver driver, By locator){
        WebElement element = driver.findElement(locator);
        element.clear();
    }
    protected String getText(WebDriver driver, By locator){
        WebElement element = driver.findElement(locator);
        return element.getText();
    }
}
