package Honey_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Honey_Base {

	public static WebDriver driver;
	public static Properties HonPro;
	
	public Honey_Base() {
		
	try {
		FileInputStream honFle = new FileInputStream(System.getProperty("user.dir")+("//src//test//java/Honey_Config/Honey_Config.Properties"));	
		HonPro = new Properties();	
		HonPro.load(honFle);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("Please,look the code");
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
	public void HonBrowser() {
    String HonAllBrowser = HonPro.getProperty("HonBrowser1");
	if(HonAllBrowser.equalsIgnoreCase("Chrome")) {	
	System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+("//Honey_ChromeDriver//chromedriver.exe"));	
	ChromeOptions yy = new ChromeOptions();
	yy.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Honey_Utiliti.pageLoadTimeout));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Honey_Utiliti.implicitlyWait));
	driver.manage().window().maximize();
	
	
	}
	else if(HonAllBrowser.equalsIgnoreCase("Edge")) {
	System.setProperty("Webdriver.edge.driver",System.getProperty("user.dir")+("//Honey_EdgeDriver//msedgedriver.exe"));	
	EdgeOptions yy = new EdgeOptions();
	yy.addArguments("--remote-allow-origins=*");
	driver = new EdgeDriver();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Honey_Utiliti.pageLoadTimeout));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Honey_Utiliti.implicitlyWait));
	driver.manage().window().maximize();
		
		
	}
	}
	
	public static void HonLaunchURL(String URL) {
		driver.get(HonPro.getProperty("HonURL8"));
		
		
	}
	
	
}
