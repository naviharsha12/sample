package ranfordbank_pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class New_EmployeeCreation 
{
	WebDriver driver;

	public New_EmployeeCreation(WebDriver driver) 
	{
		
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	@FindBy(xpath="//input[@id='txtUname']")
	public WebElement NEC_Employername_EB;
	
	@FindBy(xpath="//input[@id='txtLpwd']")
	public WebElement NEC_Loginpassword_EB;
	
	@FindBy(xpath="//select[@id='lst_Roles']")
	public WebElement NEC_Role_LB;
	
	@FindBy(xpath="//select[@id='lst_Branch']")
	public WebElement NEC_Branch_LB;
	
	@FindBy(xpath="//input[@id='BtnSubmit']")
	public WebElement NEC_Submit_btn;
	
	@FindBy(xpath="//input[@id='btnreset']")
	public WebElement NEC_Reset_btn;
	
	@FindBy(xpath="//input[@id='btnCancel']")
	public WebElement NEC_Cancel_btn;
	
	public void NewEmpCreation(String Empname, String LoginPWD, String Role, String Branch)
	{
		
		NEC_Employername_EB.clear();
		NEC_Employername_EB.sendKeys(Empname);
		NEC_Loginpassword_EB.clear();
		NEC_Loginpassword_EB.sendKeys(LoginPWD);
		new Select(NEC_Role_LB).selectByVisibleText(Role);
		new Select(NEC_Branch_LB).selectByVisibleText(Branch);
		
	}
	public void Submit()
	{
		NEC_Submit_btn.click();
	}
	public void Reset()
	{
		NEC_Reset_btn.click();
	}
	public void Cancel()
	{
		NEC_Cancel_btn.click();
		
	}
	
	
	

}
