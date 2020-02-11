package ranfordbank_Admin_Module;

import org.openqa.selenium.WebDriver;

import ranfordbank_pageObjects.Roles_Details_page;

public class RDP_TestCases 
{
	WebDriver driver;
	Roles_Details_page rdp;
	

	public RDP_TestCases(WebDriver driver) 
	{
		this.driver=driver;
	
	}
	public void new_Role()
	{
		rdp.RDP_newrole.click();
	}

}
