package com.qa.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.foundit.in/seeker/registration?spl=IN-Acq-SEM-Google-IP_IN_SER_Monster_Brand_Exact_17052022-GSN-Monster.com-www%20monsterindia%20com%20login-Both-Brand---637202008756---CPC-6645446156&utm_campaign=IN_Acq_SEM-Google-IP_IN_SER_Monster_Brand_Exact_17052022-GSN-Monster.com-www%20monsterindia%20com%20login-&utm_medium=SEM&utm_source=Google-GSN-CPC&utm_term=SEM_www%20monsterindia%20com%20login&gclid=Cj0KCQjw2cWgBhDYARIsALggUhpsUqyxHPe3rtR2sG8-Csy3u8_pIB2B1bd7bO_6HOZwke_vriYyYwkaAr1BEALw_wcB");
		driver.findElement(By.xpath("//span[text()='Choose CV']")).click();
	}

}
