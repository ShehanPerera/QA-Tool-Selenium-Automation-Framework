package com.github.shehanperera.qatools.selenium.utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Helper {

    public static void captureScreenshots (WebDriver driver){
        String projectLocation = System.getProperty("user.dir");
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(screenshot,new File(projectLocation+"/screenshots/"+getCurrentDateTime()+"-login.png"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("unable to capture screenshot "+ e.getMessage());
        }

    }
    public static String getCurrentDateTime(){

        DateFormat dateFormat = new SimpleDateFormat("DD-MM-yyyy-HH-mm-ss");
        Date currentDate = new Date();
        return  dateFormat.format(currentDate);
    }
    public static void createReporter(){

    }
}
