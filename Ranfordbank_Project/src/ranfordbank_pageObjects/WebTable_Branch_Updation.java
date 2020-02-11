package ranfordbank_pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WebTable_Branch_Updation 
{
	WebDriver driver;

	public WebTable_Branch_Updation(WebDriver cdriver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		
		
	}

	
	@FindBy(xpath="//input[@id='txtbnameU']")
	public WebElement Branch_Name_EB_Update;
	
	@FindBy(xpath="//input[@id='txtadd1u']")
	public WebElement Branch_Add1_EB_Update;
	
	@FindBy(xpath="//input[@id='txtadd2u']")
	public WebElement Branch_Add2_EB_Update;
	
	@FindBy(xpath="//input[@id='txtadd3U']")
	public WebElement Branch_Add3_EB_Update;
	
	@FindBy(xpath="//input[@id='txtareaU']")
	public WebElement Branch_Area_EB_Update;
	
	@FindBy(xpath="//input[@id='txtzipu']")
	public WebElement Branch_Zip_EB_Update ;
	
	
	@FindBy(xpath="//select[@id='drlst_countryU']")
	public WebElement Branch_Country_Drop_Update;
	
	@FindBy(xpath="//select[@id='lst_stateU']")
	public WebElement Branch_State_Drop_Update;
	
	@FindBy(xpath="//select[@id='LST_cityU']")
	public WebElement Branch_City_Drop_Update;
	
	@FindBy(id="btnupdate")
	public WebElement Branch_Update_Button;

	
	public void branch_Update(String UBName,String UAdd1,String UAdd2,String UAdd3,String UArea,String UZip,String UCountry,String UState,String UCity) throws Exception
	{
	
		
		Branch_Name_EB_Update.clear();
		Branch_Name_EB_Update.sendKeys(UBName);
		Thread.sleep(500);

		Branch_Add1_EB_Update.clear();
		Branch_Add1_EB_Update.sendKeys(UAdd1);
		Thread.sleep(500);

		Branch_Add2_EB_Update.clear();
		Branch_Add2_EB_Update.sendKeys(UAdd2);
		Thread.sleep(500);

		Branch_Add3_EB_Update.clear();
		Branch_Add3_EB_Update.sendKeys(UAdd3);
		Thread.sleep(500);

		Branch_Area_EB_Update.clear();
		Branch_Area_EB_Update.sendKeys(UArea);
		Thread.sleep(500);

		Branch_Zip_EB_Update.clear();
		Branch_Zip_EB_Update.sendKeys(UZip);
		Thread.sleep(500);

		new Select(Branch_Country_Drop_Update).selectByVisibleText(UCountry);
		Thread.sleep(500);

		new Select(Branch_State_Drop_Update).selectByVisibleText(UState);
		Thread.sleep(500);

		new Select(Branch_City_Drop_Update).selectByVisibleText(UCity);
		Thread.sleep(500);

		Branch_Update_Button.click();
		Thread.sleep(500);
		
		
		
	}
	
	
}
