package com.apcrm.pages;

import com.apcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityStreamPage {


    public ActivityStreamPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(css = "div[id='pagetitle']")
    public WebElement activityStreamPageTitle;

    @FindBy(css = "input[id='search-textbox-input']")
    public WebElement topPageSearchBox;

    @FindBy(xpath = "//span[contains(@class, 'header-search-icon')]")
    public WebElement topPageSearchSubmitButton;


}

