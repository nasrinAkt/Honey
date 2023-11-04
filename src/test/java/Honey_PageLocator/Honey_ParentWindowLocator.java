package Honey_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Honey_Utility.Honey_Base;

public class Honey_ParentWindowLocator extends Honey_Base{

	
	
	public Honey_ParentWindowLocator() {
		
		PageFactory.initElements(driver, this);	
			
		}
		@FindBy(css ="a[aria-label='Start free trial: Data + AI + CRM + Trust = more sales and happier customers.']")
		public WebElement clFreeTrial;
}
