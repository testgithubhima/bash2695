package Framework;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Excel_File {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		
		PropertyFile pf = new PropertyFile();
		
		FileInputStream fis = new FileInputStream("./PropertyFileData.properties.txt");
		Properties pro = new Properties();
		pro.load(fis);
		String URL = pro.getProperty("url2");
		driver.get(URL);
		//fetching data from excel
		/*FileInputStream fes = new FileInputStream("./ExcelData.xlsx");
		Workbook book = WorkbookFactory.create(fes);
		Sheet sheet = book.getSheet("Flipkart");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String exceldata = cell.getStringCellValue();
		driver.findElement(By.name("q")).sendKeys(exceldata);*/
		}
}

