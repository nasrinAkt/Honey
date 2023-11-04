package Honey_PageAction;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Honey_PageLocator.Honey_HomePageLocator;
import Honey_Utility.Honey_Base;
import Honey_Utility.Honey_TestData;

public class Honey_HomePageAction extends Honey_Base{
	Honey_HomePageLocator honey_HomePageLocator = new Honey_HomePageLocator();
	
	public void clickonservicelink() {
		honey_HomePageLocator.clService.click();
		
		
	}
	public void clickBrandoutlet() {
		honey_HomePageLocator.clBrandOutlet.click();	
		
		
	}
	
	public void clickonclothing() throws Exception {
		
		honey_HomePageLocator.clClothings.click();
		Thread.sleep(2000);
		
	}
	
	public void clickonchampion() {
		honey_HomePageLocator.clChampions.click();	
		
	}
	
	
	
	
	
	
	public void scrolldownandenterdepareandreturndate() throws Exception {
		
	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
JavascriptExecutor js  = (JavascriptExecutor)driver;
js.executeScript("document.getElementById('LandingAirBookingSearchForm_departureDate').value= '10/20/2023'");
js.executeScript("document.getElementById('LandingAirBookingSearchForm_returnDate').value='10/25/2023'");
	Thread.sleep(5000);
	
	
		
	/*	honey_HomePageLocator.departureDate.sendKeys(Honey_TestData.departureValue);
	
		honey_HomePageLocator.returnDate.sendKeys(Honey_TestData.returnValue);
		Thread.sleep(2000);*/
		
		
		
		
  /*  WebElement date = honey_HomePageLocator.departureDate;
	date.sendKeys("10252023");
	date.sendKeys(Keys.TAB);
	
	Thread.sleep(2000);
	 WebElement date1 = honey_HomePageLocator.returnDate;
	 date1.sendKeys("10302023");
	 date1.sendKeys(Keys.TAB);
	 Thread.sleep(2000);	*/
		
		
		
	/*	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		
		honey_HomePageLocator.oneway.click();
		Thread.sleep(2000);
		
		honey_HomePageLocator.from.sendKeys("NewYork");
		Thread.sleep(2000);
		
		honey_HomePageLocator.to.sendKeys("Dallas");
		Thread.sleep(2000);
		
		honey_HomePageLocator.departureDate.click();
		Thread.sleep(2000);
		honey_HomePageLocator.deparD.click();
		Thread.sleep(2000);
		honey_HomePageLocator.returnDate.click();
		Thread.sleep(2000);
		honey_HomePageLocator.returnD.click();
		Thread.sleep(2000);
		
		
		honey_HomePageLocator.search.click();
		Thread.sleep(5000);  */
	}
	public void draganddrop() throws Exception {
		driver.switchTo().frame(honey_HomePageLocator.frame);
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.dragAndDrop(honey_HomePageLocator.drag, honey_HomePageLocator.drop).perform();
		Thread.sleep(3000);
	}
	
	
	public void resizedemo() throws Exception {
		driver.switchTo().frame(honey_HomePageLocator.frame2);
		Thread.sleep(2000);
		
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(honey_HomePageLocator.resize, 300, 100).perform();
		Thread.sleep(2000);
		
	}
	public void workonslides() throws Exception {
		driver.switchTo().frame(honey_HomePageLocator.frame3);
		Thread.sleep(2000);
		
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(honey_HomePageLocator.greenslider, -100, 120).perform();
		Thread.sleep(3000);
		
	}
	public void Verifyusercanrightclick() throws Exception {
		driver.switchTo().frame(honey_HomePageLocator.frame4);
		Thread.sleep(2000);
		
		
		Actions ac = new Actions(driver);
		ac.contextClick(honey_HomePageLocator.rightclick).perform();
		Thread.sleep(3000);
		
	}
	public void Verifyusercancopyandpasteusingkeys() throws Exception {
		
	Actions ac = new Actions(driver);
	ac.keyDown(honey_HomePageLocator.copy, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
	Thread.sleep(3000);
	
	ac.keyDown(honey_HomePageLocator.paste, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
	Thread.sleep(3000);
	
	((JavascriptExecutor)driver).executeScript("scroll(0,80)");
	
	Thread.sleep(2000);
	
	}
	public void Verifyusercanselectdropdownfromautosuggestwithoutselecttagname() throws Exception {
		honey_HomePageLocator.fromfield.click();
		Thread.sleep(2000);
		
		honey_HomePageLocator.fromfield1.sendKeys("Sydney");
		Thread.sleep(2000);
		
		
		honey_HomePageLocator.fromfield1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		
		honey_HomePageLocator.fromfield1.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
	}
}
