package automation.framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {
	
	SelectActiveBid activeBid = new SelectActiveBid();

	public static void main(String[] args) throws InterruptedException {
		
		//login();
		System.out.println("login complete");
		SelectActiveBid.selectActiveBid();
		
	}
	
	public static void login()
	{
		System.out.println("inside login"); 
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://suppliers.qa.inwk.com");
		
		WebElement elementuname = driver.findElement(By.name("username"));
		elementuname.sendKeys("kdm");
		
		WebElement elepwd = driver.findElement(By.name("password"));
		elepwd.sendKeys("kdm1");
		
		//login button click below:
		driver.findElement(By.xpath("html/body/div[1]/table[3]/tbody/tr/td[2]/div/div[3]/button[1]")).click();

		//WebElement elecurrentbids = driver.findElement(By.name("Bids"));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	}
	

