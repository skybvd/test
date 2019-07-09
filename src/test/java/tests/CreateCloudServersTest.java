package tests;

import org.junit.Before;
import org.junit.Test;
import utils.BaseTest;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static pages.CreateServersForm.*;
import static pages.DashboardPage.*;
import static pages.Login_LogoutPage.*;

public class CreateCloudServersTest extends BaseTest {

    @Before
    public void beforeClass(){
        open("https://portal.servers.com/");

    }

    @Test
    public void createCS() {

        insertEmail("ylf16266@bcaoo.com");
        insertPassword("9866dffd33e1");
        clickSignIn();
        clickMenuItemCS();
        clickCreateAndManage();
        clickCreateServer();
        setLocationServer();
        setImage();
        setConfiguration();
        setAuthenticationMetod();
        setNameServer("test");
        clickSubmit();
        checkAddCard("Add new card");
    }
}