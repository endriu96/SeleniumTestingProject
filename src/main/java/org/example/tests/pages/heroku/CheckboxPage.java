package org.example.tests.pages.heroku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class CheckboxPage {

    WebDriver driver;


    public CheckboxPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public WebElement checkboxClick(By locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2) );
        WebElement checkbox = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        checkbox.click();
        assertTrue(checkbox.isSelected());
        return driver.findElement(locator);
    }


}
