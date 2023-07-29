package Day5;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_GetCSSValue extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");
        WebElement searchInput = driver.findElement(By.id("inputValEnter"));
        System.out.println("searchInput.getCssValue(\"color\") = " + searchInput.getCssValue("color"));
        //getCssValue() returns any styling value we want
        System.out.println("searchInput.getCssValue(\"background\") = " + searchInput.getCssValue("background"));
        waitAndQuit();
    }
}
