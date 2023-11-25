package src.test.E2E;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.chrome.*;

public class PlaceOrderTests {
    private WebDriver driver;

    @BeforeSuite
    public void initializeDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MY-PC\\Documents\\EcommerceAutomation\\src\\main\\resources\\driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
    }

    @Test
    public void SampleTest() {
        System.out.println("Test method");
    }

    @AfterSuite
    public void closeDriver() {
        driver.quit();
    }
}
