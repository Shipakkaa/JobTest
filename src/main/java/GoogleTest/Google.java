package GoogleTest;

import BuildTools.BasePage;
import BuildTools.Report;
import BuildTools.Singleton;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;

import java.awt.*;
import java.awt.event.KeyEvent;


public class Google extends BasePage {



    public static void googleTest() throws Exception {
        try {


            Robot robot = new Robot();
            Singleton.getDriverInstance().navigate().to("https://www.google.com/");
            sendKeysToElement(By.className("gLFyf"), "5 USD to ILS");
//        clickElement(By.className("gNO89b"));
            robot.keyPress(KeyEvent.VK_ENTER);

            String amount = Singleton.getDriverInstance().findElement(By.cssSelector("#knowledge-currency__updatable-data-column > div.b1hJbf > div.dDoNo.ikb4Bb.gsrt > span.DFlfde.SwHCTb")).getText();
            String name = Singleton.getDriverInstance().findElement(By.className("MWvIVe")).getText();
            System.out.println(amount + name);

            Report.test.log(Status.PASS, "Google Test Pass :)");
            Report.TakePicture();
        }catch (Exception e ){
            Report.test.log(Status.FAIL , "Google Test Fail :(");
        }
    }
}
