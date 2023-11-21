package lesson25;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static java.lang.Thread.sleep;

public class TestWindowHendles extends WebDriverInit {

    @Test
    public void testIsSelected() throws InterruptedException {
        driver.get("https://rozetka.com.ua/ua/");
        //css locator: button.header__button:nth-child(2)

        WebElement loginBtn = driver.findElement(By.xpath("(//button[contains(@class, 'header__button')])[2]"));
        loginBtn.click();
        sleep(5000);

        WebElement registrationBtn = driver.findElement(By.xpath("//button[contains(@class, 'auth-modal__register-link ')]"));
        registrationBtn.click();
        sleep(5000);

        WebElement privatPolicyDocBtn = driver.findElement(By.xpath("(//p[@class='form__caption'])[2]/a[2]"));
        privatPolicyDocBtn.click();
        sleep(5000);

        Set<String> handles = driver.getWindowHandles();

        List<String> listHandles = new ArrayList<>(handles);

        driver.switchTo().window(listHandles.get(0));
        sleep(5000);

        driver.switchTo().window(listHandles.get(1));
        sleep(5000);

    }
}
