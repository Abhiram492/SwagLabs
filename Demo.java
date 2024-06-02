package seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.nopcommerce.com/");  //Code run successfully
		String act_Title = driver.getTitle();
		if(act_Title.equals("nopCommerce demo store")) //there is no error
		{
			System.out.println("Test passed");
			
		}
		else
		{
			System.out.println("Test Failed");
			
			
		}
		
		driver.quit();
	}

}
