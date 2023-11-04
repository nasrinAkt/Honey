package Honey_StepDefinition;

import Honey_PageAction.Honey_HomePageAction;
import Honey_PageAction.Honey_SearchPageAction;
import Honey_Utility.Honey_Base;
import Honey_Utility.Honey_Utiliti;
import cucumber.api.java.en.Then;

public class Honey_Search extends Honey_Base {
	Honey_HomePageAction honey_HomePageAction = new Honey_HomePageAction();
	Honey_SearchPageAction honey_SearchPageAction = new Honey_SearchPageAction();
	
	@Then("^click Brand outlet$")
	public void click_Brand_outlet() throws Throwable {
		honey_HomePageAction.clickBrandoutlet();
		
	}

	@Then("^click on clothing$")
	public void click_on_clothing() throws Throwable {
		honey_HomePageAction.clickonclothing();
		
	}

	@Then("^click on champion$")
	public void click_on_champion() throws Throwable {
		honey_HomePageAction.clickonchampion();
		
	}
	@Then("^click on free shipping checkbox$")
	public void click_on_free_shipping_checkbox() throws Throwable {
		honey_SearchPageAction.clickonfreeshippingcheckbox(); 
		
		
	}


	@Then("^Verify user can search specific item$")
	public void verify_user_can_search_specific_item() throws Throwable {
		honey_SearchPageAction.Verifyusercansearchspecificitem(); 
	}


	
	
	
}
