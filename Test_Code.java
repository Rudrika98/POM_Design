package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Code {

	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//Rudrika//git//OrangeHrmAutomation-1//src//test//resources//drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Chrome Driver is class which

		// C:\Users\Rudrika\git\OrangeHrmAutomation-1\src\test\resources\drivers\chromedriver.exe

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		OrangeHRM_Login_Page logIn = new OrangeHRM_Login_Page(driver);
		
		logIn.Login_Username("admin");
		
		logIn.Login_Password("admin123");
		
		logIn.Login_Button();

		OrangeHRM_Admin_Page page = new OrangeHRM_Admin_Page(driver);

		OrangeHRM_Admin_Job_JobTitles job = new OrangeHRM_Admin_Job_JobTitles(driver);
		
		job.OrangeHRM_Admin_Adminclick();
		
		job.OrangeHRM_Admin_JobClick();
		
		job.OrangeHRM_Admin_JobTitles_Click();
		
		job.OrangeHRM_Admin_JobTitles_CEO();
	}
}
