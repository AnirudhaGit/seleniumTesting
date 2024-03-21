package ScreenshootHandling;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshoothamdle {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//to Take full Screenshoot
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, new File("C:\\Users\\anirudha\\OneDrive\\Desktop\\Screenshot.Sample.jpg"));

		
		//// Partial Screenshot
		WebElement partial = driver.findElement(By.xpath("(//input[@type='text'])[1]"));

		File src1 = partial.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("C:\\Users\\anirudha\\OneDrive\\Desktop\\Screenshot.Sample1.jpg"));

	}

}
