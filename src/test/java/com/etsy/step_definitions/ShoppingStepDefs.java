package com.etsy.step_definitions;

import com.etsy.pages.CartPage;
import com.etsy.pages.HomePage;
import com.etsy.pages.RingsPage;
import com.etsy.utility.BrowserUtility;
import com.etsy.utility.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ShoppingStepDefs {
    HomePage homePage = new HomePage();
    RingsPage ringsPage = new RingsPage();

    CartPage cartPage = new CartPage();

    @When("user writes {string} in the search box")
    public void user_writes_in_the_search_box(String search) {
        homePage.searchBox.sendKeys(search);
    }

    @When("user clicks search button")
    public void user_clicks_search_button() {
        homePage.searchButton.click();
    }

    @When("user selects {string}")
    public void user_selects(String ringName) {
        BrowserUtility.sleep(2);
        homePage.clickElementByName(BrowserUtility.changeSpecialCharWithDash(ringName));
    }

    @When("user is on the {string}")
    public void verify_that_user_is_on_the(String window) {
        BrowserUtility.switchWindow(window);
    }

    @When("user selects material as {string}")
    public void user_selects_material_as(String material) {
        ringsPage.selectMaterial(material);
    }

    @When("user selects ring size as {string}")
    public void user_selects_ring_size_as(String size) {
        BrowserUtility.sleep(2);
        ringsPage.selectRingSize(size);
    }

    @When("user clicks add button")
    public void user_clicks_add_button() {
        BrowserUtility.clickWithJS(ringsPage.addToCartBtn);
    }

    @Then("verify that {string} item is on the cart")
    public void verify_that_item_is_on_the_cart(String ringName) {
        ringName = BrowserUtility.changeSpecialCharWithDash(ringName);
        Assert.assertTrue(cartPage.item(ringName).isDisplayed());
    }


}
