import org.testng.annotations.Test;

public class LoginTest extends  TestBase {

    @Test
    public  void testLogIn(){
        applicationManager.clickOnLoginButton();
        applicationManager.fillLoginForm();
        applicationManager.confirmLogin();
    }


}


