package automation.framework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectActiveBid {

	public static void selectActiveBid() {
		
		//Login login1 = new Login();
		//login1.login();
		System.out.println("inside active bid");
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://suppliers.qa.inwk.com");
	
		//Load portal and login:
		WebElement elementuname = driver.findElement(By.name("username"));
		elementuname.sendKeys("kdm");
		
		WebElement elepwd = driver.findElement(By.name("password"));
		elepwd.sendKeys("kdm1");
		
		//login button click below:
		driver.findElement(By.xpath("html/body/div[1]/table[3]/tbody/tr/td[2]/div/div[3]/button[1]")).click();
		
		driver.get("http://suppliers.qa.inwk.com/#home");
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement menuBar = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div/table[1]/tbody/tr[1]"));
		List<WebElement> childs = menuBar.findElements(By.xpath(".//*"));
		
		for (WebElement element : childs) {
		    System.out.println(element);
		} 
		
		WebElement elebids = driver.findElement(By.xpath(".//td[contains(text(), 'Bids')]"));
		Actions action = new Actions(driver);
		action.moveToElement(elebids).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		
		//if ( !driver.findElement(By.id("gwt-uid-106")).isSelected() )
		//{
		//driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div/table[2]/tbody/tr/td/table/tbody/tr/td/div/table[2]/tbody/tr[3]/td/table/tbody/tr[4]/td/span/label")).click();;
		
		//WebElement activeBidMenu = driver.findElement(By.xpath("//*[@id="gwt-uid-168]);
		
		WebElement activeBidMenu = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div/table[1]/tbody/tr[1]/td/div//*[text()[contains(., 'Active Bids')]"));
		activeBidMenu.click();

		
		//}
		
		//select a bid to bid on:
		//driver.findElement(By.xpath("//*[contains(text(), 'Bid On This Item')]")).click();
		
		//driver.getPageSource().contains("text to search");

	}

}
