package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		steps to invoke chrome driver 
//		System.setProperty(null, null)
//		WebDriver driver = new ChromeDriver();
		
		
//		FIREFOX LAUNCH
//		WebDriver driver = new FirefoxDriver();
		
//		EDGE DRIVER
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//		driver.close();
		driver.quit();

	}

}
