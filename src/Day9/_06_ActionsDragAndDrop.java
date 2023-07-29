package Day9;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionsDragAndDrop extends BaseDriver {
    @Test
    public void test1() {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        WebElement oslo = driver.findElement(By.id("box1"));
        WebElement norway = driver.findElement(By.id("box101"));

        MyMethods.myWait(2);
        Actions actions = new Actions(driver);
//        Action action = actions.dragAndDrop(oslo, norway).build(); // drags and drops the source to the target
//        action.perform();

        Action action = actions.clickAndHold(oslo).moveToElement(norway).release().build();
        // clicks on the element and holds it, moves it to the target then releases it.
        action.perform();


        System.out.println(oslo.getCssValue("background-color"));

        Assert.assertTrue(oslo.getCssValue("background-color").equals("rgba(0, 255, 0, 1)"));

        waitAndQuit();

    }
}
