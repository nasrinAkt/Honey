package Honey_StepDefinition;

import org.checkerframework.common.reflection.qual.NewInstance;

import Honey_PageAction.Honey_HomePageAction;
import Honey_Utility.Honey_Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Honey_KeyEvents extends Honey_Base {

	Honey_HomePageAction honey_HomePageAction = new Honey_HomePageAction();
	
	@Given("^Open <\"([^\"]*)\"> extends$")
	public void open_extends(String URL) throws Throwable {
		HonLaunchURL(URL);
		
	}

	@Then("^Verify user can copy and paste using keys$")
	public void verify_user_can_copy_and_paste_using_keys() throws Throwable {
		honey_HomePageAction.Verifyusercancopyandpasteusingkeys();
		
	}


	
	
}
