package demoguru;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\demoguru.feature",
glue = "demoguru"
		)
public class Demogurusteprunner {

}
