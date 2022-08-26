package tests;

import constants.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MyProfilePage;
import pages.YourDashboardPage;

public class NewLastNameTest {


    @Test
    public void updateLastName() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(Credentials.USERNAME, Credentials.PASSWORD);
        YourDashboardPage dashboard = new YourDashboardPage();
        dashboard.clickDashboard();
        dashboard.openProfile();
        MyProfilePage myProfile = new MyProfilePage();
        myProfile.updateLastName();
        myProfile.clickSaveButton();
        myProfile.lastNameAfterUpdate();
        Assert.assertEquals(myProfile.lastNameAfterUpdate(), "Olja B", "Lastname wasn't update");
    }
}


