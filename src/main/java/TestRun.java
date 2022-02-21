import AmazonTest.Amazon;
import BuildTools.Report;
import BuildTools.Singleton;
import FileBinTest.FileBin;
import GoogleTest.Google;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestRun {
    @BeforeClass
    public static void beforeAll () throws Exception {
        Singleton.getDriverInstance();
        Singleton.getUrl();
    }
   @Test
    public static void test1 () throws Exception {

        Amazon.amazonTest();

   }
   @Test
   public static void test2 () throws Exception {
       Google.googleTest();
   }
   @Test
   public static void test3() throws Exception {
       FileBin.fileBinTest();
   }
   @AfterClass
    public static void end () throws Exception {
       Report.extent.flush();
       Singleton.getDriverInstance().close();
   }
}
