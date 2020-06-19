package com.siva.steps;

import com.siva.base.Helper;
import com.siva.utils.SeleniumDriver;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import javafx.scene.Scene;
import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import static com.siva.utils.SeleniumDriver.getDriver;

public class BaseSteps {


    @Before
    public void before(Scenario scenario)
    {
        SeleniumDriver.setUp();
        Helper.SCENARIO=scenario;

    }


    @After
    public void after(Scenario scenario)
    {

        WebDriver driver = getDriver();

        if (scenario.isFailed()) {
            byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshotBytes,"image/png","reportc");
//            scenario.embed(screenshotBytes, "image/png");

        }

        SeleniumDriver.tearDown();



    }


}
