package homeWork.hw27;

import init.WebDriverInit;
import org.testng.annotations.Test;
import pattern.pageObject.selenium.MainPage;

public class AddItemIntoTheCartPageObject extends WebDriverInit {
    /*
    ДЗ. Тест проверки добавления товара в корзину с использованием Page Object
    1.Открыть https://rozetka.com.ua/
    2.Перейти в раздел «Компьютеры и ноутбуки»
    3.Перейти в раздел «Ноутбуки»
    4.Добавить первый товар в корзину
    5.Проверить что в корзину добавился один товар
    6.Перейти в корзину и проверить, что добавился правильный товар
    */

    @Test
    public void addItemTest() throws InterruptedException {

        new MainPage(driver).open()
                .clickCompAndLaptopCategory()
                .clickLaptopCategory()
                .addToBasket()
                .checkingCartI()
                .checkingTitleI();
    }

}
