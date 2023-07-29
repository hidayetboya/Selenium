package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.naming.Name;

public class _02_FinfByName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");


        //Locators in Selenium
        //id
        //Name
        // className
        // linkText
        //partialLinkText
        //tagName
        //css Selector
        //xpath

        WebElement nameInput = driver.findElement(By.name("q8_name[first]"));
        nameInput.sendKeys("Elvira");


    }
}
