package ranfordbank_Admin_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import ranfordbank_pageObjects.New_RoleCreation_Page;



public class NRC_TestCases 
{
	WebDriver driver;
	New_RoleCreation_Page nrc;

	public NRC_TestCases(WebDriver driver) 
	{
		this.driver=driver;
		nrc=new New_RoleCreation_Page(driver);
	}
	public void Newrole_Creation(String Rname, String RDes, String Rtype) throws Exception
	{
		nrc.NRC_Rolename_EB.clear();
		nrc.NRC_Rolename_EB.sendKeys(Rname);
		nrc.NRC_RoleDes_EB.clear();
		nrc.NRC_RoleDes_EB.sendKeys(RDes);
		Thread.sleep(3000);
		new Select(nrc.NRC_RoleType_LB).selectByVisibleText(Rtype);
	}
	public void submit()
	{
		nrc.NRC_Submit_btn.click();
	}
	public void reset()
	{
		nrc.NRC_Reset_btn.click();
	}
	public void cancel()
	{
		nrc.NRC_Cancel_btn.click();
	}
	
	
	}


