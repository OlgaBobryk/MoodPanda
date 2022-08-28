package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import io.qameta.allure.Step;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {

    private static final Logger LOGGER = LogManager.getLogger(MainPage.class.getName());

    private SelenideElement postUpdateButton = $(new ByText("Post update"));
    private ElementsCollection posts = $$("[class ='title is-4 wrap']");


    @Step("Post Update button is displayed")
    public boolean isPostUpdateDisplayed() {
        postUpdateButton.shouldBe(Condition.visible, Duration.ofSeconds(5));
        return postUpdateButton.isDisplayed();
    }
    @Step("Find a user to send hug")
    public UserForHugPage findUser() {
        LOGGER.debug(String.format("Choose a user from list %s to send hug", posts));
        posts.get(1).click();
        return new UserForHugPage();
    }

    @Step("Click Post Update button")
    public NewPostPage clickPostUpdateButton() {
        LOGGER.debug(String.format("Find %s post update button and click", postUpdateButton));
        postUpdateButton.click();
        return new NewPostPage();
    }
}
