package principal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class ListoAutomatizar {

	public static void main(String[] args) {
		

		//  WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
			
		  WebDriver driver = new InternetExplorerDriver();
		  driver.get("http://www.google.com");
		  String i = driver.getCurrentUrl();
		  System.out.println(i);
		  driver.close();
		 }

}
