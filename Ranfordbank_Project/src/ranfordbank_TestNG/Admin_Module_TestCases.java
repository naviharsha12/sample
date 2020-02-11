package ranfordbank_TestNG;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import banking_DataDriven.Admin_with_Excel;
import keywords.keywords;
import ranfordbank_Admin_Module.Admin_TestCases;
import ranfordbank_Admin_Module.BDP_TestCases;
import ranfordbank_Admin_Module.NBC_TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Admin_Module_TestCases 
{
	String driver_path="Drivers\\chromedriver.exe";
	String Reporter_path="C:\\Users\\Administrator\\Desktop\\Navya\\Extent Reports\\Report.html";
	ExtentReports report;
	ExtentTest test;
	Admin_TestCases adminn;
	WebDriver driver = null;
	String URL="http://192.168.1.97/ebank2/home.aspx";
	
	Admin_with_Excel awe;
	
	  @Test(priority = 0)
	  public void Ranford_homePage() 
	  {
		  if (driver.getTitle().equals("MINDQ RANFORD BANK")) 
		   {
			 
			  	test.log(LogStatus.INFO, "Expected RHP title presented");
		   	} 
		   else 
		   {
			   test.log(LogStatus.SKIP, "precodition failed, RHP page not displayed");

		   }
	   }
	  
		@Test(priority = 1, dependsOnMethods= "Ranford_homePage")
		public void Admin_login() 
		{
			  if (driver.getCurrentUrl().contains("http://192.168.1.97/ebank2/adminflow.aspx"))
			   {
				  test.log(LogStatus.INFO, "Expected Admin URL presented");
				  
				   awe= new Admin_with_Excel(driver);
				  awe.Admin_login();
				  	
			   	} 
			   else 
			   {
				   test.log(LogStatus.SKIP, "precodition faild Admin page not displayed");

			   }
			
		  }
	  
		  @Test(priority = 2, dependsOnMethods= "Admin_login")
	      public void New_BranchCR() 
	      {
		
			   awe=new Admin_with_Excel(driver);
			  awe.Excel_New_BranchCreation();
	

			  
			  if (driver.getCurrentUrl().contains("http://192.168.1.97/ebank2/admin_banker_master.aspx"))
			   {
				  test.log(LogStatus.INFO, "Expected Branch creation page presented");
				  
				}
			  
			  else
			  {
				   test.log(LogStatus.SKIP, " faild Branch creation page");

			   }
			  }
		  
		  
		  
		  @Test(priority = 3, dependsOnMethods= "Admin_login")
		  public void branchhUP() throws Exception
		  {
			  keywords key=new keywords(driver);
			  key.WebTable_Click_Update_Btn("//table[@id='DG_bankdetails']", "krishnamohan", 6, 6);
			  key.Verify_Webtable_Record_Available("//table[@id='DG_bankdetails']","swathi", 6);
		  }
		  
		  @Test(priority = 5, dependsOnMethods= "Admin_login")
		  public void branch_delete() throws Exception
		  {
			  keywords key=new keywords(driver);
			  key.Verify_Webtable_Record_Available("//table[@id='DG_bankdetails']", "Nvnbabuu", 3);
			  key.Delete_Expected_Record("//table[@id='DG_bankdetails']", "Nvnbabuu", 3, 7);
			  
		  }
		  
		  @Test(priority = 6, dependsOnMethods= "Admin_login")
	      public void New_RoleCR() throws Exception 
	      {
		
			   awe=new Admin_with_Excel(driver);
			  awe.NewRoleCreation_from_excel();
	

			  
			  if (driver.getCurrentUrl().contains("http://192.168.1.97/ebank2/admin_banker_master.aspx"))
			   {
				  test.log(LogStatus.INFO, "Expected role creation page presented");
				  
				  
				  
			   }
			  
			  else
			  {
				   test.log(LogStatus.SKIP, " faild Role creation page");

			   }
			  
			  }
		  
		  @Test(priority = 7, dependsOnMethods= "Admin_login")
	      public void New_UserCR() 
	      {
		
			  awe=new Admin_with_Excel(driver);
			  awe.NewUserCreation_from_excel();
	

			  
			  if (driver.getCurrentUrl().contains("http://192.168.1.97/ebank2/admin_banker_master.aspx"))
			   {
				  test.log(LogStatus.INFO, "Expected Branch creation page presented");
				  
				
				 
			   }
			  
			  else
			  {
				   test.log(LogStatus.SKIP, " faild Branch creation page");

			   }
			  
			  
			  
			  
			  }
	
	
 
  @BeforeMethod
  public void beforeMethod(Method method) 
  {
	  test=report.startTest(method.getName());
	  
	  
  }

  @AfterMethod
  public void afterMethod() 
  {
	  //test.log(LogStatus.INFO, test.addScreenCapture("C:\\Users\\Administrator\\Desktop\\Navya\\Screens\\Image.png"));
	  report.endTest(test);
  }

  @BeforeClass
  public void beforeClass() 
  {
	   report=new ExtentReports(Reporter_path,true);
	   System.setProperty("webdriver.chrome.driver", driver_path);
	   driver=new ChromeDriver();
	   driver.get(URL);
	   driver.manage().window().maximize();
	   
  }

  @AfterClass
  public void afterClass() throws Exception 
  {
	 Thread.sleep(10000);
	 driver.close(); 
	 report.flush();
  }
 
 

}
