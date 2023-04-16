package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import core.StepBase;
import pages.DashBoardPage;
import pages.LoginPage;

public class RunTestCase extends StepBase{
	
	LoginPage objLoginPage;
	DashBoardPage objDashBoardPage;
	
	ExtentHtmlReporter htmlReport;
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	public void start() {
		setup();
		
		htmlReport = new ExtentHtmlReporter(System.getProperty("user.dir")+"/HTMLReport/ExtentReport2.html");
		reports = new ExtentReports();
		reports.attachReporter(htmlReport);
		
		htmlReport.config().setChartVisibilityOnOpen(true);
		htmlReport.config().setTheme(Theme.DARK);
		htmlReport.config().setReportName("Maven Framework");
		htmlReport.config().setDocumentTitle("OrangeHRM Automation Report");
		
	}
	
	@Test (priority = 1)
	public void login() {
		test = reports.createTest("Test Started");
		test.log(Status.INFO, "First Test Started");
		objLoginPage  = new LoginPage();
		objLoginPage.loginMethod();
		
		Assert.assertEquals("", "","message");
		
		test.log(Status.INFO, "Test End");
	}
	
	@Test (priority = 2)
	public void dashbord() {
		test.log(Status.INFO, "Second Test Started");
		
		objDashBoardPage  = new DashBoardPage();
		objDashBoardPage.clickOnPIMButton();
		
		Assert.assertEquals("", "","message");
		
		test.log(Status.INFO, "Test End");
	}
	
	
	@AfterTest
	public void stop() {
		teardown();
		reports.flush();
	}

}
