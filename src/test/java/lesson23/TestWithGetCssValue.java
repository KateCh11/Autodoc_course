package lesson23;

import init.WebDriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;

public class TestWithGetCssValue extends WebDriverInit {
    //final String EXPECTED_TITLE = "Ноутбук Apple MacBook Air 13\" M1 8/256GB 2020 (MGN63) Space Gray";

    final String EXPECTED_LABEL_COLOR = "rgba(0, 160, 70, 1)";

    @Test
    public void firstTest() throws IOException {
        driver.get("https://rozetka.com.ua/");
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys("Mac");

        //explicit waits
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement btnSearch = driver.findElement(
                By.xpath("//button[contains(@class, 'search-form__submit')]"));
        btnSearch.click();


        //explicit waits
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement titleOfFirstProduct = driver.findElement(
                By.xpath("(//span[@class='goods-tile__title'])[1]"));
        String title = titleOfFirstProduct.getText().trim();
        titleOfFirstProduct.click();


        //explicit waits
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        /*
        WebElement btnCloseTelegram = driver.findElement(
                By.xpath("//span[@class='exponea-close-cross']"));
        btnCloseTelegram.click();*/
        // //span[@class='exponea-close-cross']

        WebElement inStockLabel = driver.findElement(By.xpath("//p[contains(@class,'status-label--green')]"));
        String colorOfInStockLabel = inStockLabel.getCssValue("color");
        WebElement price = driver.findElement(By.xpath("//p[@class='product-price__big']"));
        //Assert.assertEquals(colorOfInStockLabel, EXPECTED_LABEL_COLOR, "Colors does not equals");

        if (inStockLabel.isDisplayed() && colorOfInStockLabel.equals(EXPECTED_LABEL_COLOR)) {
//            try (FileWriter fileWriter = new FileWriter("lesson23.txt")) {
//                fileWriter.write(title + " " + price.getAttribute("innerText"));
//            } catch (Exception e) {
//                System.out.println(">>>>> Error occurred, e: " + e.getMessage());
//                e.printStackTrace();
//            }


            FileWriter fileWriter = new FileWriter("lesson23.txt");
            fileWriter.write(title + " " + price.getAttribute("innerText"));
            fileWriter.close();
        }

    }
}
