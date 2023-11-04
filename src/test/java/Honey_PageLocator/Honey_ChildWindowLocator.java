package Honey_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Honey_Utility.Honey_Base;

  public class Honey_ChildWindowLocator extends Honey_Base{

	
	
   public Honey_ChildWindowLocator() {
		
		PageFactory.initElements(driver, this);	
			
		}
		@FindBy(name ="UserFirstName")
		public WebElement enterFN;
		
		@FindBy(name ="UserLastName")
		public WebElement enterLN;

		@FindBy(name ="UserTitle")
		public WebElement jobTitle;

		@FindBy(name ="UserEmail")
		public WebElement enteremail;

		@FindBy(name ="CompanyName")
		public WebElement company;

		@FindBy(name ="CompanyEmployees")
		public WebElement employees;

		@FindBy(name ="UserPhone")
		public WebElement phone;
		
		@FindBy(name ="CompanyCountry")
		public WebElement country;
		
		@FindBy(xpath ="/html/body/div[4]/div[1]/div/div[6]/div[1]/div[2]/div/div/div[2]/div/div/div/form/div[5]/div/div/div[1]")
		public WebElement clCheckBox;


}
