package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import tests.TestBase;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    SessionHelper sessionHelper;
    BoardHelper boardHelper;
    TeamHelper teamHelper;
    EventFiringWebDriver wd;
    private String browser;

    public ApplicationManager(String browser) {

        this.browser = browser;
    }

    public void start() {
        wd= new EventFiringWebDriver(new ChromeDriver());
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        openSite("https://trello.com");
        sessionHelper = new SessionHelper(wd);
        boardHelper = new BoardHelper(wd);
        teamHelper = new TeamHelper(wd);

        wd.register (new TestBase.MyListener());
    }

    public void stop() {
        //wd.quit();
    }

    public void openSite(String url) {
        wd.get(url);
    }


    public void returnToPreviousPage() {
        wd.navigate().back();
    }

    public void clickOnPlusButtonOnHeader() {
        boardHelper.click(By.cssSelector("div.header-user .icon-add"));
    }

    public BoardHelper getBoardHelper() {
        return boardHelper;
    }

    public TeamHelper getTeamHelper() {
        return teamHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }
}