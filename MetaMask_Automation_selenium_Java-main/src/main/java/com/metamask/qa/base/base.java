package com.metamask.qa.base;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

//import com.metamask.qa.utils;
//import com.crm.qa.util.WebEventListener;

public class base {
	
	public static ChromeDriver driver;
	public static Properties prop;
//	public  static EventFiringWebDriver e_driver;
//	public static WebEventListener eventListener;
	
	public base(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/metamask"
					+ "/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	 public static ChromeDriver initialization() throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		//opt.addArguments("--headless=chrome");
		opt.addExtensions(new File("10.22.1_0.crx"));
		ChromeDriver driver = new ChromeDriver(opt);
		// driver.get("chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn//popup.html");//Enter
		// link
		return driver;
		
		
		
	 	
		
		
		
		
		
		
		
		
		
		
		
//		String browserName = prop.getProperty("browser");
//		if(browserName.equals("chrome")){
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions opt = new ChromeOptions();
//		opt.addExtensions(new File("10.22.1_0.crx"));
//		WebDriver driver = new ChromeDriver(opt);
//		driver.get("chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn//home.html#initialize/welcome");
//		}
//		
//		else if(browserName.equals("FF")){
//				WebDriverManager.chromedriver().setup();
//				ChromeOptions opt = new ChromeOptions();
//				opt.addExtensions(new File("10.22.1_0.crx"));
//				DesiredCapabilities c = new DesiredCapabilities();
//		    	c.setBrowserName(ChromeOptions.CAPABILITY);
//		    	// set ChromeOptions capability
//		    	opt.merge(c);
//		    	
//				WebDriver driver = new ChromeDriver(opt);
//				//driver.get("chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn//popup.html");
//				return driver;
//				}
		
		
		
//		if(browserName.equals("chrome")){
//			System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/chromedriver");	
//			driver = new ChromeDriver(); 
//		}
//		else if(browserName.equals("FF")){
//			System.setProperty("webdriver.gecko.driver", "/Users/naveenkhunteta/Documents/SeleniumServer/geckodriver");	
//			driver = new FirefoxDriver(); 
//		}
		
		
//		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
//		eventListener = new WebEventListener();
//		e_driver.register(eventListener);
//		driver = e_driver;
		
		//driver.manage().window().maximize();
	//	driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
	//	driver.get(prop.getProperty("url"));
		
	}	}

//}
