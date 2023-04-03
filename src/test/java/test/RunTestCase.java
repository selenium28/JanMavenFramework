package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import core.StepBase;
import pages.LoginPage;

public class RunTestCase extends StepBase{
	
	LoginPage objLoginPage;
	
	@BeforeTest
	public void start() {
		setup();
	}
	
	@Test
	public void login() {
		objLoginPage  = new LoginPage();
		objLoginPage.loginMethod();
	}
	
	@AfterTest
	public void stop() {
		teardown();
	}

}
