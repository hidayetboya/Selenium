package Day8;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_StatusOfElement extends BaseDriver {

    @Test
    public void test1(){
        driver.get("https://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement tuesday = driver.findElement(By.xpath("//input[@id='gwt-debug-cwCheckBox-Tuesday-input']"));

        MyMethods.myWait(3);
        System.out.println("tuesday.isDisplayed() = " + tuesday.isDisplayed());
        System.out.println("tuesday.isEnabled() = " + tuesday.isEnabled());
        System.out.println("tuesday.isSelected() = " + tuesday.isSelected());
        System.out.println(".............................................");

        MyMethods.myWait(3);
        tuesday.click();

        MyMethods.myWait(3);
        System.out.println("tuesday1.isDisplayed() after click = " + tuesday.isDisplayed());
        System.out.println("tuesday1.isEnabled() after click = " + tuesday.isEnabled());
        System.out.println("tuesday1.isSelected() after click = " + tuesday.isSelected());

        waitAndQuit();
    }
}