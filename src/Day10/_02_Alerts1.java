package Day10;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Alerts1 extends BaseDriver {

    /**
     * Alert is a Javascript code, not part of html code.
     * How do you handle alerts with Selenium?
     *
     * driver.switchTo.alert.accept();
     * driver.switchTo.alert.dismiss();
     * driver.switchTo.alert.sendKeys();
     * **/

    @Test
    public void test1(){
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMeButton1 = driver.findElement(By.cssSelector("button[class='btn btn-default']"));
        clickMeButton1.click();

        MyMethods.myWait(3);

        driver.switchTo().alert().accept(); // switches to the alert and clicks on the Ok or Accept button

        waitAndQuit();
    }
}