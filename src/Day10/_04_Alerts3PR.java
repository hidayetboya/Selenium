package Day10;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class _04_Alerts3PR extends BaseDriver {

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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        WebElement clik = driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
        clik.click();

        driver.switchTo().alert().sendKeys("Elvira");
        MyMethods.myWait(1);

        driver.switchTo().alert().accept();


        WebElement text = driver.findElement(By.id("prompt-demo"));
        Assert.assertTrue(text.getText().contains("Elvira"));
    }
}