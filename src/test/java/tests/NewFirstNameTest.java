package tests;


import constants.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MyProfilePage;
import pages.YourDashboardPage;


public class NewFirstNameTest {
    @Test
    public void updateFirstName() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(Credentials.USERNAME, Credentials.PASSWORD);
        YourDashboardPage dashboard = new YourDashboardPage();
        dashboard.clickDashboard();
        dashboard.openProfile();
        MyProfilePage myProfile = new MyProfilePage();
        myProfile.updateFirstName();
        myProfile.clickSaveButton();
        myProfile.firstNameAfterUpdate();
        Assert.assertEquals(myProfile.firstNameAfterUpdate(), "Olja P", "Firstname wasn't update");
    }
}
