package PymeAccesoNuevo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CorreccionesBanco {

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
				
			//Generar correcciones en campos aleatorios
				driver.findElement(By.xpath("//*[@class= 'color-gris i-bordered i-circled divcenter fa fa-user fa-2x ']")).click();
				driver.findElement(By.xpath("//*[@class= 'i-rounded i-small icon-edit'][1]")).click();
				Thread.sleep(1200);
				driver.findElement(By.id("comentario")).sendKeys("Revisión de información TEST Automation");
				driver.findElement(By.xpath("//*[@value= 'Generar corrección']")).click();
				Thread.sleep(2500);
				
			//Enviar correcciones a la PYME
				driver.findElement(By.xpath("//*[@class = 'color-gris i-bordered i-circled divcenter fa fa-wrench fa-2x pasoPerfilActivo']")).click();
				driver.findElement(By.xpath("//*[contains(text(),'Enviar Correcciones')]")).click();
				Thread.sleep(1000);
				
			//Cerrar la confiración de mensaje y cerrar la ventana
				driver.findElement(By.xpath("//*[text() = 'OK']")).click();
				
				//Salir de la sesión de BANCO cerrando el navegador
				//driver.close();	
								
	}

}
