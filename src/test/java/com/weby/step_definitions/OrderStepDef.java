package com.weby.step_definitions;

import com.weby.pages.OrderPage;
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

        // Setup Chrome driver
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        // Authentication username & password
//        String username = "tmnow";
//        String password = "bule7";
//        // Get the devtools from the running driver and create a session
//        DevTools devTools = driver.getDevTools(); ;
//        devTools.createSession();
//        // Enable the Network domain of devtools
//        devTools.send(Network.enable(Optional.of(100000), Optional.of(100000), Optional.of(100000)));
//        String auth = username + ":" + password;
//        // Encoding the username and password using Base64 (java.util)
//        String encodeToString = Base64.getEncoder().encodeToString(auth.getBytes());
//        // Pass the network header -> Authorization : Basic <encoded String>
//        Map<String, Object> headers = new HashMap<>();
//        headers.put("Authorization", "Basic " + encodeToString);
//        devTools.send(Network.setExtraHTTPHeaders(new Headers(headers)));

        Driver.get().get("https://tmy.netlify.app");


    }

    @Then("user see the order page")
    public void user_see_the_order_page() {

        Assert.assertEquals("Orders", orderPage.orderPageHeader.getText());
    }

    @When("user click order type dropdown")
    public void user_click_order_type_dropdown() {
        orderPage.orderTypeDropDown.click();

    }

    @Then("user should see the list according to the selected order type")
    public void userShouldSeeTheListAccordingToTheSelectedOrderType(List<String> orderType) {
        orderPage.checkOrderStatus(orderType);
    }

}
