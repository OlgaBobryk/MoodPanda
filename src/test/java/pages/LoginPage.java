package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import constants.Credentials;
import constants.Urls;
import io.qameta.allure.Step;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class LoginPage {
    private static final Logger LOGGER = LogManager.getLogger(LoginPage.class.getName());


    private SelenideElement emailInput = $(By.xpath("//input[@type='text']"));
    private SelenideElement passwordInput = $(By.xpath("//input[@type='password']"));
    private SelenideElement loginButton = $(By.xpath("//span[text()='Login']"));

    @Step("Log in to MoodPanda")
    public MainPage login(String email, String password) {
        LOGGER.debug(String.format("Attempt to oppen Ural %s:", Urls.LOGIN_URL));
        open(Urls.LOGIN_URL);
        LOGGER.debug(String.format("Attempt to iput email %s into the field find %s ", Credentials.USERNAME, emailInput));
        emailInput.sendKeys(email);
        LOGGER.debug(String.format("Attempt to input password %s into the field find %s", Credentials.PASSWORD, passwordInput));
        passwordInput.sendKeys(password);
        loginButton.shouldBe(Condition.enabled, Duration.ofSeconds(5));
        LOGGER.debug(String.format("Attempt to click LoginButton and log in"));
        loginButton.click();
        return new MainPage();
    }
}
