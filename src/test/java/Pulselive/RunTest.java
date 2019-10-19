package Pulselive;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = ".",
//        "src\\test\\Resources\\FeatureFiles\\",
               tags = "@Register, @Login, @ResetPassword" )

public class RunTest {
}
