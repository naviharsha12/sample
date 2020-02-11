package ranfordbank_Admin_Module;

import org.openqa.selenium.WebDriver;

import ranfordbank_pageObjects.Employee_Details_Page;

public class EDP_Testcases 
{
	WebDriver driver;
	Employee_Details_Page edp;

	public EDP_Testcases(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void NewEmployee()
	{
		
		edp.EDP_NewEmployee_btn.click();
	}

}
