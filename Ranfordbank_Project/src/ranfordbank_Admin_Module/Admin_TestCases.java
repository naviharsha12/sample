package ranfordbank_Admin_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import ranfordbank_pageObjects.Admin_Home_Page;
import ranfordbank_pageObjects.Ranford_Home_page;

public class Admin_TestCases 
{
	WebDriver driver;
	
	Admin_Home_Page ahp;
	

	public Admin_TestCases(WebDriver driver) 
	{
		this.driver=driver;
		
		
	}
	
	
	public void ahp_Changepassword()
	{
		ahp.AHP_ChangePassword_btn.click();
	}
	public void ahp_logout()
	{
		ahp.AHP_LogOut_btn.click();
	}
	public void ahp_branches()
	{
		ahp.AHP_Branches_btn.click();
	}
	public void ahp_roles()
	{
		ahp.AHP_Roles_btn.click();
	}
	
	public void ahp_users()
	{
		ahp.AHP_Users_btn.click();
	}
	
	public void ahp_employee()
	{
		ahp.AHP_Employee_btn.click();
	}
	
	
	
	

}
