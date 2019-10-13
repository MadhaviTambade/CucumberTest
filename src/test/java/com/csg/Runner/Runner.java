package com.csg.Runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
//import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Featuers",glue="com.csg.tau.testCucumber.TestCucumber.StepDefinition")
public class Runner {

}
