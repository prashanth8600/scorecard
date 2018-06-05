package com.arm.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/*
 * Test execution class for Fiori Apps/Scenarios
 */
	@RunWith(Cucumber.class)
	@CucumberOptions(
			plugin = { "html:target/reports/cucumber-html-report",
					   "json:target/reports/cucumber.json",
					   "junit:target/reports/cucumber-results.xml",
					   "pretty:target/reports/cucumber-pretty.txt"},
			features = {"src/test/resources/features/Registration_supplier.feature"},
			//tags = {"@adding_to_mysuppliers", "@Remove_supplier"},
				
			glue = {"scenarios", "com.vendigital.steps"}
			)
	
	public class CukesRunner {
		
    }