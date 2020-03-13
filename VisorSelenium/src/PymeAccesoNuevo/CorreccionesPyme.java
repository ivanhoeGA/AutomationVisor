package PymeAccesoNuevo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CorreccionesPyme {

	public static void main(String[] args) throws InterruptedException {
		// Declaraci�n de navegador
				ChromeOptions opts = new ChromeOptions();
				opts.addArguments("--disable-notifications");
				WebDriver driver = new ChromeDriver(opts);

				
		//Completar el formulario de Usuario y Contrase�a
				driver.navigate().to("https://demobancomext.visor.io/login/bancomext");
				driver.manage().window().maximize ();
				Thread.sleep(1500);
								
		//Ingresar credenciales para completar REGISTRO ELECTR�NICO
				driver.findElement(By.id("emaIndex")).sendKeys("prueba.test003@yopmail.com");
				driver.findElement(By.id("pswIndex")).sendKeys("Mexico123*");
				driver.findElement(By.xpath("//*[text() = 'COMIENZA AHORA']")).click();
				//driver.navigate().to("https://bancomext.visor.io/customer/pyme_xml/GGAI851013TR6/227/correcciones");
				Thread.sleep(2000);
				
		//Ingresar el nuevo dato para corregir dicho campo.
				driver.findElement(By.id("valor")).sendKeys("Galicia");
				
		//Enviar la correcci�n
				driver .findElement(By.id("boton_0")).click();
				
		//Cerrar el cuadro de navegaci�n
				driver.findElement(By.xpath("//*[text() = 'OK']")).click();
				
				//Salir de la sesi�n de BANCO cerrando el navegador
				//driver.close();
				

	}

}
