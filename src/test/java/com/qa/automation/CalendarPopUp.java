package com.qa.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CalendarPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		driver.findElement(By.xpath("//div[text()='March 2023']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='25']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[text()='Return']")).click();		
		//driver.findElement(By.xpath("//div[text()='April 2023']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='15']")).click();
	}

}
