package pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.WithText;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class UserForHugPage {
    private SelenideElement hugButton = $(new WithText("Hug"));
    private SelenideElement myHug = $(By.xpath("//span[contains(. ,'Olga B')]"));

    public UserForHugPage clickHug() {
        hugButton.click();
        return this;
    }


    public boolean isMyHugDisplayed() {

        return myHug.isDisplayed();
    }
}
