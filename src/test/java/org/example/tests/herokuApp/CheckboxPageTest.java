package org.example.tests.herokuApp;

import org.example.tests.tests.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;


import java.time.Duration;

public class CheckboxPageTest  extends BaseTest {

    @Test
    public void checkboxClickTest(){
        homePageHerokuApp.clickCheckboxesLink();
        checkboxPage.checkboxClick(By.xpath("(//input[@type='checkbox'])[1]"));
    }
}
