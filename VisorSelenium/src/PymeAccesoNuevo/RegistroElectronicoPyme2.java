package PymeAccesoNuevo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Keys;

public class RegistroElectronicoPyme2 {

	public static void main(String[] args) throws InterruptedException {
	// Declaración de navegador
		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opts);

		
	//Completar el formulario de Usuario y Contraseña
		driver.navigate().to("https://demobancomext.visor.io/login/bancomext");
		driver.manage().window().maximize ();
		Thread.sleep(1500);
		
	//Ingresar credenciales para completar REGISTRO ELECTRÓNICO
		driver.findElement(By.id("emaIndex")).sendKeys("prueba.test003@yopmail.com");
		driver.findElement(By.id("pswIndex")).sendKeys("Mexico123*");
		driver.findElement(By.xpath("//*[text() = 'COMIENZA AHORA']")).click();
		Thread.sleep(25000);
		
	//Ingresar para completar REGISTRO ELECTRÓNICO - Actividad
		driver.findElement(By.xpath("//*[text() = 'B) Actividad']")).click();
		driver.findElement(By.id("B_Actividad_Giro_Mercantil_Actividad_u_Objeto_Social_del_Cliente_Ocupación_Profesión_Actividad_o_Giro_del_negocio_al_que_se_dedica_el_Cliente")).sendKeys("Enlatados industriales");
		driver.findElement(By.id("B_Actividad_Descripción_de_la_actividad")).sendKeys("Procesos industriales");
		driver.findElement(By.id("B_Actividad_Ventas_anuales")).sendKeys("100000");
		driver.findElement(By.id("B_Actividad_Número_de_empleados_directos")).sendKeys("450");
		driver.findElement(By.id("select2-B_Actividad_Sector_de_la_clasificación_SCIAN-container")).click();
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys("Electricidad");
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//*[contains(@id, 'select2-B_Actividad_Sector_de_la_clasificación_SCIAN-result-90ut-21')]")).sendKeys(Keys.RETURN);
		Thread.sleep(1200);
		driver.findElement(By.id("select2-B_Actividad_Subsector_de_la_clasificación_SCIAN-container")).click();
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys("Generación, transmisión y suministro de energía eléctrica.");
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.id("select2-B_Actividad_Rama_de_la_clasificación_SCIAN-container")).click();
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys("Generación, transmisión y suministro de energía eléctrica .");
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.id("select2-B_Actividad_Subrama_de_la_clasificación_SCIAN-container")).click();
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys("Generación y transmisión de energía eléctrica.");
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.id("select2-B_Actividad_Clase_de_clasificaión_SCIAN-container")).click();
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys("Generación");
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		//Guardar el apartado de "Actividad"
		driver.findElement(By.id("submit")).click();
		
		//Se cierra el navegador
		//driver.close();

	} 

}
