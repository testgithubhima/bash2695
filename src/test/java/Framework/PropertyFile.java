package Framework;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PropertyFile {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		FileInputStream fis = new FileInputStream("./PropertyFile");
		Properties pro = new Properties();
		pro.load(fis);
		String URL = pro.getProperty("url2");
		driver.get(URL);
	}
}
