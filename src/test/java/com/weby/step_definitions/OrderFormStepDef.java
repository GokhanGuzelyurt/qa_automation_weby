package com.weby.step_definitions;

import com.weby.pages.OrderFormPage;
import com.weby.pages.OrderPage;
import com.weby.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class OrderFormStepDef {

    OrderPage orderPage=new OrderPage();
    OrderFormPage orderFormPage=new OrderFormPage();
    @When("user click New Order button")
    public void user_click_new_order_button() {
       orderPage.newOrderButton.click();
    }
    @Then("user should be see {string} order status")
    public void user_should_be_see_order_status(String title) {

      assertEquals(title,orderFormPage.orderTypeText.getText());
    }
    @When("user fill in the form")
    public void user_fill_in_the_form() {

        BrowserUtils.waitForVisibility(orderFormPage.getElement("Insert order name"),10);
        orderFormPage.getElement("Insert order name").sendKeys("Test Order QA");

        orderFormPage.getElement("Select billing entity").click();
        orderFormPage.allDropDownList.get(1).click();

        orderFormPage.getElement("Order reference").sendKeys("QA");
        orderFormPage.getElement("Billing reference").sendKeys("Corsearch");
        orderFormPage.getElement("Insert price").sendKeys("55220");

        orderFormPage.getElement("Select currency").click();
        orderFormPage.allDropDownList.get(1).click();

        orderFormPage.getElement("Custom Search").click();
        orderFormPage.allDropDownList.get(3).click();

        orderFormPage.getElement("Select Nice classes").click();
        orderFormPage.allDropDownList.get(2).click();

        orderFormPage.getElement("Add goods and services").sendKeys("Good services");
        orderFormPage.getElement("Add targeted goods and services").sendKeys("Dell and Apple");

        orderFormPage.getElement("Select SIC/NAICS codes").click();
        orderFormPage.allDropDownList.get(1).click();

        orderFormPage.getElement("Add trademark name(s)").sendKeys("GG");

        orderFormPage.deadlineAndOrderStatus.get(2).click();
        orderFormPage.getElement("Select timezone").click();
        orderFormPage.allDropDownList.get(1).click();

        orderFormPage.deliveryCheckbox.get(2).click();
        orderFormPage.deliveryCheckbox.get(4).click();

        orderFormPage.getElement("Select team").click();
        orderFormPage.allDropDownList.get(2).click();

        orderFormPage.deadlineAndOrderStatus.get(6).click();

    }
    @When("user type Order Notes,Notes to analyst,Client preferences")
    public void user_type_order_notes_notes_to_analyst_client_preferences() {

        orderFormPage.notesArea.get(0).sendKeys("I am searching...");
        orderFormPage.notesArea.get(1).click();
        orderFormPage.notesArea.get(1).sendKeys("Analyst my words");
        orderFormPage.notesArea.get(2).click();
        orderFormPage.notesArea.get(2).sendKeys("QA preference");
    }
    @When("user click Save button")
    public void user_click_save_button() {

        orderFormPage.saveButton.click();

    }
    @Then("user should be see Order on the Order table")
    public void user_should_be_see_order_on_the_order_table() {
        BrowserUtils.waitForVisibility(orderPage.id,10);
        BrowserUtils.doubleClick(orderPage.id);
        assertEquals("Test Order QA",orderPage.name.getText());

    }

}
