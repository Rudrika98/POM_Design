package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_Admin_Job_JobTitles {

	/****
	 * * Author Rudrika *
	 */

	WebDriver driver;

	public OrangeHRM_Admin_Job_JobTitles(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "menu_admin_viewAdminModule")
	WebElement OrangeHRM_Admin_Adminclick;

	@FindBy(linkText = "Job")
	WebElement OrangeHRM_Admin_JobClick;

	@FindBy(id = "menu_admin_viewJobTitleList")
	WebElement OrangeHRM_Admin_JobTitles_Click;

	@FindBy(id = "btnAdd")
	WebElement OrangeHRM_Admin_JobTitles_Add_Button;

	@FindBy(id = "btnDelete")
	WebElement OrangeHRM_Admin_JobTitles_Delete_Button;

	@FindBy(id = "ohrmList_chkSelectAll")
	WebElement OrangeHRM_Admin_JobTitles_CheckBox_All;

	@FindBy(linkText = "Job Title")
	WebElement OrangeHRM_Admin_JobTitles_Job_Title;

	@FindBy(xpath = "//span[@class='headerCell']")
	WebElement OrangeHRM_Admin_JobTitles_Job_Description;

	@FindBy(linkText = "Account Clerk")
	WebElement OrangeHRM_Admin_JobTitles_Account_Clerk;

	@FindBy(linkText = "CEO")
	WebElement OrangeHRM_Admin_JobTitles_CEO;

	@FindBy(linkText = "Finance Manager")
	WebElement OrangeHRM_Admin_JobTitles_Finance_Manager;

	@FindBy(linkText = "HR Executive")
	WebElement OrangeHRM_Admin_JobTitles_HR_Executive;

	@FindBy(linkText = "HR Manager")
	WebElement OrangeHRM_Admin_JobTitles_HR_Manager;

	@FindBy(linkText = "IT Executive")
	WebElement OrangeHRM_Admin_JobTitles_IT_Executive;

	@FindBy(linkText = "IT Manager")
	WebElement OrangeHRM_Admin_JobTitles_IT_Manager;

	@FindBy(linkText = "Manger")
	WebElement OrangeHRM_Admin_JobTitles_Manger; // Spelling of Manager
													// is wrong in UI

	@FindBy(linkText = "Sales Executive")
	WebElement OrangeHRM_Admin_JobTitles_Sales_Executive;

	@FindBy(linkText = "Sales Manager")
	WebElement OrangeHRM_Admin_JobTitles_Sales_Manager;

	public void OrangeHRM_Admin_Adminclick() {
		OrangeHRM_Admin_Adminclick.click();
	}

	public void OrangeHRM_Admin_JobClick() {
		OrangeHRM_Admin_JobClick.click();
	}

	public void OrangeHRM_Admin_JobTitles_Click() {
		OrangeHRM_Admin_JobTitles_Click.click();
	}

	// Function is to add button
	public void OrangeHRM_Admin_JobTitles_Add_Button() {
		OrangeHRM_Admin_JobTitles_Add_Button.click();
	}

	// Function is to delete button
	public void OrangeHRM_Admin_JobTitles_Delete_Button() {
		OrangeHRM_Admin_JobTitles_Delete_Button.click();
	}

	// Function is to check functionaliy
	public boolean OrangeHRM_Admin_JobTitles_CheckBox_All() {
		return OrangeHRM_Admin_JobTitles_CheckBox_All.isSelected();
	}

	public void OrangeHRM_Admin_JobTitles_Job_Title() {
		OrangeHRM_Admin_JobTitles_Job_Title.click();
	}

	public String OrangeHRM_Admin_JobTitles_Job_Description() {
		return OrangeHRM_Admin_JobTitles_Job_Description.getText();
	}

	public void OrangeHRM_Admin_JobTitles_Account_Clerk() {
		OrangeHRM_Admin_JobTitles_Account_Clerk.click();
	}

	public void OrangeHRM_Admin_JobTitles_CEO() {
		OrangeHRM_Admin_JobTitles_CEO.click();
	}

	public void OrangeHRM_Admin_JobTitles_Finance_Manager() {
		OrangeHRM_Admin_JobTitles_Finance_Manager.click();
	}

	public void OrangeHRM_Admin_JobTitles_HR_Executive() {
		OrangeHRM_Admin_JobTitles_HR_Executive.click();
	}

	public void OrangeHRM_Admin_JobTitles_HR_Manager() {
		OrangeHRM_Admin_JobTitles_HR_Manager.click();
	}

	public void OrangeHRM_Admin_JobTitles_IT_Executive() {
		OrangeHRM_Admin_JobTitles_IT_Executive.click();
	}

	public void OrangeHRM_Admin_JobTitles_IT_Manager() {
		OrangeHRM_Admin_JobTitles_IT_Manager.click();
	}

	public void OrangeHRM_Admin_JobTitles_Mange() {
		OrangeHRM_Admin_JobTitles_Manger.click();
	}

	public boolean OrangeHRM_Admin_JobTitles_Sales_Executive() {
		return OrangeHRM_Admin_JobTitles_Manger.isSelected();
	}

	public boolean OrangeHRM_Admin_JobTitles_Sales_Manager() {
		return OrangeHRM_Admin_JobTitles_Manger.isSelected();
	}

}
