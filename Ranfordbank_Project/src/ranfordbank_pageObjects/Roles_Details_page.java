package ranfordbank_pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Roles_Details_page 
{
	WebDriver driver;

	public Roles_Details_page(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='btnRoles']")
	public WebElement RDP_newrole;
	
	
	


}
