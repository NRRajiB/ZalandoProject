package com.cts.stepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\resources\\task.feature", glue="com.cts.stepDefinition", plugin="json:target/task.json")
public class TestRunner {

}
