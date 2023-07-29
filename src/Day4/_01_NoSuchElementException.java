package Day4;

import Utilities.MyMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_NoSuchElementException {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement firstnameInput = driver.findElement(By.id("first_8"));
        firstnameInput.sendKeys("Elvira");

        WebElement lastnameInput = driver.findElement(By.id("last_8"));
        lastnameInput.sendKeys("Nazir");


        try {
            WebElement wrongLOcator = driver.findElement(By.id("Wrong Id")); //If the location is wrong or there is no
                                                                              // element with that locator Selenium throws
                                                                              // NoSuchElement Exception

        } catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }

//        MyMethods.myWait(3);
//        firstnameInput.clear();
//        MyMethods.myWait(3);
//        lastnameInput.clear();

        WebElement firstNameLabel = driver.findElement(By.id("sublabel_8_first"));
        WebElement submitButton = driver.findElement(By.id("input_2)"));
        submitButton.click();

        String firstNameText = firstNameLabel.getText();
        System.out.println(firstNameText);



        MyMethods.myWait(3);
        driver.quit();
    }
}
