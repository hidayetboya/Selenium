package Day11;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_IFrame extends BaseDriver {

    /**
     * Go to "https://chercher.tech/practice/frames"
     * Type USA in the first box on the page
     * Select Avatar from animals
     **/

    @Test
    public void iFrameTest(){
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);

        // we are in the frame now

//        driver.switchTo().frame("frame1"); // driver.switchTo().frame("iamframe");
//
//        WebElement iFrame = driver.findElement(By.id("frame1"));
//        driver.switchTo().frame(iFrame);


        WebElement inputBox = driver.findElement(By.cssSelector("input[type='text']"));
        inputBox.sendKeys("USA");

        driver.switchTo().parentFrame(); // goes one step back
//        driver.switchTo().defaultContent(); // goes to the beginning

        driver.switchTo().frame("frame2"); // we are in the 2nd frame

        WebElement animalsSelect = driver.findElement(By.id("animals"));
        Select animals = new Select(animalsSelect);

        animals.selectByValue("avatar");

        waitAndQuit();
    }
}