package homeworks.hw24;

import init.WebDriverInitHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Thread.sleep;

/*
* Сохранение тайтлов товаров и цен в Маp и маппинг в txt
1.Перейти на https://rozetka.com.ua/
2.В сайд меню перейти в раздел Ноутбуки и компьютеры
3.Перейти в категорию Ноутбуки
4.На странице поисковой выдачи собрать все тайтлы(название товаров) и цены товаров. (60 штук)
5.Записать их в Map.
6.С помощью FileWriter записать данные с Map в файл rozetkaTest.txt
(Пример ОЖ результат: Ноутбук Acer Nitro 5 AN515-57-54K7 (NH.QESEU.003) Shale Black - 32 999)
*/
public class TitleAndPriceIntoMap extends WebDriverInitHW {
    @Test
    public void findElements() throws InterruptedException {
        //1. Открыть https://rozetka.com.ua/
        driver.get("https://rozetka.com.ua/");
        driver.manage().window().maximize();

        //2. Перейти в раздел «Компьютеры и ноутбуки»
        WebElement laptopsAndCompCategory = driver.findElement(
                By.xpath("//ul[contains(@class, 'menu-categories_type_main')]/li[1]"));
        laptopsAndCompCategory.click();

        //3. Перейти в раздел «Ноутбуки»
        sleep(5000);
        WebElement subCategory = driver.findElement(By.xpath("(//a[contains(@href, 'c80004/')])[1]"));
        subCategory.click();

        //4. На странице поисковой выдачи собрать все тайтлы(название товаров) и цены товаров. (60 штук)
        sleep(5000);

        Map<String, String> itemMap = new HashMap<>();

        //List of all items titles
        List<WebElement> listOfTitles = driver.findElements(By.xpath("//span[@class='goods-tile__title']"));

        //List of all items prices
        List<WebElement> listOfPrices = driver.findElements(By.xpath("//span[@class='goods-tile__price-value']"));

        //5. Записать их в Map. Fill Map
        for (int i = 0; i < listOfTitles.size(); i++) {
            String titleText = listOfTitles.get(i).getText();
            String priceText = listOfPrices.get(i).getText();
            String priceTruncated = priceText.substring(0, priceText.length() - 1); //delete sign '₴' at the end of line
            itemMap.put(titleText, priceTruncated);
        }

        //6.С помощью FileWriter записать данные с Map в файл rozetkaTest.txt
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("rozetkaTest.txt");
            for (Map.Entry<String, String> entry : itemMap.entrySet()) {
                String item = entry.getKey() + " - " + entry.getValue() + "\n";
                fileWriter.write(item);
            }
            System.out.println("File \"rozetkaTest.txt\" with data created successfully");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("File \"rozetkaTest.txt\" does not created. Something went wrong!");
        }

    }
}
