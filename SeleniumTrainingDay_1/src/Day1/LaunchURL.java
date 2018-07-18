package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchURL {
	public static WebDriver driver;
	public static WebElement FirstName ;
	public static WebElement LastName ;
	public static WebElement EmailId ;
	public static WebElement Password ;
	public static WebElement ConfirmPassword ;
	public static WebElement NextBtn;

	public void Web_Elements() throws InterruptedException{
		System.setProperty(
				"webdriver.chrome.driver",
				"C:/Users/bhavay.pant/Downloads/Training Material/chromedriver_win32 (1)/chromedriver.exe");
		this.driver= new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Faccounts.google.com%2FManageAccount&flowName=GlifWebSignIn&flowEntry=SignUp");
		FirstName= driver.findElement(By.id("firstName"));
		LastName= driver.findElement(By.id("lastName"));
		EmailId= driver.findElement(By.cssSelector("#username"));
		Password= driver.findElement(By.xpath(".//*[@id='passwd']/div[1]/div/div[1]/input"));
		ConfirmPassword= driver.findElement(By.xpath(".//*[@id='confirm-passwd']/div[1]/div/div[1]/input"));
		NextBtn= driver.findElement(By.id("accountDetailsNext"));
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		LaunchURL GmailLogin= new LaunchURL();
		GmailLogin.Web_Elements();
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		FirstName.click();
		FirstName.sendKeys("Bhavay");	
		LastName.click();
		LastName.sendKeys("Pant");
		EmailId.click();
		EmailId.sendKeys("pantbhavay460@gmail.com");
		Password.click();
		Password.sendKeys("eight888");
		ConfirmPassword.click();
		ConfirmPassword.sendKeys("eight888");
		NextBtn.click();
		Thread.sleep(2000);
		driver.quit();
	}

}
