package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/?utm_source=chatgpt.com");
driver.findElement(By.xpath("//div[@class='block large-row-spacer']/div[@class='cen-right-align']/fieldset")).click();

	}

}
