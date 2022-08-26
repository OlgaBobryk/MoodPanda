package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class YourDashboardPage {
    private SelenideElement yourDashboard = $(By.xpath("//div[@class='navbar-start']//a[contains(text(), ' Your dashboard ')]"));
    private SelenideElement editProfil = $(By.xpath("//p[@class='menu-label' and contains (text(), 'Your account')]//following::ul[@class='menu-list']//child::li[1]//a"));

    public YourDashboardPage clickDashboard() {
        yourDashboard.click();
        return this;
    }

    public MyProfilePage openProfile() {
        editProfil.click();
        return new MyProfilePage();
    }


}


