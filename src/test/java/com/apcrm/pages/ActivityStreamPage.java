package com.apcrm.pages;

import com.apcrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActivityStreamPage {


    public ActivityStreamPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(css = "div[id='pagetitle']")
    public WebElement activityStreamPageTitle;

    @FindBy(css = "input[id='search-textbox-input']")
    public WebElement topPageSearchBox;

    @FindBy (xpath = "//div[contains(@class, 'search-title-top-block')][.//div[@bx-search-item-id='P918']]")
    public WebElement topPageSearchConversationsSection;

    @FindBy (xpath = "//html/body/div[4]/div/div[2]/div[1]/div")
    public WebElement topPageSearchConversationsText;

    @FindBy (xpath = "/html/body/div[4]/div/div[1]/div[2]/div/div[1]/span")
    public WebElement topPageSearchConversationsIcon;

    @FindBy (xpath = "/html/body/div[4]/div/div[2]/div[2]/div/div[1]/a")
    public WebElement topPageSearchConversationsLink;

    @FindBy (partialLinkText = "blog")
    public List<WebElement> topPageSearchBlogLinks;

    @FindBy(xpath = "//span[contains(@class, 'header-search-icon')]")
    public WebElement topPageSearchSubmitButton;



    //  /html/body/div[4]/div/div[2]/div[2]/div/div[1]/a
    // //*[contains(@class,'search-title-top-item search-title-top-item-js')]


    // driver.findElement(By.partialLinkText("Plastic Spiral Bind")).click();
    // JavascriptExecutor js = (JavascriptExecutor)driver;
    // js.executeScript("arguments[0].click();", element);



    // //div[@class='search-title-top-list search-title-top-list-js']/div[1]  first links in 4 sections of search (Employees, Conversations, Others, Search)

}

