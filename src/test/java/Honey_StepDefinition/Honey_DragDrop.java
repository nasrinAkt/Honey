package Honey_StepDefinition;

import Honey_PageAction.Honey_HomePageAction;
import Honey_Utility.Honey_Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Honey_DragDrop extends Honey_Base{
	Honey_HomePageAction honey_HomePageAction = new Honey_HomePageAction();
	
	@Given("^open <\"([^\"]*)\"> jquery$")
	public void open_jquery(String URL) throws Throwable {
		HonLaunchURL(URL);
	}

	@Then("^drag and drop$")
	public void drag_and_drop() throws Throwable {
		honey_HomePageAction.draganddrop(); 
	}


	
	
}
