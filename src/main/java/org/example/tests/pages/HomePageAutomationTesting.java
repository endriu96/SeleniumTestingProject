package org.example.tests.pages;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomePageAutomationTesting {

    WebDriver webDriver = new ChromeDriver();


    @Before
    public void initPage(){
        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        webDriver.get("https://dev.automationtesting.in/");
        webDriver.manage().deleteAllCookies();
        webDriver.manage().window().fullscreen();
        chromeOptions.addArguments(
                "--disable-popup-blocking",
                "--disable-extensions",
                "--disable-notifications",
                "--disable-infobars",
                "--disable-translate",
                "--disable-geolocation",
                "--start-maximized",
                "--disable-web-security",
                "--allow-running-insecure-content"
        );
    }
    @Test
    public void loadMainPage(){

        WebElement  acceptButton = webDriver.findElement(By.xpath("//p[@class='fc-button-label' and text()='Consent']"));
        // Możesz kontynuować działania na stronie
        acceptButton.click();
    }


}
