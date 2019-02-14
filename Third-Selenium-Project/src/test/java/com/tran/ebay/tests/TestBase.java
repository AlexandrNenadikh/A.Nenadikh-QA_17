package com.tran.ebay.tests;

import com.tran.ebay.app.ApplicationManager;
import org.testng.annotations.*;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager();

    @BeforeClass
    public void setUp(){
        app.init();

    }

    @AfterClass
    public void tearDown(){
        app.stop();
    }

}