package Day12;

import Utilities.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Set;

/**
        * Go to "https://www.selenium.dev/"
        * Click on all of the links that opens up a new tab except the ones that has "mailto" word in their href attribute
        * Print out titles and urls of them
        * Then close them one by one except the main
        * Print the title and url of the main tab
        * Then close it.
        * **/

public class Task extends BaseDriver {
    @Test
    public void javaScriptClick (){
        driver.get("https://www.selenium.dev/");
        String mainTabId = driver.getWindowHandle();
        List<WebElement> urls = driver.findElements(By.xpath("//a[@target='_blank']"));
        for (WebElement url : urls){
            if (!url.getAttribute("href").contains("mailto")){
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].click();",url);
            }
        }
        
       Set<String> ids = driver.getWindowHandles();
       
        for (String id: ids){
            if (!id.equals(mainTabId)){
                driver.switchTo().window(id);
                System.out.println("driver.getTitle() = " + driver.getTitle());
                System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
                        
            }
        }
        for (String id: ids){
            if (!id.equals(mainTabId)){
                driver.switchTo().window(id);
                driver.close();
            }
        }
        driver.switchTo().window(mainTabId);

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
