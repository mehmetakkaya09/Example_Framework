package com.etsy.pages;

import com.etsy.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public void clickElementByName(String name) {
        String elementXpath = "//h3[contains(text(), '" + name + "')]";
        Driver.getDriver().findElement(By.xpath(elementXpath)).click();
    }

}
