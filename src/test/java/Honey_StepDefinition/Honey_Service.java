package Honey_StepDefinition;

import Honey_PageAction.Honey_HomePageAction;
import Honey_PageAction.Honey_ServicePageAction;
import Honey_Utility.Honey_Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Honey_Service extends Honey_Base {
	Honey_HomePageAction honey_HomePageAction  = new Honey_HomePageAction ();
	Honey_ServicePageAction honey_ServicePageAction = new Honey_ServicePageAction();
	
	
	@Given("^open <\"([^\"]*)\"> nextE$")
	public void open_nextE(String URL) throws Throwable {
		HonLaunchURL(URL); 
	}

	@Then("^click on service link$")
	public void click_on_service_link() throws Throwable {
		honey_HomePageAction.clickonservicelink(); 
	}

	@Then("^Verify user in service page$")
	public void verify_user_in_service_page() throws Throwable {
		honey_ServicePageAction.Verifyuserinservicepage();  
	}


	
	
	
}
