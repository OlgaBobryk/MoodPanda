package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NewPostPage {
    private static final Logger LOGGER = LogManager.getLogger(NewPostPage.class.getName());


    private SelenideElement numberButton = $(By.xpath("//button[@class='button is-large is-warning' and contains (text(), '5')]"));
    private SelenideElement wordsButton = $(By.xpath("//button[@class = 'is-small button is-light' and contains(text(), 'family')]"));
    private SelenideElement updateToButton = $(By.xpath("//div//a[@class='button is-rounded is-pulled-right is-warning' and contains(text(), 'Update to 5')]"));

    @Step("Choose and add rating")
    public NewPostPage chooseNumderButtons() {
        LOGGER.debug(String.format("Apptemt to click rating button find %s", numberButton));
        numberButton.click();
        return this;
    }
    @Step("Choose and add what's affecting  mood  ")
    public NewPostPage chooseWordsButtons() {
        LOGGER.debug(String.format("Choose and apptemt to click selected button find %s , ", wordsButton));
        wordsButton.click();
        return this;
    }
    @Step("Click Update button")
    public HomePage clickUpdate() {
        LOGGER.debug(String.format("Attempt to click Updatebutton find %s", updateToButton));
        updateToButton.click();
        return new HomePage();

    }


}
