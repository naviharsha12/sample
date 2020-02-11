package ranfordbank_Admin_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ranfordbank_pageObjects.Ranford_Home_page;

public class Run_NUC_Testcases 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.1.97/ebank2/home.aspx");
		driver.manage().window().maximize();
		
		//creating obj for new branch creation
		Ranford_Home_page rhp=new Ranford_Home_page(driver);
		rhp.Admin_login("Admin", "Admin");
		
		
		Admin_TestCases adm=new Admin_TestCases(driver);
		adm.ahp_users();
		
		UDP_TestCases uddp=new UDP_TestCases(driver);
		uddp.Newuser();
		
		NUC_testcases nuuc=new NUC_testcases(driver);
		nuuc.newuser_Creation("icustomer", "BBCCMM", "customerid", "teju", "Vardhan.B", "Vennala@12", "Vennala@12");
		nuuc.home();
		
		

		

	}

}
