package com.weby.pages;

import com.weby.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TasksPage extends BasePage{

    @FindBy(id= "downshift-1-toggle-button")
    public WebElement taskTypeDropDown;

    @FindBy(css = "[role='option']")
    public List<WebElement> listTaskType;


    public WebElement getTaskValue(int id){

        return Driver.get().findElement(By.xpath(
                "(//*[@class='Card_value'])["+id+"]"));
    }
    public List<WebElement> getTaskName(String name){

        return Driver.get().findElements(By.xpath("(//*[text()='"+name+"'])"));
    }

}
