package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {

    public static void checkLogin(String login) {
        $("div[class*='CurrentUserWidget']").shouldHave(Condition.text(login));
    }

    public static void clickLoginButton() {
        $("div[class*='CurrentUserWidget']").click();
    }

    public static void clickLogout(){
        $("div[class*='CurrentUserWidget']").$("a[href='/logout']").click();
    }

    public static void clickProfile(){
        $("div[class*='CurrentUserWidget']").$("a[href='#/profile/info']").click();
    }

    public static void clickMenuItemCS(){
        $("ul[class*='MainMenu']").$("li:nth-child(2) > span").shouldHave(Condition.text("Cloud Servers")).click();
    }

    public static void clickCreateAndManage(){
        $("a[href='#/cloud/computing/servers']").shouldHave(Condition.text("Create & Manage")).click();
    }

    public static void clickCreateServer(){
        $(By.xpath(".//a[2]/span[contains(text(), 'Create server')]")).click();
    }

}