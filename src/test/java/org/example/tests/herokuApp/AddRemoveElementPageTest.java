package org.example.tests.herokuApp;

import org.example.tests.tests.BaseTest;
import org.example.tests.pages.heroku.AddRemoveElementPage;
import org.example.tests.pages.heroku.HomePageHerokuApp;
import org.junit.Test;

public class AddRemoveElementPageTest extends BaseTest {

    private HomePageHerokuApp homePageHerokuApp;
    private AddRemoveElementPage addRemoveElementPage;

    @Test
    public void addRemoveElementTest(){
        homePageHerokuApp = new HomePageHerokuApp(driver);
        addRemoveElementPage = new AddRemoveElementPage(driver);

        homePageHerokuApp.clickAddRemoveElementLink();
        addRemoveElementPage.addElement();
    }


    @Test
    public void isFooterDisplayed(){
        homePageHerokuApp = new HomePageHerokuApp(driver);
        addRemoveElementPage = new AddRemoveElementPage(driver);

        homePageHerokuApp.clickAddRemoveElementLink();
        addRemoveElementPage.isDisplayedFooterText();
    }
}
