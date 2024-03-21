package Rahulshatty.loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Anirudha");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ani");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
		driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
		driver.findElement(By.linkText("Forgot your password?")).click()  ;
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Rahul@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9856321256");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Reset Login')]")).click();
		String a = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		System.out.println(a);
		driver.findElement(By.xpath("//button[contains(text(),'Go to Login')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		String b = driver.findElement(By.xpath("//h2")).getText();
//		String c = driver.findElement(By.xpath("//h1")).getText();

		String d = driver.findElement(By.xpath("//h1")).getText();
//		System.out.println(b);
//		System.out.println(c);
		System.out.println(d);
	}

}
