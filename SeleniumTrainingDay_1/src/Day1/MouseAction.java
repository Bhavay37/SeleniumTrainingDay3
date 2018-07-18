package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseAction {
	
	
	public static WebDriver driver;
	public static WebElement ProductCategory;
	public static WebElement iPhoneCategory;
	public static WebElement LogIn;
	public static WebElement Draggable;
	public static WebElement Droppable;
	public static WebElement resizeElement;

	public void Web_Elements() throws InterruptedException{
		System.setProperty(
				"webdriver.chrome.driver",
				"C:/Users/bhavay.pant/Downloads/Training Material/chromedriver_win32 (1)/chromedriver.exe");
		this.driver= new ChromeDriver();
		//http://jqueryui.com/resources/demos/droppable/default.html
		//http://store.demoqa.com/
		//http://jqueryui.com/resources/demos/resizable/default.html
		driver.get("http://jqueryui.com/resources/demos/slider/default.html");
		WebDriverWait wait= new WebDriverWait(driver,180);
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("draggable")));
		/*wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//a[contains(text(),'Product Category')]")));
		ProductCategory= driver.findElement(By.xpath(".//a[contains(text(),'Product Category')]"));
		iPhoneCategory= driver.findElement(By.xpath(".//a[contains(text(),'iPhone')]"));*/
		//Draggable= driver.findElement(By.id("draggable"));
		//Droppable= driver.findElement(By.id("droppable"));
		resizeElement= driver.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
	}
	
	public void performMouseOperations(WebElement element1,WebElement element2, String option) throws InterruptedException{
		Actions act= new Actions(driver);
		switch (option) {
		case "Hover":
			act.moveToElement(element1).perform();	
			break;
		case "RightClick":
			act.moveToElement(element1).contextClick();
			Thread.sleep(5000);
			act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
			break;
		case "DragAndDrop":
			act.dragAndDrop(element1, element2).perform();
			break;
		case "Resize":
			// same for slide operation
			act.dragAndDropBy(element1, 400, 200).perform();
		default:
			break;
		}
		
	}


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		MouseAction HomeShopPurchase= new MouseAction();
		HomeShopPurchase.Web_Elements();
		driver.manage().window().fullscreen();
		/*HomeShopPurchase.performMouseOperations(ProductCategory,null,"Hover");
		iPhoneCategory.click();
		Thread.sleep(5000);
		LogIn= driver.findElement(By.xpath(".//a[contains(text(),'Log in')]"));
		HomeShopPurchase.performMouseOperations(LogIn,null,"RightClick");
		Thread.sleep(10000);
		driver.quit();*/
		//HomeShopPurchase.performMouseOperations(Draggable,Droppable,"DragAndDrop");
		HomeShopPurchase.performMouseOperations(resizeElement,null,"Resize");
		Thread.sleep(5000);
		driver.quit();
	}

}
