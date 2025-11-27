package runners;


import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/resources/features",
        tags = "@LoginTC_01",
        glue = {"stepDefinitions"},
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "json:target/JsonReports/report.json",
                "junit:target/JUnitReports/report.xml"
        },
        monochrome = true
)

public class TestRunner extends AbstractTestNGCucumberTests{

}