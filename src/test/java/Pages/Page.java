package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Page {

    WebDriver driver;

    public Page(WebDriver driver) {

        this.driver = driver;
    }

    public void waitUntilElementCanBeSeen(String elementId) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elementId)));
    }

    public void clickTheButton(String elementId) {

        driver.findElement(By.id(elementId)).click();
    }

    public void waitUntilElementCanBeClickable(String elementId) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.elementToBeClickable(By.id(elementId)));
    }

    public void sendText(String elementId, String text) {

        driver.findElement(By.id(elementId)).sendKeys(text);
    }

    public void waitUntilElementCanBeSeenCss(String elementId) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(elementId)));
    }

    public void sendTextCss(String elementId, String text) {

        driver.findElement(By.cssSelector(elementId)).sendKeys(text);
    }

    public void pressKeyboardKey(String elementId, Keys keyboardKey) {
        driver.findElement(By.cssSelector(elementId)).sendKeys(keyboardKey);

    }

    public void clickTheButtonCss(String elementId) {

        driver.findElement(By.cssSelector(elementId)).click();
    }
}
