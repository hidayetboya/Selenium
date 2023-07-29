package Day7;

import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Collections;
import java.util.List;

/**
 * Go to "https://www.saucedemo.com/"
 * Login
 * Click on Sauce Labs Backpack and add it to cart
 * Go back
 * Click on Sauce Labs Bolt T-Shirt and add it to cart
 * Go back
 * Click on Cart
 * Click on Check Out
 * Verify that total amount is equal to the sum of the products in the cart
 *
 * **/
public class _02_XpathExample {

    @Test
            public void test1() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();

        MyMethods.myWait(1);

        WebElement SauceLabsBackpack = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        SauceLabsBackpack.click();

        MyMethods.myWait(1);

        WebElement addSauceLabsBackpack = driver.findElement(By.xpath("//button[text()='Add to cart']"));
        addSauceLabsBackpack.click();

        MyMethods.myWait(1);

        driver.navigate().back();
        MyMethods.myWait(1);

        WebElement SauceLabsBoltTshirt = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        SauceLabsBoltTshirt.click();

        MyMethods.myWait(1);

        WebElement addSauceLabsBoltTshirt = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        addSauceLabsBoltTshirt.click();

        MyMethods.myWait(1);
        driver.navigate().back();
        MyMethods.myWait(1);

        WebElement shoppingCart = driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a[@class='shopping_cart_link']"));
        shoppingCart.click();


        WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkout.click();

        MyMethods.myWait(1);

        WebElement firstName = driver.findElement(By.xpath("//input[@id='first-name']"));
       firstName.sendKeys("elvira");

        WebElement lastName = driver.findElement(By.xpath("//input[@id='last-name']"));
        lastName.sendKeys("nazir");

        WebElement zip = driver.findElement(By.xpath("//input[@id='postal-code']"));
        zip.sendKeys("30004");

        MyMethods.myWait(1);

        WebElement continueButton = driver.findElement(By.xpath("//input[@id='continue']"));
        continueButton.click();

        List<WebElement> productList = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        double total = 0;
        for (WebElement p: productList){

            total+=Double.parseDouble(p.getText().substring(1));
        }
        System.out.println(total);


        WebElement subTotal = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        double subtotaldouble =Double.parseDouble(subTotal.getText().replaceAll("[^0-9,.]", ""));

        Assert.assertTrue("Test Faild",subtotaldouble==total);





        MyMethods.myWait(3);
        driver.quit();

    }

}
