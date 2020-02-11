package ranfordbank_pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ranford_Home_page 
{
	WebDriver driver;

	public Ranford_Home_page(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//a[@href='http://ravinderbasani.com']")
	 public WebElement RHP_Home_btn;
	
	@FindBy(xpath="//a[@href='personal_banking.html']")
	public WebElement RHP_Personalbanking_btn;
	
	@FindBy(xpath="//a[@href='Corporate Banking.html']")
	public WebElement RHP_Corporatebanking_btn;
	
	@FindBy(xpath="//a[@href='International Banking.html']")
	public WebElement RHP_internatinalbanking_btn;
	
	@FindBy(xpath="//a[@href='aboutus.html']")
	public WebElement RHP_Aboutus_btn;
	
	@FindBy(xpath="//input[@id='personal']")
	public WebElement RHP_CL_Personal_btn;
	
	@FindBy(xpath="//input[@id='corporate']")
	public WebElement RHP_CL_Corporate_btn;
	
	@FindBy(xpath="//input[@id='NRI']")
	public WebElement RHP_CL_International_btn;
	
	@FindBy(xpath="//select[@id='drlist']")
	public WebElement RHP_BL_BranchName_LB;
	
	@FindBy(xpath="//input[@id='txtuId']")
	public WebElement RHP_BL_UserName_EB;
	
	@FindBy(xpath="//input[@id='txtPword']")
	public WebElement RHP_BL_Password_EB;
	
	@FindBy(xpath="//input[@id='login']")
	public WebElement RHP_BL_Login_btn;
	
	@FindBy(xpath="")
	public WebElement RHP_Customerservice_btn;
	
	@FindBy(xpath="//a[@href='faqs.html']")
	public WebElement RHP_InternationalFAQS_btn;
	
	@FindBy(xpath="//a[@href='privacy.html']")
	public WebElement RHP_Pivacy_btn;
	
	@FindBy(xpath="//a[@href='terms&conditions.html']")
	public WebElement RHP_TermsAndConditions_btn;
	
	@FindBy(xpath="disclaimer.html")
	public WebElement RHP_Disclaimer_btn;
	
	@FindBy(xpath="sitemap.html")
	public WebElement RHP_Sitemap_btn;
	
	public void Admin_login(String UID,String PWD)
	{
		RHP_BL_UserName_EB.clear();
		RHP_BL_UserName_EB.sendKeys(UID);
		RHP_BL_Password_EB.clear();
		RHP_BL_Password_EB.sendKeys(PWD);
		RHP_BL_Login_btn.click();
	}


}
