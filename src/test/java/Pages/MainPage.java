package Pages;

import org.openqa.selenium.WebDriver;

public class MainPage extends Page {

    public final String myAccount = "myAccount";
    public final String login = "login";

    public MainPage(WebDriver driver) {
        super(driver);
    }
}
