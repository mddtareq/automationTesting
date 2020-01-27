package exel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exeltry {
	public static void main(String[] args)throws IOException{
		exeltry ob=new exeltry();
		//File filepath=new File("C:\\Users\\USER\\eclipse-workspace\\automationTesting\\exelFile\\tryy.xlsx");
		//String extension="C:\\Users\\USER\\eclipse-workspace\\automationTesting\\exelFile\\tryy.xlsx";
		//String sheetName="Data";
		//String[] value= {"Nadia","Nadia"};
		File filepath=new File("C:\\Users\\USER\\eclipse-workspace\\automationTesting\\exelFile\\Book1.xls");
		String extension="C:\\Users\\USER\\eclipse-workspace\\automationTesting\\exelFile\\Book1.xls";
		String sheetName="Data";
		String[] value= {"Nadia","Nadia"};
		String fileExtensionName = extension.substring(extension.indexOf("."));
		ob.readExel(filepath,fileExtensionName,sheetName);
		ob.writeExel(filepath,fileExtensionName,sheetName,value);

	}
	public static void readExel(File path,String extension,String sheetName) throws IOException{
		FileInputStream file = new FileInputStream(path);
		if(extension.equals(".xlsx")){
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet=workbook.getSheet(sheetName);

			for (int i = 0; i < sheet.getLastRowNum()+1; i++) {
				XSSFRow row = sheet.getRow(i);

				for (int j = 0; j < row.getLastCellNum(); j++) {
					System.out.print(row.getCell(j).getStringCellValue()+",");
				}
				System.out.println();
			}
			workbook.close();}
		else if(extension.equals(".xls")){
			HSSFWorkbook workbook = new HSSFWorkbook(file);
			HSSFSheet sheet=workbook.getSheet(sheetName);
			for (int i = 0; i < sheet.getLastRowNum()+1; i++) {
				HSSFRow row = sheet.getRow(i);

				for (int j = 0; j < row.getLastCellNum(); j++) {
					System.out.print(row.getCell(j).getStringCellValue()+",");
				}
				System.out.println();
			}
			workbook.close();}
	}
	public static void writeExel(File path,String extension,String sheetName,String[] dataWrite) throws IOException{
		FileInputStream infile = new FileInputStream(path);
		if(extension.equals(".xlsx")){
			XSSFWorkbook workbook = new XSSFWorkbook(infile);
			XSSFSheet sheet=workbook.getSheet(sheetName);
			XSSFRow row= sheet.getRow(0);
			XSSFRow newRow=sheet.createRow(sheet.getLastRowNum()+1);
			for(int j = 0; j < row.getLastCellNum(); j++){
				XSSFCell cell = newRow.createCell(j);
				cell.setCellValue(dataWrite[j]);
			}
			infile.close();
			FileOutputStream outfile = new FileOutputStream(path);
			workbook.write(outfile);
			outfile.close();
		}
		else if(extension.equals(".xls")){
			HSSFWorkbook workbook = new HSSFWorkbook(infile);
			HSSFSheet sheet=workbook.getSheet(sheetName);
			HSSFRow row= sheet.getRow(0);
			HSSFRow newRow=sheet.createRow(sheet.getLastRowNum()+1);
			for(int j = 0; j < row.getLastCellNum(); j++){
				HSSFCell cell = newRow.createCell(j);
				cell.setCellValue(dataWrite[j]);
			}
			infile.close();
			FileOutputStream outfile = new FileOutputStream(path);
			workbook.write(outfile);
			outfile.close();
		}

	}
}
