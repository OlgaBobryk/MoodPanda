package tests;

import constants.Credentials;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;


public class DeleteMyMessageTest extends BaseTests {


    @Test
    public void deleteMessage() {
        LoginPage loginPage = new LoginPage();
        loginPage.login(Credentials.USERNAME, Credentials.PASSWORD)
                .isPostUpdateDisplayed();
        NewPostPage newPost = new NewPostPage();
        MainPage mainPage = new MainPage();
        mainPage.clickPostUpdateButton();
        newPost.chooseNumderButtons()
                .chooseWordsButtons()
                .clickUpdate();
        HomePage homePage = new HomePage();
        homePage.clickLink();
        DiaryPage diaryPost = new DiaryPage();
        diaryPost.clickPostLink();
        diaryPost.deletePost();
        diaryPost.isMessageDisplayed();

        Assert.assertTrue(diaryPost.isMessageDisplayed(), "n");
    }
}

