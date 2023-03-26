package com.apcrm.pages;

import com.apcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityStream {


    public ActivityStream() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(css = "div[id='pagetitle']")
    public WebElement pageTitle;

    @FindBy(css = "input[id='search-textbox-input']")
    public WebElement searchBox;

    @FindBy(css = "input[id='search-submit']")
    public WebElement searchButton;


}

