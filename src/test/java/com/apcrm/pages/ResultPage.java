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

    @FindBy(xpath = "//*[@id='pagetitle']")
    public WebElement pageTitle;

    @FindBy(css = "input[id='LIVEFEED_search']")
    public WebElement searchedKeyword;

    @FindBy(xpath = "/html[1]/body[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]/div[1]/div[2]/span[1]")
    public WebElement conversationsPageTitle;



}
