package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_handle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
	WebElement e = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
	Thread.sleep(2000);
	driver.switchTo().frame(e);
	driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
	driver.switchTo().defaultContent();
	//Thread.sleep(1000);


	}

}
