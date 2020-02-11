package ranfordbank_Admin_Module;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Update {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.168.1.97/ebank2/home.aspx");
		driver.manage().window().maximize();
		
		//admin login
		driver.findElement(By.id("txtuId")).clear();
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPword")).clear();
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPword")).click();
		
		//branches
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img"));
		Thread.sleep(3000);
		
		boolean flag=false;
		boolean flag1=false;
		do {
			WebElement table;
			table=driver.findElement(By.id("DG_bankdetails"));
			
			//outer
			
			WebElement LastRow;
			LastRow=table.findElements(By.tagName("tr")).get(6);
			
			List<WebElement> pagelinks;
			pagelinks=LastRow.findElements(By.tagName("a"));
			
			int Linkcount;
			Linkcount=pagelinks.size();
			System.out.println(Linkcount);
			
			for (int i = 0; i < Linkcount; i++) 
			{
				List<WebElement>Rows=table.findElements(By.tagName("tr"));
				System.out.println("list of rows at each page is==>"+Rows.size());
				
				//iterate for number of rows
				for (int j = 0; j < 5; j++) 
				{
					
					//find cells of each row
					List<WebElement>cells=Rows.get(j).findElements(By.tagName("td"));
					
					for (int k = 0; k < args.length; k++) 
					{
						String Eachcell_Text=cells.get(k).getText();
						if (Eachcell_Text.equals("Swathi")) 
						{
							cells.get(6).findElement(By.tagName("a")).click();
							
							break;
							
						}
						
						
					}
					if (flag1==true) 
					{
						break;
						
					}
					
				}
				if (flag1==true) 
				{
					break;
					
				}
				pagelinks.get(i).click();
				Thread.sleep(1000);
				//restore table details to avoid stalElement Reference exception
				table=driver.findElement(By.id("DG_bankdetails"));
				LastRow=table.findElements(By.tagName("tr")).get(6);
				pagelinks=LastRow.findElements(By.tagName("a"));
				
				
				
			}
			if (flag1==true) 
			{
				break;
				
			}
			String Next;
			Next=pagelinks.get(Linkcount-1).getText();
			if (Next.equals("...")) 
			{
				flag=true;
				pagelinks.get(Linkcount-1).click();
				
			}
			if (!Next.equals("...")) 
			{
				flag=false;
				
			}
			
			
		} while (flag1);
		
		

	}

}
