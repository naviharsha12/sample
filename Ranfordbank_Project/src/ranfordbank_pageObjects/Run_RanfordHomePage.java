package ranfordbank_pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run_RanfordHomePage {

	public static void main(String[] args) 
	{
		String path="C:\\Users\\Administrator\\Desktop\\Navya\\Ranfordbank_Project\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		driver.get("192.168.1.97/ebank2/home.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//creating object for ranford home Page class
		Ranford_Home_page RHP=new Ranford_Home_page(driver);
		
		RHP.RHP_Home_btn.click();
		RHP.RHP_Personalbanking_btn.click();
		RHP.RHP_Corporatebanking_btn.click();
		RHP.RHP_internatinalbanking_btn.click();
		RHP.RHP_Aboutus_btn.click();
		RHP.RHP_CL_Personal_btn.click();
		RHP.RHP_CL_Corporate_btn.click();
		RHP.RHP_CL_International_btn.click();
		RHP.RHP_BL_BranchName_LB.click();
		RHP.RHP_BL_UserName_EB.click();
		RHP.RHP_BL_Password_EB.click();
		RHP.RHP_BL_Login_btn.click();
		RHP.RHP_Customerservice_btn.click();
		RHP.RHP_InternationalFAQS_btn.click();
		RHP.RHP_Disclaimer_btn.click();
		RHP.RHP_Pivacy_btn.click();
		RHP.RHP_Sitemap_btn.click();

	}

}
