package campana353;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class uniclick_05d {

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

		// Ubicarse en la etapa correspondiente para la carga de los documentos del solicitante
		driver.findElement(By.xpath("//*[contains(text(),'Documentos del solicitante  PM')]")).click();
		
		//Se carga el documento para "Financieros en original no mayor a 3 meses"		
		driver.findElement(By.xpath("//*[@id='btnSubirFile'][contains( @data-campo, 'Documentos_del_Solicitante__Financieros_en_original_no_mayor_a_3_meses')]")).click();
		driver.findElement(By.name("upl")).sendKeys("C:\\b2c64374-15e6-4aa7-af9b-b94c537a875c.pdf");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains( @value, 'Guardar')]")).click();
		Thread.sleep(4000);
		
		//Se carga el documento para "Estados de cuenta (3 �ltimos meses)"
		driver.findElement(By.xpath("//*[@id='btnSubirFile'][contains( @data-campo, 'Documentos_del_Solicitante__Estados_de_cuenta_3_�ltimos_meses')]")).click();
		driver.findElement(By.name("upl")).sendKeys("C:\\b2c64374-15e6-4aa7-af9b-b94c537a875c.pdf");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains( @value, 'Guardar')]")).click(); 
		Thread.sleep(4000);
		
		//Se carga el documento para "Comprobante de domicilio"
		driver.findElement(By.xpath("//*[@id='btnSubirFile'][contains( @data-campo, 'Documentos_del_Solicitante__Comprobante_de_domicilio')]")).click();
		driver.findElement(By.name("upl")).sendKeys("C:\\b2c64374-15e6-4aa7-af9b-b94c537a875c.pdf");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains( @value, 'Guardar')]")).click(); 
		Thread.sleep(4000);
		
		//Se carga el documento para "Identificaci�n vigente (rep. legal o PFAE)"
		driver.findElement(By.xpath("//*[@id='btnSubirFile'][contains( @data-campo, 'Documentos_del_Solicitante__Identificaci�n_vigente_rep_legal_o_PFAE')]")).click();
		driver.findElement(By.name("upl")).sendKeys("C:\\b2c64374-15e6-4aa7-af9b-b94c537a875c.pdf");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains( @value, 'Guardar')]")).click(); 
		Thread.sleep(4000);
		
		//Se carga el documento para "Constancia de identificaci�n fiscal"
		driver.findElement(By.xpath("//*[@id='btnSubirFile'][contains( @data-campo, 'Documentos_del_Solicitante__Constancia_de_identificaci�n_fiscal')]")).click();
		driver.findElement(By.name("upl")).sendKeys("C:\\b2c64374-15e6-4aa7-af9b-b94c537a875c.pdf");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains( @value, 'Guardar')]")).click(); 
		Thread.sleep(4000);
		
		//Se carga el documento para "FIEL (Impresi�n SAT)"
		driver.findElement(By.xpath("//*[@id='btnSubirFile'][contains( @data-campo, 'Documentos_del_Solicitante__FIEL_Impresi�n_SAT')]")).click();
		driver.findElement(By.name("upl")).sendKeys("C:\\b2c64374-15e6-4aa7-af9b-b94c537a875c.pdf");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains( @value, 'Guardar')]")).click(); 
		Thread.sleep(4000);
		
		//Se carga el documento para "Acta constitutiva"
		driver.findElement(By.xpath("//*[@id='btnSubirFile'][contains( @data-campo, 'Documentos_del_Solicitante__Acta_constitutiva')]")).click();
		driver.findElement(By.name("upl")).sendKeys("C:\\b2c64374-15e6-4aa7-af9b-b94c537a875c.pdf");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains( @value, 'Guardar')]")).click(); 
		Thread.sleep(4000);
		
		//Se carga el documento para "Acta de poderes"
		driver.findElement(By.xpath("//*[@id='btnSubirFile'][contains( @data-campo, 'Documentos_del_Solicitante__Acta_de_poderes')]")).click();
		driver.findElement(By.name("upl")).sendKeys("C:\\b2c64374-15e6-4aa7-af9b-b94c537a875c.pdf");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains( @value, 'Guardar')]")).click(); 
		Thread.sleep(4000);
		
		// Cerrar la ventana del navegador para liberar la memoria
		// driver.close();
		

	}

}
