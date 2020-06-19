package com.siva.base;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.datatype.Duration;

import static com.siva.utils.SeleniumDriver.getDriver;

public class Helper {
public static Scenario SCENARIO;
    public static void click(WebElement element) {
element.click();
    }

    public static void click(int seconds, WebElement element) {

        new WebDriverWait(getDriver(), seconds)
                .until(ExpectedConditions
                        .visibilityOf(element)).click();

    }

    public static void captureScreenshot()
    {

        Scenario scenario =  Helper.SCENARIO;
        byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot,"image/png",scenario.getName());


    }
}
