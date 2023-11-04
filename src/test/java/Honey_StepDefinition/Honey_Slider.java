package Honey_StepDefinition;

import Honey_PageAction.Honey_HomePageAction;
import Honey_Utility.Honey_Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Honey_Slider extends Honey_Base{
	Honey_HomePageAction honey_HomePageAction = new Honey_HomePageAction();
	
	@Given("^open <\"([^\"]*)\"> slide$")
	public void open_slide(String URL) throws Throwable {
		HonLaunchURL(URL);
		
	}

	@Then("^work on slides$")
	public void work_on_slides() throws Throwable {
		honey_HomePageAction.workonslides();
		
	}


	
	
	
}
