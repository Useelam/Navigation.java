package javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ExJavascriptExecutor {

	public void get(String string) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
				
		JavascriptExecutor JsExcutor = (JavaScritExecuto) driver;
		WebElement element = (WebElement) JsExcutor.executeScript("document.getElementById('email');");
		element.sendKeys("id");
		JsExcutor.executeScript ("document.getElementById('email').value='id';");
		JsExcutor.executeScript ("document.getElementById('email')[0].value='name';");
		JsExcutor.executeScript ("document.getElementById('email').[0].value='classname';");
		JsExcutor.executeScript ("document.getElementById('email').[2].value='tagname';");

	}

}
