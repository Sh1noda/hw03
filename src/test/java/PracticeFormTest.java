import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "2560x1440";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest() {

        open("/automation-practice-form");
        $("#firstName").setValue("Egor");
        $("#lastName").setValue("Ivanov");
        $("#userEmail").setValue("Ivanov@gmail.com");
        $("#genterWrapper").$(new ByText("Male")).click();
        $("#userNumber").setValue("0123456789");

    }
}
