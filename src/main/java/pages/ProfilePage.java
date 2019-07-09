package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {

    public static void clickEditAccountButton(){
        $(".panel-options").click();
    }

    public static void checkAccountDialogOpen(){
        $(".modal-dialog").should(Condition.visible);
    }

    public static void checkAccountDialogTitle(String title){
        $(".modal-title").shouldBe(Condition.visible, Condition.text(title));
    }

    public static void selectAccountType(String type){
        $(".form-group").$("label:nth-child(2) > input").click();
    }

    public static void insertInputField(String fieldName, String value){
        $(By.name(fieldName)).setValue(value);
    }

    public static void selectCountry(String country){
        $("div[data-role='billing_address_country-field']").click();
        $("ul[id*='ui-select-choices']").$(By.xpath(".//div[contains(text(), "+country+")]")).click();
    }

    public static void clickSaveButton(){
        $(By.xpath("//button[contains(text(), 'Save')]")).click();
    }

}