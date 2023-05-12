package cucumberOptions;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/test/resources/features"},glue ={"stepDefinitions"}
,monochrome=true,
plugin= {"pretty",
		"html:testng_results/cucumberReports.html",
		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
		"json:testng_results/cucumberReports.json",
		"junit:testng_results/cucumberReports/Cucumber.xml",
		"rerun:testng_results/failed_scenario.txt",
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
