package Day10;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_Alerts3 extends BaseDriver {

    /**
     * Go to "http://demo.seleniumeasy.com/javascript-alert-box-demo.html"
     * Click on Click for Prompt Box Button
     * Type your message
     * Click on OK
     * Verify that you see your message.
     *
     * **/

    @Test
    public void test1() {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        MyMethods.myWait(3);
        WebElement clickForPromptBox = driver.findElement(By.xpath("//button[normalize-space()='Click for Prompt Box']"));
        clickForPromptBox.click();

        MyMethods.myWait(3);
        driver.switchTo().alert().sendKeys("Batch 8");

        MyMethods.myWait(3);
        driver.switchTo().alert().accept();

        MyMethods.myWait(3);
        WebElement message = driver.findElement(By.id("prompt-demo"));

        Assert.assertTrue(message.getText().contains("Batch 8"));

        waitAndQuit();
    }
}