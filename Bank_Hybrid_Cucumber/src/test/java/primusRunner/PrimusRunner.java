package primusRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"./FeatureFiles/PrimusLogin.feature"},glue = {"primusStepDefination"},
plugin= {"pretty","html:target/cucumber-reports"}

)
public class PrimusRunner extends AbstractTestNGCucumberTests{

}
