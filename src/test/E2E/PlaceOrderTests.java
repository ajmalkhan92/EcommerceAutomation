package src.test.E2E;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.chrome.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import src.main.utils.driver.Browser;
import src.main.utils.driver.WebDriverManager;
import src.main.utils.driver.Driver;

import src.main.utils.log.LogUtils;

public class PlaceOrderTests {
    private static final Logger logger = LogManager.getLogger(PlaceOrderTests.class);

    private Driver driver;

    @BeforeSuite
    public void initializeDriver() {
        driver = new WebDriverManager();
        driver.start(Browser.CHROME);
    }

    @Test
    public void CheckHomePageLoadedSuccessfully() {
        driver.goToURL("https://automationexercise.com/");
        Assert.assertEquals(driver.getURL(), "https://automationexercise.com/");
        LogUtils.logInfo("Redirected to home page successfully");
    }

    @AfterSuite
    public void closeDriver() {
        driver.quit();
    }
}
