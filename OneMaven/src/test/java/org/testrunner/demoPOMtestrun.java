package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\resources\\featureFile\\demoPOM.feature", glue="com.cmbr.stepdefinition", monochrome=true, 
plugin= {"pretty", "json:target/Cucumber_Report/demoguru.json", "rerun:rerun/rerun.txt"})

public class demoPOMtestrun {

}
