package banking_DataDriven;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import ranfordbank_Admin_Module.NEC_TestCases;
import ranfordbank_Admin_Module.NRC_TestCases;
import ranfordbank_Admin_Module.NUC_testcases;
import ranfordbank_pageObjects.Admin_Home_Page;
import ranfordbank_pageObjects.Branch_Details_Page;
import ranfordbank_pageObjects.New_BranchCreation;
import ranfordbank_pageObjects.New_RoleCreation_Page;
import ranfordbank_pageObjects.Ranford_Home_page;
import ranfordbank_pageObjects.Roles_Details_page;


public class Admin_with_Excel 
{
	public FileInputStream fi;
	public String filepath="C:\\Users\\Administrator\\Desktop\\Navya\\";
	public XSSFWorkbook book;
	public XSSFSheet sht;
	public XSSFRow row;
	
	WebDriver driver;
	
	public Admin_with_Excel(WebDriver driver) 
	{
		this.driver=driver;
		
		
	}
	


public void excel_connection(String filepath,String sheetname)
{
	try {
		fi=new FileInputStream(filepath);
		book=new XSSFWorkbook(fi);
		sht=book.getSheet(sheetname);
		row=sht.getRow(1);
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void Admin_login()
{
	excel_connection(filepath+"navya1.xlsx","Sheet1");
	String UID=row.getCell(0).getStringCellValue();
	String PWD=row.getCell(1).getStringCellValue();
	
	Ranford_Home_page rhpp=new Ranford_Home_page(driver);
	
	rhpp.RHP_BL_UserName_EB.clear();
	rhpp.RHP_BL_UserName_EB.sendKeys(UID);
	rhpp.RHP_BL_Password_EB.clear();
	rhpp.RHP_BL_Password_EB.sendKeys(PWD);
	
	rhpp.RHP_BL_Login_btn.click();
	
	System.out.println(UID);
	System.out.println(PWD);
	
}

	

public void Excel_New_BranchCreation()
{
	excel_connection(filepath+"navya1.xlsx","Sheet2");
	String Branch_Name=row.getCell(0).getStringCellValue();
	System.out.println(Branch_Name);
	
	String ADD1=row.getCell(1).getStringCellValue();
	System.out.println(ADD1);
	
	String ADD2=row.getCell(2).getStringCellValue();
	System.out.println(ADD2);
	
	String ADD3=row.getCell(3).getStringCellValue();
	System.out.println(ADD3);
	
	String Area=row.getCell(4).getStringCellValue();
	System.out.println(Area);
	
	String Zipcode=row.getCell(5).getStringCellValue();
	String country=row.getCell(6).getStringCellValue();
	String state=row.getCell(7).getStringCellValue();
	String city=row.getCell(8).getStringCellValue();
	System.out.println(city);
	
	New_BranchCreation branch=new New_BranchCreation(driver);
	
	Branch_Details_Page branches=new Branch_Details_Page(driver) ;
	Admin_Home_Page adminn=new Admin_Home_Page(driver);
	adminn.AHP_Branches_btn.click();
	branch.NBC_Branches_btn.click();
	
	branch.NBC_Branchname_EB.clear();
	branch.NBC_Branchname_EB.sendKeys(Branch_Name);
	
	branch.NCB_Address1_EB.clear();
	branch.NCB_Address1_EB.sendKeys(ADD1);
	
	branch.NCB_Address2_EB.clear();
	branch.NCB_Address2_EB.sendKeys(ADD2);
	
	branch.NCB_Address3_EB.clear();
	branch.NCB_Address3_EB.sendKeys(ADD3);
	
	branch.NBC_Area_EB.clear();
	branch.NBC_Area_EB.sendKeys(Area);
	
	branch.NBC_ZipCode_EB.clear();
	branch.NBC_ZipCode_EB.sendKeys(Zipcode);
	new Select(branch.NBC_Country_LB).selectByVisibleText(country);
	new Select(branch.NBC_State_LB).selectByVisibleText(state);
	new Select(branch.NBC_City_LB).selectByVisibleText(city);
	
	branch.NBC_LogOut_btn.click();
	
	
	
	}
public void NewRoleCreation_from_excel() throws Exception
{
	New_RoleCreation_Page role=new New_RoleCreation_Page(driver) ;
	Admin_Home_Page ahp=new Admin_Home_Page(driver); 
	Roles_Details_page rdp=new Roles_Details_page(driver);
	
	ahp.AHP_Roles_btn.click();
	rdp.RDP_newrole.click();
	
	excel_connection(filepath+"navya1.xlsx","Sheet3");
	String R_name=row.getCell(1).getStringCellValue();
	System.out.println(R_name);
	String R_Des=row.getCell(2).getStringCellValue();
	String R_Type=row.getCell(3).getStringCellValue();
	
	role.Newrole_Creation(R_name, R_Des, R_Type);

	
	
	
}
public void NewUserCreation_from_excel()
{
	NUC_testcases user=new NUC_testcases(driver) ;
	excel_connection(filepath+"navya1.xlsx","Sheet4");
	String role=row.getCell(1).getStringCellValue();
	String branch=row.getCell(2).getStringCellValue();
	String customerId=row.getCell(3).getStringCellValue();
	String customername=row.getCell(4).getStringCellValue();
	String username=row.getCell(5).getStringCellValue();
	String loginpassword=row.getCell(6).getStringCellValue();
	String transactionpassword=row.getCell(7).getStringCellValue();
	user.newuser_Creation(role, branch, customerId, customername, username, loginpassword, transactionpassword);
}
public void NewEmployee_Creation()
{
	NEC_TestCases employee=new NEC_TestCases(driver); 
	excel_connection(filepath+"navya1.xlsx","sheet5");
	String EMPName=row.getCell(1).getStringCellValue();
	String LoginPWD=row.getCell(2).getStringCellValue();
	String Role=row.getCell(2).getStringCellValue();
	String Branch=row.getCell(3).getStringCellValue();
	
	employee.NewEmpCreation(EMPName, LoginPWD, Role, Branch);
	
	
}



}
