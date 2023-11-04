package Honey_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Honey_Utility.Honey_Base;

public class Honey_SearchPageLocator extends Honey_Base{

	

	public Honey_SearchPageLocator() {
		
	PageFactory.initElements(driver, this);	
		
	}
	@FindBy(id ="glbfooter")
	public WebElement verifyPage;
	
	@FindBy(css ="button[aria-label='More refinements']")
	public WebElement scrolldown;
	
	@FindBy(css ="li[name='LH_FS'] span[class='cbx x-refine__multi-select-cbx']")
	public WebElement clCheckBox;
	
}
