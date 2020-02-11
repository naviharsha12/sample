package ranfordbank_Admin_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ranfordbank_pageObjects.Admin_Home_Page;
import ranfordbank_pageObjects.Branch_Details_Page;
import ranfordbank_pageObjects.Ranford_Home_page;

public class Run_NBC_Testcases {

	
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe" );
	    WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.1.97/ebank2/home.aspx");
		driver.manage().window().maximize();
		
		Ranford_Home_page rhp=new Ranford_Home_page(driver);
		rhp.Admin_login("Admin", "Admin");
		
		Admin_Home_Page bran=new Admin_Home_Page(driver);
		bran.AHP_Branches_btn.click();
		
		Branch_Details_Page new_bran=new Branch_Details_Page(driver);
		new_bran.BDP_NewBranch_btn.click();
		Thread.sleep(2000);
	
		NBC_TestCases crea=new NBC_TestCases(driver);
		crea.New_branch_creation("BBCCMM", "Bhagavandas Colony@RamaTemple#14", "#1234@ramaTemple", "#1234@ramatemple", "bhadrachalam@khammam#12", "54086", "INDIA", "Andhra Pradesh", "Hyderabad");
		
		
		
		
		

	}

}
