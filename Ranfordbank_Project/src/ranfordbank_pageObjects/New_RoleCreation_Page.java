package ranfordbank_pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class New_RoleCreation_Page 
{
	WebDriver driver;

	public New_RoleCreation_Page(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	@FindBy(xpath="//input[@id='txtRname']")
	public WebElement NRC_Rolename_EB;
	
	@FindBy(xpath="//input[@id='txtRDesc']")
	public WebElement NRC_RoleDes_EB;
	
	@FindBy(xpath="//select[@id='lstRtypeN']")
	public WebElement NRC_RoleType_LB;
	
	@FindBy(xpath="//input[@id='btninsert']")
	public WebElement NRC_Submit_btn;
	
	@FindBy(xpath="//input[@id='Btn_Reset']")
	public WebElement NRC_Reset_btn;
	
	@FindBy(xpath="//input[@id='Btn_cancel']")
	public WebElement NRC_Cancel_btn;
	public void Newrole_Creation(String Rname, String RDes, String Rtype) throws Exception
	{
		NRC_Rolename_EB.clear();
		NRC_Rolename_EB.sendKeys(Rname);
		NRC_RoleDes_EB.clear();
		NRC_RoleDes_EB.sendKeys(RDes);
		Thread.sleep(3000);
		new Select(NRC_RoleType_LB).selectByVisibleText(Rtype);
	}
	public void submit()
	{
		NRC_Submit_btn.click();
	}
	public void reset()
	{
		NRC_Reset_btn.click();
	}
	public void cancel()
	{
		NRC_Cancel_btn.click();
	}
	
	
	
	

}
