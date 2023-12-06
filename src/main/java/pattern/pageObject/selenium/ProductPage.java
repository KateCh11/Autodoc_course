package pattern.pageObject.selenium;

import org.openqa.selenium.WebDriver;


import static java.lang.Thread.sleep;

public class ProductPage extends ProductPageLocators implements ICartPage {

    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTittleText() throws InterruptedException {
        sleep(5000);
        return driver.findElement(titleOfProduct).getAttribute("innerText");
    }

    public String getTitleOfFirstProduct() {
        return driver.findElement(locatorTitleOfFirstProduct).getText().trim();
    }

    public ProductPage addToBasket() throws InterruptedException {
        driver.findElement(addToBasket).click();
        return this;
    }

    public ProductPage checkingCartI() {
        checkingCartI(driver);
        return this;
    }

    public ProductPage checkingTitleI() {
        checkingTitleI(driver);
        return this;
    }
}
