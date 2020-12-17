package pageCommons;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.service.DriverService;
import org.openqa.selenium.support.ui.Select;

public class Manager {

	public static WebDriver driver;

	public static void iniciaDriver() throws IOException {

		if (driver == null) {

			Object service = new ChromeDriverService.Builder()
					.usingDriverExecutable(new File("C:/chromedriver/chromedriver.exe")).usingAnyFreePort().build();
			((DriverService) service).start();
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--proxy-server='direct://'");
			chromeOptions.addArguments("--proxy-bypass-list=*");
			chromeOptions.addArguments("disable-infobars");
			chromeOptions.addArguments("--headless", "--window-size=1366,768");

			driver = new RemoteWebDriver(((DriverService) service).getUrl(), new ChromeOptions());
			driver.manage().deleteAllCookies();
			driver.get("https://ww2.soc.com.br/blog/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	}

	public void fechaDriver() {
		if (driver != null) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.close();
		}
	}

	public void escolheValorNoCombo(String elemento, String valor) {
		WebElement ele = driver.findElement(By.cssSelector(elemento));
		Select combo = new Select(ele);
		combo.selectByValue(valor);
	}

	public boolean validarMensagemDoAlerta(String msg) {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		String msgFap = driver.findElement(RepositoryTest.CSS_ALERTA_FAP).getText();
		if (msgFap.equals(msg)) {
			driver.findElement(RepositoryTest.CSS_FECHAR_ALERTA_FAP).click();
			return true;
		} else {
			return false;
		}
	}

	public boolean validarTextoEspecifico(String texto) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String textoElement = driver.findElement(RepositoryTest.CSS_ESTIMATIVA_FAP).getText();
		if (textoElement.equals(texto)) {
			return true;
		} else {
			return false;
		}
	}

	public void manipularScrollParaBaixo() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scrollBy(0,1250)", "");
	}

	// Métodos BuscarBlog

	public void preencherBusca() {
		driver.findElement(RepositoryTest.CSS__PESQUISA_BLOG).sendKeys(RepositoryTest.BUSCA_SINDROME);
	}

	public void clicarPesquisar() {
		driver.findElement(RepositoryTest.CSS_BTN_PESQUISAR).click();
	}

	public boolean validarResultado() {
		String retorno = driver.findElement(RepositoryTest.CSS_CAMPO_RESULTADO).getText();
		if (retorno.contains(RepositoryTest.BUSCA_SINDROME)) {
			return true;
		} else {
			return false;
		}

	}

}
