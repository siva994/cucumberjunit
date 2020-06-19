package com.siva.pageactions;

import com.siva.base.Helper;
import com.siva.pages.LoginLocators;
import io.cucumber.java.Scenario;
import org.openqa.selenium.support.PageFactory;

import static com.siva.utils.SeleniumDriver.getDriver;

public class LoginActions extends Helper {


    LoginLocators loginLocators ;

public LoginActions()
{
this.loginLocators = new LoginLocators();
    PageFactory.initElements(getDriver(),loginLocators);

}

public void clickSignIn()
{


click(5,loginLocators.signInBtn);
    captureScreenshot();
click(5,loginLocators.signInLink);


}

}
