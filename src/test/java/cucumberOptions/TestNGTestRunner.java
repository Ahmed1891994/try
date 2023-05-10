package cucumberOptions;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/test/resources/features"},glue ={"stepDefinitions"}
,monochrome=true,
plugin= {"pretty",
		"html:target/cucumberReports.html",
		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
		"json:target/cucumberReports.json",
		"junit:target/cucumberReports/Cucumber.xml",
		"rerun:target/failed_scenario.txt",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class TestNGTestRunner extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	

}
