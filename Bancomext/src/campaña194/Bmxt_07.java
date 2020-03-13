package campa�a194;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Keys;

public class Bmxt_07 {

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
		driver.findElement(By.id("emaIndex")).sendKeys("sam194qa@yopmail.com");
		driver.findElement(By.id("pswIndex")).sendKeys("Mexico123*");
		driver.findElement(By.xpath("//*[text() = 'COMIENZA AHORA']")).click();
		Thread.sleep(25000);
		
	//Ingresar para completar REGISTRO ELECTR�NICO - Actividad
		driver.findElement(By.xpath("//*[text() = 'B) Actividad']")).click();
		driver.findElement(By.id("B_Actividad_Giro_Mercantil_Actividad_u_Objeto_Social_del_Cliente_Ocupaci�n_Profesi�n_Actividad_o_Giro_del_negocio_al_que_se_dedica_el_Cliente")).sendKeys("Enlatados industriales");
		driver.findElement(By.id("B_Actividad_Descripci�n_de_la_actividad")).sendKeys("Procesos industriales");
		driver.findElement(By.id("B_Actividad_Ventas_anuales")).sendKeys("100000");
		driver.findElement(By.id("B_Actividad_N�mero_de_empleados_directos")).sendKeys("450");
		driver.findElement(By.id("select2-B_Actividad_Sector_de_la_clasificaci�n_SCIAN-container")).click();
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys("Electricidad");
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//*[contains(@id, 'select2-B_Actividad_Sector_de_la_clasificaci�n_SCIAN-result-90ut-21')]")).sendKeys(Keys.RETURN);
		Thread.sleep(1200);
		driver.findElement(By.id("select2-B_Actividad_Subsector_de_la_clasificaci�n_SCIAN-container")).click();
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys("Generaci�n, transmisi�n y suministro de energ�a el�ctrica.");
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.id("select2-B_Actividad_Rama_de_la_clasificaci�n_SCIAN-container")).click();
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys("Generaci�n, transmisi�n y suministro de energ�a el�ctrica .");
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.id("select2-B_Actividad_Subrama_de_la_clasificaci�n_SCIAN-container")).click();
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys("Generaci�n y transmisi�n de energ�a el�ctrica.");
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.id("select2-B_Actividad_Clase_de_clasificai�n_SCIAN-container")).click();
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys("Generaci�n");
		driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		//Guardar el apartado de "Actividad"
		driver.findElement(By.id("submit")).click();
		
		//Se cierra el navegador
		driver.close();

	} 

}
