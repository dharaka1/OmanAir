package RunnerPack;

import org.junit.runner.RunWith;

import BasePack.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\FeaturePack\\OmanAir.feature", glue = "StepPack", dryRun = false, publish = true, monochrome = true, plugin = {
		"html:target\\OmanAir.report\\Oman.html", "json:target\\OmanAir.report\\Oman.json" })

public class RunnerClass extends BaseClass {

}
