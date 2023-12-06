package pattern.pageObject.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

public class CompAndLaptop implements ICartPage {

    private WebDriver driver;

    public CompAndLaptop(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage clickLaptopCategory() throws InterruptedException {
        WebElement sectionLaptop = driver.findElement(
                By.xpath("(//a[contains(@href, 'c80004/')])[1]"));
        sectionLaptop.click();
        return new ProductPage(driver);
    }
}
