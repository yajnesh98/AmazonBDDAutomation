package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import base.BaseClass;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void setUp() {
        driver = BaseClass.browserLaunch();   // Launching browser
        System.out.println("=== Browser Launched ===");
    }

    @After
    public void tearDown() {
        BaseClass.quitDriver();               // Closing browser
        System.out.println("=== Browser Closed ===");
    }
}
