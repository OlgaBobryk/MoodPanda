package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import java.time.Duration;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {
    private SelenideElement postUpdateButton = $(new ByText("Post update"));
    private ElementsCollection posts = $$("[class ='title is-4 wrap']");


    public boolean isPostUpdateDisplayed() {
        postUpdateButton.shouldBe(Condition.visible, Duration.ofSeconds(5));
        return postUpdateButton.isDisplayed();
    }

    public UserForHugPage findUser() {
        posts.get(1).click();
        return new UserForHugPage();
    }




    public NewPostPage clickPostUpdateButton() {
        postUpdateButton.click();
        return new NewPostPage();
    }
}
