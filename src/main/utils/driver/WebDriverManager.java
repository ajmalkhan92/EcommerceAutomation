package src.main.utils.driver;

import org.openqa.selenium.*;
import src.main.utils.driver.configure.ChromeSetup;
import src.main.utils.driver.configure.EdgeSetup;
import src.main.utils.driver.configure.FireFoxSetup;

import java.util.List;

public class WebDriverManager extends Driver {
    WebDriver webDriver;

    @Override
    public void start(Browser browser) {
        webDriver = switch (browser) {
            case CHROME -> {
                yield new ChromeSetup().initializeDriver();
            }
            case FIREFOX -> {
                yield new FireFoxSetup().initializeDriver();
            }
            case EDGE -> {
                yield new EdgeSetup().initializeDriver();
            }
        };
    }

    @Override
    public void quit() {
        webDriver.quit();
    }

    @Override
    public void goToURL(String URL) {
        webDriver.navigate().to(URL);
    }

    @Override
    public String getURL() {
        return webDriver.getCurrentUrl();
    }

    @Override
    public List<WebElement> findElements(By locator) {
        return null;
    }

    @Override
    public WebElement findElement(By locator) {
        return null;
    }

}
