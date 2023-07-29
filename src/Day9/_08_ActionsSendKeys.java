package Day9;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _08_ActionsSendKeys extends BaseDriver {
    @Test
    public void test1(){

        driver.get("https://demoqa.com/auto-complete");

        WebElement inputBox = driver.findElement(By.id("autoCompleteMultipleContainer"));
        //inputBox.sendKeys("John");

        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(inputBox).click().keyDown(Keys.SHIFT).sendKeys("j").keyUp(Keys.SHIFT)
                .sendKeys("ohn").build();

        action.perform();
    }
}
