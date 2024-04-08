package webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class loginpage {

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions ();
		co.addArguments("--remote-allow-origins=*");
		ChromeDriver driver =new ChromeDriver(co);
		driver.manage().timeouts();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("txtUsername")).sendKeys("123456789");
		driver.findElement(By.id("txtpassword")).sendKeys("123456789");
		driver.findElement(By.className("button")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();

	}

}
