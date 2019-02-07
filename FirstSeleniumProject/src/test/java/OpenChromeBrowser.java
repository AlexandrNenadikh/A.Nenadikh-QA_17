import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OpenChromeBrowser {


    WebDriver wd;

    @BeforeClass
    public void setUp(){
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }
    @Test
    public void chromeBrowserTest(){
        wd.get("http://google.com");
//        wd.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Look, i am testing myself");
//        wd.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).click();
        //wd.findElement(By.name("q")).click();
        //wd.findElement(By.name("q")).sendKeys("Рефакторить");
        //wd.findElement(By.name("btnK")).click();
        wd.findElement(By.cssSelector("body")).click();
        wd.findElement(By.cssSelector("body")).sendKeys(Keys."t");

        //wd.get("http://vk.com");

    }
    @AfterClass
    public void tearDown() throws InterruptedException {
//        Thread.sleep(10500);
//        wd.quit();
    }
}
