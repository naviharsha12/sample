package ranfordbank_Admin_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import ranfordbank_pageObjects.Branch_Details_Page;

public class BDP_TestCases 
{
	WebDriver driver;
	Branch_Details_Page bdp;
	

	public BDP_TestCases(WebDriver driver) 
	
	{
		this.driver=driver;
		
		// TODO Auto-generated constructor stub
	}
	public void new_Branch()
	{
		bdp.BDP_NewBranch_btn.click();
		
	}
	public void s(String countryname,String Statename, String cityname)
	{
		new Select(bdp.BDP_Country_btn).selectByVisibleText(countryname);
		new Select(bdp.BDP_State_btn).selectByVisibleText(Statename);
		new Select(bdp.BDP_City_btn).selectByVisibleText(cityname);
	
	}
	public void Search()
	{
		bdp.BDP_Search_btn.click();
		
	}
	public void Clear()
	{
		bdp.BDP_Clear_btn.click();
		
	}
	
	
	
	

}
