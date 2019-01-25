
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Homework_p2 {

    WebDriver wd;


    @BeforeClass
    public void setUp() {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wd.manage().window().maximize();

    }

    @Test

    public void addToWatchList(){
        openSite("https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Main+Page");
        getFillForm("wpName1", "QA17");
        getFillForm("wpPassword1", "qwerty123");
        clickElement("wpLoginAttempt");
        selectSearchTab("searchInput");
        getFillForm("searchInput", "Game of Thrones");
        clickElement("searchButton");
        clickOnButton("#ca-watch > span:nth-child(1) > a:nth-child(1)");


    }

    public void clickElement(String wpLoginAttempt) {
        wd.findElement(By.id(wpLoginAttempt)).click();
    }

    public void clickOnButton(String cssSelector) {
        wd.findElement(By.cssSelector(cssSelector)).click();
    }

    public void getFillForm(String searchInput, String sendKeys) {
        wd.findElement(By.id(searchInput)).sendKeys(sendKeys);
    }

    public void selectSearchTab(String searchInput) {
        clickElement(searchInput);
    }

//    public void confirmLogin(String login) {
//        selectSearchTab(login);
//
//    }
//
//    public void clickOnLoginButton(String xpathExpression) {
//        wd.findElement(By.xpath(xpathExpression)).click();

//    }

    public void openSite(String url) {

        wd.get(url);
    }


    @AfterClass
    public void tearDown() {
//     Thread.sleep(10500);
//        wd.quit();
    }

}