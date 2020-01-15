import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datadriven {

	public static void main(String[] args) throws IOException {
		try{
			FileInputStream f1=new FileInputStream("D:\\test\\test.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(f1);
			XSSFSheet sh=wb.getSheetAt(0);
			Row r=sh.getRow(0);
			Cell c=r.getCell(0);
			System.out.println(c.toString());
			System.setProperty("webdriver.chrome.driver","C:\\geckodriver\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get(c.toString());
			WebElement day=driver.findElement(By.id("day"));
			String s=day.getText();
			
			 Row headerRow = sh.createRow(1);
		        //for(int i = 0; i < 31; i++) {
		            Cell cell = headerRow.createCell(0);
		            cell.setCellValue(s);
		            f1.close();
					FileOutputStream f2=new FileOutputStream("D:\\test\\test.xlsx");
		            wb.write(f2);
		            f2.close();

		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}

	}

}
