package com.makemytrip.steprunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

@io.cucumber.testng.CucumberOptions(features = "C:\\Users\\vikas\\eclipse-workspace\\com.makemytrip\\src\\main\\java\\feature\\Home.feature",
glue = "com.makemytrip.stepdefination", 
dryRun = false, monochrome = true, 
plugin = {
		"pretty", "html:target/Cucumber-Reports/reports01.html" }

)

public class Runner extends AbstractTestNGCucumberTests {

}
