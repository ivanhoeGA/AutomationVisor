package campana353;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class uniclick_08 {

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
		
		// Se firma el documento "Contrato"
		driver.findElement(By
				.xpath("//*[text() = 'FIRMAR EXPEDIENTE']"))
				.click();
		driver.findElement(By.name("upl")).sendKeys("C:\\b2c64374-15e6-4aa7-af9b-b94c537a875c.pdf");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains( @value, 'Guardar')]")).click();
		Thread.sleep(4000);
		

///html/body/div[2]/ht-initialize-athena-store/ht-initialize-athena-store-widget/signing-orchestrator/div/div/div[2]/one-signing/div/pdf-preview/div/div[3]/div/div[2]/button/span

	}

}
