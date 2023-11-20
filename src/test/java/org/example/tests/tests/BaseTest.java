package org.example.tests.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.tests.pages.heroku.*;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BaseTest {

    protected WebDriver driver;
    protected HomePageHerokuApp homePageHerokuApp;
    protected BasicAuthPage basicAuthPage;

    protected ChallengingDOMPage challengingDOMPage;

    protected CheckboxPage checkboxPage;

    protected ContextMenuPage contextMenuPage;

    protected Actions actions;

    @Before
    public void init(){


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        PageFactory.initElements(driver, this);
        homePageHerokuApp = new HomePageHerokuApp(driver);
        basicAuthPage = new BasicAuthPage(driver);
        challengingDOMPage = new ChallengingDOMPage(driver);
        checkboxPage = new CheckboxPage(driver);
        contextMenuPage = new ContextMenuPage(driver);
        actions = new Actions(driver);


    }
}
