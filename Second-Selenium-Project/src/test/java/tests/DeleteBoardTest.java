package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteBoardTest extends TestBase{
    @BeforeMethod
    public void ensurePreconditions() {
        if (!app.getSessionHelper().isUserLoggedIn()) {
            app.getSessionHelper().login();
        }
    }

    @Test
    public void boardDelete(){
        int before = app.getBoardHelper().BoardName();

        app.getBoardHelper().selectBoard2Deleting();
        app.getBoardHelper().selectDeleteOptionFromMenu();

        int after = app.getBoardHelper().BoardName();

       Assert.assertEquals(after, before-1);

    }
}