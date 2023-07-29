package Day9;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _07_ActionsDragAndDropBy extends BaseDriver {
    @Test
    public void test1() {
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");

        WebElement leftScroll = driver.findElement(By.cssSelector("span[class='ui-slider-handle ui-state-default ui-corner-all'][style='left: 20%;']"));

        Actions actions = new Actions(driver);

        MyMethods.myWait(3);
        Action action = actions.dragAndDropBy(leftScroll, -50, 0).build();

        //
        action.perform();
        MyMethods.myWait(3);

        action = actions.dragAndDropBy(leftScroll, 300, 0).build();

        action.perform();

    }
}
