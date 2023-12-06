package homeworks.hw23;

/*
1. Открыть https://rozetka.com.ua/
2. Перейти в раздел «Компьютеры и ноутбуки»
3. Перейти в раздел « Ноутбуки»
4. Добавить первый товар в корзину
5. Проверить что в корзину добавился один товар (проверить в кружке на кнопке корзины)
6. Перейти в корзину и проверить, что добавился правильный товар (сравнить тайтлы)
*/


import init.WebDriverInitHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.sleep;

public class AddItemToTheBasket extends WebDriverInitHW {

    final String EXPECTED_TITLE = "Ноутбук Lenovo IdeaPad 3 15IAU7 (82RK00TWRA) Arctic Grey / 15.6\" IPS Full HD / Intel Core i5-1235U / RAM 16 ГБ / SSD 512 ГБ / Підсвічування клавіатури";

    @Test
    public void firstTest() {

        /*
        //1. Открыть https://rozetka.com.ua/
        driver.get("https://rozetka.com.ua/");

        //Resize current window to the set dimension
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2. Перейти в раздел «Компьютеры и ноутбуки» //click Comp and Laptop
        WebElement compAndLaptop = driver.findElement(
                By.xpath("//ul[contains(@class, 'menu-categories_type_main')]/li[1]"));
        compAndLaptop.click();


        //3. Перейти в раздел « Ноутбуки» //click Laptop
        WebElement sectionLaptop = driver.findElement(
                By.xpath("(//a[contains(@href, 'c80004/')])[1]"));
        sectionLaptop.click();


         */

        driver.get("https://rozetka.com.ua/ua/notebooks/c80004/");

        //Resize current window to the set dimension
        driver.manage().window().maximize();

        sleep(15000);


        //Запомнить title первого товара
        WebElement titleOfFirstProduct = driver.findElement(
                By.xpath("(//span[@class='goods-tile__title'])[1]"));
        String title = titleOfFirstProduct.getText().trim();

        //4. Добавить первый товар в корзину
        WebElement addToBasket = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(@class, 'buy-button')])[1]")));
        addToBasket.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //5. Проверить что в корзину добавился один товар (проверить в кружке на кнопке корзины)
        WebElement checkAddTobasket = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class, 'badge badge--green ng-star-inserted')]")));

        String basketValue = checkAddTobasket.getText().trim();
        int znachBasketValue = Integer.parseInt(basketValue);
        if (znachBasketValue == 1) {
            System.out.println("В корзину добавился один товар");
        } else {
            System.out.println("В корзину добавился НЕ один товар");
        }

        Assert.assertEquals(title, EXPECTED_TITLE, "Items are different. Titles does not the same.");
    }
}