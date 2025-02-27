package testcases;

import base.BaseClass;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features="src/main/java/features", glue="pages",dryRun = false,monochrome = true,publish=true,tags="",
plugin = { "pretty", "html:target/cucumber-reports.html" })

public class RunnerClass extends BaseClass{

}



//TestNG - Execute XML
//Cucumber - Runner Class - driver->Static

//PageObjectModel:
//Sequential- driver-> static
//Parallel-  Constructor config driver-Non Static

//PageObjectModel with cucumber -ThreadLocal Implementation
//ThreadLocal - Encapsulation