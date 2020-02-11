package ranfordbank_Admin_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import keywords.keywords;
import ranfordbank_pageObjects.Admin_Home_Page;
import ranfordbank_pageObjects.Ranford_Home_page;

public class Run_branchupdation {

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
		
		keywords key=new keywords(driver);
		key.WebTable_Click_Update_Btn("//table[@id='DG_bankdetails']", "PojithA4586",2,7);
		

	}

}
