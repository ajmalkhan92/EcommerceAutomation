package src.main.utils.driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.List;

public abstract class Driver {

    public abstract void start(Browser browser);

    public abstract void quit();

    public abstract void goToURL(String URL);

    public abstract String getURL();

    public abstract WebElement findElement(By locator);

    public abstract List<WebElement> findElements(By locator);

}
