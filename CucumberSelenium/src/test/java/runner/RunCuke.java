package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
       features = "src/test/resources/features/",
       glue={"steps"},
       tags = "@Used-Search-Cars"
)

public class RunCuke extends AbstractTestNGCucumberTests {




}
