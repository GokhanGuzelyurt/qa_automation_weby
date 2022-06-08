package com.weby.pages;

import com.weby.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class OrderFormPage extends BasePage{

    @FindBy(css = "[class*='Pill_pill ']")
    public WebElement orderTypeText;

    @FindBy(css = "[role='option']")
    public List<WebElement> allDropDownList;

    /**
     * 0-5 --Deadline radioButton
     * 6-9 --OrderStatus radioButton
     */
    @FindBy(className = "RadioButton_radioButton__csui")
    public List<WebElement> deadlineAndOrderStatus;

    @FindBy(className = "Checkbox_checkbox__csui")
    public List<WebElement> deliveryCheckbox;

    @FindBy(css = "[class*='secondary']")
    public WebElement cancelButton;

    @FindBy(xpath = "(//*[@class='Button_button__csui Button_primary__csui'])[2]")
    public WebElement saveButton;

    @FindBy(css = "[class*='PageTabs_anchor']")
    public List<WebElement> notesArea;






    public WebElement getElement(String placeHolderName){

        return Driver.get().findElement(By.cssSelector("[placeholder='"+placeHolderName+"'"));
    }




}
