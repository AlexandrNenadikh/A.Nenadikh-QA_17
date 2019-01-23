import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.testng.annotations.AfterClass;
        import org.testng.annotations.BeforeClass;
        import org.testng.annotations.Test;

        import java.util.concurrent.TimeUnit;

public class Homework {


    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }
    @Test
    public void testeBaySearch(){
        wd.get("https://www.wikipedia.org/");
        wd.findElement(By.id("js-link-box-en")).click();
        wd.findElement(By.id("pt-login")).click();
        wd.findElement(By.name("wpPassword")).click();
        wd.findElement(By.name("wpPassword")).sendKeys("qwerty123");
        wd.findElement(By.name("wpName")).click();
        wd.findElement(By.name("wpName")).sendKeys("QA17");
        wd.findElement(By.id("wpLoginAttempt")).click();

    }
    @AfterClass
    public void tearDown(){
//        Thread.sleep(10500);
//      wd.quit();
    }
}