package com.weby.pages;

import com.weby.utilities.BrowserUtils;
import com.weby.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class OrderPage extends BasePage{

    @FindBy(className = "PageHeader_title")
    public WebElement orderPageHeader;

    @FindBy(css = "[role='option']")
    public List<WebElement> orderTypeList;

    @FindBy(id= "downshift-1-toggle-button")
    public WebElement orderTypeDropDown;

    @FindBy(xpath= "//tbody//td[8]")
    public List<WebElement> orderStatus;




}
