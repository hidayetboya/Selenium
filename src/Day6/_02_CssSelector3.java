package Day6;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Go to "https://formsmarts.com/form/yu?mode=h5"
 * Select Business
 * Click on Discover XYZ and select Advertising
 * Select Every Day
 * Select Good
 * Click on XYZ and select the 3rd option
 *
 *Use Css Selector only
 *
 * **/
public class _02_CssSelector3 extends BaseDriver {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://formsmarts.com/form/yu?mode=h5");
        driver.manage().window().maximize();

        MyMethods.myWait(1);
        WebElement selectBusiness = driver.findElement(By.cssSelector("fieldset[id=\"u_yQt_4586\"]  span[class=\"label-body\"]"));
        selectBusiness.click();

        MyMethods.myWait(1);
        WebElement selectAnOption = driver.findElement(By.cssSelector("div[id=\"section_1\"] select[id=\"u_yQt_4588\"]"));
        selectAnOption.click();

        MyMethods.myWait(1);
        WebElement selectAdvertising = driver.findElement(By.cssSelector("div[id=\"section_1\"] select[id=\"u_yQt_4588\"]>:nth-child(4)"));
        selectAdvertising.click();

        MyMethods.myWait(1);
        WebElement selectEveryDay = driver.findElement(By.cssSelector("fieldset[id=\"u_yQt_89585\"] span[class=\"label-body\"]"));
        selectEveryDay.click();

        MyMethods.myWait(1);
        WebElement selectGood = driver.findElement(By.cssSelector("fieldset[id='u_yQt_4589'] span[class='label-body'] "));
        selectGood.click();

        MyMethods.myWait(1);
        WebElement xyz = driver.findElement(By.cssSelector("fieldset[id=\"u_yQt_4589\"]+label+select"));
        xyz.click();

        MyMethods.myWait(1);
        WebElement xyz3option = driver.findElement(By.cssSelector("fieldset[id=\"u_yQt_4589\"]+label+select :nth-child(3)"));
        xyz3option.click();

        waitAndQuit();

    }
}
