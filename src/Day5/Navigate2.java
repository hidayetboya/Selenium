package Day5;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Navigate2 extends BaseDriver {
    public static void main(String[] args) {

      driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement element = driver.findElement(By.id("alerttest"));
        MyMethods.myWait(1);
        element.click();
        MyMethods.myWait(1);
        driver.navigate().back();


        MyMethods.myWait(1);
       driver.quit();


    }
}
