package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class MyProfilePage {


    private SelenideElement firstNameInput = $(By.xpath("//div[@class='box']//following::div[@class='field']//label[contains(text(), 'First name')]//following::div[@class='control'][1]//input"));
    private SelenideElement lastNameInput = $(By.xpath("//div[@class='box']//following::div[@class='field']//label[contains(text(), 'Last name')]//following::div[@class='control'][1]//input"));
    private SelenideElement saveButton = $(By.xpath("//button[contains (text(), 'Save identity')]"));
    private SelenideElement profileName = $(By.xpath("//p[@class='title is-4 wrap']"));


    public MyProfilePage updateFirstName() {
        firstNameInput.clear();
        firstNameInput.sendKeys("Olja");
        return this;
    }

    public MyProfilePage clickSaveButton() {
        saveButton.click();
        return this;
    }

    public String firstNameAfterUpdate() {
        return profileName.getText();

    }


    public MyProfilePage updateLastName() {
        lastNameInput.clear();
        lastNameInput.sendKeys("B");
        return this;
    }

    public String lastNameAfterUpdate() {
        return profileName.getText();
    }
}
