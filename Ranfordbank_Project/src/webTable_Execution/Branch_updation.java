package webTable_Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import keywords.keywords;
import ranfordbank_Admin_Module.Admin_TestCases;
import ranfordbank_pageObjects.Ranford_Home_page;

public class Branch_updation {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.1.97/ebank2/home.aspx");
		driver.manage().window().maximize();
		
		Ranford_Home_page rhp=new Ranford_Home_page(driver);
		rhp.Admin_login("Admin", "Admin");
		
		Admin_TestCases adm=new Admin_TestCases(driver);
		adm.ahp_branches();
		
		
		//branch updating 
		
		 keywords key=new keywords(driver);
		  key.WebTable_Click_Update_Btn("//table[@id='DG_bankdetails']", "krishnamohan", 6, 6);

		

	}

}
