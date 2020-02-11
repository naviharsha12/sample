package ranfordbank_Admin_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import ranfordbank_pageObjects.New_UserCreation;

public class NUC_testcases 
{
	WebDriver driver;
	New_UserCreation nuc;
	

	public NUC_testcases(WebDriver driver) 
	{
		this.driver=driver;
		
	}
	public void newuser_Creation(String role, String branch, String customerid, String Cname, String uname, String Loginpwd, String TPWD)
	{
		
		new Select(nuc.NUC_Role_LB).selectByVisibleText(role);
		new Select(nuc.NUC_Branch_LB).selectByVisibleText(branch);
		new Select(nuc.NUC_CustomerId_LB).selectByVisibleText(customerid);
		
		nuc.NUC_Customername_EB.clear();
		nuc.NUC_Customername_EB.sendKeys(Cname);
		
		nuc.NUC_Username_EB.clear();
		nuc.NUC_Username_EB.sendKeys(uname);
		
		nuc.NUC_Loginpassword_EB.clear();
		nuc.NUC_Loginpassword_EB.sendKeys(Loginpwd);
		
		nuc.NUC_Transactionpassword_EB.clear();
		nuc.NUC_Transactionpassword_EB.sendKeys(TPWD);
	}
	public void submit()
	{
		nuc.NUC_Submit_btn.click();
	}
	public void reset()
	{
		nuc.NUC_Reset_btn.click();
	}
	public void cancel()
	{
		nuc.NUC_Cancel_btn.click();
	}
	public void LoGout()
	{
		nuc.NUC_LogOut_btn.click();
	}
	public void home()
	{
		nuc.NUC_Home_btn.click();
		
	}

}
