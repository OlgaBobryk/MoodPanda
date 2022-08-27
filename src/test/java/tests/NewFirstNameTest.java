package tests;


import constants.Credentials;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MyProfilePage;
import pages.YourDashboardPage;


public class NewFirstNameTest {
    private static final Logger LOGGER = LogManager.getLogger(NewFirstNameTest.class.getName());

    @Test
    public void updateFirstName() {
        LoginPage loginPage = new LoginPage();
        LOGGER.info(String.format("Page %s initialized", LoginPage.class.getName()));
        LOGGER.info(String.format("Log in to MoodPanda"));
        loginPage.login(Credentials.USERNAME, Credentials.PASSWORD);
        YourDashboardPage dashboard = new YourDashboardPage();
        LOGGER.info(String.format("Page %s initialized", YourDashboardPage.class.getName()));
        LOGGER.info(String.format("Click Your Dashboard Link"));
        dashboard.clickDashboard();
        LOGGER.info(String.format("Go to User Profile"));
        dashboard.openProfile();
        MyProfilePage myProfile = new MyProfilePage();
        LOGGER.info(String.format("Page %s initialized", MyProfilePage.class.getName()));
        LOGGER.info(String.format("Change first nsme"));
        myProfile.updateFirstName();
        LOGGER.info(String.format("Save change"));
        myProfile.clickSaveButton();
        LOGGER.info(String.format("Check if new First Name in this profile  and expected First Name  are identical"));
        Assert.assertEquals(myProfile.NameAfterUpdate(), "Olja P", "Firstname wasn't update");
    }
}
