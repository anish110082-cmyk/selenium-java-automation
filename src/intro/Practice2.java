package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ixigo.com/flights");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//div[@class='flex flex-col py-10 px-20 items-start pl-20  duration-300 ease-linear absolute w-full']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='HYD']")).click();

	}

}
