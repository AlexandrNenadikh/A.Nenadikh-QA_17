package com.tran.ebay.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private com.tran.ebay.app.ItemHelper item;
    private  UserHelper user;
    WebDriver wd;

    public void init() {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        openSite("https://www.ebay.com/");
        item = new ItemHelper(wd);
        user = new UserHelper(wd);
    }


    public void openSite(String url) {
        wd.get(url);
    }

    public void stop() {
        wd.quit();
    }

    public void clickOnLogo() {
        item.click(By.id("gh-logo"));
    }

    public ItemHelper getItem() {
        return item;
    }

    public UserHelper getUser() {
        return user;
    }
}