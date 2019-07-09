package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Login_LogoutPage {

    public static void insertEmail(String email){
        $(By.name("email")).setValue(email);
    }

    public static void insertPassword(String password){
        $(By.name("pwd")).setValue(password);
    }

    public static void clickSignIn(){
        $("button[type='submit']").click();
    }

    public static void checkLoginPageHeader(String header_text){
        $(".login-header").shouldHave(Condition.text(header_text));
    }
}
