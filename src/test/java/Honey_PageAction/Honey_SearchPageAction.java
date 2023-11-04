package Honey_PageAction;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Honey_PageLocator.Honey_SearchPageLocator;
import Honey_Utility.Honey_Base;
import Honey_Utility.Honey_Utiliti;

public class Honey_SearchPageAction extends Honey_Base{
	Honey_SearchPageLocator honey_SearchPageLocator = new Honey_SearchPageLocator();
	
	
	public void clickonfreeshippingcheckbox() throws Exception {
		Actions actions = new Actions(driver);
		actions.moveToElement(honey_SearchPageLocator.scrolldown);
		actions.perform();
		Thread.sleep(2000);
		honey_SearchPageLocator.clCheckBox.click();
			
	}
	
	
    public void Verifyusercansearchspecificitem() throws Exception {
	Actions ac = new Actions(driver);
	ac.moveToElement(honey_SearchPageLocator.verifyPage);
	ac.perform();
	Thread.sleep(5000);
	
	
    boolean verification = honey_SearchPageLocator.verifyPage.isDisplayed();	
	Assert.assertTrue(verification);	
		
	}
	
	
	
}
