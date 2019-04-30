package testDD;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumOne {

	public static WebDriver driver;

	@Parameters({ "url", "browser" })
	@BeforeMethod
	public void initial(String web, String bb) {

		if (bb.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\palsa\\Desktop\\imp\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (bb.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\palsa\\Desktop\\imp\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (bb.equals("safari")) {
			System.setProperty("webdriver.safari.driver", "C:\\Users\\palsa\\Desktop\\imp\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.get(web);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(dataProvider = "infodata")
	public void info(String a, String b) {

		driver.findElement(By.partialLinkText("Log In")).click();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(a);
		driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys(b);
		String z = driver.findElement(By.xpath("//*[@id=\"ups-main\"]/div/div/form/p[2]")).getText();
		Assert.assertEquals(z, "okooooo");

	}

	@AfterMethod
	public void close() throws Exception {
		
		Thread.sleep(1000l);
	}

	@DataProvider
	public Object[][] infodata() {
		Object[][] dada = { { "aaa", "1111" }, { "bbb", "2222" } };
		return dada;
	}

	@Test
	public void photoforme(String dd) throws IOException {
		driver.findElement(By.xpath("//*[@id=\"submitBtn\"]")).click();
		File ff = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ff, new File("C:\\Users\\palsa\\Desktop\\screen\\" + dd + "Screenshot.png"));

	}

}
