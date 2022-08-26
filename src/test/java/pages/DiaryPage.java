package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class DiaryPage {
    private SelenideElement postLink = $(By.xpath("//div[ contains(@class,'dropdown is')]//div[@class='dropdown-trigger']//a[1]"));
    private SelenideElement delete = $(By.xpath("//div[@id='dropdown-menu3']//div//a[2]"));
    private SelenideElement message = $(new ByText("Your post was deleted. It may take a minute or so to update the feeds"));


    public DiaryPage clickPostLink(){
        postLink.click();
        return this;
    }
    public DiaryPage deletePost(){
        delete.click();
        return this;

    }

    public boolean isMessageDisplayed() {
        message.shouldBe(Condition.enabled, Duration.ofSeconds(5));
        return message.isDisplayed();
    }
}
