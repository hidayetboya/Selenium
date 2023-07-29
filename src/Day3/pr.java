package Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class pr {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        //WebDriver driver1 = new EdgeDriver();

        driver.get("https://www.google.com/");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
        driver.close();

    }
}
