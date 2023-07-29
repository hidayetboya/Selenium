package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;



public class BaseDriver {

    public static WebDriver driver;


    static {

        closePreviousDrivers();
        Logger logger= Logger.getLogger(""); // shows only severse problem on the consol
        logger.setLevel(Level.SEVERE);
       driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        // Waits for 15 seconds for page to be loaded
        //If it takes more than 15 sec to a page being loaded it throws an exception
        //PageLoad
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Waits until all elements on a webpage are visible on our browser
        //if it is not done in 15 sec it throws an exception
    }

    public static void waitAndQuit(){
        MyMethods.myWait(4);
        driver.quit();
    }

    public static void closePreviousDrivers() {
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
