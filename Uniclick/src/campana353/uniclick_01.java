package campana353;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class uniclick_01 {

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
		
		//Completar los campos de la etapa "Consulta SAT"
		WebElement giroComercial = driver.findElement(By.xpath("//*[@class='select-list initial']"));
		WebElement opcion = driver.findElement(By.xpath("//*[text() = 'Otros servicios de información']"));
		WebElement passSAT = driver.findElement(By.id("Ciec"));
		giroComercial.click();
		opcion.click();
		passSAT.sendKeys("PruebasQA");
		Thread.sleep(3000);
		
		//Avanzar a la etapa "Inforación de la Empresa"
		driver.findElement(By.xpath("//*[text() = 'Validar ahora']")).click();
		
		
		//Cerrar la autorización para cerrar el modal
		WebElement continuar = driver.findElement(By.xpath("//*[text() = 'Continuar']"));
		continuar.click();
		Thread.sleep(3500);
		
		//Avanzar a información de la empresa. Cuando no se alcanza a habilitar el modal
		WebElement informacionEmpresa = driver.findElement(By.id("eAuth"));
		informacionEmpresa.click();
		
		//Cerrar la ventana del navegador para liberar la memoria
		//driver.close(); 
	}

}
