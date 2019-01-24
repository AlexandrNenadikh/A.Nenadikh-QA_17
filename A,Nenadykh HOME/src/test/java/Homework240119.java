import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Homework240119 {

    WebDriver wd;


    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wd.manage().window().maximize();

    }

    @Test
    public void testLogin() {
        openSite("https://trello.com");
        clickOnLoginButton("/html/body/div[1]/div[2]/a[1]");
        getFillForm("user", "password");
        confirmLogin("login");

    }

    public void getFillForm(String user, String password) {
        wd.findElement(By.id(user)).sendKeys("elena.telran@yahoo.com");
        wd.findElement(By.id(password)).sendKeys("12345.com");

    }

    public void confirmLogin(String login) {
        wd.findElement(By.id(login)).click();

    }

    public void clickOnLoginButton(String xpathExpression) {
        wd.findElement(By.xpath(xpathExpression)).click();

    }

    public void openSite(String url) {
        wd.get(url);
    }


    @AfterClass
    public void tearDown() {
//     Thread.sleep(10500);
//        wd.quit();
    }

}