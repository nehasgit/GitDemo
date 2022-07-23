package DPExcelPOI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DPExcel {
public static void main(String[] args) {
		
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Sandeep\\Documents\\Neha\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
}
