package org.example.tests.pages.heroku;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AuthenticationAlertPage {
    WebDriver driver;

    String username;
    String password;
    String domain;
    String url;

    public AuthenticationAlertPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void loginInAlert(){
        domain ="https://the-internet.herokuapp.com/digest_auth";
        username = "admin";
        password = "admin";
        url = "https://" + username + ":"+ password + "@" + domain;
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
