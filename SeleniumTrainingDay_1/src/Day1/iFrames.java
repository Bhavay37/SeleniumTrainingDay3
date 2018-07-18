package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class iFrames {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty(
				"webdriver.chrome.driver",
				"C:/Users/bhavay.pant/Downloads/Training Material/chromedriver_win32 (1)/chromedriver.exe");
		driver= new ChromeDriver();
		//http://jqueryui.com/dialog/
		driver.get("file:///C:/Users/bhavay.pant/Downloads/NewPage.html");
		driver.manage().window().maximize();
		/*WebElement frameElement= driver.findElement(By.xpath("//*[@id='content']/iframe"));
		driver.switchTo().frame(frameElement);
		WebElement closebtn= driver.findElement(By.xpath(".//button[@type='button']"));
		closebtn.click();*/
		System.out.println(driver.findElements(By.xpath("//iframe")).size());
		driver.switchTo().frame(0);
		WebElement alertwindow= driver.findElement(By.id("promo"));
		WebElement closeBtn= driver.findElement(By.id("close"));
		String content= alertwindow.getText();
		System.out.println(content);
		closeBtn.click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		WebElement alertwindow2= driver.findElement(By.id("promo"));
		WebElement closeBtn2= driver.findElement(By.id("close"));
		String content2= alertwindow2.getText();
		System.out.println(content2);
		WebElement link_Text= driver.findElement(By.linkText("HERE"));
		link_Text.click();
		Thread.sleep(5000);
		driver.close();

	}

}
