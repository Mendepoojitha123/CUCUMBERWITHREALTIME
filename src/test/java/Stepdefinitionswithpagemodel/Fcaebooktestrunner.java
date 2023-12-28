package Stepdefinitionswithpagemodel;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = 	"src\\test\\resources\\Facebookfeatures\\scenarios.feature",	
glue ="Stepdefinitionswithpagemodel",
dryRun = false,
monochrome=true
		
		)
public class Fcaebooktestrunner {

}
