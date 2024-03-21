package WindowsHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling_3 {
    public static void main(String[] args) throws InterruptedException {
       
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/windows");
        System.out.println("Parent URL: " + driver.getCurrentUrl());
        Thread.sleep(2000);
        Set<String> windows = driver.getWindowHandles();
        Thread.sleep(2000);
        Iterator<String> it = windows.iterator();
        String parent = it.next();
        String child = it.next();
        driver.switchTo().window(child);
        System.out.println("Child URL: " + driver.getCurrentUrl());
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div[@class='row'])[1]")).click();
        Thread.sleep(2000);
        System.out.println("After clicking on child URL: " + driver.getCurrentUrl());
        driver.switchTo().window(parent);
        System.out.println("Back to Parent URL: " + driver.getCurrentUrl());
        driver.quit();
    }
}

