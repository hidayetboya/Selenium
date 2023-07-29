package Day11;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_iFrame extends BaseDriver {

    /**
     * Go to "https://chercher.tech/practice/frames"
     * Type USA in the first box on the page
     * Check the checkbox
     * Select Avatar from animals
     **/

    @Test
    public void iFrameTest() {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);
        // we are in the first frame now

        WebElement inputBox = driver.findElement(By.cssSelector("input[type='text']"));
        inputBox.sendKeys("USA");

        driver.switchTo().frame(0); // we are in the inner frame
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();

        driver.switchTo().defaultContent(); // we are in the main page


        driver.switchTo().frame(1); // we are in the 2nd frame

        WebElement animalsSelect = driver.findElement(By.id("animals"));
        Select animals = new Select(animalsSelect);

        animals.selectByValue("avatar");

        waitAndQuit();
    }
}