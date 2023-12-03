package pattern.pageObject.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

public class ProductPage {
    By titleOfProduct = By.xpath("//div[@class='product__heading']/h1");
    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTittleText() throws InterruptedException {
        sleep(5000);
        return driver.findElement(titleOfProduct).getAttribute("innerText");
    }
}
