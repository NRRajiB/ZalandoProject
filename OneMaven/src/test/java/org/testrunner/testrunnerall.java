package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\main\\resources\\featureFile\\cmbrMap.feature","src\\main\\resources\\featureFile\\dummy.feature"}, 
glue= {"com.cmbr.stepdefinition","dummy.stepdefinition"}, monochrome=true, tags={"@Feature,@Feature1","@SmokeTest"}, 
plugin= {"rerun:target/failedScenario.txt"})

public class testrunnerall {

}
