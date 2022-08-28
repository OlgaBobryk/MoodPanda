package pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.WithText;
import io.qameta.allure.Step;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UserForHugPage {
    private static final Logger LOGGER = LogManager.getLogger(UserForHugPage.class.getName());


    private SelenideElement hugButton = $(new WithText("Hug"));
    private SelenideElement myHug = $(By.xpath("//span[contains(. ,'Olga B')]"));

    @Step("Click Hug button and send hug")
    public UserForHugPage clickHug() {
        LOGGER.debug(String.format("Send hug with click hugButton  %s",hugButton));
        hugButton.click();
        return this;
    }

    @Step("Hug message is displayed ")
    public boolean isMyHugDisplayed() {
        LOGGER.debug(String.format("Check if it's my hug with my name %s ", myHug));
        return myHug.isDisplayed();
    }
}
