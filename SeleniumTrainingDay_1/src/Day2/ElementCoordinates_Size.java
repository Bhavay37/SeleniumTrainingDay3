package Day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementCoordinates_Size {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty(
				"webdriver.chrome.driver",
				"C:/Users/bhavay.pant/Downloads/Training Material/chromedriver_win32 (1)/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		WebElement SearchBtn= driver.findElement(By.xpath(".//input[@name='btnK']"));
		Point coordinates=SearchBtn.getLocation();
		Dimension size=SearchBtn.getSize();
		System.out.println(coordinates+"\n"+size);
		driver.quit();

	}

}
