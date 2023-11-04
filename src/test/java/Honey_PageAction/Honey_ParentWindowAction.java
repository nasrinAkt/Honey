package Honey_PageAction;

import Honey_PageLocator.Honey_ParentWindowLocator;
import Honey_Utility.Honey_Base;

public class Honey_ParentWindowAction extends Honey_Base{

	Honey_ParentWindowLocator honey_ParentWindowLocator = new Honey_ParentWindowLocator();
	
	public void clickonstartfreetrial() throws Exception {
		honey_ParentWindowLocator.clFreeTrial.click();
		
		Thread.sleep(5000);
	}
	
}
