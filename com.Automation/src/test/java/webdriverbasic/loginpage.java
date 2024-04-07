package webdriverbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("txtUsername")).sendKeys("");
		driver.findElement(By.id("txtpassword")).sendKeys("");
		driver.findElement(By.className("button")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();
				

	}

}
