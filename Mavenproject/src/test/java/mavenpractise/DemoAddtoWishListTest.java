package mavenpractise;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DemoAddtoWishListTest extends BaseclassTest{
	@Test
	public void addtocart() throws InterruptedException{
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("harishhari@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Harishhari@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[4]/a")).click();
		 
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/h2/a")).click();
			driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();

}
}
