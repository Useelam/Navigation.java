package framespractice;

import org.openqa.selenium.WebDriver:
import org.openqa.selenium.chrome.ChromeDriver:

import io.github.Useelam.wdm.WebDriverManager:
	
import uitesting.WebDriver;

public class Frames {

	public static void main(String[] args) throws Exception {
		//WebDiverManager.chromedriver().setup()
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id(name")).sendkeys(Text1");//Main document
		Thread.sleep(3000);
		driver.switchTo().frame("frm1");//frame1
		seName_dd = new select (driver.findElement (By.id"course"));
		courseName_dd.selectByVisibleText("Java");
		Thread.sleep(3000);
		driver.switchTo().frame("fm2");//frame2
		
		driver.findElement(By.id("firstName")).sendkeys(Uma);
		driver.switchTo().defaultContent();//Main document
		Thread.sleep(3000);
		driver.switchTo().frame("frm1"); //frame1
		
		courseName_dd.selectByVisibleText("Dot Net");
		Thread.sleep(3000);
		
		driver.swithTO().defaultContent();//Main docuemnt
		driver.findElement (By.id("name")).clear();
		driver.findElement (By.id("name")).sendKeys ("Text2");
		}

	}


