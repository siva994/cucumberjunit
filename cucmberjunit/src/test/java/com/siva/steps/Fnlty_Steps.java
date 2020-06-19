package com.siva.steps;

import com.siva.datahandlers.LoginData;
import com.siva.pageactions.LoginActions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.siva.utils.SeleniumDriver.getDriver;

public class Fnlty_Steps {

    
    LoginActions loginActions = new LoginActions();
 

    @Given("user launches the home page")
    public  void userLaunchesTheHomePage() {
//        System.out.println(stringList);
        

        getDriver().get("https://www.expedia.co.in");
        loginActions.clickSignIn();


    }

    @Then("user logins successfully")
    public void userLoginsSuccessfully(DataTable table) {
    }

    @And("there is {string} displayed")
    public void thereIsDisplayed(String arg0) {
    }

    @And("so and so is done")
    public void soAndSoIsDone(DataTable dataTable) {

    }

    @And("the integer is displayed")
    public void theIntegerIsDisplayed() {


    }

    @And("the integer {int} is displayed")
    public void theIntegerIsDisplayed(int arg0) {
    }

    @And("the integer {double} is displayed")
    public void theIntegerIsDisplayed(double d) {

        System.out.println(d);
    }

    @And("it is {double}")
    public void itIs(double d) {
    }
}

