package org.example.tests.herokuApp;

import org.example.tests.tests.BaseTest;
import org.junit.Test;

public class AlertPageTest  extends BaseTest {

    @Test
    public void loginAlertPageTest(){
        homePageHerokuApp.menuItemClick("//ul/li[8]/a");
        authenticationAlertPage.loginInAlert();
    }
}
