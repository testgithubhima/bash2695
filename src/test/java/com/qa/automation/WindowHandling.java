package com.qa.automation;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		driver.findElement(By.xpath("//button[text()='click']")).click();
		Thread.sleep(4000);
		Set<String> windows = driver.getWindowHandles(); //framework //selenium //java ids store
		for(String childwindow:windows)
		{
			driver.switchTo().window(childwindow);
			String title = driver.getTitle(); //framework //selenium
			System.out.println(title);
			
			if(title.contains("Selenium"))
			{
				break;
			}
		}
		
		driver.findElement(By.linkText("Get Tickets")).click();
		driver.findElement(By.xpath("//a[.='Get Tickets']")).click();
		Thread.sleep(4000);
		
		Set<String> set2 = driver.getWindowHandles();
		for(String string : set2)
		{
			
		}
		
		
	}

}
