package campana353;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class uniclick_06 {

	public static void main(String[] args) throws InterruptedException {
		// Abrir el browser y navegar a la url
		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opts);
		driver.navigate().to("https://uniclick.visor.io/admin/autentifica_admin_pruebas.php?email=banco@visoradl.com&pass=visoradl&type=1&idc=353");
		driver.manage().window().maximize ();
		
	//Abrir el apartado de notificaciones para el BANCO
		driver.navigate().to("https://uniclick.visor.io/admin/notificaciones");
		
	//Realizar una búsqueda por campaña
		driver.findElement(By.id("param")).click();
		driver.findElement(By.id("param")).sendKeys("ID campaña");
		driver.findElement(By.id("param")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("term")).sendKeys("353");
		driver.findElement(By.xpath("//*[contains(@class, 'btn btn-success')]")).click();
		Thread.sleep(2500);
		
	//Buscar el RFC de la PYME para ingresar en su perfil
		driver.findElement(By.id("term")).sendKeys("LPD081210FI2");
		driver.findElement(By.xpath("//*[contains(@class, 'btn btn-success')]")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//*[contains(@class, 'btn btn-default')][1]")).click();
		
		//Ingresar al administrador de proceso
		driver.findElement(By.xpath("//*[text() = 'Administrador de Proceso']")).click();
		
	//Modificar la etapa en la que se encuentra
		driver.findElement(By.xpath("//*[contains(@class, 'sm-form-control')]")).sendKeys("Firma");;
		
	//Autorizar el cambio de etapa
		driver.findElement(By.id("btnCambioStatus")).click();

	}

}
