package Day5;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_Cssselector extends BaseDriver {
    public static void main(String[] args) {
        /**
         * Go to "https://demo.seleniumeasy.com/basic-first-form-demo.html
         * Type your message into the input box
         * Click on Show Message button
         * Check if the message shown next to Your Message and the message you sent are the same
         * **/
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
        WebElement messageInput = driver.findElement(By.cssSelector("input[class='form-control'][placeholder='Please enter your Message']"));
        messageInput.sendKeys("Hello Batch 8");

        WebElement sendMessageButton = driver.findElement(By.cssSelector("[class='btn btn-primary'][type='button'][onclick='showInput();']"));
        sendMessageButton.click();

        WebElement messageDisplay = driver.findElement(By.cssSelector("span[id='display']"));
        String displayedText = messageDisplay.getText();
       if (displayedText.equals("Hello Batch 8")){
           System.out.println("Test passed");
       }else {
           System.out.println("Test faild");
       }
    }
}
