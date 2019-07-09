package tests;

import org.junit.Before;
import org.junit.Test;
import utils.BaseTest;

import static com.codeborne.selenide.Selenide.open;
import static pages.DashboardPage.*;
import static pages.Login_LogoutPage.*;


public class Login_LogoutTest extends BaseTest {

    @Before
    public void beforeClass(){
        open("https://portal.servers.com/");

    }

    @Test
    public void login_Logout() {

        insertEmail("ylf16266@bcaoo.com");
        insertPassword("9866dffd33e1");
        clickSignIn();
        clickLoginButton();
        clickLogout();

        checkLoginPageHeader("Dear user, log in to access the Self Service Panel.");

    }

}
