package com.tran.ebay.app;

import com.tran.ebay.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends  HelperBase{
    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public void confirmLogin() {
        click(By.id("sgnBt"));
    }

    public void fillLoginForm(User user) {
        type(By.name("userid"), user.getUser());
        type(By.id("pass"), user.getPwd());
    }

    public void initLogit() {
        click(By.linkText("Sign in"));
    }

}