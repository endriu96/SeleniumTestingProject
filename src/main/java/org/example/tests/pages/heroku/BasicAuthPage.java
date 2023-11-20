package org.example.tests.pages.heroku;

import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasicAuthPage {
    private WebDriver driver;
    String username;
    String password;
    String domain;
    String url;


    public BasicAuthPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void loginAndPassword(){
        domain ="https://the-internet.herokuapp.com/basic_auth";
        username = "admin";
        password = "admin";
        url = "https://" + username + ":"+ password + "@" + domain;



    }



}
