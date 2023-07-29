package Day11;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _04_Windows extends BaseDriver {

    /**
     * Go to "https://www.selenium.dev/"
     * Click on Watch the videos
     * Print the title and url of new tab
     * Close the new tab
     **/


    @Test
    public void windowsTest() {
        driver.get("https://www.selenium.dev/");
        String windowId = driver.getWindowHandle(); // gives the id of the current tab

        WebElement watchVideosLink = driver.findElement(By.xpath("//a[normalize-space()='Watch the Videos']"));
        watchVideosLink.click();
        MyMethods.myWait(3);

        Set<String> windowIds = driver.getWindowHandles(); // gives us ids of all open tabs

        for (String id : windowIds) { // compared all of the ids of the open tabs with the first tab and than clicked on the different one
            if (!id.equals(windowId)) {
                driver.switchTo().window(id); // now current tab is the second tab
            }
        }

        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        driver.close(); // closed the current tab which is youtube

        driver.switchTo().window(windowId); // switch to the first tab

        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        waitAndQuit();

    }


}