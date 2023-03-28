package com.apcrm.pages;

import com.apcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage {

    public ResultPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "#pagetitle")
    public WebElement blogPageTitle;

    @FindBy(css = "#pagetitle")
    public WebElement itemPageTitle;


    @FindBy(css = "#pagetitle")
    public WebElement groupPageTitle;




}
