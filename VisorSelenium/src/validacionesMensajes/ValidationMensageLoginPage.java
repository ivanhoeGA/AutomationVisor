package validacionesMensajes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationMensageLoginPage {

	public static void main(String[] args) {
		// Declaraci�n de la variable de 
		String baseUrl = "https://demo.visor.io/login/";
		String expectedTitle = "Bienvenido";
		String actualTitle = "";

		// Invocaci�n del navegador
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.visor.io/login/");
		driver.manage().window().maximize();

		// Se valida el t�tulo de la pantalla de Home Page
		driver.get(baseUrl);
		actualTitle = driver.getTitle();

		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Verificaci�n realizada, el t�tulo corresponde al LoginPage");
		} else {
			System.out.println("El t�tulo no corresponde a LoginPage");
		}

		// Se realiza la validaci�n de la im�gen del Login Page
		WebElement imageLogin = driver.findElement(By.xpath("//*[@class = 'img-responsive']"));

		if (imageLogin.isDisplayed()) {
			System.out.println("Contiene correctamente la im�gen de Bancomext en LoginPage");
		} else {
			System.out.println("No contiene la im�gen de bancomext en LoginPage");
		}

		// Se realiza la validaci�n del mensaje de usuario incorrecto
		WebElement userIncorrect = driver.findElement(By.id("mensajeLoginIndex"));
		WebElement email = driver.findElement(By.id("emaIndex"));
		WebElement password = driver.findElement(By.id("pswIndex"));
		WebElement passButton = driver.findElement(By.xpath("//*[text() = 'COMIENZA AHORA']"));

		email.sendKeys("selenium.qa@yopmail.com");
		password.sendKeys("Mexico_ERROR");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		passButton.click();

		if (userIncorrect.isDisplayed()) {
			System.out.println("Se muestra mensaje 'No encontramos tu usuario en nuestros registros, comun�cate con VISOR'");
		}

		else {
			System.out.println("El mensaje no se mostr� al usuario");
		}
		
		//Se valida que se presente el bot�n de "Assitencia"
//		WebElement helpButton = driver.findElement(By.xpath("//*[text() ='Asistencia']]"));
//		
//		if (helpButton.isDisplayed())	{
//			System.out.println("Se visualiza el bot�n de ayuda");
//		}
//		else	{
//			System.out.println("No esta presente el bot�n de ayuda en LoginPage");
//		}
	}

}
