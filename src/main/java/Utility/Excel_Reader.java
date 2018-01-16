package Utility;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.*;

public class Excel_Reader {
	String path=null;
	FileInputStream fis;
	XSSFWorkbook workbook=null;
	XSSFSheet sheet=null;
	XSSFRow rows=null;
	XSSFCell cells=null;
		
	public Excel_Reader(String path)
	{
		try {
			fis=new FileInputStream(path);
			workbook=new XSSFWorkbook(fis);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public String[][] getData(String sheetName)
	{
		String[][] getdataset = null;
		try {
			
			sheet=workbook.getSheet(sheetName);
			int actRow=sheet.getLastRowNum()+1;
			int actCell=sheet.getRow(0).getLastCellNum();
			getdataset=new String[actRow-1][actCell];
			for(int i=1;i<actRow;i++)
			{
				rows=sheet.getRow(i);
				for(int j=0;j<actCell;j++)
				{
					cells=rows.getCell(j);
					if(cells.getCellType()==cells.CELL_TYPE_STRING)
					{
						getdataset[i-1][j]=cells.getStringCellValue();
						//System.out.print("String:"+cells.getStringCellValue());
					}
					//System.out.println();
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return getdataset;
	}

}
