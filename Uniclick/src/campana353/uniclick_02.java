package campana353;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class uniclick_02 {

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

		// Declarar los campos Crédito deseado
		WebElement productoInt = driver.findElement(By.id("Información_consulta_buró_Producto_de_interés"));
		WebElement montoSolic = driver.findElement(By.id("Información_consulta_buró_Monto_a_solicitar"));
		WebElement plazo = driver.findElement(By.id("Información_consulta_buró_Plazo_meses"));
		// Ingresar la información en los campos correspondiente -Crédito
		// deseado-
		productoInt.click();
		productoInt.sendKeys("Crédito");
		montoSolic.sendKeys("500000");
		plazo.click();
		plazo.sendKeys("9");
		plazo.sendKeys(Keys.ENTER);

		// Declarar los campos de la información de la Empresa
		WebElement nameRepLegal = driver
				.findElement(By.id("Información_consulta_buró_Nombre_del_representante_legal_solicitante"));
		WebElement apellUnoRepLeg = driver
				.findElement(By.id("Información_consulta_buró_Apellido_paterno_del_representante_legal_solicitante"));
		WebElement apellDosRepLeg = driver
				.findElement(By.id("Información_consulta_buró_Apellido_materno_del_representante_legal_solicitante"));
		WebElement rfcRepLeg = driver
				.findElement(By.id("Información_consulta_buró_RFC_del_representante_legal_solicitante"));
		WebElement telRepLeg = driver.findElement(By.id("Información_consulta_buró_Teléfono"));
		WebElement calle = driver.findElement(By.id("Información_consulta_buró_Calle"));
		WebElement numExt = driver.findElement(By.id("Información_consulta_buró_Número_exterior"));
		WebElement codigoPostal = driver.findElement(By.id("Información_consulta_buró_Código_postal"));

		// Check de Autorización
		WebElement autorizacion = driver.findElement(By.id("Información_consulta_buró_Autorizo"));

		// Se ingresa la información de la Empresa
		nameRepLegal.sendKeys("Nicodemo");
		apellUnoRepLeg.sendKeys("Garopólo");
		apellDosRepLeg.sendKeys("Mahomes");
		rfcRepLeg.sendKeys("5");
		telRepLeg.sendKeys("5556581111");
		calle.sendKeys("Silofonistas de México Antiguo");
		numExt.sendKeys("3201");
		codigoPostal.sendKeys("06800");

		autorizacion.click();

		// Declarar el botón para almacenar la información
		WebElement btnGuardaInf = driver.findElement(By.id("submit"));
		Thread.sleep(3000);

		btnGuardaInf.click();
		Thread.sleep(4500);

		// Eliminar el popup al guardar los datos
		WebElement btnContinuar = driver.findElement(By.xpath("//*[text() = 'Continuar']"));
		btnContinuar.click();
		Thread.sleep(2500);

		// Avanzar a la Consulta de Buró
		WebElement btnAvanzar = driver.findElement(By.id("eAuth"));
		btnAvanzar.click();

		// Cerrar la ventana del navegador para liberar la memoria
		// driver.close();

	}

}
