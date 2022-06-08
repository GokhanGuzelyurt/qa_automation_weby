package com.weby.step_definitions;

import com.weby.pages.OrderPage;
import com.weby.utilities.BrowserUtils;
import com.weby.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;



public class OrderStepDef {
    OrderPage orderPage = new OrderPage();
    private ChromeDriver driver;

    @Given("user open the website")
    public void user_open_the_website() {

        Driver.get().get("https://tmy.netlify.app");

    }

    @Then("user see the order page")
    public void user_see_the_order_page() {

        Assert.assertEquals("Orders", orderPage.orderPageHeader.getText());
    }

    @When("user click order type dropdown")
    public void user_click_order_type_dropdown() {
//        orderPage.orderTypeDropDown.click();

    }

    @Then("user should see the list according to the selected order type")
    public void userShouldSeeTheListAccordingToTheSelectedOrderType(List<String> orderType) {

        for (int i=0;i<orderType.size();i++){
            orderPage.orderTypeDropDown.click();
            orderPage.orderTypeList.get(i).click();
            BrowserUtils.waitFor(2);
            List<String> orderStatus= BrowserUtils.getElementsText(orderPage.orderStatus);
            for (int j = 0; j < orderStatus.size(); j++) {
                Assert.assertEquals(orderType.get(i),orderStatus.get(j));
            }
        }
    }

}
