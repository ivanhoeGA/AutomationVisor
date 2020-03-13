package validacionesMensajes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationMensagePyme3 {

	public static void main(String[] args) throws InterruptedException 
	{
		// Se instancia el navegador para acceder al sitio de Bancomext
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://bancomext.visor.io/login/bancomext");
		driver.manage().window().maximize();
		
		//Se inicia la sesión para acceder a la etapa correspondiente
		WebElement email = driver.findElement(By.id("emaIndex"));
		WebElement password = driver.findElement(By.id("pswIndex"));
		WebElement passButton = driver.findElement(By.xpath("//*[text() = 'COMIENZA AHORA']"));

		email.sendKeys("selenium.qa@yopmail.com");
		password.sendKeys("Mexico123*");
		passButton.click();
		
		//Se declaran los campos obligatorios
//		WebElement aPaterno = driver.findElement(By.id("Datos_generales_del_proveedor_Apellido_paterno"));
//		WebElement aMaterno = driver.findElement(By.id("Datos_generales_del_proveedor_Apellido_materno"));
//		WebElement nombre = driver.findElement(By.id("Datos_generales_del_proveedor_Nombre_s"));
//		WebElement rfcHomoclave = driver.findElement(By.id("Datos_generales_del_proveedor_RFC_con_homoclave"));
//		WebElement cURP = driver.findElement(By.id("Datos_generales_del_proveedor_CURP"));
		
		//Se genera el modal que indica los campos obligatorios
		WebElement buttonSave = driver.findElement(By.id("submit"));
		buttonSave.click();
		
		//Se valida que se presente el modal que informa los campos faltantes
		
		WebElement modalMandatory = driver.findElement(By.xpath("//*[contains (text(), 'Faltan')]"));
		
		if (modalMandatory.isDisplayed()){
			System.out.println("Se muestra el listado de los campos faltantes");
		}
		else {
			System.out.println("No esta mostrandose el mensaje al usuario");
		}
		
		

	}

}
