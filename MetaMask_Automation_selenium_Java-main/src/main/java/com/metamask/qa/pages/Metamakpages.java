package com.metamask.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.metamask.qa.base.base;

public class Metamakpages extends base {
	

//	//Page Factory - OR:
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div/div[2]/div/div")
	WebElement NetworkDropdown;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/div[2]/li[2]/span")
	WebElement SelectGoerli;
	//for unlock metamask
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div/div/form/div/div/input")
	WebElement Metamask_pwd;
	
//	
	public Metamakpages(){
		PageFactory.initElements(driver, this);
//	//Actions:
	}
	
//		public String validateLoginPageTitle(){
//			return driver.getTitle();
//		}
//		
//		public boolean validateCRMImage(){
//			return crmLogo.isDisplayed();
//		}
//		
//		public HomePage login(String un){
//			Metamask_pwd.sendKeys(un);
//			//loginBtn.click();
//			    	JavascriptExecutor js = (JavascriptExecutor)driver;
//			    	js.executeScript("arguments[0].click();", loginBtn);
//			    	
//			return new HomePage();
//		}
//
}
