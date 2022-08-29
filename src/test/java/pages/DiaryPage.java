package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import io.qameta.allure.Step;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class DiaryPage {
    private static final Logger LOGGER = LogManager.getLogger(DiaryPage.class.getName());


    private SelenideElement dropdownMenu = $(By.xpath("//div[ contains(@class,'dropdown is')]//div[@class='dropdown-trigger']//a[1]"));
    private SelenideElement delete = $(By.xpath("//div[@id='dropdown-menu3']//div//a[2]"));
    private SelenideElement message = $(new ByText("Your post was deleted. It may take a minute or so to update the feeds"));

    @Step("Find and click dropdown Menu")
    public DiaryPage clickPostLink() {
        LOGGER.debug(String.format("Find post and apptemt to click dropdown menu find %s", dropdownMenu));
        dropdownMenu.click();
        return this;
    }

    @Step("Choose Delete and click")
    public DiaryPage deletePost() {
        LOGGER.debug(String.format("Choose %s and attempt to click Delete", delete));
        delete.click();
        return this;

    }

    @Step("Successful message is displayed")
    public boolean isMessageDisplayed() {
        LOGGER.debug(String.format("Find %s successful message", message));
        message.shouldBe(Condition.enabled, Duration.ofSeconds(5));
        return message.isDisplayed();
    }
}
