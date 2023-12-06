package pattern.pageObject.selenium;

import org.openqa.selenium.By;

public class ProductPageLocators {
    By locatorTitleOfFirstProduct = By.xpath("(//span[@class='goods-tile__title'])[1]");
    By addToBasket = By.xpath("(//button[contains(@class, 'buy-button')])[6]");
    By titleOfProduct = By.xpath("//div[@class='product__heading']/h1");
}
