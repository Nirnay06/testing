import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C:\\geckodriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.myntra.com");
		driver.switchTo().alert().dismiss();
	}
}
