package intro;
import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://sso.teachable.com/secure/9521/identity/login/password?force=true");
		driver.findElement(By.id("email")).sendKeys("anish@gmail.com");
		driver.findElement(By.name("password")).sendKeys("anish1234");
		driver.findElement(By.name("commit")).click();
		driver.findElement(By.linkText("Forgot Password")).click();
		
//		the below wait statement , gives some time and let the driver wait after forgot password and then enter the new email in the new web page, without this cmd both the emails will be written in the first page itself
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.urlContains("forgot_password"));
//		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='email'] ")).sendKeys("anish123@gmail.com");
		driver.findElement(By.xpath("//input[@name='email']")).clear();
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ak121@gmail.com");
		driver.findElement(By.cssSelector("#email")).sendKeys("ak123456@rediffmail.com");
}
}
