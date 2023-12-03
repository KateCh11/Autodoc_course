package lesson27;

import init.WebDriverInit;
import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.Test;
import pattern.pageObject.selenium.MainPage;

public class FirstPageObjectTest extends WebDriverInit {

    final String EXPECTED_TITTLE = "Ноутбук Apple MacBook Air 13\" M1 8/256GB 2020 (MGN63) Space Gray";
    final String URL = "https://rozetka.com.ua/";

    final String cook = "gAgdWvYFd4P1e8v0fo56rv.8Ku6CXgZBrrBxFJBxBr8-1701381748-0-1-ed022f04.3bb916bb.ba0370e4-0.2.1701381748";


    @Test
    public void firstTest() throws InterruptedException {
        driver.get(URL);
        ///
        Cookie cookie = new Cookie("cf_clearance", cook);
        driver.manage().deleteCookieNamed("cf_clearance");
        driver.manage().addCookie(cookie);
        driver.navigate().refresh();
        ////

        String actualTittle = new MainPage(driver).typeTextInInputSearch("Mac").clickBtnSearch()
                .clickOnProductTittleByIndex(0)
                .getTittleText();
        Assert.assertEquals(actualTittle, EXPECTED_TITTLE);
    }
}
