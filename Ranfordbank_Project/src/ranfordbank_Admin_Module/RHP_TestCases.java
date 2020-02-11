package ranfordbank_Admin_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import ranfordbank_pageObjects.Ranford_Home_page;

public class RHP_TestCases 
{
	WebDriver driver;
	Ranford_Home_page rhp=new Ranford_Home_page(driver);
	

	public RHP_TestCases(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void _Home()
	{
		rhp.RHP_Home_btn.click();
		
	}
	public void Personal_Banking()
	{
		rhp.RHP_Personalbanking_btn.click();
		
	}
	public void Corporate_Banking()
	{
		rhp.RHP_Corporatebanking_btn.click();
		
	}
	public void International_banking()
	{
		rhp.RHP_Corporatebanking_btn.click();
		
	}
	public void About_Us()
	{
		rhp.RHP_Aboutus_btn.click();
		
	}
	
	public void CL_personal()
	{
		rhp.RHP_CL_Personal_btn.click();;
		
	}
	public void CL_Corporate()
	{
		rhp.RHP_CL_Corporate_btn.click();
		
	}
	
	public void CL_International()
	{
		rhp.RHP_CL_International_btn.click();
		
	}
	
	public void Banker_Login(String BL_UID,String BL_PWD, String countryname)
	{
		new Select(rhp.RHP_BL_BranchName_LB).selectByVisibleText(countryname);
		rhp.RHP_BL_UserName_EB.clear();
		rhp.RHP_BL_UserName_EB.sendKeys(BL_UID);
		rhp.RHP_BL_Password_EB.clear();
		rhp.RHP_BL_Password_EB.sendKeys();
		rhp.RHP_BL_Login_btn.click();
		
	}
	
}
