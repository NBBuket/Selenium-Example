package Pages;

import org.openqa.selenium.WebDriver;

public class LoginPage extends Page {

    public final String email = "txtUserName";
    public final String loginButton = "btnLogin";

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
