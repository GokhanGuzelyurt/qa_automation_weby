package com.weby.step_definitions;

import com.weby.pages.TasksPage;
import com.weby.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

import java.util.List;

public class TasksStepDef {

    TasksPage tasksPage=new TasksPage();
    @When("user click menu tabs")
    public void user_click_menu_tabs() {
        tasksPage.burgerMenu.click();
    }
    @When("user click Tasks from menus")
    public void user_click_tasks_from_menus() {
        tasksPage.allMenuItem.get(1).click();
        BrowserUtils.waitFor(1);

    }
    @Then("user should see the list according to the selected task types")
    public void user_should_see_the_list_according_to_the_selected_task_types(List<String> taskType) {

        for (int i=0;i<taskType.size();i++){
            tasksPage.taskTypeDropDown.click();
            tasksPage.listTaskType.get(i+1).click();
            BrowserUtils.waitFor(2);
            List<String> taskStatus= BrowserUtils.getElementsText(tasksPage.getTaskName(taskType.get(i)));
            for (int j = 0; j < taskStatus.size(); j++) {
                assertTrue(taskStatus.get(j).contains(taskType.get(i)));
            }
        }

    }
}
