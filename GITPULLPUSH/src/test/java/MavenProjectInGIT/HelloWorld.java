package MavenProjectInGIT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromedriver","C:\\Users\\MYHOME\\Downloads\\chromedriver_win32 (1)");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		//use Alert. 
		
	}

}
