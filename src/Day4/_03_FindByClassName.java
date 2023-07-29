package Day4;

import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class _03_FindByClassName {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");
        WebElement nameInput = driver.findElement(By.className("form-textbox"));
        nameInput.sendKeys("Elvira"); //thare are multiple element that have the same className
                                                  // Selenium gets the first element

        List<WebElement> labels = driver.findElements(By.className("form-sub-label")); // Gets all of the elements
                                                                                        // that have the same locator
       for (WebElement e : labels){
           System.out.println(e.getText());
       }


       //findElement() --> NoSuchElementException
        // findElements() --> returnts an empty list

        List<WebElement> elements = driver.findElements((By.className("wrongClassName")));
        System.out.println(elements.size());
        MyMethods.myWait(3);
        driver.quit();

    }
}
