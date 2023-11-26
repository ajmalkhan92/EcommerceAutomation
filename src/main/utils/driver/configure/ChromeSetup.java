package src.main.utils.driver.configure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeSetup implements DriverSetup {
    ChromeOptions options = new ChromeOptions();

    @Override
    public WebDriver initializeDriver() {
        setProperties();
         return new ChromeDriver(options);
    }

    public void setProperties() {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\MY-PC\\Documents\\EcommerceAutomation\\src\\main\\resources\\driver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\driver\\chromedriver.exe");
        options.addArguments("--remote-allow-origins=*");
    }
}
