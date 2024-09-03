package BasePack;

import java.awt.AWTException;
import java.awt.Robot;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {


	public static WebDriver driver;

	public static void geturl(String url) {
		driver.get(url);
	}

	public static void toMaximize() {
		driver.manage().window().maximize();
	}

	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	public static void jsClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click() ;", element);
	}

	public static void jsScroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static void explicitWait(WebElement locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10000));
		wait.until(ExpectedConditions.elementToBeClickable(locator));

	}

	public static void ScreenShort(WebDriver driver2, String string) throws IOException {

		TakesScreenshot screen = (TakesScreenshot) driver2;
		File src = screen.getScreenshotAs(OutputType.FILE);
		File path = new File(
				"C:\\Users\\91812\\Downloads\\DominosPoc\\src\\test\\java\\Sceenshot.file\\" + string + ".png");
		FileUtils.copyFile(src, path);

	}

	public static void RobotClass() throws AWTException {
		Robot robot = new Robot();
	}

	public static void log(String text) {
		System.out.println(text);
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

	public static void quit() {
		driver.quit();
	}
}
