package pages;

import com.codeborne.selenide.SelenideElement;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    private static final Logger LOGGER = LogManager.getLogger(HomePage.class.getName());


    private SelenideElement diaryLink = $(By.xpath("//div//a[ contains(@class,'navbar-item') and contains(text(),'Your diary')]"));

    public DiaryPage clickLink(){
        LOGGER.debug(String.format("Find and apptemt to click Your Diary Link find %s",diaryLink));
        diaryLink.click();
        return new DiaryPage();
    }

}
