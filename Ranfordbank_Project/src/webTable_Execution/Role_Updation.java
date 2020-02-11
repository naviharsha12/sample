package webTable_Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import keywords.keywords;
import ranfordbank_Admin_Module.Admin_TestCases;
import ranfordbank_pageObjects.Ranford_Home_page;

public class Role_Updation 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.1.97/ebank2/home.aspx");
		driver.manage().window().maximize();
		
		Ranford_Home_page rhp=new Ranford_Home_page(driver);
		rhp.Admin_login("Admin", "Admin");
		
		Admin_TestCases adm=new Admin_TestCases(driver);
		adm.ahp_roles();
		
		 keywords key=new keywords(driver);
		 //for clicking  update button
		 key.WebTable_Click_Update_Btn("table_Xpath", "branchname", 4, 4);
		 
		 key.Verify_Webtable_Record_Available("table_Xpath", "branchname", 5);
		 
		 key.Delete_Expected_Record("Table_Xpath", "branchname", 5, 6);;
		

	}

}
