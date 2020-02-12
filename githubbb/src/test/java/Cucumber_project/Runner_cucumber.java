package Cucumber_project;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	plugin= {"json:src/test/java/Cucumber_project/output/cucumber.json"}
)
public class Runner_cucumber {
	

}
