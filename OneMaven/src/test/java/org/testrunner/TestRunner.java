package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\resources\\featureFile\\cmbrMap.feature", glue="com.cmbr.stepdefinition",
monochrome=true, tags= {"@Feature","~@SmokeTest"},plugin= {"pretty","html:target/Cucumber_report","junit:target/Cucumber_report/Cucumber.xml",
"json:target/Cucumber_report/Cucumber.json", "rerun:rerun/failed_Scenario.txt"})


public class TestRunner {

		
}
