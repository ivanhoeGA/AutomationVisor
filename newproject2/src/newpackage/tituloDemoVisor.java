package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class tituloDemoVisor {
	
	public static void main (String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Windows\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		String baseUrl = "https://demo.visor.io/login";
		String expectedTitle = "Bienvenido";
		String actualTitle = "";
		
		driver.get(baseUrl);
		
		actualTitle = driver.getTitle();
		
		
		if (actualTitle.contentEquals(expectedTitle))  {
			System.out.println("Verificación realida, el título es correcto");
		}
		else {
			System.out.println("Incorrect Test");
		}
		
	driver.close();
	}

}
