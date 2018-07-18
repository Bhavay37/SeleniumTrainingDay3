package Day2;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebAppPerformance {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty(
				"webdriver.chrome.driver",
				"C:/Users/bhavay.pant/Downloads/Training Material/chromedriver_win32 (1)/chromedriver.exe");
		driver= new ChromeDriver();

		SimpleDateFormat formatdate= new SimpleDateFormat("HH:mm:ss:ms");
		Date StartTime= new Date();
		String StrtTime= formatdate.format(StartTime);
		System.out.println("START TIME: "+StrtTime);
		
		//****************************************************************
		driver.get("http://www.homeshop18.com");
		/*WebDriverWait wait= new WebDriverWait(driver,30);
		WebElement OfferBtn= driver.findElement(By.xpath(".//a[@title='HS18 Offers']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//a[@title='HS18 Offers']")));*/	
		Wait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofMillis(1))
				.ignoring(NoSuchElementException.class);
		//fluentwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//a[@title='HS18 Offers']")));
		fluentwait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//a[@title='HS18 Offers']")));
		//***************************************************************

		Date EndTime= new Date();
		String Endtm= formatdate.format(EndTime);
		System.out.println("END TIME: "+Endtm);
		long TotalTime= EndTime.getTime()-StartTime.getTime();
		System.out.println("ELAPSE TIME: "+TotalTime);
		driver.quit();
	}

}
