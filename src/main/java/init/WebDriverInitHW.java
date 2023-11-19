package init;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WebDriverInitHW {


    public WebDriver driver;
    public WebDriverWait webDriverWait;


    @BeforeTest
    public void initDriver() {

        WebDriverManager.chromedriver().setup();
        //object of ChromeOptions
        ChromeOptions o = new ChromeOptions();
        //set browser options
        o.addArguments("--disable-notifications");
        //o.addArguments("--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36");
        //o.addArguments("--headless");
        //o.addArguments("--disable-blink-features=AutomationControlled");
        driver = new ChromeDriver(o);
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterTest
    public void after() {
        driver.quit();
    }

}
