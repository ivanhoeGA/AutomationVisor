package PymeAccesoNuevo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RegistroElectronicoPyme5 {

	public static void main(String[] args) throws InterruptedException {
		// Declaración de navegador
		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opts);

		// Completar el formulario de Usuario y Contraseña
		driver.navigate().to("https://demobancomext.visor.io/login/bancomext");
		driver.manage().window().maximize();
		Thread.sleep(1500);

		// Ingresar credenciales para completar REGISTRO ELECTRÓNICO
		driver.findElement(By.id("emaIndex")).sendKeys("prueba.test003@yopmail.com");
		driver.findElement(By.id("pswIndex")).sendKeys("Mexico123*");
		driver.findElement(By.xpath("//*[text() = 'COMIENZA AHORA']")).click();
		Thread.sleep(2000);

		// Completar el REGISTRO ELECTRÓNICO - Apoderados
		driver.findElement(By.xpath("//*[text() = 'E) Apoderados']")).click();
		driver.findElement(By.id("Apoderados_1_Personalidad_jurídica")).sendKeys("F");
		driver.findElement(By.id("Apoderados_1_Personalidad_jurídica")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("Apoderados_1_Apellido_paterno")).sendKeys("Aguirre");
		driver.findElement(By.id("Apoderados_1_Apellido_materno")).sendKeys("Segoviano");
		driver.findElement(By.id("Apoderados_1_Nombre_s")).sendKeys("Mariano");
		driver.findElement(By.id("Apoderados_1_Relación_del_apoderado")).sendKeys("EJECUTIVO");
		driver.findElement(By.id("Apoderados_1_Relación_del_apoderado")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("Apoderados_1_Fecha_de_nacimiento")).sendKeys("12-03-1987");
		driver.findElement(By.id("Apoderados_1_Teléfono_con_clave_de_larga_distancia")).sendKeys("5588226446");
		driver.findElement(By.id("Apoderados_1_Teléfono_con_clave_de_larga_distancia_adicional")).sendKeys("4455668877");
		driver.findElement(By.id("Apoderados_1_RFC_con_homoclave")).sendKeys("MROP900922GF8");
		driver.findElement(By.id("Apoderados_1_Número_de_identificación_oficial_vigente")).sendKeys("123216560988490");
		driver.findElement(By.id("Apoderados_1_Tipo_de_identificación_oficial")).sendKeys("LICENCIA PARA CONDUCIR");
		driver.findElement(By.id("Apoderados_1_Tipo_de_identificación_oficial")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("Apoderados_1_Nacionalidad")).sendKeys("MEXICANA");
		driver.findElement(By.id("Apoderados_1_Nacionalidad")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("Apoderados_1_Calle")).sendKeys("Militares Armados");
		driver.findElement(By.id("Apoderados_1_Número_exterior")).sendKeys("2500");
		driver.findElement(By.id("Apoderados_1_Código_postal")).sendKeys("02300");
		Thread.sleep(1500);
		driver.findElement(By.id("Apoderados_1_Entidad_Federativa_Estado_o_Provincia")).sendKeys("CIUDAD DE MEXICO");
		driver.findElement(By.id("Apoderados_1_Entidad_Federativa_Estado_o_Provincia")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("Apoderados_1_País")).sendKeys("MEXICO");
		driver.findElement(By.id("Apoderados_1_País")).sendKeys(Keys.ENTER);
		//driver.findElement(By.id("")).sendKeys("");
		
		//Guardar el apartado de "Apoderados"
		driver.findElement(By.id("submit")).click();
	}

}
