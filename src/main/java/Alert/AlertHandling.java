package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Anirudha");
driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
Thread.sleep(3000);
driver.switchTo().alert().accept();


driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();

String text = driver.switchTo().alert().getText();
System.out.println(text);
//driver.switchTo().alert().sendKeys("Yes");
//driver.switchTo().alert().sendKeys("No");
driver.switchTo().alert().accept();
	}

}
