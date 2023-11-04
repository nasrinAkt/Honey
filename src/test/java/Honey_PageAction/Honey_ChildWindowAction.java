package Honey_PageAction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Honey_PageLocator.Honey_ChildWindowLocator;
import Honey_Utility.Honey_Base;
import Honey_Utility.Honey_TestData;
import Honey_Utility.Honey_Utiliti;

public class Honey_ChildWindowAction extends Honey_Base{

Honey_ChildWindowLocator honey_ChildWindowLocator = new Honey_ChildWindowLocator();
	
public void windowhandleenterfirstnamelastnamejobemailcompanyemployeephonecountryclickonboxgotoparentwindow() throws Exception {
		
	Set<String>	windowHandles = driver.getWindowHandles();
    Iterator<String> ite = windowHandles.iterator();
    String ParentWindow = ite.next();
    String childWindow = ite.next();
    
    
    
    
    driver.switchTo().window(childWindow);
    Thread.sleep(1000);
    
    honey_ChildWindowLocator.enterFN.sendKeys(Honey_TestData.FirstName);
    Thread.sleep(1000);
    
    honey_ChildWindowLocator.enterLN.sendKeys(Honey_TestData.LastName);
    Thread.sleep(1000);
    
    Select sl = new Select(honey_ChildWindowLocator.jobTitle);
    sl.selectByVisibleText(Honey_TestData.jobtitle);
    Thread.sleep(2000);
    
    honey_ChildWindowLocator.enteremail.sendKeys(Honey_TestData.email);
    Thread.sleep(2000);
    
    honey_ChildWindowLocator.company.sendKeys(Honey_TestData.companyNm);
    Thread.sleep(2000);
    
   honey_ChildWindowLocator.employees.sendKeys("1-15 employees");
    
    Thread.sleep(2000);
    
    honey_ChildWindowLocator.phone.sendKeys(Honey_TestData.phoneNR);
    Thread.sleep(2000);
    
    Select sl3 = new Select(honey_ChildWindowLocator.country);
    sl3.selectByVisibleText(Honey_TestData.countryNM);
    Thread.sleep(2000);
    
    ((JavascriptExecutor)driver).executeScript("scroll(0,50)");
   Actions actions = new Actions(driver);
    actions.moveToElement(honey_ChildWindowLocator.clCheckBox).click().build().perform();
     honey_ChildWindowLocator.clCheckBox.click(); 
    
      
    Thread.sleep(10000);
    
    Honey_Utiliti.takeMyScreenshot(driver, "click");
    
    driver.switchTo().window(ParentWindow);
    Thread.sleep(3000);
	}
	
	
	
}
