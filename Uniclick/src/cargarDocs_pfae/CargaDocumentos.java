package cargarDocs_pfae;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CargaDocumentos {

	public static void main(String[] args) throws InterruptedException {
		// Abrir el browser y navegar a la url
		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opts);
		driver.navigate().to("https://uniclick.visor.io/login/uniclick");
		driver.manage().window().maximize();

		// Ingresar credenciales para abrir navegador
		driver.findElement(By.id("emaIndex")).sendKeys("automation.sec@yopmail.com");
		driver.findElement(By.id("pswIndex")).sendKeys("Mexico123*");
		driver.findElement(By.id("submit")).click();
		Thread.sleep(9000);

		// Acceder a la pestaña de "Documentos del solicitante"
		driver.findElement(By.xpath("//*[text() = 'Documentos del solicitante PFAE']")).click();

		// Cargar el documento "Financieros en original no mayor a 3 meses".
		driver.findElement(By
				.xpath("//*[@id='btnSubirFile'][contains( @data-campo, 'Documentos_del_solicitante_PFAE_Financieros_en_original_no_mayor_a_3_meses')]"))
				.click();
		driver.findElement(By.name("upl")).sendKeys("C:\\document_10Mb.pdf");
		Thread.sleep(4500);
		driver.findElement(By.xpath("//*[contains( @value, 'Guardar')]")).click();
		Thread.sleep(4000);

		// Cargar el documento "Estados de cuenta (3 últimos meses)".
		driver.findElement(By
				.xpath("//*[@id='btnSubirFile'][contains( @data-campo, 'Documentos_del_solicitante_PFAE_Estados_de_cuenta_3_últimos_meses')]"))
				.click();
		driver.findElement(By.name("upl")).sendKeys("C:\\document_20Mb.pdf");
		Thread.sleep(4500);
		driver.findElement(By.xpath("//*[contains( @value, 'Guardar')]")).click();
		Thread.sleep(5000);

		// Cargar el documento "Comprobante de domicilio".
		driver.findElement(By.xpath("//*[@id='btnSubirFile'][contains( @data-campo, 'Documentos_del_solicitante_PFAE_Comprobante_de_domicilio')]"))
				.click();
		driver.findElement(By.name("upl")).sendKeys("C:\\document_30Mb.pdf");
		Thread.sleep(3500);
		driver.findElement(By.xpath("//*[contains( @value, 'Guardar')]")).click();
		Thread.sleep(5000);

		// Cargar el documento "Identificación oficial vigente (rep. legal o PFAE)".
		driver.findElement(By
				.xpath("//*[@id='btnSubirFile'][contains( @data-campo, 'Documentos_del_solicitante_PFAE_Identificación_oficial_vigente_rep_legal_o_PFAE')]"))
				.click();
		driver.findElement(By.name("upl")).sendKeys("C:\\document_100Mb.pdf");
		Thread.sleep(3500);
		driver.findElement(By.xpath("//*[contains( @value, 'Guardar')]")).click();
		Thread.sleep(9000);

		// Cargar el documento "Constancia de identificación fiscal".
		driver.findElement(By
				.xpath("//*[@id='btnSubirFile'][contains( @data-campo, 'Documentos_del_solicitante_PFAE_Constancia_de_identificación_fiscal')]"))
				.click();
		driver.findElement(By.name("upl")).sendKeys("C:\\b2c64374-15e6-4aa7-af9b-b94c537a875c.pdf");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains( @value, 'Guardar')]")).click();
		Thread.sleep(2500);

		// Cargar el documento "CURP".
		driver.findElement(
				By.xpath("//*[@id='btnSubirFile'][contains( @data-campo, 'Documentos_del_solicitante_PFAE_CURP')]"))
				.click();
		driver.findElement(By.name("upl")).sendKeys("C:\\b2c64374-15e6-4aa7-af9b-b94c537a875c.pdf");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains( @value, 'Guardar')]")).click();
		Thread.sleep(2500);
	}

}
