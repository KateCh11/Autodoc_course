package lesson24;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static java.lang.Thread.sleep;
/*
1. Открыть https://rozetka.com.ua/
2. Перейти в раздел «Компьютеры и ноутбуки»
3. Перейти в раздел « Ноутбуки»
4. Вывести тайтлы всех товаров в консоль
5. Проверить, что на главной странице отобразилось 60 товаров
*/

public class TestFindElements extends WebDriverInit {

    @Test
    public void findElements() throws InterruptedException {
        //1. Открыть https://rozetka.com.ua/
        driver.get("https://rozetka.com.ua/");

        //2. Перейти в раздел «Компьютеры и ноутбуки»
        WebElement laptopsAndCompCategory = driver.findElement(
                By.xpath("//ul[contains(@class, 'menu-categories_type_main')]/li[1]"));
        laptopsAndCompCategory.click();

        //3. Перейти в раздел « Ноутбуки»
        sleep(5000);
        WebElement subCategory = driver.findElement(By.xpath("(//a[contains(@href, 'c80004/')])[1]"));
        subCategory.click();

        //4. Вывести тайтлы всех товаров в консоль
        sleep(5000);
        List<WebElement> listOfTitles = driver.findElements(By.xpath("//span[@class='goods-tile__title']"));

        for (WebElement element : listOfTitles) {
            String titleText = element.getText();
            System.out.println(titleText);
        }

        //5. Проверить, что на главной странице отобразилось 60 товаров
        Assert.assertEquals(listOfTitles.size(), 60, "Elements size on page does not equals ");

    }

}
