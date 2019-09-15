import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestAutoIT {
	
	   @Test
	   public void Test() throws InterruptedException, IOException
	   {
		System.setProperty("webdriver.chrome.driver","E:\\jars\\SeleniumJAR\\Chrome\\NewChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tinyupload.com/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type=\"file\" and @name=\"uploaded_file\"]")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\dell\\Downloads\\AutoIT\\Script\\FirstScript.exe");
		
		
		
		Thread.sleep(3000);
	   }
		
		
		
		
		
	
	
	

}
