package Utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.*;

public class Excel_Read {
	String path = null;
	FileInputStream fis;
	static XSSFWorkbook workbook = null;
	static XSSFSheet sheet = null;
	static XSSFRow rows = null;
	static XSSFCell cells = null;

	public Excel_Read(String path) 
	{
		try {
			this.path=path;
			fis = new FileInputStream(path);
			workbook=new XSSFWorkbook(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String[][] excell_Data(String sheetname)
	{
		String[][] getData=null;
		sheet=workbook.getSheet(sheetname);
		int actRow=sheet.getLastRowNum()+1;
		int actCell=sheet.getRow(0).getLastCellNum();
		getData=new String[actRow-1][actCell];
		for(int i=1;i<actRow;i++)
		{
			rows=sheet.getRow(i);
			for(int j=0;j<actCell;j++)
			{
				cells=rows.getCell(j);
				if(cells.getCellType()==cells.CELL_TYPE_STRING)
				{
					getData[i-1][j]=cells.getStringCellValue();
					System.out.print(cells.getStringCellValue()+"\t");
				}
			}
			System.out.println();
		}
		return getData;
	}
}
