import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogoutTest extends TestBase {
    @BeforeMethod
    public void ensurePreconditions() {
        if (!applicationManager.isUserLoggedIn()) {
            applicationManager.login();
        }
    }
//  public  void  ensurePreconditions(){
//    if(isUserLoggedIn()){
//
//    } else login();
//  }

    @Test
    public void testLogout() {
        applicationManager.clickOnAvatar();
        applicationManager.clickOnLogOutButton();

        Assert.assertFalse(applicationManager.isUserLoggedIn());
    }

}


