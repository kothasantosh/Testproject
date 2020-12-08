package com.OrangeHRM_test_runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="OrangeHRMFeatures"
		,glue={"com.Sprint2_santosh"}
		//,tags={"@Add_Employee ,@Employee_login"}
		)

public class OrangeHRMTestRunner {

}
