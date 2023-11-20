package org.example.tests.herokuApp;

import org.example.tests.pages.heroku.AddRemoveElementPage;
import org.example.tests.pages.heroku.BasicAuthPage;
import org.example.tests.pages.heroku.HomePageHerokuApp;
import org.example.tests.tests.BaseTest;
import org.junit.Test;

public class BasicAuthPageTest extends BaseTest {
    @Test
    public void alertAuthenticationLogin(){
        homePageHerokuApp = new HomePageHerokuApp(driver);
        basicAuthPage = new BasicAuthPage(driver);

        homePageHerokuApp.clickBasicAuthPageLink();
        basicAuthPage.loginAndPassword();


    }


}
