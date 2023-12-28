package stepswithpom;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\orangehrmfeaturewithpom\\orangehrmpom.feature",
glue = "stepswithpom",
dryRun = false,
monochrome = true)

public class Testrunnerwithpom {
	
	

}
