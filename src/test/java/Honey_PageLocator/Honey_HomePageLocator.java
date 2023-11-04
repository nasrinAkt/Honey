package Honey_PageLocator;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Honey_Utility.Honey_Base;

public class Honey_HomePageLocator extends Honey_Base{

	public Honey_HomePageLocator() {
		
	PageFactory.initElements(driver, this);	
		
	}
	@FindBy(linkText ="Service")
	public WebElement clService;
	
	@FindBy(linkText ="Brand Outlet")
	public WebElement clBrandOutlet;
	
	@FindBy(xpath ="//span[text()='Clothing']")
	public WebElement clClothings;
	
	@FindBy(linkText ="Champion")
	public WebElement clChampions;
	
	@FindBy(name ="LandingAirBookingSearchForm_tripType")
	public WebElement oneway;
	
	@FindBy(id ="LandingAirBookingSearchForm_originationAirportCode")
	public WebElement from;
	
	@FindBy(id ="LandingAirBookingSearchForm_destinationAirportCode")
	public WebElement to;
	
	@FindBy(id ="LandingAirBookingSearchForm_departureDate")
	public WebElement departureDate;
	
	@FindBy(id ="calendar-69-2023-11-06")
	public WebElement deparD;
	
	@FindBy(xpath ="/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[10]/button[25]")
	public WebElement returnD;
	
	
	
	@FindBy(xpath ="/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/span[1]/span[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[2]/label[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement returnDate;
	
	@FindBy(id ="LandingAirBookingSearchForm_submit-button")
	public WebElement search;
	
	@FindBy(xpath ="//*[@id=\"content\"]/iframe")
	public WebElement frame;
	
	@FindBy(id ="draggable")
	public WebElement drag;
	
	@FindBy(id ="droppable")
	public WebElement drop;
	
	@FindBy(xpath ="//*[@id=\"content\"]/iframe")
	public WebElement frame2;
	
	@FindBy(xpath ="//*[@id=\"resizable\"]/div[3]")
	public WebElement resize;
	
	@FindBy(xpath ="//*[@id=\"content\"]/iframe")
	public WebElement frame3;
	
	@FindBy(xpath ="//*[@id=\"green\"]/span")
	public WebElement greenslider;
	
	@FindBy(xpath ="//*[@id=\"content\"]/iframe")
	public WebElement frame4;
	
	
	@FindBy(xpath ="//*[@id=\"swatch\"]")
	public WebElement rightclick;
	
	@FindBy(xpath ="//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[5]/pre/span")
	public WebElement copy;
	
	@FindBy(xpath ="//*[@id=\"dropZone2\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[4]/pre/span")
	public WebElement paste;
	
	
	@FindBy(xpath ="//span[text()='From']")
	public WebElement fromfield;
	
	@FindBy(xpath ="//input[@placeholder='From']")
	public WebElement fromfield1;
	
	@FindBy(xpath ="//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]")
	public WebElement selectfromdropdown;
	
	
}
