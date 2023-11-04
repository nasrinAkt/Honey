package Honey_StepDefinition;

import Honey_PageAction.Honey_HomePageAction;
import Honey_Utility.Honey_Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Honey_RightClick extends Honey_Base{
	Honey_HomePageAction honey_HomePageAction = new Honey_HomePageAction();
	
	@Given("^open <\"([^\"]*)\"> right$")
	public void open_right(String URL) throws Throwable {
		HonLaunchURL(URL); 
		
	}

	@Then("^Verify user can right click$")
	public void verify_user_can_right_click() throws Throwable {
		honey_HomePageAction.Verifyusercanrightclick();
		
	}


	
	
	
}
