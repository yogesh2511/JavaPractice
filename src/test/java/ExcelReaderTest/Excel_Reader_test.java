package ExcelReaderTest;

import Utility.Excel_Read;
import Utility.Excel_Reader;

public class Excel_Reader_test {

	public static void main(String[] args) {
		Excel_Read ex=new Excel_Read("D:\\Java_Project\\UIAutomation\\resources\\excel\\TestData.xlsx");
		ex.excell_Data("LoginTestData");
	}

}
