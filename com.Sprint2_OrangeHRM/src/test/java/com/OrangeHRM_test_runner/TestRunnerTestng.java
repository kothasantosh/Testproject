package com.OrangeHRM_test_runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="OrangeHRMFeatures"
		,glue={"com.Sprint2_santosh"}
		,plugin = {"json:target/cucumber.json"}
		,tags={"@Add_Employee ,@Employee_login"}
		)


public class TestRunnerTestng extends AbstractTestNGCucumberTests{

}
