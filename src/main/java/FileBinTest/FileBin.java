package FileBinTest;

import BuildTools.BasePage;
import BuildTools.Report;
import BuildTools.Singleton;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileBin  extends BasePage {
    public static void fileBinTest() throws Exception {
        try {
            Singleton.getDriverInstance().navigate().to("https://filebin.net/");
            WebElement fileUpload = Singleton.getDriverInstance().findElement(By.id("fileField"));
            fileUpload.sendKeys("C:\\Users\\Omer Brosh\\IdeaProjects\\JobTest\\src\\main\\java\\FileBinTest\\baby-groot-guardians.0.jpg");
            Thread.sleep(4000);
            clickElement(By.id("dropdownFileMenuButton"));
            clickElement(By.cssSelector("body > table > tbody > tr > td:nth-child(5) > div > div > a:nth-child(2)"));
            String size = Singleton.getDriverInstance().findElement(By.cssSelector("#modalFileProperties-0 > div > div > div.modal-body > dl > dd:nth-child(6)")).getText();
            System.out.println(size);
            Report.test.log(Status.PASS, "File Bin Test Pass :) ");
            Thread.sleep(2000);
            Report.TakePicture();

        }catch (Exception e){
            Report.test.log(Status.FAIL , "File Bin Test Fail :(");
        }
    }
}
