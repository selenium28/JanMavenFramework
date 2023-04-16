package report;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pages.LoginPage;

public class ExtentReport {
	WebDriver driver;
	ExtentHtmlReporter htmlReport;
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	public void start() {
		htmlReport = new ExtentHtmlReporter(System.getProperty("user.dir")+"/HTMLReport/ExtentReport.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlReport);
	}
	
	@Test
	public void login() {
		test = reports.createTest("Test Started");
		test.log(Status.INFO, "New Test Started");
		
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		test.log(Status.INFO, "Test End");
		
	}
	
	@AfterTest
	public void stop() {
		reports.flush();
		driver.close();
	}
	
}
