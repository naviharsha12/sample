package restng_testsuite;

import java.io.File;
import java.lang.reflect.Method;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import keywords.keywords;
import ranfordbank_Admin_Module.NBC_TestCases;
import ranfordbank_pageObjects.Admin_Home_Page;
import ranfordbank_pageObjects.Branch_Details_Page;
import ranfordbank_pageObjects.Ranford_Home_page;

public class branches_creation 

{
	
	WebDriver driver=null;
	String dr_path="";
	String file_path="C:\\Users\\Administrator\\Desktop\\Navya\\Ranfordbank_Project\\Extents_reports\\reports.html";
	ExtentReports reports;
	ExtentTest test;
	
	
	@BeforeClass
	public void beforeclass()
	{
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://http://192.168.1.97/ebank2/home.aspx");
		driver.manage().window().maximize();
		
	}
	@BeforeMethod
	public void beforemethod(Method method)
	{
		test=reports.startTest(method.getName());
	}
	
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
  public void brancch_creation() throws Exception 
  {
	  Admin_Home_Page ad=new Admin_Home_Page(driver);
	  ad.AHP_Branches_btn.click();
	  
	  Branch_Details_Page bd=new Branch_Details_Page(driver);
	  bd.BDP_NewBranch_btn.click();
	  
	  NBC_TestCases nb=new NBC_TestCases(driver);
	  nb.New_branch_creation("jfaiefjios", "Bhagavandas Colony@RamaTemple#14", "#1234@ramaTemple", "#1234@ramatemple", "bhadrachalam@khammam#12", "54086", "INDIA", "Andhra pradesh", "Hyderabad");
	  
  }
 
  
  
  @AfterMethod
  public void afterMethod() 
  {

		/*File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Fileutils.copyFile(src,new File("Screens\\"));
		 test.log(LogStatus.INFO, test.addScreenCapture("C:\\Users\\Administrator\\Desktop\\Navya\\Screens\\Image.png"));*/
		  reports.endTest(test);
	  
  }
  @AfterClass
  public void afterClass() throws Exception 
  {
	  Thread.sleep(10000);
		 driver.close(); 
		 reports.flush();
  }
}
