package ranfordbank_pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class New_UserCreation 
{
	WebDriver driver;

	public New_UserCreation(WebDriver driver) 
	{
		
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	@FindBy(xpath="//select[@id='lst_Roles']")
	public WebElement NUC_Role_LB;
	
	@FindBy(xpath="//select[@id='lst_Branch']")
	public WebElement NUC_Branch_LB;
	
	@FindBy(xpath="//select[@id='DrCName']")
	public WebElement NUC_CustomerId_LB;
	
	@FindBy(xpath="//input[@id='Lbc_name']")
	public WebElement NUC_Customername_EB;
	
	@FindBy(xpath="//input[@id='txtUname']")
	public WebElement NUC_Username_EB;
	
	@FindBy(xpath="//input[@id='txtLpwd']")
	public WebElement NUC_Loginpassword_EB;
	
	@FindBy(xpath="//input[@id='txtTpwd']")
	public WebElement NUC_Transactionpassword_EB;
	
	@FindBy(xpath="//input[@id='BtnSubmit']")
	public WebElement NUC_Submit_btn;
	
	@FindBy(xpath="//input[@id='btnreset']")
	public WebElement NUC_Reset_btn;
	
	@FindBy(xpath="//input[@id='btnCancel']")
	public WebElement NUC_Cancel_btn;

	@FindBy(xpath="//a[@href='adminflow.aspx']")
	public WebElement NUC_Home_btn;
	
	@FindBy(xpath="//a[@href='change_password.aspx']")
	public WebElement NUC_ChangePassword;
	
	@FindBy(xpath="//a[@href='home.aspx']")
	public WebElement NUC_LogOut_btn;
	
	@FindBy(xpath="//a[@href='admin_banker_master.aspx']")
	public WebElement NUC_Branches_btn;
	
	@FindBy(xpath="//a[@href='Admin_Roles_details.aspx']")
	public WebElement NUC_Roles_btn;
	
	@FindBy(xpath="//a[@href='userdetails.aspx']")
	public WebElement NUC_Users_btn;
	
	@FindBy(xpath="//a[@href='Admin_Emp_details.aspx']")
	public WebElement NUC_Employee_btn;
	
}
