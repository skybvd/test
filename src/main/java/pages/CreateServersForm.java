package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CreateServersForm {

    // Dallas
    public static void setLocationServer(){
        $("radio-selector[data-role='vm-configuration:region-selector']").$("radio-selector-item:nth-child(4)").click();
    }

    // Debian 9 (64 bit)
    public static void setImage(){
        $("radio-selector[data-role='image-selector']").$("radio-selector-item:nth-child(4)").scrollTo().click();
    }

    //SSD.50
    //2 VCPUs, 2048 MB RAM, 50 GB SSD
    //3072GB free traffic 0.01/GB overuse
    public static void setConfiguration(){
        $("radio-selector[data-role='flavor-selector']").$("radio-selector-item:nth-child(2)").scrollTo().click();
    }

    //Password
    public static void setAuthenticationMetod(){
        $("radio-selector[data-role='authentication-method-selector']").$("radio-selector-item:nth-child(2)").scrollTo().click();
    }

    public static void setNameServer(String name){
        $("input-field").$(By.name("name")).scrollTo().setValue(name);
    }

    public static void clickSubmit(){
        $(".server-configuration-totals").$("sv-submit").click();
    }

    public static void checkAddCard(String text){
        $(".panel-heading").shouldHave(Condition.text(text));
    }

}

