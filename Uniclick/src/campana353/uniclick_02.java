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

		// Declarar los campos Cr�dito deseado
		WebElement productoInt = driver.findElement(By.id("Informaci�n_consulta_bur�_Producto_de_inter�s"));
		WebElement montoSolic = driver.findElement(By.id("Informaci�n_consulta_bur�_Monto_a_solicitar"));
		WebElement plazo = driver.findElement(By.id("Informaci�n_consulta_bur�_Plazo_meses"));
		// Ingresar la informaci�n en los campos correspondiente -Cr�dito
		// deseado-
		productoInt.click();
		productoInt.sendKeys("Cr�dito");
		montoSolic.sendKeys("500000");
		plazo.click();
		plazo.sendKeys("9");
		plazo.sendKeys(Keys.ENTER);

		// Declarar los campos de la informaci�n de la Empresa
		WebElement nameRepLegal = driver
				.findElement(By.id("Informaci�n_consulta_bur�_Nombre_del_representante_legal_solicitante"));
		WebElement apellUnoRepLeg = driver
				.findElement(By.id("Informaci�n_consulta_bur�_Apellido_paterno_del_representante_legal_solicitante"));
		WebElement apellDosRepLeg = driver
				.findElement(By.id("Informaci�n_consulta_bur�_Apellido_materno_del_representante_legal_solicitante"));
		WebElement rfcRepLeg = driver
				.findElement(By.id("Informaci�n_consulta_bur�_RFC_del_representante_legal_solicitante"));
		WebElement telRepLeg = driver.findElement(By.id("Informaci�n_consulta_bur�_Tel�fono"));
		WebElement calle = driver.findElement(By.id("Informaci�n_consulta_bur�_Calle"));
		WebElement numExt = driver.findElement(By.id("Informaci�n_consulta_bur�_N�mero_exterior"));
		WebElement codigoPostal = driver.findElement(By.id("Informaci�n_consulta_bur�_C�digo_postal"));

		// Check de Autorizaci�n
		WebElement autorizacion = driver.findElement(By.id("Informaci�n_consulta_bur�_Autorizo"));

		// Se ingresa la informaci�n de la Empresa
		nameRepLegal.sendKeys("Nicodemo");
		apellUnoRepLeg.sendKeys("Garop�lo");
		apellDosRepLeg.sendKeys("Mahomes");
		rfcRepLeg.sendKeys("5");
		telRepLeg.sendKeys("5556581111");
		calle.sendKeys("Silofonistas de M�xico Antiguo");
		numExt.sendKeys("3201");
		codigoPostal.sendKeys("06800");

		autorizacion.click();

		// Declarar el bot�n para almacenar la informaci�n
		WebElement btnGuardaInf = driver.findElement(By.id("submit"));
		Thread.sleep(3000);

		btnGuardaInf.click();
		Thread.sleep(4500);

		// Eliminar el popup al guardar los datos
		WebElement btnContinuar = driver.findElement(By.xpath("//*[text() = 'Continuar']"));
		btnContinuar.click();
		Thread.sleep(2500);

		// Avanzar a la Consulta de Bur�
		WebElement btnAvanzar = driver.findElement(By.id("eAuth"));
		btnAvanzar.click();

		// Cerrar la ventana del navegador para liberar la memoria
		// driver.close();

	}

}
