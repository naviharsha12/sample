package restng_testsuite;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

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
import ranfordbank_pageObjects.Ranford_Home_page;
import ranfordbank_pageObjects.WebTable_Employee_Updation;

public class Employee_Updation 
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
	@Test
	public void emp_updation() throws Exception
	{
		keywords key=new keywords(driver);
		key.WebTable_Click_Update_Btn("//table[@id='DG_bankdetails']", "branchname", 3, 5);
		
		WebTable_Employee_Updation eu=new WebTable_Employee_Updation(driver);
		eu.Employee_Updation("EName_Update", "E_PW_Update", "ERole_Update", "EBranch_Update");
		
		
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


