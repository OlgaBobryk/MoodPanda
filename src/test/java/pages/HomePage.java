package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    private SelenideElement diaryLink = $(By.xpath("//div//a[ contains(@class,'navbar-item') and contains(text(),'Your diary')]"));

    public DiaryPage clickLink(){
        diaryLink.click();
        return new DiaryPage();
    }

}
