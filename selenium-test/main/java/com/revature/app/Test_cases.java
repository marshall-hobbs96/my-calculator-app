package com.revature.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test_cases {
	
	public static String addId1;
	public static String addId2;
	public static String addBtnId; 
	
	public static String subtractionId1; 
	public static String subtractionId2; 
	public static String subtractionBtnId;
	
	public static String multiplyId1;
	public static String multiplyId2; 
	public static String multiplyBtnId; 
	
	public static String divisionId1; 
	public static String divisionId2; 
	public static String divisionBtnId; 
	
	public static void additionInfo(String addId1, String addId2, String addBtn) {	//helper function to fill out addition calculator html tags so webdriver knows where things are
		
		Test_cases.addId1 = addId1;  
		Test_cases.addId2 = addId2;
		Test_cases.addBtnId = addBtn;
		 
		
	}
	
	public static void subtractionInfo(String subtractionId1, String subtractionId2, String subtractionBtnId) {	//helper function to fill out subtraction calculator html tags
		
		Test_cases.subtractionId1 = subtractionId1; 
		Test_cases.subtractionId2 = subtractionId2; 
		Test_cases.subtractionBtnId = subtractionBtnId;
		
	}
	
	public static void multiplyInfo(String multiplyId1, String multiplyId2, String multiplyBtnId) {	//helper function to fill out multiplication html tags
		
		Test_cases.multiplyId1 = multiplyId1; 
		Test_cases.multiplyId2 = multiplyId2; 
		Test_cases.multiplyBtnId = multiplyBtnId; 
		
	}
	
	public static void divisionInfo(String divisionId1, String divisionId2, String divisionBtnId) {	//helper function to fill out division html tags
		
		Test_cases.divisionId1 = divisionId1; 
		Test_cases.divisionId2 = divisionId2; 
		Test_cases.divisionBtnId = divisionBtnId; 
		
	}
	
	public static String additionTest(WebDriver driver, String num1, String num2) {	
		//function for testing functionality of our addition function on my-calculator-app
		//need to make sure we get the proper output when we put in two numbers
		//also need to make sure we get proper output when we neglect to input one or both of the numbers
		WebElement addInput1 = driver.findElement(By.id(Test_cases.addId1)); 
		WebElement addInput2 = driver.findElement(By.id(Test_cases.addId2));
		WebElement addBtn = driver.findElement(By.id(Test_cases.addBtnId));
		
		String testOutcome = "";
		
		addInput1.sendKeys(num1);
		addInput2.sendKeys(num2);
		addBtn.click();
		
		driver.switchTo().frame("result");
		WebElement addOutput = driver.findElement(By.tagName("pre"));
		String textOutput = addOutput.getText(); 
		driver.switchTo().defaultContent();
		
		double actualResult = Double.parseDouble(textOutput);
		//double doubleNum1 = Double.parseDouble(num1);
		//double doubleNum2 = Double.parseDouble(num2);
		
		double expectedResult = (Double.parseDouble(num1) + Double.parseDouble(num2));
		
		if(expectedResult != actualResult) {
			
			testOutcome += "Test failed. Expected result does not equal actual result";
			
		}
		
		else {
			
			testOutcome += "Test passed";
			
		}
		
		
		return testOutcome; 
	}
	
	public static String subtractionTest(WebDriver driver, String num1, String num2) {
		//function for testing functionality of our subtraction function on my-calculator-app
		//need to make sure we get the proper output when we put in two numbers
		//also need to make sure we get proper output when we neglect to input one or both of the numbers
		
		WebElement subInput1 = driver.findElement(By.id(Test_cases.subtractionId1)); 
		WebElement subInput2 = driver.findElement(By.id(Test_cases.subtractionId2));
		WebElement subBtn = driver.findElement(By.id(Test_cases.subtractionBtnId));
		
		String testOutcome = ""; 
		
		subInput1.sendKeys(num1);
		subInput2.sendKeys(num2);
		subBtn.click();
		
		driver.switchTo().frame("result");
		WebElement subOutput = driver.findElement(By.tagName("pre"));
		String textOutput = subOutput.getText();
		driver.switchTo().defaultContent();
		
		double actualResult = Double.parseDouble(textOutput);
		double expectedResult = (Double.parseDouble(num1) - Double.parseDouble(num2));
		
		if(actualResult != expectedResult) {
			
			testOutcome += "Test failed. Actual result does not equal expected result";
			
		}
		
		else {

			testOutcome += "Test passed";
			
		}
		
		return testOutcome; 
	}
	
	public static String multiplyTest(WebDriver driver, String num1, String num2) {
		//function for testing functionality of our multiply function on my-calculator-app
		//need to make sure we get the proper output when we put in two numbers
		//also need to make sure we get proper output when we neglect to input one or both of the numbers

		WebElement multInput1 = driver.findElement(By.id(Test_cases.multiplyId1)); 
		WebElement multInput2 = driver.findElement(By.id(Test_cases.multiplyId2));
		WebElement multBtn = driver.findElement(By.id(Test_cases.multiplyBtnId));
		
		multInput1.sendKeys(num1);
		multInput2.sendKeys(num2);
		multBtn.click();
		
		String testOutcome = "";
		
		driver.switchTo().frame("result");
		WebElement subOutput = driver.findElement(By.tagName("pre"));
		String textOutput = subOutput.getText();
		driver.switchTo().defaultContent();
		
		double actualResult = Double.parseDouble(textOutput);
		double expectedResult = (Double.parseDouble(num1) * Double.parseDouble(num2));
		
		if(actualResult != expectedResult) {
			
			testOutcome += "Test failed. Actual result does not equal expected result";
			
		}
		
		else {

			testOutcome += "Test passed";
			
		}
		
		return testOutcome;
		
		
	}
	
	public static String divisionTest(WebDriver driver, String num1, String num2) {
		//function for testing functionality of our division function on my-calculator-app
		//need to make sure we get the proper output when we put in two numbers
		//also need to make sure we get proper output when we neglect to input one or both of the numbers
		
		WebElement divInput1 = driver.findElement(By.id(Test_cases.divisionId1)); 
		WebElement divInput2 = driver.findElement(By.id(Test_cases.divisionId2));
		WebElement divBtn = driver.findElement(By.id(Test_cases.divisionBtnId));
		
		divInput1.sendKeys(num1);
		divInput2.sendKeys(num2);
		divBtn.click();
		
		String testOutcome = "";
		
		driver.switchTo().frame("result");
		WebElement subOutput = driver.findElement(By.tagName("pre"));
		String textOutput = subOutput.getText();
		driver.switchTo().defaultContent();
		
		double actualResult = Double.parseDouble(textOutput);
		double expectedResult = (Double.parseDouble(num1) / Double.parseDouble(num2));
		
		if(actualResult != expectedResult) {
			
			testOutcome += "Test failed. Actual result does not equal expected result";
			
		}
		
		else {

			testOutcome += "Test passed";
			
		}
		
		return testOutcome; 
		
	}
}
