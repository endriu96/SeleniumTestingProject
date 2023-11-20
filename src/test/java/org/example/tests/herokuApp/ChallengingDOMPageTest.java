package org.example.tests.herokuApp;

import junit.framework.Assert;
import org.example.tests.pages.heroku.BasicAuthPage;
import org.example.tests.pages.heroku.ChallengingDOMPage;
import org.example.tests.pages.heroku.HomePageHerokuApp;
import org.example.tests.tests.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;

public class ChallengingDOMPageTest extends BaseTest {

    @Test
    public void find6Row3ColumnElementTest(){

        homePageHerokuApp.clickChallengingDOMLink();
        challengingDOMPage.findSingleElementInTable(By.xpath("//tr[6]//td[3]"));
        By elementLocator = By.xpath("//tr[6]//td[3]");
        Assert.assertTrue(challengingDOMPage.verifyTextInElement(elementLocator, "Adipisci5"));
    }


    @Test
    public void findSingleElement(){
        homePageHerokuApp.clickChallengingDOMLink();
        challengingDOMPage.verifyTextInElement(By.xpath("//tr[1]//td[2]"),"Apeirian0");
    }




}
