package homeworks.hw25;

import init.WebDriverInitHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

/*
1.Открыть браузер и ввести URL: https://rozetka.com.ua/.
2.Нажать на кнопку “Логин“.
3.В открывшемся попапе нажать на кнопку “Зарегистрироваться“.
4.Нажать на пользовательское соглашение (гиперссылка).
5.После нажатия на пользовательское соглашение, удостовериться, что тайтл в открывшейся вкладке имеет следующий текст:
“Угода користувача | ROZETKA”.
6.Проверить, что на странице присутствует текст “Как удалить аккаунт?” и он отображается на странице.

в тесте должно быть 3 ассерта*/

public class TermsOfUse extends WebDriverInitHW {

    final String EXPECTED_TITLE = "Угода користувача | ROZETKA";

    final String EXPECTED_TITLE_2 = "КОНТАКТ З ОН-ЛАЙН ПЛАТФОРМО";

    @Test
    public void testTermsOfUse() throws InterruptedException {
        openBrowser();
        clickLoginBtn();
        clickRegistrationBtn();
        clickPrivatPolicyDocBtn();
        checkTitle();
        checkTextPresents();
    }

    public void openBrowser() {
        //1.Открыть браузер и ввести URL: https://rozetka.com.ua/.
        driver.get("https://rozetka.com.ua/ua/");
        driver.manage().window().maximize();
    }

    public void clickLoginBtn() {
        //2.Нажать на кнопку “Логин“.
        WebElement loginBtn = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(@class, 'header__button')])[2]")));
        loginBtn.click();
    }

    public void clickRegistrationBtn() {
        //3.В открывшемся попапе нажать на кнопку “Зарегистрироваться“.
        WebElement registrationBtn = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'auth-modal__register-link ')]")));
        registrationBtn.click();
    }

    public void clickPrivatPolicyDocBtn() throws InterruptedException {
        //4.Нажать на пользовательское соглашение (гиперссылка).
        WebElement privatPolicyDocBtn = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//p[@class='form__caption'])[2]/a[2]")));
        privatPolicyDocBtn.click();
    }

    public void checkTitle() {
        driver.get("https://rozetka.com.ua/ua/pages/legal_terms/");
        driver.manage().window().maximize();

        //5.После нажатия на пользовательское соглашение, удостовериться, что тайтл в открывшейся вкладке имеет следующий текст:
        //“Угода користувача | ROZETKA”.
        String pageTitleStr = driver.getTitle();
        Assert.assertEquals(pageTitleStr, EXPECTED_TITLE, "Titles are different.");
    }

    public void checkTextPresents() {
        //driver.get("https://rozetka.com.ua/ua/pages/legal_terms/");
        //driver.manage().window().maximize();

        //6.Проверить, что на странице присутствует текст “Как удалить аккаунт?” и он отображается на странице.
        WebElement chapterContactWithOnlaine = driver.findElement(By.xpath("//div[@class='rz-text']/h3"));
        Assert.assertTrue(chapterContactWithOnlaine.isDisplayed(), "Element does not displayed");

        String titleChapter = chapterContactWithOnlaine.getText().trim();
        System.out.println(titleChapter);

        Assert.assertEquals(titleChapter, EXPECTED_TITLE_2, "Titles are different.");
    }

}
