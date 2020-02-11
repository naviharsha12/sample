package ranfordbank_Admin_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import ranfordbank_pageObjects.New_BranchCreation;

public class NBC_TestCases 
{
	WebDriver driver;
	New_BranchCreation nbc;

	public NBC_TestCases(WebDriver driver) 
	{
		
		this.driver=driver;
		nbc=new New_BranchCreation(driver);
	}
	public void New_branch_creation(String Br_name,String Add1,String Add2,String Add3,String R_name,String zipcode, String Country_name, String S_name,String Cityname ) throws Exception
	{
		
		nbc.NBC_Branchname_EB.clear();
		nbc.NBC_Branchname_EB.sendKeys(Br_name);
		
		nbc.NCB_Address1_EB.clear();
		nbc.NCB_Address1_EB.sendKeys(Add1);
		
		nbc.NCB_Address2_EB.clear();
		nbc.NCB_Address2_EB.sendKeys(Add2);
		
		nbc.NCB_Address3_EB.clear();
		nbc.NCB_Address3_EB.sendKeys(Add3);
		
		nbc.NBC_Area_EB.clear();
		nbc.NBC_Area_EB.sendKeys(R_name);;
		
		nbc.NBC_ZipCode_EB.clear();
		nbc.NBC_ZipCode_EB.sendKeys(zipcode);
		new Select(nbc.NBC_Country_LB).selectByVisibleText(Country_name);
		Thread.sleep(2000);
		new Select(nbc.NBC_State_LB).selectByVisibleText(S_name);
		Thread.sleep(2000);
		new Select(nbc.NBC_City_LB).selectByVisibleText(Cityname);
		
		
	}
	public void Submit()
	{
		nbc.NBC_Submit_btn.click();
		
	}
	public void Reset()
	{
		nbc.NBC_Reset_btn.click();
		
	}public void cancel()
	{
		nbc.NBC_Cancel_btn.click();
		
	}
	public void Logout()
	{
		nbc.NBC_LogOut_btn.click();
	}



}
