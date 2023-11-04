package Honey_StepDefinition;

import Honey_PageAction.Honey_ChildWindowAction;
import Honey_PageAction.Honey_ParentWindowAction;
import Honey_Utility.Honey_Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Honey_WindowHandle extends Honey_Base{

	Honey_ParentWindowAction honey_ParentWindowAction = new Honey_ParentWindowAction();
	Honey_ChildWindowAction honey_ChildWindowAction = new Honey_ChildWindowAction();
	
	@Given("^open <\"([^\"]*)\"> salesforce$")
	public void open_salesforce(String URL) throws Throwable {
		HonLaunchURL(URL);
	}

	@Then("^click on start free trial$")
	public void click_on_start_free_trial() throws Throwable {
		honey_ParentWindowAction.clickonstartfreetrial(); 
	}

	@Then("^window handle enter firstname lastname jobtitle email company employee phone country click on box go to parent window$")
	public void window_handle_enter_firstname_lastname_jobtitle_email_company_employee_phone_country_click_on_box_go_to_parent_window() throws Throwable {
	honey_ChildWindowAction.windowhandleenterfirstnamelastnamejobemailcompanyemployeephonecountryclickonboxgotoparentwindow(); 
	}


	
	
	
}
