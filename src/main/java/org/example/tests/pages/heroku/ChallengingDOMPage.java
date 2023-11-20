package org.example.tests.pages.heroku;

import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ChallengingDOMPage {
    @FindBy

    private WebDriver driver;

    public ChallengingDOMPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement findSingleElementInTable(By locator) {
        return driver.findElement(locator);
    }

    public boolean verifyTextInElement(By locator, String expectedText) {
        WebElement element = findSingleElementInTable(locator);
        String actualText = element.getText().trim();
        return actualText.equals(expectedText);
    }
}