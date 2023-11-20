package org.example.tests.pages.heroku;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class AddRemoveElementPage {

    public AddRemoveElementPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "button[onclick='addElement()']")
    private WebElement addElementButton;

    @FindBy(css ="button[class='added-manually']")
    private WebElement deleteButton;

    @FindBy(xpath = "//a[contains(text(),'Elemental Selenium')]")
    private WebElement footerText;

    public void addElement(){
        addElementButton.click();
        try {
            assertTrue("Przycisk 'Delete' nie jest widoczny", deleteButton.isDisplayed());
        } catch (NoSuchElementException e) {
            fail("Przycisk 'Delete' nie został znaleziony");
        }
    }

    public void isDisplayedFooterText(){
            try{
                assertTrue("Text 'Elemental Selenium' nie jest widoczny",footerText.isDisplayed());

            } catch (NoSuchElementException e){
                fail("Napis nie jest widoczny");
            }
    }
}
