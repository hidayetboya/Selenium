package Day9;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Pr extends BaseDriver {
    @Test
    public void Test1(){

        driver.get("https://demoqa.com/buttons");

        WebElement clik = driver.findElement(By.xpath("//button[text()='Click Me']"));
        Actions actions = new Actions(driver);
//        Action action = actions.moveToElement(clik).click().build();
        Action action = actions.click(clik).build();
        MyMethods.myWait(1);
        action.perform();

        WebElement rightclick = driver.findElement(By.id("rightClickBtn"));
        Actions actions1= new Actions(driver);
//        Action action1=actions1.moveToElement(rightclick).contextClick().build();
        Action action1 = actions1.contextClick(rightclick).build();
        MyMethods.myWait(1);
        action1.perform();

        WebElement doubleclick = driver.findElement(By.id("doubleClickBtn"));
        Actions actions2 = new Actions(driver);
//        Action action2 = actions2.moveToElement(doubleclick).doubleClick().build();
        Action action2 = actions2.doubleClick(doubleclick).build();
        MyMethods.myWait(1);
        action2.perform();
    }
}
