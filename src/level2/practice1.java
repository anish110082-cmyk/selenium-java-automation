package level2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
//		first find the element by its heading , all 30 headings will be selected here
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
//		running a loop for all 30 elements
		for(int i = 0 ; i<= products.size() ; i++) {
//			extract the text for each element
			String name = products.get(i).getText();
			
//			when extracted text is equal to required text , select the add to cart button
			if(name.contains("Cucumber")) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}

	}

}
