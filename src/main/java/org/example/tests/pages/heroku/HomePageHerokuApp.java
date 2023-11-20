package org.example.tests.pages.heroku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePageHerokuApp {

    private WebDriver driver;

    public HomePageHerokuApp(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[href='/add_remove_elements/']")
    private WebElement addRemoveElementLink;

    @FindBy(css="a[href='/basic_auth']")
    private WebElement basicAuthPageLink;

    @FindBy(css="a[href='/challenging_dom']")
    private WebElement challengingDOMLink;

    @FindBy(css="a[href='/checkboxes']")
    private WebElement checkboxesLink;

    @FindBy(xpath = "//ul/li[7]")
    private WebElement contextMenuLink;

    public void clickAddRemoveElementLink() {
        addRemoveElementLink.click();
    }

    public void clickBasicAuthPageLink(){
        basicAuthPageLink.click();
    }

    public void clickChallengingDOMLink(){
        challengingDOMLink.click();
    }

    public void clickCheckboxesLink(){
        checkboxesLink.click();
    }

    public void clickContextMenuLink(){
        contextMenuLink.click();
    }

    public void menuItemClick(String xpath){
        try {
            By locator = By.xpath(xpath);
            WebElement element = new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
            element.click();
        }catch (Exception e){
            System.err.println("Nie udało się kliknąć elementu menu" + e.getMessage());
        }
    }
}
