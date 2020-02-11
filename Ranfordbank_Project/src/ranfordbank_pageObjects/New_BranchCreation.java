package ranfordbank_pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class New_BranchCreation 
{
	WebDriver driver;

	public New_BranchCreation(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	@FindBy(xpath="//input[@id='txtbName']")
	public WebElement NBC_Branchname_EB;
	
	@FindBy(xpath="//input[@id='txtAdd1']")
	public WebElement NCB_Address1_EB;
	
	@FindBy(xpath="//input[@id='Txtadd2']")
	public WebElement NCB_Address2_EB;
	
	@FindBy(xpath="//input[@id='txtadd3']")
	public WebElement NCB_Address3_EB;
	
	@FindBy(xpath="//input[@id='txtArea']")
	public WebElement NBC_Area_EB;
	
	@FindBy(xpath="//input[@id='txtZip']")
	public WebElement NBC_ZipCode_EB;

	@FindBy(xpath="//select[@id='lst_counrtyU']")
	public WebElement NBC_Country_LB;

	@FindBy(xpath="//select[@id='lst_stateI']")
	public WebElement NBC_State_LB;

	@FindBy(xpath="//select[@id='lst_cityI']")
	public WebElement NBC_City_LB;

	@FindBy(xpath="//input[@id='btn_insert']")
	public WebElement NBC_Submit_btn;

	
	@FindBy(xpath="//input[@id='Btn_Reset']")
	public WebElement NBC_Reset_btn;

	@FindBy(xpath="//input[@id='Btn_cancel']")
	public WebElement NBC_Cancel_btn;
	
	@FindBy(xpath="//a[@href='adminflow.aspx']")
	public WebElement NBC_Home_btn;
	
	@FindBy(xpath="//a[@href='change_password.aspx']")
	public WebElement NBC_ChangePassword_btn;
	
	@FindBy(xpath="//a[@href='home.aspx']")
	public WebElement NBC_LogOut_btn;
	
	@FindBy(xpath="//input[@id='BtnNewBR']")
	public WebElement NBC_Branches_btn;
	
	@FindBy(xpath="//a[@href='Admin_Roles_details.aspx']")
	public WebElement NBC_Roles_btn;
	
	@FindBy(xpath="//a[@href='userdetails.aspx']")
	public WebElement NBC_Users_btn;
	
	@FindBy(xpath="//a[@href='Admin_Emp_details.aspx']")
	public WebElement NBC_Employee_btn;
	

}
