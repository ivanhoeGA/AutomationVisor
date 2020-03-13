package campana353;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class uniclick_03 {

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
		
		//Se declara la autorización para los términos y condiciones
		WebElement acepto = driver.findElement(By.id("checTyCBuro"));
		
		//Se marca el recuadro para aceptar terminos y condiciones
		acepto.click();
		
		//Se marca la entidad jurídica
		WebElement pfae = driver.findElement(By.xpath("//*[@for='radio-check']"));
		
		//Se marca la entidad jurídica
		pfae.click();
		
		//Se declara el botón Firmar
		WebElement firmar = driver.findElement(By.id("firmaBuro"));
		
		//Se realiza el proceso de firma
		firmar.click();
		Thread.sleep(3000);
		
		//Se completa el proceso de la firma
		WebElement btnOk	= driver.findElement(By.xpath("//*[contains(@class,'btn btn-primary')][text() = 'OK']"));
		
		btnOk.click();
		Thread.sleep(6500);
		
		//Continuación de proceso de Firma
		WebElement pasoUno = driver.findElement(By.xpath("//*[contains(@class,'btn btn-success center theme-btn-visor')][text() = 'Continuar']"));
		pasoUno.click();
		
		
		//   banco@visoradl.com    visoradl		https://uniclick.visor.io/admin/autentifica_admin_pruebas.php?email=banco@visoradl.com&pass=visoradl&type=1&idc=353
		// https://uniclick.visor.io/admin/autentifica_admin_pruebas.php?email=admin@visor.io&pass=hola&type=1
		
				
		

	}

}
