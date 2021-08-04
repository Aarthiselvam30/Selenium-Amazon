package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opengoogle {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\user\\\\\\\\Desktop\\\\\\\\Selenium\\\\\\\\SeleniumTraining\\\\\\\\driver\\\\\\\\chromedriver (1).exe");
		WebDriver driver = new ChromeDriver();
		//1.open amazon
		driver.get("https://www.amazon.in/");   
		//2.Signin in amazon
		driver.findElement(By.id("nav-link-accountList")).click();
		//3.Login with phone number
		driver.findElement(By.id("ap_email")).sendKeys("8939151254"+Keys.ENTER);
		//4.Entering password
		driver.findElement(By.id("ap_password")).sendKeys("aarthi123@"+Keys.ENTER);
		//5.type the product in search box
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("fire bolt watch"+Keys.ENTER);
		//6.Click the product to view the description
		driver.findElement(By.xpath("//img[@alt='Sponsored Ad - Fire-Boltt SpO2 Full Touch 1.4 inch Smart Watch 400 Nits Peak Brightness Metal Body 8 Days Battery Life wit...']")).click();
		//7.Click add to cart
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		//8.click the rating to view
		driver.findElement(By.xpath("//div[@id='averageCustomerReviews_feature_div']//span[@id='acrCustomerReviewText']")).click();
		driver.close();
		
		
	

	}

}
