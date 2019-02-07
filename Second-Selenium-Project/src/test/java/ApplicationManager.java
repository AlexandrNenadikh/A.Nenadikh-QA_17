import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {


    WebDriver wd;

    public void start() {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        openSite("https://trello.com/en");
    }

    public void stop() {
        wd.quit();
    }

    protected void clickOnLoginButton() {

        //click(By.xpath("/html/body/div[1]/div/div[2]/a[1]"));
        click(By.cssSelector("body > div.global-header.mod-trello-blue.mod-dark-background.u-clearfix > div > div.global-header-section.mod-right > a.header-button-secondary"));
    }

    protected void confirmLogin() {
        click(By.cssSelector("#login"));


    }

    protected void fillLoginForm() {
        type(By.cssSelector("input[type=email]"), "elena.telran@yahoo.com");

        type(By.cssSelector("input[type=password]"), "12345.com");


        wd.findElement(By.cssSelector("input[type=password]")).click();
        wd.findElement(By.cssSelector("input[type=password]")).clear();
        wd.findElement(By.cssSelector("input[type=password]")).sendKeys("12345.com");
    }

    private void type(By locator, String text) {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void openSite(String url) {
        wd.get(url);
    }

    public void login() {
        clickOnLoginButton();
        fillLoginForm();
        confirmLogin();
        wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/a")).click();
    }

    public boolean isUserLoggedIn() {
        return isElementPresent(By.cssSelector("img.member-avatar"));

    }

    private boolean isElementPresent(By by) {
        try {
            wd.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    protected void clickOnAvatar() {
        click(By.xpath("//*[@id=\"header\"]/div[5]/a[4]/span/img"));
    }

    private void click(By locator) {
        wd.findElement(locator).click();
    }

    protected void clickOnLogOutButton() {
        click(By.cssSelector("a.js-logout"));
    }

    public void clickOnCreateTeamButtonOnNavMenu() {
        click(By.cssSelector("[data-test-id='home-navigation-create-team-button']"));
    }

    public void fillTeamCreationForm(String teamName, String description) {
        type(By.id("org-display-name"), teamName);
        type(By.id("org-desc"), description);
    }

    public void submitTeamCreationForm() {
        click(By.xpath("//*[@value='Create']"));
    }
}
