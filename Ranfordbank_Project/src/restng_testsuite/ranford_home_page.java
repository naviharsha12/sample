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

import banking_DataDriven.Admin_with_Excel;
import ranfordbank_pageObjects.Ranford_Home_page;

public class ranford_home_page 
{
	WebDriver driver=null;
	String dr_path="";
	String file_path="C:\\Users\\Administrator\\Desktop\\Navya\\Ranfordbank_Project\\Extents_reports\\reports.html";
	ExtentReports reports;
	ExtentTest test;
	
	@Test
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
	@AfterMethod
	public void aftermethod()
	{
		/*File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Fileutils.copyFile(src,new File("Screens\\"));
		 test.log(LogStatus.INFO, test.addScreenCapture("C:\\Users\\Administrator\\Desktop\\Navya\\Screens\\Image.png"));*/
		  reports.endTest(test);
	}
	
	
	@AfterClass
	public void afterclass() throws Exception
	{
		Thread.sleep(10000);
		 driver.close(); 
		 reports.flush();
		
	}
	
	
  
 
  
}
