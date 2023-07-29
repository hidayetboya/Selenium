package Day12;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class _02_RobotClass extends BaseDriver {

    // We use it to deal with windows when we want to download or upload something.

    @Test
    public void robotClass1() throws AWTException {
        driver.get("http://demo.guru99.com/test/upload/");

        WebElement chooseFileButton = driver.findElement(By.id("uploadfile_0"));
        Actions actions = new Actions(driver);
        actions.click(chooseFileButton).build().perform();

        //    C:\Users\ragip\Desktop\RobotClassTest\TestDocument.txt
        //    C:\Users\ragip\Desktop\RobotClassTest\TestDocument.txt
        MyMethods.myWait(3);
        StringSelection filePath = new StringSelection("C:\\Users\\ragip\\Desktop\\RobotClassTest\\TestDocument.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);

        Robot rbt = new Robot();

        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);
        // pressed ctrl+V

        rbt.keyRelease(KeyEvent.VK_V);
        rbt.keyRelease(KeyEvent.VK_CONTROL);
        // released ctrl and V
        MyMethods.myWait(3);
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        MyMethods.myWait(3);

        WebElement checkBox = driver.findElement(By.id("terms"));
        checkBox.click();

        WebElement submitButton = driver.findElement(By.id("submitbutton"));
        submitButton.click();

        WebElement message = driver.findElement(By.id("res"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(message));

        Assert.assertTrue(message.getText().contains("successfully uploaded"));
        waitAndQuit();
    }

}