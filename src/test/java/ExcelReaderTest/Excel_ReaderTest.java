package ExcelReaderTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.Excel_Reader;

public class Excel_ReaderTest 
{
	/*@DataProvider(name="SingleLoginTestData")
	public String[][] getdata()
	{
		String[][] testRecords=null;
		Excel_Reader exlReader=new Excel_Reader("D:\\Java_Project\\UIAutomation\\resources\\excel\\TestData.xlsx");
		testRecords=exlReader.getData("LoginTestData");
		return testRecords;
	}

	@Test(dataProvider="SingleLoginTestData")
	public void test1(String username,String pwd,String runmode)
	{
		System.out.println(username);
		System.out.println(pwd);
		System.out.println(runmode);
	}*/
	@DataProvider(name="2d_data")
	public String[][] twoData()
	{
		//String[][] multi=null;
		String[][] data = new String[3][2];

		// 1st row
		data[0][0] ="sampleuser1";
		data[0][1] = "abcdef";

		// 2nd row
		data[1][0] ="testuser2";
		data[1][1] = "zxcvb";
		
		// 3rd row
		data[2][0] ="guestuser3";
		data[2][1] = "pass123";

		return data;
		
	}
	@Test(dataProvider="2d_data")
	public void test(String x,String y)
	{
		System.out.println(x);
	}
}
