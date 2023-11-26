package lesson26;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class TestSelectExample extends WebDriverInit {

    @Test
    public void testSelect() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        //driver.manage().window().maximize();
        WebElement dropDown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropDown);

        //взаимодействуем с опшинами
        select.selectByValue("1");
        sleep(5000);
        select.selectByIndex(2);
        sleep(5000);

    }
}
