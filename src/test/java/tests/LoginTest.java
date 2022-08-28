package tests;

import constants.Credentials;
import io.qameta.allure.Description;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTests {
    private static final Logger LOGGER = LogManager.getLogger(LoginTest.class.getName());

    @Test
    @Description("User tries to log in to MoodPanda")
    public void loginTest() {

        LoginPage loginPage = new LoginPage();
        LOGGER.info(String.format("Page %s initialized", LoginPage.class.getName()));
        LOGGER.info(String.format("Log in to MoodPanda"));
        boolean isMainPageDisplayed = loginPage.login(Credentials.USERNAME, Credentials.PASSWORD).isPostUpdateDisplayed();
        LOGGER.info(String.format("Check if Login is successful and new page is opened"));
        Assert.assertTrue(isMainPageDisplayed, "User didn't log in");
    }
}
