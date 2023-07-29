package Day10;


import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class _06_WaitExample1 extends BaseDriver {

    /**
     * Go to  "http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html"
     * Click on Timer Button
     * Verify that you see WebDriver text
     * **/

    @Test
    public void test1(){

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement timerButton = driver.findElement(By.cssSelector("button[onclick='timedText()']"));
        timerButton.click();

        WebElement message = driver.findElement(By.id("demo"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.id("demo"),"WebDriver"));
        // waits until the text of the element becomes WebDriver for 30 secs.
        // If it becomes WebDriver before 30 secs it keeps running the rest of the code

        // Thread.sleep(30000);  It is not a Selenium method. It is a Java method.
        // It stops the code for 30 secs no matter what. Even the text becomes WebDriver before 30 secs.
        // So it causes waste of time.



        Assert.assertTrue(message.getText().equals("WebDriver"));

        waitAndQuit();

    }

}