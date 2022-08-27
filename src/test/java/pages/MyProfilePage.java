package pages;

import com.codeborne.selenide.SelenideElement;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MyProfilePage {
    private static final Logger LOGGER = LogManager.getLogger(MyProfilePage.class.getName());


    private SelenideElement firstNameInput = $(By.xpath("//div[@class='box']//following::div[@class='field']//label[contains(text(), 'First name')]//following::div[@class='control'][1]//input"));
    private SelenideElement lastNameInput = $(By.xpath("//div[@class='box']//following::div[@class='field']//label[contains(text(), 'Last name')]//following::div[@class='control'][1]//input"));
    private SelenideElement saveButton = $(By.xpath("//button[contains (text(), 'Save identity')]"));
    private SelenideElement profileName = $(By.xpath("//p[@class='title is-4 wrap']"));


    public MyProfilePage updateFirstName() {
        LOGGER.debug(String.format("Clear field find by %s with first name", firstNameInput));
        firstNameInput.clear();
        LOGGER.debug(String.format("Enter new first name"));
        firstNameInput.sendKeys("Olja");
        return this;
    }

    public MyProfilePage clickSaveButton() {
        LOGGER.debug(String.format("Attempt to click Save Button find by %s", saveButton));
        saveButton.click();
        return this;
    }

    public String NameAfterUpdate() {
        LOGGER.debug(String.format("Get new profile name find by%s", profileName));
        return profileName.getText();

    }


    public MyProfilePage updateLastName() {
        LOGGER.debug(String.format("Clear field find by %s with first name", lastNameInput));
        lastNameInput.clear();
        LOGGER.debug(String.format("Enter new last name"));
        lastNameInput.sendKeys("B");
        return this;

    }
}
