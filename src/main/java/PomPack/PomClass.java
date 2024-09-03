package PomPack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BasePack.BaseClass;

public class PomClass extends BaseClass {

	public static By PopUp = By.xpath("//button[text()='Accept All']");

	public void PopUp() {

		driver.findElement(PopUp).click();
	}

	public static By ClickFrom = By.xpath("//div[@class=\"selected-option-airport\"]");

	public void From() {

		driver.findElement(ClickFrom).click();
	}

	public static By EnterFrom = By.xpath("	//input[@placeholder=\"Coimbatore (CJB)\"]");

	public void EnterFrom() throws AWTException, InterruptedException {

		implicityWait();
		driver.findElement(EnterFrom).sendKeys("Chennai");
	}

	public static By ClickChennai = By.xpath("//div[text()='Chennai International Airport']");

	public void ClickChennai() {
		driver.findElement(ClickChennai).click();
	}

	public static By Toclick = By.xpath("//label[text()='Destination']");

	public void Toclick() {

		driver.findElement(Toclick).click();
	}

	public static By ToEnter = By.xpath("//div[text()='Where to?']");

	public void ToEnter() {

		driver.findElement(ToEnter).click();

	}

	public static By EnterToDistination = By.xpath("//input[@placeholder=\"Where to?\"]");

	public void EnterToDistination() {

		driver.findElement(EnterToDistination).sendKeys("Muscat");

	}

	public static By ClickMuscat = By.xpath("//div[text()='Muscat, Oman']");

	public void ClickMuscat() throws InterruptedException {
		implicityWait();
		driver.findElement(ClickMuscat).click();

	}

	public static By ClickDepatureDate = By.xpath("//input[@value=\"Departure – Return\"]");

	public static By DepatureDate = By.xpath("(//div[@class=\"DayPicker-Day DayPicker-Day--mondays\"])");

	public void ClickDepatureDate() {

		driver.findElement(ClickDepatureDate).click();

	}

	public void DepatureDate() throws AWTException, InterruptedException {
		implicityWait();
		Robot robot = new Robot();
		driver.findElement(DepatureDate).click();

		robot.keyPress(KeyEvent.VK_ENTER);

	}

	public static By ClickOnPasangers = By.xpath("//input[@name=\"passengers\"]");

	public void ClickOnPasangers() {

		driver.findElement(ClickOnPasangers).click();
	}

	public static By NoOfpAdultasangers = By.xpath("(//button[@class=\"btn btn-count\"])[2]");

	public void NoOfpAdultasangers() {

		for (int a = 0; a <= 6; a++) {

			driver.findElement(NoOfpAdultasangers).click();
		}
	}

	public void ScrollClickOnPasangers() throws InterruptedException {
		implicityWait();
		WebElement ScrollClickOnPasangers = driver.findElement(By.xpath("//h4[text()='Passengers']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ScrollClickOnPasangers);
	}

	public static By NoOfChildreanpasangers = By.xpath("(//button[@class=\"btn btn-count\"])[4]//img[@alt=\"plus\"]");

	public void NoOfChildreanpasangers() {

		for (int a = 0; a <= 2; a++) {

			driver.findElement(NoOfChildreanpasangers).click();
		}
	}

}
