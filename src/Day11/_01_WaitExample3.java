package Day11;

import Utilities.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _01_WaitExample3 extends BaseDriver {

    /**
     * Go to "https://www.demoblaze.com/index.html"
     * Click on Samsung Galaxy s6
     * Click on "Add to Cart"
     * Close the alert
     * Click on Product Store to go back to the main page
     * Verify that you are on the main page
     **/

    @Test
    public void waitExample() {
        driver.get("https://www.demoblaze.com/index.html");

        WebElement samsungS6 = driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']"));
        samsungS6.click();

        WebElement addToCart = driver.findElement(By.xpath("//a[text()='Add to cart']"));
        addToCart.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

        WebElement productStore = driver.findElement(By.id("nava"));
        productStore.click();

        Assert.assertEquals("Test failed", "https://www.demoblaze.com/index.html", driver.getCurrentUrl());

        waitAndQuit();
    }
}