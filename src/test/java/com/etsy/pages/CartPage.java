package com.etsy.pages;

import com.etsy.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage{

    public WebElement item(String itemName){
        String itemXpath = "//a[contains(text(),'" + itemName + "')]";
        return Driver.getDriver().findElement(By.xpath(itemXpath));
    }


}
