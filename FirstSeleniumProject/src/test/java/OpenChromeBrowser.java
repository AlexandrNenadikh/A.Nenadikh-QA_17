import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OpenChromeBrowser {


    WebDriver wd;

    @BeforeClass
    public void setUp(){
    wd = new ChromeDriver();

    }
    @Test
    public void chromeBrowserTest(){
        wd.get("http://google.com");
        wd.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Look, i am testing myself");
        wd.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).click();
    }
    @AfterClass
    public void tearDown() throws InterruptedException {
//        Thread.sleep(10500);
//        wd.quit();
    }
}
