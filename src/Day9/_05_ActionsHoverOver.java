package Day9;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionsHoverOver extends BaseDriver {

    @Test
    public void test1(){

        driver.get("https://www.ebay.com/");

        WebElement electronics = driver.findElement(By.linkText("Electronics"));

        Actions actions = new Actions(driver);

        Action action = actions.moveToElement(electronics).build();
        action.perform();

        MyMethods.myWait(1);
        WebElement headPhones = driver.findElement(By.linkText("Headphones"));
        headPhones.click();

        String url = driver.getCurrentUrl();

        Assert.assertTrue("Test Failed",url.contains("Headphones"));

        waitAndQuit();
    }

}
