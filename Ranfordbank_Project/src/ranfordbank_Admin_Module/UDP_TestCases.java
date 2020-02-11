package ranfordbank_Admin_Module;

import org.openqa.selenium.WebDriver;

import ranfordbank_pageObjects.User_Details_Page;

public class UDP_TestCases 
{
	WebDriver driver;
	User_Details_Page udp;

	public UDP_TestCases(WebDriver driver) 
	{
		this.driver=driver;
		
	}
	public void Newuser()
	{
		udp.UDP_NewUser_btn.click();
		
	}

}
