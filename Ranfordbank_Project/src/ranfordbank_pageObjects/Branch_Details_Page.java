package ranfordbank_pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Branch_Details_Page 
{
	WebDriver driver;

	public Branch_Details_Page(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
		
	}
	
	
	@FindBy(xpath="//input[@id='BtnNewBR']")
	public WebElement BDP_NewBranch_btn;
	
	
	@FindBy(xpath="//select[@id='lst_countryS']")
	public WebElement BDP_Country_btn;
	
	@FindBy(xpath="//select[@id='lst_stateS']")
	public WebElement BDP_State_btn;

	@FindBy(xpath="//select[@id='lst_cityS']")
	public WebElement BDP_City_btn;

	@FindBy(xpath="//select[@id='btn_search']")
	public WebElement BDP_Search_btn;
	
	@FindBy(xpath="//select[@id='btn_clsearch']")
	public WebElement BDP_Clear_btn;
	
	



	
	

}
