import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OpenFirefoxBrowser {


    WebDriver wd;

    @BeforeMethod
    public void setUp(){
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    @Test
    public void testeBaySearch(){
        openSite();
        type();
        clickSearchButton();

    }

    @Test
    public void testeBayFilter() {
        openSite();
        type();
        clickSearchButton();
        filterItems();

    }

    public void filterItems() {
        wd.findElement(By.linkText("Auction")).click();
    }


    public void clickSearchButton() {
    wd.findElement(By.id("gh-btn")).click();
}

    public void type() {
        wd.findElement(By.name("_nkw")).click();
        wd.findElement(By.name("_nkw")).clear();
        wd.findElement(By.name("_nkw")).sendKeys("glasses");
    }

    public void openSite() {
        wd.get("https://www.ebay.com/");
    }

    @AfterClass
    public void tearDown(){
//        Thread.sleep(10500);
//      wd.quit();
    }
}