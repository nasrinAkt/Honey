package Honey_StepDefinition;



import Honey_PageAction.Honey_HomePageAction;
import Honey_Utility.Honey_Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Honey_ResizeDemo extends Honey_Base{

	Honey_HomePageAction honey_HomePageAction = new Honey_HomePageAction();
	
	@Given("^open <\"([^\"]*)\"> jqueryResize$")
	public void open_jqueryResize(String URL) throws Throwable {
		HonLaunchURL(URL);
	}

	@Then("^resize demo$")
	public void resize_demo() throws Throwable {
		honey_HomePageAction.resizedemo();
	}


	
	
}
