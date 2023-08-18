package seleniumprjt1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {
	public static void main(String [] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("title: "+title);
		String cUrl=driver.getCurrentUrl();
		System.out.println("cUrl: "+cUrl);
		Thread.sleep(40001);
		driver.close();
		
		
	}
}
