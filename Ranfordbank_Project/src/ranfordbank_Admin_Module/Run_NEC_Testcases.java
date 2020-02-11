package ranfordbank_Admin_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ranfordbank_pageObjects.Admin_Home_Page;
import ranfordbank_pageObjects.Employee_Details_Page;
import ranfordbank_pageObjects.Ranford_Home_page;

public class Run_NEC_Testcases {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.1.97/ebank2/home.aspx");
		driver.manage().window().maximize();
		
		//creating obj for new branch creation
		Ranford_Home_page rhp=new Ranford_Home_page(driver);
		rhp.Admin_login("Admin", "Admin");
		
		
		Admin_Home_Page adp=new Admin_Home_Page(driver);
		 adp.AHP_Employee_btn.click();
		 
		 Employee_Details_Page ed=new Employee_Details_Page(driver);
		 ed.EDP_NewEmployee_btn.click();
		 
		 NEC_TestCases nec=new NEC_TestCases(driver);
		 nec.NewEmpCreation("sirisha", "vennela@12", "clerk", "BBCCMM");
		

	}

}
