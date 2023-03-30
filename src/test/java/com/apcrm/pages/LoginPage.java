package com.apcrm.pages;

import com.apcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input[name='USER_LOGIN']")
    public WebElement userLoginInput;
    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement userPasswordInput;
    @FindBy(css = "input[class='login-btn']")
    public WebElement loginButton;

//    @FindBy(css = "div[id='pagetitle']")
//    public WebElement activityStreamPageTitle;

    @FindBy(css = "div[class='errortext']")
    public WebElement errorMessage;

    @FindBy(xpath = "//div[@class='errortext']") // may need to be updated
    public WebElement errorMessageAfter5Tries; // update after 5 tries


    /**
     * This method will log in using credentials from configuration.properties
     */
    public void loginWithConfiguration() {
        // String url = ConfigurationReader.getProperty("apcrmUrl");
        // Driver.getDriver().get(ConfigurationReader.getProperty("apcrmUrl"));
        // userLoginInput.sendKeys(ConfigurationReader.getProperty("loginUsername"));
        // userPasswordInput.sendKeys(ConfigurationReader.getProperty("loginPassword"));
        // loginButton.click();
    }

}
