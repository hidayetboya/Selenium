package Day10;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionsArrowKeys extends BaseDriver {

    @Test
    public void test1() {

        driver.get("https://demoqa.com/auto-complete");
        WebElement inputBox = driver.findElement(By.cssSelector("div[class=\"auto-complete__value-container css-1hwfws3\"]"));

        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(inputBox).click().sendKeys("b").build();
        action.perform();

        MyMethods.myWait(3);
        Action action1 = actions.sendKeys(Keys.ARROW_DOWN).build();
        action1.perform();

        MyMethods.myWait(3);
        Action action2 = actions.sendKeys(Keys.ENTER).build();
        action2.perform();

        MyMethods.myWait(3);

        waitAndQuit();
    }
}