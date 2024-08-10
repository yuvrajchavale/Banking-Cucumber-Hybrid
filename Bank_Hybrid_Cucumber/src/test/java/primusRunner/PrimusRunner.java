package primusRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"./FeatureFiles/PrimusLogin.feature"},glue = {"primusStepDefination"}


)
public class PrimusRunner {

}
