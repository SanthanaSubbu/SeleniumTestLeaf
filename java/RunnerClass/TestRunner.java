package RunnerClass;

import io.cucumber.testng.CucumberOptions;
import stepDefsSF.*;



@CucumberOptions(features="src/test/java/featuresSalesforce/DeleteAccount.feature", glue="stepDefsSF",dryRun = false,monochrome = true,publish=true,tags="",
plugin = { "pretty", "html:target/cucumber-reports.html" })
public class TestRunner extends BaseClass{

}


