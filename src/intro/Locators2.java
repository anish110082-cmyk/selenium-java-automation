package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		ChromeDriver driver = new ChromeDriver();
//		String name = "standard_user";
//		driver.get("https://www.saucedemo.com/");
//		driver.findElement(By.id("user-name")).sendKeys(name);
//		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("secret_sauce");
////		driver.findElement(By.name("commit")).click();
////		driver.findElement(By.cssSelector("label[class='v-middle form-footer obsidian bodySmall']")).click();
//		driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
//		driver.findElement(By.cssSelector("input[name = 'commit']")).click();
//		Thread.sleep(4000);
////		System.out.println(driver.getCurrentUrl());
////		System.out.println(driver.findElement(By.tagName("a")).getText());
////		Assert.assertEquals(driver.findElement(By.tagName("a")).getText(),"Sauce Labs Backpack");
////		System.out.println(driver.findElements(By.tagName("a")).size());
////		System.out.println(driver.findElements(By.tagName("a")).get(5).getText());
//		driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		driver.findElement(By.id("login-button")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("react-burger-menu-btn")).click();

		Thread.sleep(1000);

//	    driver.findElement(By.id("logout_sidebar_link")).click();

	}

}
