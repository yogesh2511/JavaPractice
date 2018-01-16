package TestNgExample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample 
{
	@DataProvider(name="Login_Data")
	public Object[][] data()
	{
		Object[][] data=new Object[2][3];
		data[0][0]="1";
		data[0][1]="2";
		data[0][2]="3";
		
		data[1][0]="4";
		data[1][1]="5";
		data[1][2]="6";
		return data;
	}
	
	@Test(dataProvider="Login_Data")
	public void DataProviderEx(String x,String y,String z)
	{
		System.out.print(x+"\t");
		System.out.print(y+"\t");
		System.out.print(z+"\t");
	}

}
