package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./src/main/resources/driver/chromedriver.exe");
	WebDriverManager.chromiumdriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leafground.com/pages/Edit.html");
    WebElement EmailBox = driver.findElement(By.id("email"));
    EmailBox.sendKeys("Test@leaf.com");
	WebElement AppendBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
	AppendBox.sendKeys("text");
	WebElement getTextBox = driver.findElement(By.name("Username"));
	String Value = getTextBox.getAttribute("value");
	System.out.println("value");
	WebElement ClearBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input"));
	ClearBox.clear();
	WebElement disabledBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input"));
	boolean Enabled = disabledBox.isEnabled();
	System.out.println("Enabled");
	driver.close();
	
	}

}
