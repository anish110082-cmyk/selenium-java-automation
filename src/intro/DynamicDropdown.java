package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.spicejet.com/");

        Thread.sleep(5000);

        // Click From
        driver.findElement(By.xpath("//div[text()='From']")).click();

        Thread.sleep(2000);

        // Select Ahmedabad
        driver.findElement(By.xpath("//*[text()='AMD']")).click();

        Thread.sleep(2000);

        // Select Mumbai
        driver.findElement(By.xpath("//*[text()='BOM']")).click();

        Thread.sleep(3000);
    }
}