package WindowsHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling_2 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.get("https://www.naukri.com/");
driver.findElement(By.xpath("(//a[@class='ntc__chip-wrapper'])[2]")).click();
System.out.println(driver.getCurrentUrl());
Thread.sleep(2000);
Set<String> Windows = driver.getWindowHandles();

Iterator<String> it = Windows.iterator();
Thread.sleep(2000);

String Parent = it.next();
String child = it.next();

driver.switchTo().window(child);
System.out.println(driver.getCurrentUrl());
Thread.sleep(2000);
driver.findElement(By.xpath("(//div[@class=' row1'])[1]")).click();
System.out.println(driver.getCurrentUrl());
driver.switchTo().window(Parent);
System.out.println(driver.getCurrentUrl());
driver.switchTo().window(child);
System.out.println(driver.getCurrentUrl());


	}

}
