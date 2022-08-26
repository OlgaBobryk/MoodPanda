package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class NewPostPage {
    private SelenideElement numberButton = $(By.xpath("//button[@class='button is-large is-warning' and contains (text(), '5')]"));
    private SelenideElement wordsButton = $(By.xpath("//button[@class = 'is-small button is-light' and contains(text(), 'family')]"));
    private SelenideElement updateToButton = $(By.xpath("//div//a[@class='button is-rounded is-pulled-right is-warning' and contains(text(), 'Update to 5')]"));

    public NewPostPage chooseNumderButtons() {
        numberButton.click();
        return this;
    }

    public NewPostPage chooseWordsButtons() {
        wordsButton.click();
        return this;
    }

    public HomePage clickUpdate() {
        updateToButton.click();
        return new HomePage();

    }




}
