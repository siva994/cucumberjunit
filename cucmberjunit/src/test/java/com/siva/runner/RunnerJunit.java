package com.siva.runner;

//import com.cucumber.listener.ExtentCucumberFormatter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//import org.testng.annotations.BeforeClass;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@CucumberOptions(
        features = {"src\\test\\resources\\com\\siva\\features\\Test.feature"},
        glue={"steps"},
        monochrome = true,
        plugin = {"pretty","html:target/cucumber",
                "json:target/cucumber-reports/cucumber.json",
                "junit:target/cucumber-reports/cucumber.xml"
//                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

        }
)
@RunWith(Cucumber.class)
public class RunnerJunit {


}
