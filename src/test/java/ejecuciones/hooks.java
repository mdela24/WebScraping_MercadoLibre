package ejecuciones;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {
	static WebDriver driver;
	
@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\ChromeDriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.mercadolibre.cl/");
	}
	
	static WebDriver getDriver() {
		return driver;
	}
	
	@After
	public void tearDown() {
//		driver.close();
	}

}
