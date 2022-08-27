package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {

    private static final Logger LOGGER = LogManager.getLogger(MainPage.class.getName());

    private SelenideElement postUpdateButton = $(new ByText("Post update"));
    private ElementsCollection posts = $$("[class ='title is-4 wrap']");



    public boolean isPostUpdateDisplayed() {
        postUpdateButton.shouldBe(Condition.visible, Duration.ofSeconds(5));
        return postUpdateButton.isDisplayed();
    }

    public UserForHugPage findUser() {
        LOGGER.debug(String.format("Choose a user from list %s for hug", posts));
        posts.get(1).click();
        return new UserForHugPage();
    }


    public NewPostPage clickPostUpdateButton() {
        LOGGER.debug(String.format("Find %s post update button and click", postUpdateButton));
        postUpdateButton.click();
        return new NewPostPage();
    }
}
