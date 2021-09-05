package taudemo;

import browser.BrowserGetter;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.*;

@TestInstance(PER_CLASS)
public class SeleniumTest {
    private final BrowserGetter browserGetter = new BrowserGetter();
    private WebDriver driver;

    @BeforeAll
    public void beforeAll(){
        //Code to open the browser
        driver = browserGetter.getChromeDriver();
    }

    @AfterAll
    public void afterAll(){
        //Code to close the browser
        driver.quit();
    }

    @Test
    public void openTheComPageAndCheckTheTitle(){
        //Code for the test
        String expectedComTitle = "Example title";
        driver.get("https://www.example.com");
        assertEquals(expectedComTitle, driver.getTitle());
        Assertions.assertEquals(1,2);
    }

    @Test
    public void openTheOrgPageAndCheckTheTitle(){
        //Code for the test
        String expectedOrgTitle = "Example title";
        driver.get("https://www.example.org");
        assertEquals(expectedOrgTitle, driver.getTitle());
        Assertions.assertEquals(1,2);
    }
}


