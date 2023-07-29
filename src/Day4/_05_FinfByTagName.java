package Day4;

import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_FinfByTagName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        WebElement element = driver.findElement(By.linkText("Careers")); //Locates a tags by using visible text




        MyMethods.myWait(3);
        driver.quit();



    }
}
