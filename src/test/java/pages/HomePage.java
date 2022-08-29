package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    private static final Logger LOGGER = LogManager.getLogger(HomePage.class.getName());


    private SelenideElement diaryLink = $(By.xpath("//div//a[ contains(@class,'navbar-item') and contains(text(),'Your diary')]"));

    @Step("Click Your Diary Link and go to Your Diary Page")
    public DiaryPage clickLink() {
        LOGGER.debug(String.format("Find and apptemt to click Your Diary Link find %s", diaryLink));
        diaryLink.click();
        return new DiaryPage();
    }

}
