package campa�a194;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Bmxt_01 {
	public static void main(String[] args) throws InterruptedException {

		// Abrir el browser y navegar a la url
				ChromeOptions opts = new ChromeOptions();
				opts.addArguments("--disable-notifications");
				WebDriver driver = new ChromeDriver(opts);
				driver.navigate().to("https://demobancomext.visor.io/admin/autentifica_admin_pruebas.php?email=comprador.atm.bmxt@yopmail.com&pass=Mexico123*&type=1");
				driver.manage().window().maximize ();
				
		//Acceder al apartado de Pagina de inicio
				driver.navigate().to("https://demobancomext.visor.io/admin/view_multinacional");
				
		//Seleccionar la opci�n de Proveedores
				driver.findElement(By.xpath("//*[@class='content-botones']/*[2]")).click();
				
		//Seleccionar la opci�n Proveedor Individual
				driver.findElement(By.xpath("//button[contains(@class, 'btn btn-primary form-control')]")).click();
				Thread.sleep(2000);
				
		//Llenar el formulario del proveedor
				driver.findElement(By.id("inputNombre")).sendKeys("Sams Club");
				
				driver.findElement(By.id("rfc_pyme")).sendKeys("NWM9709244W4");
				
				driver.findElement(By.id("email_pyme")).sendKeys("sam194qa@yopmail.com");
				Thread.sleep(2000);
				
		//Enviar la solicitud de nuevo proveedor
				driver.findElement(By.xpath("//button[contains(@class, 'btn btn-success addPymeStatus')]")).click();
				
		//Salir de la sesi�n de BANCO cerrando el navegador
				driver.close();  		
		

	}

}
