package org.example.tests.pages.heroku;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationAlertPage {
    WebDriver driver;

    public AuthenticationAlertPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void loginInAlert(String login, String password){
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(login);
        alert.sendKeys(password);
    }
}
