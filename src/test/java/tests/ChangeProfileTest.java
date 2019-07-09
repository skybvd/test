package tests;

import org.junit.Before;
import org.junit.Test;
import utils.BaseTest;

import static com.codeborne.selenide.Selenide.open;
import static pages.DashboardPage.clickLoginButton;
import static pages.DashboardPage.clickProfile;
import static pages.Login_LogoutPage.*;
import static pages.ProfilePage.*;

public class ChangeProfileTest extends BaseTest {

    @Before
    public void beforeClass(){
        open("https://portal.servers.com/");

    }

    @Test
    public void changeProfile() {

        insertEmail("ylf16266@bcaoo.com");
        insertPassword("9866dffd33e1");
        clickSignIn();
        clickLoginButton();
        clickProfile();
        clickEditAccountButton();
        checkAccountDialogOpen();
        checkAccountDialogTitle("Please fill your account info");
        selectAccountType("Business");
        insertInputField("first_name","Test");
        insertInputField("last_name","Testov");
        insertInputField("phone_number", "+1 (234) 567-89-90");
        insertInputField("company_name", "Test_Company");
        selectCountry("Afghanistan");
        insertInputField("billing_address_city","Test_City");
        insertInputField("billing_address_state","Test_State");
        insertInputField("billing_address_zip","Test_Pc");
        insertInputField("billing_address_street", "Test_Street");
        clickSaveButton();

    }
}
