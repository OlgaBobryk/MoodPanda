package tests;

import constants.Credentials;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.UserForHugPage;

public class SendHugTest extends BaseTests {
    private static final Logger LOGGER = LogManager.getLogger(SendHugTest.class.getName());

    @Test
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


