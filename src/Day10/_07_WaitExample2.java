package Day10;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.regex.Pattern;

public class _07_WaitExample2 extends BaseDriver {
    /**
     * Go to http://demo.seleniumeasy.com/ajax-form-submit-demo.html
     * Type Name and a Comment
     * Click on Submit Button
     * Verify you see "Success" keyword.
     **/
    @Test
    public void test1() {
        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement name = driver.findElement(By.id("title"));
        name.sendKeys("Batch 8");

        WebElement comment = driver.findElement(By.id("description"));
        comment.sendKeys("Hello Testing World!");

        WebElement submitButton = driver.findElement(By.id("btn-submit"));
        submitButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions
                .textMatches(By.xpath("//div[@id='submit-control']"), Pattern.compile("Success")));

        WebElement message = driver.findElement(By.xpath("//div[@id='submit-control']"));

        Assert.assertTrue(message.getText().contains("Success"));

        waitAndQuit();

    }
}