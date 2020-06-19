package com.siva.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.Properties;

public class LoginLocators {





@FindBy(how = How.XPATH,using = "//div[contains(text(),'Sign in')]")
public WebElement signInBtn;

@FindBy(how = How.XPATH,using = "//a[contains(text(),'Sign in')]")
public WebElement signInLink;




}
