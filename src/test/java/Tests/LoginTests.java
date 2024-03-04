package Tests;

import Pages.LoginPage;
import Pages.MainPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginTests {

    private WebDriver driver;
    private MainPage mainPage;
    private LoginPage loginPage;

    @BeforeEach
    void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);
    }

    @Test
    void hepsiburadaLoginTest() {

        driver.get("https://hepsiburada.com");

        mainPage.waitUntilElementCanBeSeen(mainPage.myAccount);
        mainPage.clickTheButton(mainPage.myAccount);
        mainPage.waitUntilElementCanBeClickable(mainPage.login);
        mainPage.clickTheButton(mainPage.login);

        loginPage.waitUntilElementCanBeSeen(loginPage.email);
        loginPage.sendText(loginPage.email, "buket_bkts_06@hotmail.com");
        loginPage.waitUntilElementCanBeSeen(loginPage.loginButton);
        loginPage.clickTheButton(loginPage.loginButton);
    }

  // normally there is an afterEach annotation here, but it gives warning there
}
