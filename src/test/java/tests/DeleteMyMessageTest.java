package tests;

import constants.Credentials;
import io.qameta.allure.Description;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;


public class DeleteMyMessageTest extends BaseTest {
    private static final Logger LOGGER = LogManager.getLogger(DeleteMyMessageTest.class.getName());


    @Test
    @Description("User tries to delete his post")
    public void deleteMessage() {
        LoginPage loginPage = new LoginPage();
        LOGGER.info(String.format("Page %s initialized", LoginPage.class.getName()));
        LOGGER.info(String.format("Log in to MoodPanda"));
        loginPage.login(Credentials.USERNAME, Credentials.PASSWORD)
                .isPostUpdateDisplayed();
        NewPostPage newPost = new NewPostPage();
        LOGGER.info(String.format("Page %s initialized", NewPostPage.class.getName()));
        MainPage mainPage = new MainPage();
        LOGGER.info(String.format("Page %s initialized", MainPage.class.getName()));
        LOGGER.info(String.format("Find and click PostUpdateButton"));
        mainPage.clickPostUpdateButton();
        LOGGER.info(String.format("Choose rating"));
        newPost.chooseNumderButtons();
        LOGGER.info(String.format("choose what is affecting my mood"));
        newPost.chooseWordsButtons();
        LOGGER.info(String.format("Update my post"));
        newPost.clickUpdate();
        HomePage homePage = new HomePage();
        LOGGER.info(String.format("Page %s initialized", HomePage.class.getName()));
        LOGGER.info(String.format("Go to homepage"));
        homePage.clickLink();
        DiaryPage diaryPost = new DiaryPage();
        LOGGER.info(String.format("Page %s initialized", DiaryPage.class.getName()));
        LOGGER.info(String.format("Find my post"));
        diaryPost.clickPostLink();
        LOGGER.info(String.format("Delete my post"));
        diaryPost.deletePost();
        LOGGER.info(String.format("Check if Successful message is displayed"));
        Assert.assertTrue(diaryPost.isMessageDisplayed(), "n");
    }
}

