package com.etsy.pages;

import com.etsy.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RingsPage extends BasePage{

    public void selectMaterial(String material){
        WebElement element = Driver.getDriver().findElement(By.id("variation-selector-0"));
        Select materialOption = new Select(element);

        List<WebElement> options = materialOption.getOptions();
        for (WebElement option : options) {
            if (option.getAttribute("innerHTML").trim().contains(material)) {
                option.click();
                break;
            }
        }
    }

    public void selectRingSize(String size){
        WebElement element = Driver.getDriver().findElement(By.id("variation-selector-1"));
        Select sizeOption = new Select(element);

        List<WebElement> options = sizeOption.getOptions();
        for (WebElement option : options) {
            if (option.getAttribute("innerHTML").trim().equals(size)) {
                option.click();
                break;
            }
        }
    }

    @FindBy(xpath = "//button[normalize-space(text())='Add to cart']")
    public WebElement addToCartBtn;



}
