package webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Gethublogin {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
		driver.findElement(By.id(("login_field"))).sendKeys("Useelam");
		driver.findElement(By.name("password")).sendKeys("umarani@21");
		driver.findElement(By.name("commit")).click();
		
		
		
	}

}
