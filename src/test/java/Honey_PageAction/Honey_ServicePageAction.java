package Honey_PageAction;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import Honey_PageLocator.Honey_ServicePageLocator;
import Honey_Utility.Honey_Base;

public class Honey_ServicePageAction extends Honey_Base{

	
	Honey_ServicePageLocator honey_ServicePageLocator = new Honey_ServicePageLocator();
	
	public void Verifyuserinservicepage() throws Exception {
	((JavascriptExecutor)driver).executeScript("scroll(0,2000)");
	Thread.sleep(5000);
    boolean veri	= honey_ServicePageLocator.verifySerPag.isDisplayed();
	Assert.assertTrue(veri);
	Thread.sleep(5000);
	((JavascriptExecutor)driver).executeScript("scroll(2000,0)");
	Thread.sleep(3000);
	}
	
	
	
}
