package org.browser.launch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(500);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.close();
	
	
	
	
			

	}

}
