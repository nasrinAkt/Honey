package Honey_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Honey_Utility.Honey_Base;

public class Honey_ServicePageLocator extends Honey_Base {

	public Honey_ServicePageLocator() {
		
		PageFactory.initElements(driver, this);	
			
		}
		@FindBy(xpath ="//h1[text()='Our Portfolio']")
		public WebElement verifySerPag;
		
	
	
	
}
