import java.io.File;
import java.io.IOException;

import org.apache.commons.io.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelWebDriver {

	private static String fileWithPath;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\geckodriver\\chromedriver.exe");
		//DesiredCapabilities capabilities=DesiredCapabilities.chrome();
		//capabilities.setCapability("marionette", true);
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
//		driver.findElement(By.linkText("Sign In")).click();
//		driver.findElement(By.id("id_userLoginId")).sendKeys("a@g.com");
//		WebElement chkbox=driver.findElement(By.id("bxid_rememberMe_true"));
		//chkbox.click();
//		chkbox.click();
//		if(chkbox.isSelected())
//			System.out.println("check is on");
		
//		WebElement rb=driver.findElement(By.id("u_0_6"));
//		rb.click();
//		 rb=driver.findElement(By.id("u_0_7"));
//		 rb.click();
//		if(rb.isSelected())
//		{
//			System.out.println("checked");
//		}
		
//		driver.findElement(By.cssSelector("#u_0_m"));
//		Select select=new Select(driver.findElement(By.id("day")));
//		select.selectByVisibleText("6");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src,new File("C:/selenium/error.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
