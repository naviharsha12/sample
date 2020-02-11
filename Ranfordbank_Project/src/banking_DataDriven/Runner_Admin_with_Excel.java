package banking_DataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner_Admin_with_Excel {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver","drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.1.97/ebank2/home.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Admin_with_Excel  awe=new Admin_with_Excel(driver) ;
		
		awe.Admin_login();
		//awe.Excel_New_BranchCreation();
		awe.NewRoleCreation_from_excel();

	}

}
