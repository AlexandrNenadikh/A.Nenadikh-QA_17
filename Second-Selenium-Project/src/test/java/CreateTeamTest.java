import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateTeamTest extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        if (!app.isUserLoggedIn()) {
            app.login();
        }
    }

    @Test
    public void teamCreationFromLeftNavMenu(){
        app.clickOnCreateTeamButtonOnNavMenu();
        app.fillTeamCreationForm("new Team Not_Lena", "hgjhgjhgjgjg");
        app.submitTeamCreationForm();


    }

}
