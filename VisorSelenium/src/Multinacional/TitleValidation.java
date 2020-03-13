package Multinacional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class TitleValidation {
	
	public static void main (String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Windows\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		String baseUrl = "https://bancomext.visor.io/admin/";
		String expectedTitle = "ADMIN - Login";
		String actualTitle = "";
		
		driver.get(baseUrl);
		
		actualTitle = driver.getTitle();
		
		
		if (actualTitle.contentEquals(expectedTitle))  {
			System.out.println("Verificación realizada, el título es correcto");
		}
		else {
			System.out.println("Incorrect Test");
		}
		
	driver.close();
	}

}
