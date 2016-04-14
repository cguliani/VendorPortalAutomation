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
				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		/*WebElement menuBar = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div/table[1]/tbody/tr[1]"));
		List<WebElement> childs = menuBar.findElements(By.xpath(".//*"));
		
		for (WebElement element : childs) {
		    System.out.println(element);
		} 
		*/
		
		WebElement elebids = driver.findElement(By.xpath("//tr/td[contains(text(), 'Bids')]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(elebids).build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		//WebDriverWait wait = new WebDriverWait(driver, 5); 
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='subNav_music_menu']/tbody/tr[2]/td[1]/a[1]")));  // until this submenu is found

		//identify menu option from the resulting menu display and click
		WebElement menuOption = driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr[2]/td[2]/div/div/table/tbody/tr[2]/td"));
		menuOption.click(); 
		
		//if ( !driver.findElement(By.id("gwt-uid-106")).isSelected() )
		//{
		//driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div/table[2]/tbody/tr/td/table/tbody/tr/td/div/table[2]/tbody/tr[3]/td/table/tbody/tr[4]/td/span/label")).click();;
		
	//	WebElement activeBidMenu = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/div/table[1]/tbody/tr[1]/td/div//*[text()[contains(., 'Active Bids')]"));
	//	activeBidMenu.click();

		
	}

}
