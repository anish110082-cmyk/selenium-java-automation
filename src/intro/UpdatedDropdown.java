package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class UpdatedDropdown {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.cssSelector("input[id$='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id$='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id$='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		
//		COUNT THE NO OF CHECKBOXES
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);	
        
		     int i =1;
		  while(i<5)
		  {
		      driver.findElement(By.id("hrefIncAdt")).click();
		       i++;
		   }
		  Thread.sleep(2000);
		  	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		  	Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		  	
		  int j = 0 ;
		  while(j<3)
		  {
			  driver.findElement(By.id("hrefIncInf")).click();
			  j++;
		  }
		  Thread.sleep(5000);
		  while(j>1)
		  {
			  driver.findElement(By.id("hrefDecInf")).click();
			  j--;

		  }
		  	Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult, 1 Infant");

		  

		  
		
		driver.findElement(By.id("btnclosepaxoption")).click();

	}

}
