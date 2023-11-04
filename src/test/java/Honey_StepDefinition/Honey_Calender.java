package Honey_StepDefinition;

import Honey_PageAction.Honey_HomePageAction;
import Honey_Utility.Honey_Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Honey_Calender extends Honey_Base{
	Honey_HomePageAction honey_HomePageAction = new Honey_HomePageAction();
	
	@Given("^open <\"([^\"]*)\">$")
	public void open(String URL) throws Throwable {
		HonLaunchURL(URL);
		
		
	}

	@Then("^scroll down and enter depart and return date$")
	public void scroll_down_and_enter_depart_and_return_date() throws Throwable {
		honey_HomePageAction.scrolldownandenterdepareandreturndate();
		
		
	}


	
	
	
}
