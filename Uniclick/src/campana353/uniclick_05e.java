package campana353;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class uniclick_05e {

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
		driver.findElement(By.xpath("//*[contains(text(),'Documentos del  propietario real')]")).click();

		// Se carga el documento para "Financieros en original no mayor a 3
		// meses"
		driver.findElement(By
				.xpath("//*[@id='btnSubirFile'][contains( @data-campo, 'Documentos_del__Propietario_Real_Identificación_oficial_vigente')]"))
				.click();
		driver.findElement(By.name("upl")).sendKeys("C:\\b2c64374-15e6-4aa7-af9b-b94c537a875c.pdf");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains( @value, 'Guardar')]")).click();
		Thread.sleep(4000);
		
		// Se carga el documento para "Cédula de identificación fiscal "
				driver.findElement(By
						.xpath("//*[@id='btnSubirFile'][contains( @data-campo, 'Documentos_del__Propietario_Real_Cédula_de_identificación_fiscal')]"))
						.click();
				driver.findElement(By.name("upl")).sendKeys("C:\\b2c64374-15e6-4aa7-af9b-b94c537a875c.pdf");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[contains( @value, 'Guardar')]")).click();
				Thread.sleep(4000);
			
				// Se carga el documento para "CURP "
				driver.findElement(By
						.xpath("//*[@id='btnSubirFile'][contains( @data-campo, 'Documentos_del__Propietario_Real_CURP')]"))
						.click();
				driver.findElement(By.name("upl")).sendKeys("C:\\b2c64374-15e6-4aa7-af9b-b94c537a875c.pdf");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[contains( @value, 'Guardar')]")).click();
				Thread.sleep(4000);
				
				// Se carga el documento para "Comprobante de domicilio"
				driver.findElement(By
						.xpath("//*[@id='btnSubirFile'][contains( @data-campo, 'Documentos_del__Propietario_Real_Comprobante_de_domicilio')]"))
						.click();
				driver.findElement(By.name("upl")).sendKeys("C:\\b2c64374-15e6-4aa7-af9b-b94c537a875c.pdf");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[contains( @value, 'Guardar')]")).click();
				Thread.sleep(4000);
		
				// Se carga el documento para "Identificación del Propietario Real (anexo)"
				driver.findElement(By
						.xpath("//*[@id='btnSubirFile'][contains( @data-campo, 'Documentos_del__Propietario_Real_Identificación_del_Propietario_Real_anexo')]"))
						.click();
				driver.findElement(By.name("upl")).sendKeys("C:\\b2c64374-15e6-4aa7-af9b-b94c537a875c.pdf");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[contains( @value, 'Guardar')]")).click();
				Thread.sleep(4000);
				
				// Se carga el documento para "Aviso de Privacidad"
				driver.findElement(By
						.xpath("//*[@id='btnSubirFile'][contains( @data-campo, 'Documentos_del__Propietario_Real_Aviso_de_Privacidad')]"))
						.click();
				driver.findElement(By.name("upl")).sendKeys("C:\\b2c64374-15e6-4aa7-af9b-b94c537a875c.pdf");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[contains( @value, 'Guardar')]")).click();
				Thread.sleep(4000);
		

	}

}
