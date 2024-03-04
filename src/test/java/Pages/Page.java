package Pages;

import org.openqa.selenium.By;
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
}
