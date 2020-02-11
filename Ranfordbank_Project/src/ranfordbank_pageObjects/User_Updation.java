package ranfordbank_pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_Updation 
{
	WebDriver driver;

	public User_Updation(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
		
	}
	@FindBy(xpath="")
	public WebElement s;
	
	@FindBy(xpath="")
	public WebElement e;
	
	@FindBy(xpath="")
	public WebElement t ;

}
