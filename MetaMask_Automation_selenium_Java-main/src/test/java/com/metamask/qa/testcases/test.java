package com.metamask.qa.testcases;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.metamask.qa.base.base;
import com.metamask.qa.mm.metamask_defination;
import com.metamask.qa.pages.page1;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class test extends base {
	//page1 page1;
	metamask_defination metamask_Defination;

	public test() {
		super();
	}
	// test cases should be separated -- independent with each other
	// before each test case -- launch the browser and login
	// @test -- execute test case
	// after each test case -- close the browser

	@BeforeTest
	public void setUp() throws InterruptedException {
	//	ChromeDriver driver = initialization();
		initialization();
		// page1 = new page1();
		metamask_Defination = new metamask_defination();

	}

	@Test
	public void sampleTest() throws InterruptedException, IOException {

		ChromeDriver driver = initialization();

//   pass capability to driver
		driver.manage().window().maximize();
		metamask_defination.metamaskSetup(driver);
		metamask_defination.ChangeNetworkToGoerli(driver);
		driver.get("http://3.141.0.105/");
		
		Thread.sleep(1000);
		//driver.findElement(By.xpath("")).click();
		//metamask_Defination.AddNetwork(driver, "ds", "sdf", "sdf", "sdf");
		metamask_defination.connectToWebsite(driver);
		driver.get("http://3.141.0.105/");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/span[2]/button/span[1]/p")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div[5]/div[1]/div/div")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div[2]/div/div[1]/div/div/p")).click();
		Thread.sleep(1000);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div[2]/div/div[2]/div[2]/div/div[5]/button[1]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div[4]/div/div[3]/div[1]/div/div/div/input")).sendKeys("1");
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div[4]/div/button")).click();
		Thread.sleep(5000);
		metamask_defination.rejectTransactionFromMetamask(driver);
		//metamask_defination.LockWallet(driver);
		//metamask_defination.UNlockWallet(driver, "Rajametamask01");
		//metamask_defination.ChangeNetworkToGoerli(driver);
		
		//metamask_defination.ChangeNetworkToSepolia(driver);
		//metamask_defination.AddNetwork(driver, "ds", "sdf", "sdf", "sdf");
		//metamask_defination.changeMetamaskNetwork(driver, "Goerli test network");
		//metamask_defination.rejectTransactionFromMetamask(driver);

	//	driver.get("https://dev.dafiprotocol.io");

//		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/button")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/nav/div[2]/div/div/div/div[1]/ul/div[2]/div[2]"))
//				.click();
//
////	 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/nav/div[2]/div/div/div/ul/div[2]")).click();
//		driver.findElement(By.xpath("//*[@id='outlined-basic']")).sendKeys("2500");
//		WebElement approvalButtonElement = driver
//				.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div/div[2]/div/div/div/div/button[1]"));
//		Thread.sleep(2000);
//		if (approvalButtonElement.isEnabled()) {
//			approvalButtonElement.click();
//			Thread.sleep(1000);
////			CLICK ON PROCEED
//			driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/button/span[1]")).click();
//			Thread.sleep(1000);
////			rejectApprovalFromMetamask(driver);
		driver.close();
		}}

//}
//}
//	@Test
//public void sampleTest2() throws InterruptedException, IOException {
//
////	ChromeDriver driver = initialization();
//
////pass capability to driver
//	//driver.manage().window().maximize();
//	//metamask_defination.metamaskSetup(driver);
//	//metamask_defination.ChangeNetworkToGoerli(driver);
//	//driver.get("http://3.141.0.105/");
//	
//	//Thread.sleep(1000);
//	//driver.findElement(By.xpath("")).click();
//	//metamask_Defination.AddNetwork(driver, "ds", "sdf", "sdf", "sdf");
//	//metamask_defination.connectToWebsite(driver);
//	driver.get("http://3.141.0.105/");
//	driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/span[2]/button/span[1]/p")).click();
//	driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div[5]/div[1]/div/div")).click();
//	driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div[2]/div/div[1]/div/div/p")).click();
//	Thread.sleep(1000);
//	JavascriptExecutor js = ((JavascriptExecutor) driver);
//	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("/html/body/div/div/div[3]/div[2]/div[2]/div/div[2]/div[2]/div/div[5]/button[1]")).click();
//	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div[4]/div/div[3]/div[1]/div/div/div/input")).sendKeys("1");
//	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div[4]/div/button")).click();
//	Thread.sleep(5000);
//	metamask_defination.rejectTransactionFromMetamask(driver);
//	//metamask_defination.LockWallet(driver);
//	//metamask_defination.UNlockWallet(driver, "Rajametamask01");
//	//metamask_defination.ChangeNetworkToGoerli(driver);
//	
//	//metamask_defination.ChangeNetworkToSepolia(driver);
//	//metamask_defination.AddNetwork(driver, "ds", "sdf", "sdf", "sdf");
//	//metamask_defination.changeMetamaskNetwork(driver, "Goerli test network");
//	//metamask_defination.rejectTransactionFromMetamask(driver);
//
////	driver.get("https://dev.dafiprotocol.io");
//
////	driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/button")).click();
////	Thread.sleep(2000);
////	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/nav/div[2]/div/div/div/div[1]/ul/div[2]/div[2]"))
////			.click();
////
////// driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/nav/div[2]/div/div/div/ul/div[2]")).click();
////	driver.findElement(By.xpath("//*[@id='outlined-basic']")).sendKeys("2500");
////	WebElement approvalButtonElement = driver
////			.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div/div[2]/div/div/div/div/button[1]"));
////	Thread.sleep(2000);
////	if (approvalButtonElement.isEnabled()) {
////		approvalButtonElement.click();
////		Thread.sleep(1000);
//////		CLICK ON PROCEED
////		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[2]/button/span[1]")).click();
////		Thread.sleep(1000);
//////		rejectApprovalFromMetamask(driver);
//	}
//
//}
