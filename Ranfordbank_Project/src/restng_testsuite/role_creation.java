package restng_testsuite;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ranfordbank_Admin_Module.NRC_TestCases;
import ranfordbank_pageObjects.Admin_Home_Page;
import ranfordbank_pageObjects.Ranford_Home_page;
import ranfordbank_pageObjects.Roles_Details_page;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.lang.reflect.Method;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class role_creation 
{
	WebDriver driver=null;
	String dr_path="";
	String file_path="C:\\Users\\Administrator\\Desktop\\Navya\\Ranfordbank_Project\\Extents_reports\\reports.html";
	ExtentReports reports;
	ExtentTest test;
	
	@Test(priority=1)
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

  @Test(priority=2)
  public void role_ccreation() throws Exception 
  {
	  Admin_Home_Page adp=new Admin_Home_Page(driver);
		adp.AHP_Roles_btn.click();
		
		
		Roles_Details_page rdp=new Roles_Details_page(driver);
		rdp.RDP_newrole.click();
		
		 NRC_TestCases nrrc=new  NRC_TestCases (driver);
		 nrrc.Newrole_Creation("Clerk", "Receipts@12", "E");
	  
  }
  @BeforeMethod
  public void beforeMethod(Method method) 
  {
	  test=reports.startTest(method.getName());
	  
  }

  @AfterMethod
  public void afterMethod() 
  {
	  /*File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  Fileutils.copyFile(src,new File("Screens\\"));
	  test.log(LogStatus.INFO, test.addScreenCapture("C:\\Users\\Administrator\\Desktop\\Navya\\Screens\\Image.png"));*/
	  reports.endTest(test);
	  
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://http://192.168.1.97/ebank2/home.aspx");
		driver.manage().window().maximize();
	  
  }

  @AfterClass
  public void afterClass() throws Exception 
  {
	  Thread.sleep(10000);
		 driver.close(); 
		 reports.flush();
  }

}
