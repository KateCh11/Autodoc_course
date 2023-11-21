package lesson25;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class TestIsSelected extends WebDriverInit {

    @Test
    public void testIsSelected() throws InterruptedException {
        driver.get("https://rozetka.com.ua/ua/");
        //css locator: button.header__button:nth-child(2)
        WebElement loginBtn = driver.findElement(By.xpath("(//button[contains(@class, 'header__button')])[2]"));
        loginBtn.click();

        WebElement rememberCheckboxInput = driver.findElement(By.id("remember_me"));
        WebElement rememberCheckbox = driver.findElement(By.xpath("//label[@class='auth-modal__remember-checkbox']"));

        System.out.println(rememberCheckboxInput.isSelected());

        rememberCheckbox.click();

        System.out.println(rememberCheckboxInput.isSelected());

        sleep(5000);

    }
}
