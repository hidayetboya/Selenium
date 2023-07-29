package Day13;

import Utilities.BaseDriver;
import Utilities.MyMethods;
import org.junit.Test;
import org.openqa.selenium.Dimension;

import java.awt.*;

public class _02_WindowDimensions extends BaseDriver {
    @Test
    public void WindowDimensions(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Dimension dimension = new Dimension(412,915);
        MyMethods.myWait(2);
        driver.manage().window().setSize(dimension);
        waitAndQuit();
    }
}
