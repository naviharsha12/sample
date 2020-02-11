package ranfordbank_Admin_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import ranfordbank_pageObjects.New_EmployeeCreation;

public class NEC_TestCases 
{
	WebDriver driver;
	New_EmployeeCreation nec;

	public NEC_TestCases(WebDriver driver) 
	{
		this.driver=driver;
		nec=new New_EmployeeCreation(driver);
	}
	public void NewEmpCreation(String Empname, String LoginPWD, String Role, String Branch)
	{
		
		nec.NEC_Employername_EB.clear();
		nec.NEC_Employername_EB.sendKeys(Empname);
		nec.NEC_Loginpassword_EB.clear();
		nec.NEC_Loginpassword_EB.sendKeys(LoginPWD);
		new Select(nec.NEC_Role_LB).selectByVisibleText(Role);
		new Select(nec.NEC_Branch_LB).selectByVisibleText(Branch);
		
	}
	public void Submit()
	{
		nec.NEC_Submit_btn.click();
	}
	public void Reset()
	{
		nec.NEC_Reset_btn.click();
	}
	public void Cancel()
	{
		nec.NEC_Cancel_btn.click();
		
	}
	
	}


