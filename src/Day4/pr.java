package Day4;

import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pr {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
        element.sendKeys("els");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        element.clear();
        WebElement element3 = driver.findElement(By.id("nav_cs_1"));
       String text = element3.getText();
        System.out.println(text);


    }
}
