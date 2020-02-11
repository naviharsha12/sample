package ranfordbank_pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_Details_Page 
{
	WebDriver driver;

	public User_Details_Page(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//input[@id='Btnuser']")
	public WebElement UDP_NewUser_btn;
	
	@FindBy(xpath="//select[@id='lst_branchS']")
	public WebElement UDP_Branch_LB;
	
	@FindBy(xpath="//select[@id='lst_rolesS']")
	public WebElement UDP_Roles_LB;
	
	@FindBy(xpath="//input[@id='btn_search']")
	public WebElement UDP_Search_btn;
	
	@FindBy(xpath="//input[@id='btn_clear']")
	public WebElement UDP_Clear_btn;
	
	@FindBy(xpath="//a[@href='adminflow.aspx']")
	public WebElement UDP_Home_btn;
	
	@FindBy(xpath="//a[@href='change_password.aspx']")
	public WebElement UDP_ChangePassword;
	
	@FindBy(xpath="//a[@href='home.aspx']")
	public WebElement UDP_LogOut_btn;
	
	@FindBy(xpath="//a[@href='admin_banker_master.aspx']")
	public WebElement UDP_Branches_btn;
	
	@FindBy(xpath="//a[@href='Admin_Roles_details.aspx']")
	public WebElement UDP_Roles_btn;
	
	@FindBy(xpath="//a[@href='userdetails.aspx']")
	public WebElement UDP_Users_btn;
	
	@FindBy(xpath="//a[@href='Admin_Emp_details.aspx']")
	public WebElement UDP_Employee_btn;
	

}
