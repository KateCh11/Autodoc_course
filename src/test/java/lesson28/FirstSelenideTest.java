package lesson28;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class FirstSelenideTest {
    final String cook = "4W777AUaQVDpXYm1QByXIImy0__gmpCwne_iDWbhj90-1701707435-0-1-ed022f04.656b3c7c.ba0370e4-0.2.1701707435";

    @BeforeMethod
    public void before() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-features=AutomationControlled");
        //Configuration.startMaximized = true;
        Configuration.browserSize = "1280x720";
        Configuration.browserPosition = "8x8";
        Configuration.timeout = 10000;
        Configuration.pageLoadTimeout = 10000;
        Configuration.browserCapabilities = options;
    }

    @Test
    public void testSelenide() {
        Cookie cookie = new Cookie("cf_clearance", cook);
        WebDriverRunner.getWebDriver().manage().deleteCookieNamed("cf_clearance");
        WebDriverRunner.getWebDriver().manage().addCookie(cookie);

        open("https://rozetka.com.ua/ua/");

        $(By.name("search")).setValue("Mac").pressEnter();
        sleep(5000);
    }


}
