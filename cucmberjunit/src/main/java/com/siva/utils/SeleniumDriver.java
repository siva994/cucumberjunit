package com.siva.utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumDriver {
    /*--initialixe driver*/
    private static WebDriver driver;
    private static SeleniumDriver seleniumDriver;

    /*initialize timeout*/
    public static final long TIMEOUT = 10;
    public static final long PAGELOAD_TIMEOUT = 12;

    public SeleniumDriver() {
        WebDriverManager.chromedriver().setup();

        System.out.println(WebDriverManager.chromedriver().getDownloadedVersion());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGELOAD_TIMEOUT, TimeUnit.SECONDS);


    }


    public static void launchpage(String url) {

        driver.get(url);
    }

    public static WebDriver getDriver() {
        return driver;
    }


    public static void setUp() {
        if (seleniumDriver == null) {
            seleniumDriver = new SeleniumDriver();
        }
    }

    public static void tearDown() {

        if (driver != null) {
            driver.close();
            driver.quit();
        }
        seleniumDriver = null;
    }
}
