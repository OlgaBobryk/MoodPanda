package tests;

import constants.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.UserForHugPage;

public class SendHugTest extends BaseTests {
    @Test
    public void hug() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(Credentials.USERNAME, Credentials.PASSWORD);
        MainPage hugelement = new MainPage();
        hugelement.findUser();
        UserForHugPage userHug = new UserForHugPage();
        userHug.clickHug();
        Assert.assertTrue(userHug.isMyHugDisplayed(), "You didn't hug");


    }
}


