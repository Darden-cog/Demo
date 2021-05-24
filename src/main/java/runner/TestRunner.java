package runner;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.TestNGCucumberRunner;
import io.appium.java_client.remote.MobileCapabilityType;



@CucumberOptions(
		features= "./features",
		glue = {"stepDefinition"},
		tags = {"@Firstone"},plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber.json"},
		monochrome =true)

public class TestRunner {
	
	@BeforeTest
	public void setup() {
		
		DesiredCapabilities caps =new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME,"");
		caps.setCapability(MobileCapabilityType.UDID,"");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"60");
		caps.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"");
		
	}
	
	

}
