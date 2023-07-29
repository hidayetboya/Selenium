package Day9;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class _02_ActionsClick extends BaseDriver {

    @Test
    public void test1() {
        driver.get("https://demoqa.com/buttons");

        WebElement singleClick = driver.findElement(By.xpath("//button[text()='Click Me']"));

        Actions actions = new Actions(driver); // Created Actions object

        Action action = actions.moveToElement(singleClick).click().build(); //Prepares the action for us

        MyMethods.myWait(3);
        action.perform(); // performs the action


        waitAndQuit();

    }
}
