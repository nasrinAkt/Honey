package Honey_StepDefinition;

import Honey_PageAction.Honey_HomePageAction;
import Honey_Utility.Honey_Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Honey_AutoSuggestDropDown extends Honey_Base{
	Honey_HomePageAction honey_HomePageAction = new Honey_HomePageAction();
	
	@Given("^open <\"([^\"]*)\"> makemytrip$")
	public void open_makemytrip(String URL) throws Throwable {
		HonLaunchURL(URL);
	}

	@Then("^Verify user can select drop down from auto suggest without select tagname$")
	public void verify_user_can_select_drop_down_from_auto_suggest_without_select_tagname() throws Throwable {
		honey_HomePageAction.Verifyusercanselectdropdownfromautosuggestwithoutselecttagname();
	}


	
}
