package ranfordbank_pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Employee_Details_Page 
{
	WebDriver driver;

	public Employee_Details_Page(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	@FindBy(xpath="//input[@id='BtnNew']")
	public WebElement EDP_NewEmployee_btn;
	
	

}
