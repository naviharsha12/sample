package restng_testsuite;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import keywords.keywords;
import ranfordbank_pageObjects.Admin_Home_Page;
import ranfordbank_pageObjects.Ranford_Home_page;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class branch_updation 
{
	WebDriver driver=null;
	String dr_path="";
	String file_path="C:\\Users\\Administrator\\Desktop\\Navya\\Ranfordbank_Project\\Extents_reports\\reports.html";
	ExtentReports reports;
	ExtentTest test;
	
	@Test(priority=0)
	public void Admin_login()
	{
		 if (driver.getCurrentUrl().contains("http://192.168.1.97/ebank2/adminflow.aspx"))
		   {
			  test.log(LogStatus.INFO, "Expected Admin URL presented");
			  
			  Ranford_Home_page rhp=new Ranford_Home_page(driver);
				rhp.Admin_login("Admin", "Admin");
			  	
		   	} 
		   else 
		   {
			   test.log(LogStatus.SKIP, "precodition faild Admin page not displayed");

		   }
		
	}
	
  @Test(priority=1,dependsOnMethods= "Admin_login")
  public void branch_uupdation() throws Exception 
  {
	  Admin_Home_Page ad=new Admin_Home_Page(driver);
	  ad.AHP_Branches_btn.click();
	  
	  keywords key=new keywords(driver);
	  key.WebTable_Click_Update_Btn("//table[@id='DG_bankdetails']", "PojithA4586", 2, 6);


	 
  }
  
  @Test(priority = 2,dependsOnMethods= "branch_uupdation")
	public void verify_Role_Availability_At_WebTable() throws Exception
	{
	  Admin_Home_Page ad = new Admin_Home_Page(driver); 
		Thread.sleep(500);
		ad.AHP_Branches_btn.click();	 
		
		keywords key=new keywords(driver);
		boolean flag=key.Verify_Webtable_Record_Available("//table[@id='DG_bankdetails']", "MQDfSf",6);
		Assert.assertTrue(flag);
		System.out.println("Expected Record has been found at Role webtable");

	}
  
  @Test(priority=3)
  public void branch_ddeletion() throws Exception 
  {
	  Admin_Home_Page ad=new Admin_Home_Page(driver);
	  ad.AHP_Branches_btn.click();
	  Thread.sleep(500);

	  keywords key=new keywords(driver);
	  key.Delete_Expected_Record("//table[@id='DG_bankdetails']", "PojithA4586", 2, 7);
	  
	  
  }  
  @BeforeMethod
  public void beforeMethod(Method method) 
  {
	  test=reports.startTest(method.getName()); 
  }

  @AfterMethod
  public void afterMethod() 
  {

		
		 test.log(LogStatus.INFO, test.addScreenCapture("C:\\Users\\Administrator\\Desktop\\Navya\\Screens\\Image.png"));
		  reports.endTest(test);
	  
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://http://192.168.1.97/ebank2/home.aspx");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

  }

  @AfterClass
  public void afterClass() throws Exception 
  {
	  	 Thread.sleep(10000);
		 driver.close(); 
		 reports.flush();
  }

}
