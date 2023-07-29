package Day13;

import Utilities.BaseDriver;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _01_ScreenShot extends BaseDriver {

    @Test
    public void screenShot () throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin1");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        loginButton.click();

        WebElement errorMessage = driver.findElement(By.xpath("//p[.='Invalid credentials']"));

        if (errorMessage.isDisplayed()) {

            LocalDateTime localDateTime = LocalDateTime.now();
            DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("MM_dd_yyyy_hh_mm_ss_SSS");
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver; // Took the screenshot
            File screenShotInTheMemory = takesScreenshot.getScreenshotAs(OutputType.FILE); // Stores the screenshot in the temporary memory as a file
// Now you can do whatever you need to do with it, for example copy somewhere
            FileUtils.copyFile(screenShotInTheMemory, new File("screenShots/screenShot" + localDateTime.format(myFormat) +".png"));
            // Stores the screenshot as a file in the permanent memory

        }
        waitAndQuit();
    }
}
