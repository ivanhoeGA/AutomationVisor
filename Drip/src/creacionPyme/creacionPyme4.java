package creacionPyme;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class creacionPyme4 {

	public static void main(String[] args) throws InterruptedException {
		// Se instancia el navegador para acceder al sitio de Bancomext
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://demo.visor.io/login");
		driver.manage().window().maximize();

		// Se ingresa en el aplicativo para la generación de la PYMe y su perfil
		WebElement email = driver.findElement(By.id("emaIndex"));
		WebElement password = driver.findElement(By.id("pswIndex"));
		WebElement passButton = driver.findElement(By.xpath("//*[@id = 'submit']"));

		email.sendKeys("tola@yopmail.com");
		password.sendKeys("Visor@123");
		passButton.click();
		Thread.sleep(2000);
		
		// Apartado de Buró de Crédito
		WebElement BuroCredito = driver.findElement(By.xpath("//h4[contains(text(),'Buró de Crédito')]"));
		BuroCredito.click();
		
		//Cargar archivos
		WebElement Autorizacion = driver.findElement(By.xpath("//*[@id='btnSubirFile'][contains( @data-campo, 'buro_de_credito_autorizacion')]"));
		WebElement SubirArchivo = driver.findElement(By.name("upl"));
		WebElement Guardar = driver.findElement(By.xpath("//*[contains( @value, 'Guardar')]"));
		
		Autorizacion.click();
		SubirArchivo.sendKeys("C:\\b2c64374-15e6-4aa7-af9b-b94c537a875c.pdf");
		Thread.sleep(2500);
		Guardar.click();
		Thread.sleep(4000);

	}

}
