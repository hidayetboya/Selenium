package Day10;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_Alerts2 extends BaseDriver {

    @Test
    public void test1() {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        MyMethods.myWait(3);
        WebElement clickMeButton2 = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][normalize-space()='Click me!']"));
        clickMeButton2.click();
        MyMethods.myWait(3);

        driver.switchTo().alert().dismiss(); // switches to the alert and clicks on dismiss, reject, and cancel button

        waitAndQuit();
    }
}