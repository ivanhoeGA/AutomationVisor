package campana353;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class uniclick_07 {

	public static void main(String[] args) throws InterruptedException {
		// Abrir el browser y navegar a la url
		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opts);
		driver.navigate().to(
				"https://uniclick.visor.io/admin/autentifica_admin_pruebas.php?email=banco@visoradl.com&pass=visoradl&type=1&idc=353");
		driver.manage().window().maximize();

		// Abrir el apartado de notificaciones para el BANCO
		driver.navigate().to("https://uniclick.visor.io/admin/notificaciones");

		// Realizar una búsqueda por campaña
		driver.findElement(By.id("param")).click();
		driver.findElement(By.id("param")).sendKeys("ID campaña");
		driver.findElement(By.id("param")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("term")).sendKeys("353");
		driver.findElement(By.xpath("//*[contains(@class, 'btn btn-success')]")).click();
		Thread.sleep(2500);

		// Buscar el RFC de la PYME para ingresar en su perfil
		driver.findElement(By.id("term")).sendKeys("LPD081210FI2");
		driver.findElement(By.xpath("//*[contains(@class, 'btn btn-success')]")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//*[contains(@class, 'btn btn-default')][1]")).click();

		// Se declaran los campos en los cuales se ingresa la información del
		// crédito otorgado
		WebElement montoOtorgado = driver.findElement(By.id("Formalización_Monto_de_crédito_otorgado"));
		WebElement tasaInt = driver.findElement(By.id("Formalización_Tasa_de_interés"));
		WebElement plazo = driver.findElement(By.id("Formalización_Plazo_de_la_línea_meses"));
		WebElement plazoMax = driver.findElement(By.id("Formalización_Plazo_máximo_de_disposición_días"));
		WebElement fechaLim = driver.findElement(By.id("Formalización_Fecha_de_firma_de_contrato"));
		WebElement fechaVenc = driver.findElement(By.id("Formalización_Fecha_de_vencimiento_de_crédito"));

		// Se ingresa información en los campos referentes a la información del
		// crédito otorgado
		montoOtorgado.sendKeys("$150,000.00");
		tasaInt.sendKeys("3");
		plazo.sendKeys("18");
		plazoMax.sendKeys("30");
		fechaLim.sendKeys("05-12-2020");
		fechaVenc.sendKeys("01-12-2022");

		// Almacenar información referente al crédito otorgado
		WebElement formalizacionFinish = driver.findElement(By.id("submit"));
		formalizacionFinish.click();

		// Cerrar la ventana del navegador para liberar la memoria
		driver.close();

	}

}
