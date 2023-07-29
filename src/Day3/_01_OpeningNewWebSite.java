package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _01_OpeningNewWebSite {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver(); // Creates a WebDriver object and opends a new Chrome page
//        WebDriver driver1 = new FirefoxDriver();
//        WebDriver driver2 = new EdgeDriver();
        // driver.quit(); //closes only the avtive tab

        driver.get("https://www.google.com/");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();



    }
}
