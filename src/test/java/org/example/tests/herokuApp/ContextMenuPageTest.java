package org.example.tests.herokuApp;

import org.example.tests.tests.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ContextMenuPageTest  extends BaseTest {

    @Test
    public  void contextMenuAndAlertAppearedTest(){
        homePageHerokuApp.menuItemClick("//ul/li[7]/a");
        contextMenuPage.clickContextMenuAndCheckAlertAppeared(driver.findElement(By.xpath("div[id='hot-spot']")));
    }
}
