package ExcelReaderTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.Excel_Read;

public class Test2 
{
	@DataProvider(name="Login_Data")
	public String[][] getdata()
	{
		String[][] data=null;
		Excel_Read exr= new Excel_Read("D:\\Java_Project\\UIAutomation\\resources\\excel\\TestData.xlsx");
		data=exr.excell_Data("LoginTestData");
		return data;
	}

	@Test(dataProvider="Login_Data")
	public void test1(String username,String pw,String runmode)
	{
		System.out.println(username);
	}
}
