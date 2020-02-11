package ranfordbank_Admin_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ranfordbank_pageObjects.Ranford_Home_page;
import ranfordbank_pageObjects.WebTable_Branch_Updation;

public class Run_branchUpdate 
{
	
	WebTable_Branch_Updation but;

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
		
		BDP_TestCases bdp=new BDP_TestCases (driver);
		
		
		WebTable_Branch_Updation but=new WebTable_Branch_Updation(driver);
		but.branch_Update("155", "krishnamohannn", "mindq00010", "mindq00010", "mindq00010", "abcd", "45678",  "Tamil Nadu","MADHURAI	");
		
		
		

	}

}
