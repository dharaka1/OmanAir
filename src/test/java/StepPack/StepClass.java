package StepPack;

import java.awt.AWTException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import BasePack.BaseClass;
import PomPack.PomClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepClass extends BaseClass {
	PomClass ps = new PomClass();

	@Given("User launch {string}")
	public void user_launch(String Browser) {
		if (Browser.equalsIgnoreCase("Chrome")) {

			driver = new ChromeDriver();

		} else if (Browser.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();

		} else if (Browser.equalsIgnoreCase("Firefox")) {

			driver = new FirefoxDriver();

		} else {
			System.out.println("No browsers were found");
		}

		maximize();
	}

	@When("Launch The Url")
	public void launch_the_url() {
		Url("https://www.omanair.com/");
	}

	@When("Enter From Address")
	public void enter_from_address() throws AWTException, InterruptedException {
		ps.PopUp();
		ps.From();
		ps.EnterFrom();
		ps.ClickChennai();
	}

	@When("Enter To Address")
	public void enter_to_address() throws InterruptedException {

		ps.Toclick();
		ps.ToEnter();
		ps.EnterToDistination();
		ps.ClickMuscat();
	}

	@When("Choose the date")
	public void choose_the_date() throws AWTException, InterruptedException {
		ps.ClickDepatureDate();
		ps.DepatureDate();
	}

	@Then("choose no of passangers")
	public void choose_no_of_passangers() throws InterruptedException {
		ps.ClickOnPasangers();
		ps.ScrollClickOnPasangers();
		ps.NoOfpAdultasangers();
		ps.NoOfChildreanpasangers();
		driver.quit();
	}

}
