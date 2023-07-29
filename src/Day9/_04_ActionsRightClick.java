package Day9;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionsRightClick extends BaseDriver {
    @Test
    public void test1(){
        driver.get("https://demoqa.com/buttons");

        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));

        Actions actions = new Actions(driver);

//        Action action = actions.moveToElement(rightClickButton).contextClick().build();
//        action.perform();

        Action action = actions.contextClick(rightClickButton).build();
        action.perform();

//        actions.contextClick(rightClickButton).build().perform(); can perform the action once

        action.perform(); // we can perform the same action multiple times

        waitAndQuit();



    }


}

