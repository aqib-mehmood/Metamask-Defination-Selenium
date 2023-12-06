package com.metamask.qa.mm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.apache.batik.bridge.Window;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.metamask.qa.base.base;

public class metamask_defination extends base {

	public static void metamaskSetup(ChromeDriver driver) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(0));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/button")));
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div/div/div[5]/div[1]/footer/button[2]"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div/div[2]/div/div[2]/div[1]/button"))
				.click();
		Thread.sleep(1000);
//		    
		// ArrayList<WebElement> inputs = (ArrayList<WebElement>)
		// driver.findElements(By.xpath("//input"));
		// Enter seedphrase
		// ("vast subject prize relax valid section shell jealous fun army pear boring")
		driver.findElement(By.xpath("//*[@id=\"import-srp__srp-word-0\"]")).sendKeys("vast");
		driver.findElement(By.xpath("//*[@id=\"import-srp__srp-word-1\"]")).sendKeys("subject");
		driver.findElement(By.xpath("//*[@id=\"import-srp__srp-word-2\"]")).sendKeys("prize");
		driver.findElement(By.xpath("//*[@id=\"import-srp__srp-word-3\"]")).sendKeys("relax");
		driver.findElement(By.xpath("//*[@id=\"import-srp__srp-word-4\"]")).sendKeys("valid");
		driver.findElement(By.xpath("//*[@id=\"import-srp__srp-word-5\"]")).sendKeys("section");
		driver.findElement(By.xpath("//*[@id=\"import-srp__srp-word-6\"]")).sendKeys("shell");
		driver.findElement(By.xpath("//*[@id=\"import-srp__srp-word-7\"]")).sendKeys("jealous");
		driver.findElement(By.xpath("//*[@id=\"import-srp__srp-word-8\"]")).sendKeys("fun");
		driver.findElement(By.xpath("//*[@id=\"import-srp__srp-word-9\"]")).sendKeys("army");
		driver.findElement(By.xpath("//*[@id=\"import-srp__srp-word-10\"]")).sendKeys("pear");
		driver.findElement(By.xpath("//*[@id=\"import-srp__srp-word-11\"]")).sendKeys("boring");

		// ("vast subject prize relax valid section shell jealous fun army pear boring")

		// Enter password
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Rajametamask01");
		// Enter confirm password
		driver.findElement(By.xpath("//*[@id=\"confirm-password\"]")).sendKeys("Rajametamask01");
		// Agreee terms and conditions
		driver.findElement(By.xpath("//*[@id=\"create-new-vault__terms-checkbox\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[2]/div/div/div[2]/form/button")).click();
		Thread.sleep(10000);

		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/button")).click();
//
////		    # closing the message popup after all done metamask screen
		Thread.sleep(3000);
		System.out.println("seed phrase input done and wallet setup successfully");
		// click on ethereum buttom
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/span")).click();
//		    //click on hide/show link
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[3]/span/a")).click();
//		    //click on show test network
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id=\"app-content\"]/div/div[3]/div/div[2]/div[2]/div[2]/div[8]/div[2]/div/label/div[1]/div[2]/div"))
				.click();
//		    // click on close
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[3]/div/div[1]/div[1]/div[2]")).click();
//		    
		Thread.sleep(1000);
		System.out.println("Wallet has been imported successfully");
		Thread.sleep(1000);
		driver.switchTo().window(tabs2.get(1));
		System.out.println("switched to target tab for URL");
	}

	// Change network to Goerli
	public static void ChangeNetworkToGoerli(ChromeDriver driver) throws InterruptedException {

		System.out.println("Changing network");
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(0));
		System.out.println("tab switched");
		driver.get("chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn//home.html");
		// driver.get(EXTENSION_PROTOCOL + "://" + EXTENSION_ID + "/home.html");
		System.out.println("Closing popup");
		Thread.sleep(1500);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/li[2]/span")).click();
		System.out.println("Network Changed to Goerli");
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(1000);
	}

	// Change network to Sepolia
	public static void ChangeNetworkToSepolia(ChromeDriver driver) throws InterruptedException {

		System.out.println("Changing network");
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(0));
		System.out.println("tab switched");
		driver.get("chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn//home.html");
		// driver.get(EXTENSION_PROTOCOL + "://" + EXTENSION_ID + "/home.html");
		System.out.println("Closing popup");
		Thread.sleep(1500);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/li[3]/span")).click();
		System.out.println("Network Changed to Sepolia");
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(1000);
	}

	// Lock Metamask Wallet
	public static void LockWallet(ChromeDriver driver) throws InterruptedException {

		System.out.println("Locking Wallet");
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(0));
		System.out.println("tab switched");
		driver.get("chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn//home.html");
		// driver.get(EXTENSION_PROTOCOL + "://" + EXTENSION_ID + "/home.html");
		System.out.println("Closing popup");
		Thread.sleep(1500);
		// click on round button
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/button/div")).click();
		Thread.sleep(1000);
		// click on lock button
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/button")).click();
		System.out.println("MetaMask Locked");
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(1000);
	}

	public static void UNlockWallet(ChromeDriver driver, String Metamask_pwd) throws InterruptedException {

		System.out.println("Unlocking Wallet");
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(0));
		System.out.println("tab switched");
		driver.get("chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn//home.html");
		// driver.get(EXTENSION_PROTOCOL + "://" + EXTENSION_ID + "/home.html");
		System.out.println("Closing popup");
		Thread.sleep(1500);
		// Enter password
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/form/div/div/input")).sendKeys(Metamask_pwd);
		Thread.sleep(1000);
		// click on Unlock button
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/button")).click();
		System.out.println("MetaMask Unlocked");
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(1000);
	}

	public static void AddNetwork(ChromeDriver driver, String Network_Name, String Network_URL, String Chain_ID,
			String Currency_Symbol) throws InterruptedException {

		System.out.println("Adding network");
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(0));
		System.out.println("tab switched");
		driver.get("chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn//home.html");
		// driver.get(EXTENSION_PROTOCOL + "://" + EXTENSION_ID + "/home.html");
		System.out.println("Closing popup");
		Thread.sleep(1500);

		// driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/span")).click();

		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[3]/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/div[2]/div/div[2]/a/h6")).click();
		// adding network fields
		Thread.sleep(1500);
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/label/input"))
				.sendKeys(Network_Name);
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/label/input"))
				.sendKeys(Network_URL);
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/label/input"))
				.sendKeys(Chain_ID);
		driver.findElement(
				By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[4]/label/input"))
				.sendKeys(Currency_Symbol);
		// driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/div[2]/div/div[2]/div/div[2]/div[5]/label/input")).sendKeys(Explorer_URL);
		// click on save button
		// driver.findElement(By.xpath("")).click();

		System.out.println("Network added successfully");
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(1000);
	}
	//

//	public static void changeMetamaskNetwork(ChromeDriver driver, String networkName) throws InterruptedException {
//
//		System.out.println("Changing network");
//		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs2.get(0));
//		System.out.println("tab switched");
//		driver.get("chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn//home.html");
//		// driver.get(EXTENSION_PROTOCOL + "://" + EXTENSION_ID + "/home.html");
//		System.out.println("Closing popup");
//		Thread.sleep(1500);
//		
//		//driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div/span")).click();
//		
//		driver.findElement(By.xpath("//*[@id='popover-content']/div/div/section/header/div/button")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id='app-content']/div/div[1]/div/div[2]/div[1]/div/span")).click();
//
//		WebElement element = driver.findElement(By.xpath("//*[@id=\'app-content\']/div/div[3]/div"));
//		Thread.sleep(1000);
//
//		List<WebElement> li_tagsElements = element.findElements(By.tagName("li"));
//		Thread.sleep(1000);
//		for (WebElement elem : li_tagsElements) {
//			String textElementString = elem.getText();
//			if (textElementString.equals(networkName)) {
//				Thread.sleep(1500);
//				elem.click();
//				System.out.println(textElementString + " is selected");
//				driver.switchTo().window(tabs2.get(0));
//				Thread.sleep(1500);
//				return;
//			}
//		}
//		System.out.println("Please provide a valid network name");
//		driver.switchTo().window(tabs2.get(1));
//		Thread.sleep(1000);
//	}

//	public static void connectToWebsite(ChromeDriver driver) throws InterruptedException {
//
//		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs2.get(2));
//		System.out.println("tab switched");
//		driver.get("chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn//popup.html");
//		// driver.get(EXTENSION_PROTOCOL + "://" + EXTENSION_ID + "/popup.html");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[3]/div[2]/button[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div[2]/footer/button[2]")).click();
//		System.out.println("Site connected to metamask");
//		driver.switchTo().window(tabs2.get(0));
//	}

	public static void connectToWebsite(ChromeDriver driver) throws InterruptedException {
		// experiment
		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> iterator = windowhandles.iterator();
		String parentwindow = iterator.next();
		String childwindow = iterator.next();
		System.out.println("tab switched");
		driver.get("chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn//popup.html");
		// driver.get(EXTENSION_PROTOCOL + "://" + EXTENSION_ID + "/popup.html");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[3]/div[2]/button[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div[2]/footer/button[2]")).click();
		System.out.println("Site connected to metamask");
		driver.switchTo().window(parentwindow);

	}

	public static void confirmApprovalFromMetamask(ChromeDriver driver) throws InterruptedException {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		// experiment
//		Set <String> windowhandles = driver.getWindowHandles();
//		Iterator <String> iterator = windowhandles.iterator();
//		String parentwindow = iterator.next();
//		String childwindow = iterator.next();

		//

		driver.get("chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn//popup.html");
		// driver.get(EXTENSION_PROTOCOL + "://" + EXTENSION_ID + "/popup.html");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		// confirm approval from metamask
		driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[3]/div/div[4]/footer/button[2]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Approval transaction confirmed");
		// driver.close();

		// switch to dafi
		// driver.switchTo().window(parentwindow);
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(1000);
	}

	public static void rejectApprovalFromMetamask(ChromeDriver driver) throws InterruptedException {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		driver.get("chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn//notification.html");
		// driver.get(EXTENSION_PROTOCOL + "://" + EXTENSION_ID + "/popup.html");
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		// confirm approval from metamask
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[5]/div[3]/footer/button[1]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Approval transaction rejected");

		// switch to dafi
		driver.switchTo().window(tabs2.get(0));
		System.out.println("Reject approval from metamask");
	}

	public static void confirmTransactionFromMetamask(ChromeDriver driver) throws InterruptedException {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		driver.get("chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn//popup.html");
		// driver.get(EXTENSION_PROTOCOL + "://" + EXTENSION_ID + "/popup.html");
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		// confirm transaction from metamask
		driver.findElement(By.xpath("//*[@id=\"app-content\"]/div/div[3]/div/div[3]/div[3]/footer/button[2]")).click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Transaction confirmed");

		// switch to Dapp
		driver.switchTo().window(tabs2.get(0));
		Thread.sleep(1000);

	}

	public static void rejectTransactionFromMetamask(ChromeDriver driver) throws InterruptedException {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		driver.get("chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn//notification.html");
		// driver.get(EXTENSION_PROTOCOL + "://" + EXTENSION_ID + "/popup.html");
		// confirm reject transaction from metamask
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[5]/div[2]/ul/li[1]/button"))
				.sendKeys(Keys.CONTROL, Keys.END);
		Thread.sleep(5000);
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[5]/div[4]/footer/button[1]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Transaction rejected");

		// switch to web window
		driver.switchTo().window(tabs2.get(0));
		Thread.sleep(1000);
		System.out.println("back to main Dapp");

	}

}
