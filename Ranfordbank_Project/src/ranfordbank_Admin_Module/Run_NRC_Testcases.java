package ranfordbank_Admin_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ranfordbank_pageObjects.Admin_Home_Page;
import ranfordbank_pageObjects.Ranford_Home_page;
import ranfordbank_pageObjects.Roles_Details_page;

public class Run_NRC_Testcases {

	public static void main(String[] args) throws Exception 
	
	{
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.1.97/ebank2/home.aspx");
		driver.manage().window().maximize();
		
		Ranford_Home_page rhp=new Ranford_Home_page(driver);
		rhp.Admin_login("Admin", "Admin");
		
		
		Admin_Home_Page adp=new Admin_Home_Page(driver);
		adp.AHP_Roles_btn.click();
		
		
		Roles_Details_page rdp=new Roles_Details_page(driver);
		rdp.RDP_newrole.click();
		
		 NRC_TestCases nrrc=new  NRC_TestCases (driver);
		 nrrc.Newrole_Creation("Clerk", "Receipts@12", "E");
		
		

	}

}
