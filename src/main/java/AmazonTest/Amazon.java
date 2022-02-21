package AmazonTest;

import BuildTools.BasePage;
import BuildTools.Report;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;

public class Amazon extends BasePage {


    public static void amazonTest() throws Exception {
        try {


            Thread.sleep(4000);
            sendKeysToElement(By.id("twotabsearchtextbox"), "laptop");
            clickElement(By.id("nav-search-submit-button"));
            clickElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
            Report.test.log(Status.PASS, "Amazon Test Pass :)");
            Report.TakePicture();
        } catch (Exception e) {
            Report.test.log(Status.FAIL, "Amazon Test Fail:(");

        }
    }

}
