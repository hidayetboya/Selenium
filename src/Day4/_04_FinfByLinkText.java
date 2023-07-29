package Day4;

import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _04_FinfByLinkText {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.amazon.com/");
//        WebElement element = driver.findElement(By.linkText("Careers")); //Locates a tags by using visible text
//
//
//        System.out.println(element.getText());
//        System.out.println(element.getAttribute("href"));
//        System.out.println(element.getAttribute("class"));
//        //element.click();
//
//
//        WebElement element1 = driver.findElement(By.partialLinkText("Sell products"));
//        System.out.println(element1.getText());
//
//        List<WebElement>  linksAmazon = driver.findElements(By.tagName("a"));
//        for (WebElement e : linksAmazon){
//            System.out.println(e.getAttribute("href"));
//        }

        driver.get("https://form.jotform.com/221934510376353");
        List<WebElement> labels = driver.findElements(By.tagName("label"));
        for (WebElement e : labels){
            System.out.println(e.getText());
        }


        MyMethods.myWait(3);
        driver.quit();



    }
}
