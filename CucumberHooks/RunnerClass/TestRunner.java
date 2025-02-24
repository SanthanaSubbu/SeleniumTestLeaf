package CucumberHooks.RunnerClass;

import CucumberHooks.stepDefsSF.BaseClass;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(features="src/test/java/cucumberHooksFeaturesSalesforce/DeleteAccount.feature", glue="CucumberHooks.stepDefsSF",dryRun = false,monochrome = true,publish=true,tags="",
plugin = { "pretty", "html:target/cucumber-reports.html" })
public class TestRunner extends BaseClass{

}


