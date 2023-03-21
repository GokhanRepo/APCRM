package com.apcrm.pages;

import com.apcrm.utilities.ConfigurationReader;
import com.apcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public  WebElement loginInput;
    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public  WebElement passwordInput;
    @FindBy(xpath = "//input[@class='login-btn']")
    public  WebElement loginButton;



    /**
     * This method will log in using credentials from configuration.properties
     * @param username
     * @param password
     */

    public void loginWithConfiguration() {
        //String url = ConfigurationReader.getProperty("apcrmUrl");
        Driver.getDriver().get(ConfigurationReader.getProperty("apcrmUrl"));
        loginInput.sendKeys(ConfigurationReader.getProperty("loginUsername"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("loginPassword"));
        loginButton.click();
    }

}
