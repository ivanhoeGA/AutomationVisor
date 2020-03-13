package campana353;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class uniclick_05f {

	public static void main(String[] args) throws InterruptedException {
		// Abrir el browser y navegar a la url
				ChromeOptions opts = new ChromeOptions();
				opts.addArguments("--disable-notifications");
				WebDriver driver = new ChromeDriver(opts);
				driver.navigate().to("https://uniclick.visor.io/login/uniclick");
				driver.manage().window().maximize();

				// Ingresar credenciales para abrir navegador
				driver.findElement(By.id("emaIndex")).sendKeys("producto.bovinos@yopmail.com");
				driver.findElement(By.id("pswIndex")).sendKeys("Mexico123*");
				driver.findElement(By.id("submit")).click();
				Thread.sleep(5500);
				
				// Ubicarse en la etapa correspondiente para la carga de los documentos
				// del solicitante
				driver.findElement(By.xpath("//*[contains(text(),'Documentos del aval')]")).click();

				// Se carga el documento para "Identificaci�n oficial vigente"
				driver.findElement(By
						.xpath("//*[@id='btnSubirFile'][contains( @data-campo, 'Documentos_del_Avall_Identificaci�n_oficial_vigente')]"))
						.click();
				driver.findElement(By.name("upl")).sendKeys("C:\\b2c64374-15e6-4aa7-af9b-b94c537a875c.pdf");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[contains( @value, 'Guardar')]")).click();
				Thread.sleep(4000);
				
				// Se carga el documento para "C�dula de identificaci�n fiscal "
				driver.findElement(By
						.xpath("//*[@id='btnSubirFile'][contains( @data-campo, 'Documentos_del_Avall_C�dula_de_identificaci�n_fiscal')]"))
						.click();
				driver.findElement(By.name("upl")).sendKeys("C:\\b2c64374-15e6-4aa7-af9b-b94c537a875c.pdf");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[contains( @value, 'Guardar')]")).click();
				Thread.sleep(4000);
				
				// Se carga el documento para "CURP  "
				driver.findElement(By
						.xpath("//*[@id='btnSubirFile'][contains( @data-campo, 'Documentos_del_Avall_CURP')]"))
						.click();
				driver.findElement(By.name("upl")).sendKeys("C:\\b2c64374-15e6-4aa7-af9b-b94c537a875c.pdf");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[contains( @value, 'Guardar')]")).click();
				Thread.sleep(4000);
				
				// Se carga el documento para "Comprobante de domicilio"
				driver.findElement(By
						.xpath("//*[@id='btnSubirFile'][contains( @data-campo, 'Documentos_del_Avall_Comprobante_de_domicilio')]"))
						.click();
				driver.findElement(By.name("upl")).sendKeys("C:\\b2c64374-15e6-4aa7-af9b-b94c537a875c.pdf");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[contains( @value, 'Guardar')]")).click();
				Thread.sleep(4000);
				
				// Se carga el documento para "Identificaci�n del Aval (anexo)"
				driver.findElement(By
						.xpath("//*[@id='btnSubirFile'][contains( @data-campo, 'Documentos_del_Avall_Identificaci�n_del_Aval_anexo')]"))
						.click();
				driver.findElement(By.name("upl")).sendKeys("C:\\b2c64374-15e6-4aa7-af9b-b94c537a875c.pdf");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[contains( @value, 'Guardar')]")).click();
				Thread.sleep(5500);
				
				
				//Avanzar a informaci�n de la empresa hacia la etapa de An�lisis.
				WebElement formalizacionFinish = driver.findElement(By.id("eAuth"));
				formalizacionFinish.click();
				
				System.out.println("Se debi� de haber cambiado de etapa");

	}

}
