package com.tran.ebay.tests;

import com.tran.ebay.model.User;
import org.testng.annotations.Test;

public class EbayLoginTest extends TestBase {

    @Test
    public  void loginTest(){

        app.getUser().initLogit();
        app.getUser().fillLoginForm(new User()
                .setUser("username")
                .setPwd("dddd111"));
        app.getUser().confirmLogin();
    }

}