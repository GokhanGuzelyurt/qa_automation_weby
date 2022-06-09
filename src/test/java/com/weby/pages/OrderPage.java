package com.weby.pages;

import com.weby.utilities.BrowserUtils;
import com.weby.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class OrderPage extends BasePage{

    @FindBy(className = "PageHeader_title")
    public WebElement orderPageHeader;
    @FindBy(id= "downshift-1-toggle-button")
    public WebElement orderTypeDropDown;
    @FindBy(css = "[role='option']")
    public List<WebElement> orderTypeList;
    @FindBy(xpath= "//tbody//td[8]")
    public List<WebElement> orderStatus;
    @FindBy(css = "[class*='newButton']")
    public WebElement newOrderButton;
    @FindBy(xpath = "//th[1]")
    public WebElement id;
    @FindBy(xpath = "//tr/td[2]")
    public WebElement name;

    @FindBy(xpath = "//td[11]")
    public WebElement orderDetailsButton;

    @FindBy(xpath = "//td[2]")
    public WebElement orderName;
    @FindBy(className= "ContextMenu_item")
    public List<WebElement> editButton;









}
