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

    @FindBy (className = "PageHeader_burgerMenuWrapper")
    public WebElement burgerMenu;

    @FindBy(className = "BurgerMenu_rowRight")
    public List<WebElement> allMenu;


    public void   checkOrderStatus(List<String> orderType){

        int i=0;

        for (String s : orderType) {

            orderTypeDropDown.click();
            BrowserUtils.waitFor(1);
            orderTypeList.get(i).click();
            BrowserUtils.waitForVisibility(orderStatus.get(i),10);
            orderStatus.forEach(status->status.getText().equals(s));
            i++;

        }

    }




}
