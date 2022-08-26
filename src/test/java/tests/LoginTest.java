package tests;

import constants.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTests {
    @Test
    public void loginTest() {

        LoginPage loginPage = new LoginPage();
        boolean isMainPageDisplayed = loginPage
                .login(Credentials.USERNAME, Credentials.PASSWORD)
                .isPostUpdateDisplayed();
        Assert.assertTrue(isMainPageDisplayed, "User didn't log in");
    }
}
