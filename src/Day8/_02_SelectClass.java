package Day8;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class _02_SelectClass extends BaseDriver {
    @Test
    public void test1() {
        driver.get("https://formsmarts.com/form/yu?mode=h5");
        WebElement discoverXVY = driver.findElement(By.xpath("//select[@id='u_CnW_14598']"));

        // If the element above has select tag we can handle it by Select Class
        Select drpDwnMenu = new Select(discoverXVY);
        MyMethods.myWait(3);
        //drpDwnMenu.selectByVisibleText("Search Engine");  Selects by the displayed text of the options
        drpDwnMenu.selectByIndex(3);                      //Selects by the index of the options
        //drpDwnMenu.selectByValue("Online Advertising");     // Selects by the value attribute of the options


        List<WebElement> optionsList = drpDwnMenu.getOptions(); // returns list of options in the Select tag
        System.out.println("optionsList.size() = " + optionsList.size());

        for (WebElement op : optionsList) {
            System.out.println("op.getText() = " + op.getText());
            System.out.println("op.getAttribute(\"value\") = " + op.getAttribute("value"));
        }

        int index = (int) (Math.random() * optionsList.size()-1)+1;
        if (!optionsList.get(index).getText().equals("Select an option"))
            drpDwnMenu.selectByIndex(index);



    }
}