package org.browser.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Ecomerce_Project {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		// unwanted notification avoided using below method ex Allow key notification
		// ChromeOptions op = new ChromeOptions();
		// op.addArguments("--disable -notification");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(9000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("LG Tv");
		Thread.sleep(1000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(9000);
         Actions a = new Actions(driver);
         WebElement product =driver.findElement(By.xpath("//*[text()='41,990']"));
         a.moveToElement(product);
         Thread.sleep(1500);
         a.click();
         Thread.sleep(1500);
       
         
	}

}
