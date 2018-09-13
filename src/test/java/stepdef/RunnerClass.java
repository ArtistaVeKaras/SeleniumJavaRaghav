package stepdef;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions (plugin = {"pretty", "html:target/Cucumber",
        "json:target/Cucumber-report.json"},
        features = {"./src/test/resources"}, // read from this file instead of the long path name such as "/Users/admin/Intelj Idea/TestAutomateScondVersion/src/test/resources"
        tags = {"~@wip","@TestCompleted"}
        //~ use this sign to tags both test or the program will not recognise either test scenario
)

public class RunnerClass {


}
