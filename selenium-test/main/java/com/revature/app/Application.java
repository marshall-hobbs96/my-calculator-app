package com.revature.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Application {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:/WebDrivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080");
		
		Test_cases.additionInfo("addNum1", "addNum2", "addBtn");	
		Test_cases.subtractionInfo("subNum1", "subNum2", "subBtn");
		Test_cases.multiplyInfo("multNum1", "multNum2", "multBtn");
		Test_cases.divisionInfo("divNum1", "divNum2", "divBtn");
		
		String additionTestResult = "";
		String subtractionTestResult = "";
		String multiplyTestResult = "";
		String divideTestResult = "";
		
		additionTestResult += Test_cases.additionTest(driver,  "10.5", "20.5");
		subtractionTestResult += Test_cases.subtractionTest(driver, "50", "30");	
		multiplyTestResult += Test_cases.multiplyTest(driver, "7", "32");
		divideTestResult += Test_cases.divisionTest(driver, "49", "7");

		System.out.println("Addition test result: " + additionTestResult);
		System.out.println("Subtraction test result: " + subtractionTestResult);
		System.out.println("Multiplication test result: " + multiplyTestResult);
		System.out.println("Division test result: " + divideTestResult);

		
		driver.quit(); 
		
		
		

	}

}
