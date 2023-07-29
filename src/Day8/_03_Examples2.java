package Day8;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Go to https://www.facebook.com/
 * Click on Create New Account
 * Enter name, lastname and email
 * Verify that an input is displayed that says enter your email again
 * and it was not there at the beginning
 * Re-enter your email
 * Create a password
 * Select date of birth
 * Select Gender
 * And Verify it is selected
 **/
public class _03_Examples2 extends BaseDriver {
    @Test
    public void test1(){

        driver.get("https://www.facebook.com/");
        System.out.println("facebook url --> " + driver.getCurrentUrl());

        WebElement newAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
        newAccount.click();

        WebElement name= driver.findElement(By.cssSelector("input[id^='u_'][id*='_b_']"));
        name.sendKeys("elkekj");

        WebElement lastname= driver.findElement(By.cssSelector("input[id^='u_'][id*='_d_']"));
        lastname.sendKeys("kjldkfd");

        WebElement email= driver.findElement(By.cssSelector(" input[id^='u_'][id*='_g_']"));

        WebElement emailConf= driver.findElement(By.cssSelector(" input[id^='u_'][id*='_j_']"));
        Assert.assertFalse(emailConf.isDisplayed());
        System.out.println(emailConf.getText());

        email.sendKeys("asdd@gmail.com");
        Assert.assertTrue(emailConf.isDisplayed());
        System.out.println(emailConf.getText());
        emailConf.sendKeys("asdd@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-'][@id=\"password_step_input\"]"));
        password.sendKeys("kjhdA355434");

        WebElement month = driver.findElement(By.id("month"));
        Select selectmonth = new Select(month);
        List<WebElement> monthlist = selectmonth.getOptions();
        int index= (int) (Math.random() * monthlist.size());
        selectmonth.selectByIndex(index);
        MyMethods.myWait(2);

        WebElement day = driver.findElement(By.id("day"));
        Select selectday = new Select(month);
        List<WebElement> daylist = selectday.getOptions();
        int index1= (int) (Math.random() * daylist.size());
        selectmonth.selectByIndex(index1);
        MyMethods.myWait(2);

        WebElement year = driver.findElement(By.id("year"));
        Select selectyear = new Select(year);
        List<WebElement> yearlist = selectyear.getOptions();
        int index2= (int) (Math.random() * yearlist.size());
        selectyear.selectByIndex(index2);
        MyMethods.myWait(2);

        MyMethods.myWait(1);
        WebElement gender = driver.findElement(By.xpath("//input[@value='1']"));
        gender.click();

        Assert.assertTrue(gender.isSelected());

        MyMethods.myWait(1);
        driver.quit();



    }
}
