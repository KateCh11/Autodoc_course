package pattern.pageObject.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static java.lang.Thread.sleep;

public class SearchPage {
    By firstProductTittle = By.xpath("//span[@class='goods-tile__title']");

    private WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ProductPage clickOnProductTittleByIndex(int tittleIndex) throws InterruptedException {
        sleep(5000);
        List<WebElement> tittles = driver.findElements(firstProductTittle);
        tittles.get(tittleIndex).click();
        return new ProductPage(driver);
    }
}
