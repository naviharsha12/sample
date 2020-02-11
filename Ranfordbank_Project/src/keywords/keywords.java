package keywords;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class keywords 
{
	WebDriver driver;
	WebDriverWait wait;
	public keywords(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	
	/*
	 * keywords:
	 * Author:
	 * CreateOn:
	 * ReviewedBy:
	 * lastUpdations:
	 * parameters used:
	 */
	public void Browser_launch()
	{
		String path="";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		
		
	}
	
	/*
	 * keywords:
	 * Author:
	 * CreateOn:
	 * ReviewedBy:
	 * lastUpdations:
	 * parameters used:
	 */
	public void load_webpage()
	{
		driver.get("");
		driver.manage().window().maximize();
		
		
	}
	/*
	 * keywords:
	 * Author:
	 * CreateOn:
	 * ReviewedBy:
	 * lastUpdations:
	 * parameters used:
	 */
	public void set_timeout(int Time_in_sec)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait=new WebDriverWait(driver,Time_in_sec);
		
	}
	/*
	 * keywords:
	 * Author:
	 * CreateOn:
	 * ReviewedBy:
	 * lastUpdations:
	 * parameters used:
	 */
	public void CaptureSrceen()
	{
		//java time stamp
		DateFormat df=new SimpleDateFormat("dd/mmm/yyyy hh-mm-ss");
		//get system date
		Date d=new Date();
		//using simple date formatter change system date
		String time=df.format(d);
		
	}
	
	/*
	 * keywords:
	 * Author:
	 * CreateOn:
	 * ReviewedBy:
	 * lastUpdations:
	 * parameters used:
	 */
	public boolean is_AlertPresented()
	{
		boolean flag;
		try {
			driver.switchTo().alert();
			flag=true;
			
		} catch (NoAlertPresentException e) {
			
			flag=false;
			System.out.println(e.getMessage());
		}
		return flag;
		
	}
	
	/*
	 * keywords:
	 * Author:
	 * CreateOn:
	 * ReviewedBy:
	 * lastUpdations:
	 * parameters used:
	 */
	public boolean Verify_Alert_Presented(String Exp_alert_text)
	{
		boolean flag;
		if (Is_Alertpresented()) 
		{
			String act_alert_text=driver.switchTo().alert().getText();
			flag=act_alert_text.contains(Exp_alert_text);
			driver.switchTo().alert().accept();
			
		} else 
		{
			System.out.println("Alert not presented");
			flag=false;

		}
		return flag;
		
	}
	

	private boolean Is_Alertpresented() {
		// TODO Auto-generated method stub
		return false;
	}


	/*
	 * Keyword:--> Click Update_btn Inside Webtable and update expected Branch record
	 */
	public void WebTable_Click_Update_Btn(String table_Xpath,String branchname, int Rownum,int cellnum) throws Exception
	{
		boolean flag=false;
		boolean flag1=false;
		
		do {
			WebElement Table;
			Table=driver.findElement(By.xpath(table_Xpath));
			
			WebElement Last_Row;
			Last_Row=Table.findElements(By.tagName("tr")).get(Rownum);
			
			List<WebElement> Pagelinks;
			Pagelinks=Last_Row.findElements(By.tagName("a"));
			
			int Link_Count;
			Link_Count=Pagelinks.size();
			System.out.println(Link_Count);
			
			for (int i = 0; i <= Link_Count-1; i++) 
			{
				//Find list of rows under each row
				List<WebElement> Rows=Table.findElements(By.tagName("tr"));
				int Rows_size=Rows.size();
				
				System.out.println("List of rows at each page is => " +Rows_size);
				
				//iterate for number of rows
				for (int j = 1; j <=Rows.size()-2; j++)
				{
					//Find list of cells under each row
					List<WebElement> Cells=Rows.get(j).findElements(By.tagName("td"));
					int Cell_size=Cells.size();
					
					//System.out.println("List of cells at each page is => " +Cell_size);
					
					//iterate for number of cells
					for (int k = 0; k < Cell_size; k++) 
					{
						String EachCell_Text=Cells.get(k).getText();
						
						if (EachCell_Text.equals(branchname)) 
						{
							Cells.get(cellnum).findElement(By.tagName("a")).click();
							Thread.sleep(1000);
							
							flag1=true;
							break;
				
						}
						
						
					}
					
					if(flag1==true)
					{
						break;	
 					}
							
				}
				
				if(flag1==true)
				{
					break;	
				}
				
				if(!Pagelinks.get(i).getText().equals("..."))
				{
					Pagelinks.get(i).click();
					Thread.sleep(1000);
				}
				
				
				
				//Restore Table details to avoid staleElement reference exception
				Table=driver.findElement(By.xpath(table_Xpath));
				Last_Row=Table.findElements(By.tagName("tr")).get(Rownum);
				Pagelinks=Last_Row.findElements(By.tagName("a"));
		
			}
			if(flag1==true)
			{
				break;
			}
		
			
	
			String Next;
			Next=Pagelinks.get(Link_Count-1).getText();
			
			if(Next.equals("..."))
			{
				flag=true;
				Pagelinks.get(Link_Count-1).click();
				
			}
			
			if (!Next.equals("..."))
			{
				flag=false;	
			}
			
		} while (flag);
	}
	
	/*
	 * keyword:--> Verify Expected Record Available
	 */
	
	public boolean Verify_Webtable_Record_Available(String table_Xpath,String branchname, int Rownum) throws Exception
	{
		boolean flag=false;
		boolean flag1=false;
		
		do {
			WebElement Table;
			Table=driver.findElement(By.xpath(table_Xpath));
			
			WebElement Last_Row;
			Last_Row=Table.findElements(By.tagName("tr")).get(Rownum);
			
			List<WebElement> Pagelinks;
			Pagelinks=Last_Row.findElements(By.tagName("a"));
			
			int Link_Count;
			Link_Count=Pagelinks.size();
			System.out.println(Link_Count);
			
			for (int i = 0; i <= Link_Count-1; i++) 
			{
				//Find list of rows under each row
				List<WebElement> Rows=Table.findElements(By.tagName("tr"));
				int Rows_size=Rows.size();
				
				System.out.println("List of rows at each page is => " +Rows_size);
				
				//iterate for number of rows
				for (int j = 1; j <=Rows.size()-2; j++)
				{
					//Find list of cells under each row
					List<WebElement> Cells=Rows.get(j).findElements(By.tagName("td"));
					int Cell_size=Cells.size();
					
					//System.out.println("List of cells at each page is => " +Cell_size);
					
					//iterate for number of cells
					for (int k = 0; k < Cell_size; k++) 
					{
						String EachCell_Text=Cells.get(k).getText();
						
						if (EachCell_Text.equals(branchname)) 
						{
							
							flag1=true;
							break;
				
						}
						
						
					}
					
					if(flag1==true)
					{
						break;	
 					}
							
				}
				
				if(flag1==true)
				{
					break;	
				}
				
				if(!Pagelinks.get(i).getText().equals("..."))
				{
					Pagelinks.get(i).click();
					Thread.sleep(1000);
				}
				
				
				
				//Restore Table details to avoid staleElement reference exception
				Table=driver.findElement(By.xpath(table_Xpath));
				Last_Row=Table.findElements(By.tagName("tr")).get(Rownum);
				Pagelinks=Last_Row.findElements(By.tagName("a"));
		
			}
			if(flag1==true)
			{
				break;
			}
		
			
	
			String Next;
			Next=Pagelinks.get(Link_Count-1).getText();
			
			if(Next.equals("..."))
			{
				flag=true;
				Pagelinks.get(Link_Count-1).click();
				
			}
			
			if (!Next.equals("..."))
			{
				flag=false;	
			}
			
		} while (flag);
		
		
		return flag1;
	}
	
	
	/*
	 * keyword:-->  Expected Record deletion
	 */
	public void Delete_Expected_Record(String Table_Xpath,String branchname,int Rownum,int cellnumber ) throws Exception
	{
		boolean flag=false;
		boolean flag1=false;
	
		do {
			WebElement Table;
			Table=driver.findElement(By.id(Table_Xpath));
			
			WebElement Last_Row;
			Last_Row=Table.findElements(By.tagName("tr")).get(Rownum);
			
			List<WebElement> Pagelinks;
			Pagelinks=Last_Row.findElements(By.tagName("a"));
			
			int Link_Count;
			Link_Count=Pagelinks.size();
			System.out.println(Link_Count);
			
			for (int i = 0; i <= Link_Count-1; i++) 
			{
				//Find list of rows under each row
				List<WebElement> Rows=Table.findElements(By.tagName("tr"));
				int Rows_size=Rows.size();
				
				System.out.println("List of rows at each page is => " +Rows_size);
				
				//iterate for number of rows
				for (int j = 1; j <=Rows.size()-2; j++)
				{
					//Find list of cells under each row
					List<WebElement> Cells=Rows.get(j).findElements(By.tagName("td"));
					int Cell_size=Cells.size();
					
					//System.out.println("List of cells at each page is => " +Cell_size);
					
					//iterate for number of cells
					for (int k = 0; k < Cell_size; k++) 
					{
						String EachCell_Text=Cells.get(k).getText();
						
						if (EachCell_Text.equals(branchname)) 
						{
							Cells.get(cellnumber).findElement(By.tagName("a")).click();
							
							flag1=true;
							break;
				
						}
						
						
					}
					
					if(flag1==true)
					{
						break;	
 					}
							
				}
				
				if(flag1==true)
				{
					break;	
				}
				
				if(!Pagelinks.get(i).getText().equals("..."))
				{
					Pagelinks.get(i).click();
					Thread.sleep(1000);
				}
				
				
				//Restore Table details to avoid staleElement reference exception
				Table=driver.findElement(By.id("DG_bankdetails"));
				Last_Row=Table.findElements(By.tagName("tr")).get(Rownum);
				Pagelinks=Last_Row.findElements(By.tagName("a"));
		
			}
			if(flag1==true)
			{
				break;
			}
		
			
	
			String Next;
			Next=Pagelinks.get(Link_Count-1).getText();
			
			if(Next.equals("..."))
			{
				flag=true;
				Pagelinks.get(Link_Count-1).click();
				
			}
			
			if (!Next.equals("..."))
			{
				flag=false;	
			}
			
		} while (flag);
		
		
		
	}
}
	
		
	/*
	 * keywords:
	 * Author:
	 * CreateOn:
	 * ReviewedBy:
	 * lastUpdations:
	 * parameters used:
	 */
	
		

		

	
	
	
	


