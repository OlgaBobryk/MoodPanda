package tests;

import constants.Credentials;
import io.qameta.allure.Description;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.UserForHugPage;

public class SendHugTest extends BaseTest {
    private static final Logger LOGGER = LogManager.getLogger(SendHugTest.class.getName());

    @Test
    @Description("User tries to send hug to any message")
    public void hug() {
        LoginPage loginPage = new LoginPage();
        LOGGER.info(String.format("Page %s initialized", LoginPage.class.getName()));
        LOGGER.info(String.format("Log in to MoodPanda"));
        loginPage.login(Credentials.USERNAME, Credentials.PASSWORD);
        MainPage hugelement = new MainPage();
        LOGGER.info(String.format("Page %s initialized", MainPage.class.getName()));
        LOGGER.info(String.format("Find user for hug"));
        hugelement.findUser();
        UserForHugPage userHug = new UserForHugPage();
        LOGGER.info(String.format("Page %s initialized", UserForHugPage.class.getName()));
        LOGGER.info(String.format("Send hug"));
        userHug.clickHug();
        LOGGER.info(String.format("Check if my hug is displayed"));
        Assert.assertTrue(userHug.isMyHugDisplayed(), "You didn't hug");


    }
}


