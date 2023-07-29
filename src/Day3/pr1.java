package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pr1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
//        driver.get("https://www.wayfair.com/");
        WebElement element  = driver.findElement(By.id("twotabsearchtextbox"));
        element.sendKeys("elvira");
//        WebElement element1 = driver.findElement(By.id("OutlinedSearchBar-label"));
//        element1.sendKeys("elvira");
        driver.quit();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
