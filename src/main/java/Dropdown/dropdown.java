package Dropdown;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class dropdown {
 public static void main(String[] args) { 
	 WebDriver driver = new ChromeDriver();
	    String baseURL = "https://demo.guru99.com/test/newtours/register.php";
	    
		driver.get(baseURL);

		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARCTICA");

		//Selecting Items in a Multiple SELECT elements
		driver.get("http://jsbin.com/osebed/2");
		Select fruits1 = new Select(driver.findElement(By.id("fruits")));
		fruits1.selectByVisibleText("Banana");
		fruits1.selectByIndex(1);
 }
}