package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class YourDashboardPage {
    private static final Logger LOGGER = LogManager.getLogger(YourDashboardPage.class.getName());


    private SelenideElement yourDashboard = $(By.xpath("//div[@class='navbar-start']//a[contains(text(), ' Your dashboard ')]"));
    private SelenideElement editProfile = $(By.xpath("//p[@class='menu-label' and contains (text(), 'Your account')]//following::ul[@class='menu-list']//child::li[1]//a"));

    @Step("Click Your Dashboard Link ")
    public YourDashboardPage clickDashboard() {
        LOGGER.debug(String.format("Attempt to click Your Dashboard Link find %s", yourDashboard));
        yourDashboard.click();
        return this;
    }

    @Step("Click Edit Profile ink and go to new Page")
    public MyProfilePage openProfile() {
        LOGGER.debug(String.format("Attempt to click Edit Profile Link find %s", editProfile));
        editProfile.click();
        return new MyProfilePage();
    }


}


