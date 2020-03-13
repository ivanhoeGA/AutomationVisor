package validacionesMensajes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationMensagePyme1 {

	public static void main(String[] args) {
		// //Invocación del navegaddor para acceder al LoginPage de la PYME
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(450, TimeUnit.SECONDS);
		driver.navigate().to("http://bancomext.visor.io/login/bancomext");
		driver.manage().timeouts().implicitlyWait(360, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Se ingresa en el aplicativo para acceder a la Etapa1de la Pyme
		WebElement email = driver.findElement(By.id("emaIndex"));
		WebElement password = driver.findElement(By.id("pswIndex"));
		WebElement passButton = driver.findElement(By.xpath("//*[text() = 'COMIENZA AHORA']"));
			
		email.sendKeys("selenium.qa@yopmail.com");
		password.sendKeys("Mexico123*");
		passButton.click();
		driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
		driver.navigate().refresh();
		
		//Se valida el título de la interfaz para la Solicitud de la Pyme
		String baseUrl = "https://bancomext.visor.io/customer/pyme_xml/GGAI851013TR6/227/CIEC";
		String expectedTitle = "Solicitud";
		String actualTitle = "";
		driver.get(baseUrl);
		driver.navigate().refresh();
		
		actualTitle = driver.getTitle();
		driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
		
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Verificación realizada, el título corresponde a la etapa 'Identificate'");
		} else {
			System.out.println("El título no corresponde a la etapa de 'Identificate'");
		}
		
		//Se valida el modal de los campos obligatorios
		WebElement buttonSave = driver.findElement(By.id("submit"));
		buttonSave.click();
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		
		WebElement inputMandatory = driver.findElement(By.xpath("//*[@id='carga_resultado']"));

		if (inputMandatory.isDisplayed()) {
			System.out.println("Muestra correctamente los campos obligatorios faltantes");
		} 
		else {
			System.out.println("No muestra el mensaje de los campo obligatorios");
		}		
		
		
		

	}

}
