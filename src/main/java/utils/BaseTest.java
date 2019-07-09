package utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BaseTest {

    @BeforeClass
    public static void setup() {

        Configuration.browser = "chrome";
        Configuration.startMaximized = true;

    }

    @AfterClass
    public static void tearDown() {
        Selenide.close();
    }
}
