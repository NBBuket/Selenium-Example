package Pages;

import org.openqa.selenium.WebDriver;

public class MainPage extends Page {

    public final String myAccount = "myAccount";
    public final String login = "login";
    public final String itemSearch = "[placeholder='Ürün, kategori veya marka ara']";
    public final String itemSearch2 = ".searchBoxOld-M1esqHPyWSuRUjMCALPK";
    public final String itemSearch3 = "theme-IYtZzqYPto8PhOx3ku3c theme-JOTHTAYrQhCBEf9bVgI8";

    public MainPage(WebDriver driver) {
        super(driver);
    }
}
