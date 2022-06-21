package mavenpractise;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoWebShop_addToCartTest extends BaseclassTest {
	@Test
	public void addtocart() throws InterruptedException{
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("ico-login")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("harishhari@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Harishhari@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		  driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]")).click();
		  Actions act=new Actions(driver);
			
			WebElement sortby = driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
			act.sendKeys((sortby), Keys.ARROW_DOWN.ENTER).build().perform();
			driver.findElement(By.xpath("(//a[@title='Show products in category Desktops'])[1]")).click();
			driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
			/*
			 * Thread.sleep(2000);
			 * driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
			 * Thread.sleep(5000);
			 * driver.findElement(By.xpath("(//a[@href='/cart'])[2]")).click(); String
			 * text=driver.findElement(By.xpath("(//table[1])/tbody[1]/tr[1]/td[3]/a")).
			 * getText(); if(text.contains("Computing and Internet")) {
			 * System.out.println("test case pass");
			 *  }
			 */
		 
	}

}

