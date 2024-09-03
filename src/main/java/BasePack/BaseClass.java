package BasePack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class BaseClass {

	public static WebDriver driver;

	public static void LaunchBrowser() {

		driver = new ChromeDriver();

	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void implicityWait() throws InterruptedException {
		Thread.sleep(2000);
	}

	public static void Url(String Url) {
		driver.get(Url);
	}

	public static void scroll(WebElement Scroll) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Scroll);
	}

	public static void ScreenShort(WebDriver driver2, String string) throws IOException {

		TakesScreenshot screen = (TakesScreenshot) driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		File path = new File(
				"C:\\Users\\91812\\eclipse-workspace\\magento.softwaretestingboard\\src\\test\\java\\ScreenShort.folder"
						+ string + ".png");
		FileUtils.copyFile(src, path);

	}
}
