package PymeAccesoNuevo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Validacion {

	public static void main(String[] args) throws InterruptedException {

		// Abrir el browser y navegar a la url
		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opts);
		driver.navigate().to("https://demobancomext.visor.io/admin/autentifica_admin_pruebas.php?email=banco.atm.bmxt@yopmail.com&pass=Mexico123*&type=2&idc=194");
		driver.manage().window().maximize ();
		
		//Abrir el apartado de notificaciones para el BANCO
			driver.navigate().to("https://demobancomext.visor.io/admin/notificaciones");
			
		//Buscar el RFC de la PYME para ingresar en su perfil
			driver.findElement(By.id("term")).sendKeys("TGO080429880");
			driver.findElement(By.xpath("//*[contains(@class, 'btn btn-success')]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[contains(@class, 'btn btn-default')][1]")).click();
			
		//Ingresar al administrador de proceso
			driver.findElement(By.xpath("//*[text() = 'Administrador de Proceso']")).click();
			
		//Modificar la etapa en la que se encuentra
			driver.findElement(By.xpath("//*[contains(@class, 'sm-form-control')]")).sendKeys("Validación");;
			
		//Autorizar el cambio de etapa
			driver.findElement(By.id("btnCambioStatus")).click();
			
		//Salir de la sesión de BANCO cerrando el navegador
			//driver.close();

	}

}
