package webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gethublogin {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver get("https://github.com");
		driver.findElement(By.id(("Username")).sendKeys("Useelam");
		driver.findElement(By.id("Password")).sendKeys("Shraddha@21");
		
		
	}

}
