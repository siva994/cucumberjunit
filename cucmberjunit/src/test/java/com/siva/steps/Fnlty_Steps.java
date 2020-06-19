package com.siva.steps;

import com.google.common.collect.Iterables;
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

    @DataTableType


    public LoginData getLoginData(Map<String, String> map) {

        return new LoginData(map);
//        return  new LoginData(stringList.get(0),stringList.get(1));
    }

    LoginActions loginActions = new LoginActions();
    LoginData loginData;

    @Given("user launches the home page")
    public  void userLaunchesTheHomePage(List<LoginData> stringList) {
//        System.out.println(stringList);
        LoginData last = stringList.get(0);
        String pswd = last.getPswd();

        System.out.println(pswd);

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

/*
* Jun 14, 2020 1:10:50 PM io.cucumber.core.runtime.CucumberExecutionContext getRunner
SEVERE: Unable to start Cucumber
io.cucumber.java.InvalidMethodSignatureException: A @DataTableType annotated method must have one of these signatures:
 * public Author author(DataTable table)
 * public Author author(List<String> row)
 * public Author author(Map<String, String> entry)
 * public Author author(String cell)
at com.siva.steps.Fnlty_Steps.getLoginData(java.util.List<com.siva.datahandlers.LoginData>)
*
* */