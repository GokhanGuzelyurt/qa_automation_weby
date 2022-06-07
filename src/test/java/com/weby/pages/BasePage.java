package com.weby.pages;

import com.weby.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(),this);
    }


    @FindBy(className = "PageHeader_burgerMenuWrapper")
    public WebElement burgerMenu;

    @FindBy(className = "BurgerMenu_rowRight")
    public List<WebElement> allMenuItem;
}
