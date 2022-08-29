package tests;

import constants.Credentials;
import io.qameta.allure.Description;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MyProfilePage;
import pages.YourDashboardPage;

public class NewLastNameTest {
    private static final Logger LOGGER = LogManager.getLogger(NewLastNameTest.class.getName());


    @Test
    @Description("User tries to change his last name")

    public void updateLastName() {
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
        LOGGER.info(String.format("Change the last name"));
        myProfile.updateLastName();
        LOGGER.info(String.format("Save change"));
        myProfile.clickSaveButton();
        myProfile.NameAfterUpdate();
        LOGGER.info(String.format("Check if the new Last Name in this profile  and expected Last Name  are identical"));
        Assert.assertEquals(myProfile.NameAfterUpdate(), "Olja B", "Lastname wasn't update");
    }
}


