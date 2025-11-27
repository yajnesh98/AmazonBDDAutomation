package utils;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static base.BaseClass.driver;

public class WaitUtils {
    public static void waitForSometime(int time){
        try {
            new WebDriverWait(driver, Duration.ofSeconds(time))
                    .until(webDriver -> false);
        } catch (TimeoutException e) {
            // ignore timeout
        }
    }
}
