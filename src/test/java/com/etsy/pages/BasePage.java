package com.etsy.pages;

import com.etsy.utility.BrowserUtility;
import com.etsy.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    public void clickModule(String module) {
        String moduleLocator = "//span[normalize-space(text())='" + module + "']";
        WebElement element = Driver.getDriver().findElement(By.xpath(moduleLocator));
        BrowserUtility.clickWithJS(element);
    }

    @FindBy(id = "global-enhancements-search-query")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@data-id='gnav-search-submit-button']")
    public WebElement searchButton;


}
