package Honey_TestRunner;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Honey_Utility.Honey_Base;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/Honey_Features"},
plugin = {"json:target/cucumber.json"},
glue = "Honey_StepDefinition",tags = {"@tag9"})   //@tag1 for ebay //@tag2 for southwest airlines
                                                 //@tag3 for sales force


public class Honey_TestRunner extends AbstractTestNGCucumberTests{

	@BeforeTest
	public void honStartURL() {
	Honey_Base hon = new Honey_Base();	
	hon.HonBrowser();	
		
	}
	
	@AfterTest
	public void honCloseURL() {
	Honey_Base hon = new Honey_Base();	
	hon.driver.quit();	
		
	}
	
	
}
