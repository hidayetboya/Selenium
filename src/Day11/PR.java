package Day11;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class PR extends BaseDriver {
    @Test
    public void windowsTest() {
        driver.get("https://www.selenium.dev/");
        String windowid= driver.getWindowHandle();

        WebElement link = driver.findElement(By.xpath("//a[text()='Watch the Videos']"));
        link.click();

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("************************");

        Set<String> windoids = driver.getWindowHandles();
        for (String id : windoids){
            if (!windoids.equals(id)){
                driver.switchTo().window(id);
            }
        }
        MyMethods.myWait(3);
        driver.switchTo().window(windowid);
        MyMethods.myWait(1);

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        System.out.println("driver.getTitle() = " + driver.getTitle());


    }
}

