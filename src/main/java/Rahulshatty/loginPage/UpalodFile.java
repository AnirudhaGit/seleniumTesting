package Rahulshatty.loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpalodFile {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://demo.guru99.com/test/upload/";
		driver.get(baseUrl);
		WebElement uploadElement =	driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		
		uploadElement.sendKeys("D:\\file.html");
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.xpath("//button[@id='submitbutton']")).click();
		

}
}
