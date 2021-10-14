package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.*;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Base {

	
	public static Logger log=LogManager.getLogger(Base.class.getName());
	public static WebDriver driver;
	public static Properties prop;

	public static WebDriver initializeDriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//java//resources//data.properties");

		prop.load(fis);
		// String browserName = System.getProperty("browser");
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		log.info(browserName);

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//drivers//chromedriver.exe");
			driver = new ChromeDriver();
			// execute in chrome driver

		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "//drivers//geckodriver.exe");
			driver = new FirefoxDriver();
			// firefox code
		} else if (browserName.equals("IE")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//drivers//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
//	IE code
		}
		return driver;

	}

	public void getScreenShot(String result) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C://test//" + result + "screenshot.png"));

	}

	public void getDynamicWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) element));

	}

	public void getAlert() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	public void click(By element) {
		driver.findElement(element).click();
		log.info("Clicked on "+element);
	}

	public void globalClick(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) element));
		element.click();
	}

}
