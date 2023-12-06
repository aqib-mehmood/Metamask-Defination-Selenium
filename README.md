# Metamask-Defination-Selenium
Selenium WebDriver Setup using Maven in Eclipse IDE:
====================================================
-- First of all download the Eclipse IDE and install it (Java Developer version).
-- After installation, create a maven project.
-- While creating a maven project, select archetype org.apache.maven.archtype - quickstart from Catalog:Internal.
-- Then enter the Group Id that may be your organization name.
-- Then enter the Artifact Id that may be your project name.
-- Now that you have created a simple maven project in eclipse.
-- You can see that there are some folder structure that is showing src/main/java, src/test/java that's the beuaty of maven project.
-- You can easily manage the test classes and object classes.

-- Before moving ahead, let me describe each of the above folder.
-- Page Layer - 1: (Package = com.qa.pages in src/main/java) also known as Page Libraries, and Object Repositories as these contains collections of page objects only. Contains the Objects or Web Elements of all the pages in a seperate class of each page. Each class should only contains the actions or features etc in the form of methods on that specific page. For Example: clickRegisterButton(), clickFooterLink() etc.
-- Test Layer - 2: (Package = com.qa.tests in src/test/java) Each class should only contains the Test Scripts for each page object class seperately. Test class contains the TestNG annotations.
-- Base Class/ Parent Class - 3: (Package = com.qa.base in src/main/java) There should be a base class or parent class that should only contains the common methods for example: Properties files, chrome driver initilizations, maximizeWindows, pageLoadTime, implicitWait, deleteAllCookies, get(url) etc. This base class should be inherit by the Page Layer and Test Layer.
-- Environment Varibles - Layer 4: (Package = com.qa.configs in src/main/java) This class should contains the config.properites file. Inside that file we can add URL, username, password, browsers, others.
-- Test Data - Layer 5: (Package = com.qa.testdata in src/main/java) There will be a layer where we will store or read data from files like excel. This will contains the data files.
-- Test Utils - Layer 6: (Package = com.qa.utils in src/main/java) This will contians the utilities functions like read, write data or other actions from excel file. Take screenshot, sendmail, commonutils etc.
Test Report - Layer 7: (Package = com.qa.output/reports - it will be created by default) This will contains the test report (like HTML, TestNG, XML, ExtentReport etc) related stuff.

-- Now, we have to add all the required dependencies in our pom.xml file before writing test in selenium.

-- Given below is a list of all the Dependencies we need in maven project:
-1- Selenium java - Adding this we don't need to install selenium explicitly.
-2- TestNG - Testing framework for Java
-3- Log4J - Logging utility
-4- Apache POI - Used to read, write, and manipulate the data in mircorsoft documents like excel, power point and word.
-5- Extent Report- Report Generation in Selenium

Note: Install TestNG for Eclipse using Eclipse Marketplace for smooth running.
****************************************************************************************************************************
		<!-- Selenium Java Dependency -->	
		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>4.6.0</version>
		</dependency>

		<!-- TestNG Dependency - Install it from Eclipse marketplace and will added in each project. -->
		<!-- https://mvnrepository.com/artifact/org.testng/testng -->
		<dependency>
    			<groupId>org.testng</groupId>
    			<artifactId>testng</artifactId>
    			<version>7.7.1</version>
    			<scope>test</scope>
		</dependency>

		<!-- Extent Report -->
		<!-- https://mvnrepository.com/artifact/com.relevantcodes/extentreports -->
		<dependency>
			<groupId>com.relevantcodes</groupId>
			<artifactId>extentreports</artifactId>
			<version>2.41.2</version>
		</dependency>
		
		<!-- Log4j Dependency - Working -->
		<!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core -->
		<dependency>
			<groupId>log4j</groupId>
			<artifactId>log4j</artifactId>
			<version>1.2.17</version>
		</dependency>

		<!-- APACHE POI Dependency -->
		<!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi</artifactId>
			<version>5.2.3</version>
		</dependency>

		<!-- APACHE POI Dependency -->
		<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi-ooxml</artifactId>
			<version>5.2.3</version>
		</dependency>
****************************************************************************************************************************
