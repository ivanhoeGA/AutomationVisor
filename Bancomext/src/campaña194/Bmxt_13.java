package campa�a194;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Bmxt_13 {

	public static void main(String[] args) throws InterruptedException {
		// / Declaraci�n de navegador
		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opts);

		// Completar el formulario de Usuario y Contrase�a
		driver.navigate().to("https://demobancomext.visor.io/login/bancomext");
 		driver.manage().window().maximize();
		Thread.sleep(1500);

		// Ingresar credenciales para completar REGISTRO ELECTR�NICO
		driver.findElement(By.id("emaIndex")).sendKeys("sam194qa@yopmail.com");
		driver.findElement(By.id("pswIndex")).sendKeys("Mexico123*");
		driver.findElement(By.xpath("//*[text() = 'COMIENZA AHORA']")).click();
		Thread.sleep(25000);
		
		//Se selecciona la campa�a 227
		//driver.findElement(By.xpath("//*[text() = 'Solicitudes']")).click();
		
		
		// Completar el REGISTRO ELECTR�NICO - Apoderados
		driver.findElement(By.xpath("//*[text() = 'H) Documentaci�n general del proveedor']")).click();
		
//		driver.findElement(By.xpath("//*[@id='btnSubirFile'][contains( @data-campo, 'Solicitante_1_Identificaci�n_Oficial')]")).click();
//		driver.findElement(By.name("upl")).sendKeys("C:\\b2c64374-15e6-4aa7-af9b-b94c537a875c.pdf");
//		driver.findElement(By.xpath("//*[contains( @value, 'Guardar')]")).click();
		
		driver.findElement(By.xpath("//*[@id='btnSubirFile'][contains( @data-campo, 'Datos_7_Copia_simple_del_�ltimo_Estado_de_Cuenta_de_Cheques_o_carta_emitida_por_el_Banco')]")).click();
		driver.findElement(By.name("upl")).sendKeys("C:\\b2c64374-15e6-4aa7-af9b-b94c537a875c.pdf");
		driver.findElement(By.xpath("//*[contains( @value, 'Guardar')]")).click(); 
		
		//Pasar a la etapa Comprobaci�n.
		driver.findElement(By.id("eAuth")).click();
		
		//Se cierra el navegador
		driver.close();
		
	}

}
