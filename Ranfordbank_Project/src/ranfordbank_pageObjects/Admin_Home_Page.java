package ranfordbank_pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_Home_Page 
{
	WebDriver driver;

	public Admin_Home_Page(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	@FindBy(xpath="//a[@href='adminflow.aspx']")
	public WebElement AHP_Home_btn;
	
	@FindBy(xpath="//a[@href='change_password.aspx']")
	public WebElement AHP_ChangePassword_btn;
	
	@FindBy(xpath="//a[@href='home.aspx']")
	public WebElement AHP_LogOut_btn;
	
	@FindBy(xpath="//a[@href='admin_banker_master.aspx']")
	public WebElement AHP_Branches_btn;
	
	@FindBy(xpath="//a[@href='Admin_Roles_details.aspx']")
	public WebElement AHP_Roles_btn;
	
	@FindBy(xpath="//a[@href='userdetails.aspx']")
	public WebElement AHP_Users_btn;
	
	@FindBy(xpath="//a[@href='Admin_Emp_details.aspx']")
	public WebElement AHP_Employee_btn;
	
	


}
