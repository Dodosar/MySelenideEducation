package org.selenide;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import org.junit.Rule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Driver;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.junit.ScreenShooter;

import Utils.StoreCookieInfo;


public class GoogleTest {
	
	WebDriver driver;
	/*@Rule
	public ScreenShooter takeScreenshotSelenide = ScreenShooter.failedTests();*/

	/*@BeforeSuite
	public void setBrowser() {
		Configuration.browser = "chrome";
		Configuration.browserSize = "1920x1080";
		Configuration.holdBrowserOpen = true;
		System.setProperty("webdriver.chrome.driver", "D:\\browsersDrivers\\chromedriver.exe");
	}

	@AfterSuite
	public void TearDown() {
		closeWindow();
		closeWebDriver();

	}*/

	@Test
	public void userCanSearchKeywordWithDemoGuru99() {
		Configuration.remote = "http://localhost:4444/wd/hub";
		Configuration.headless = true;
		Configuration.browserSize = "1920x1080";
		open("http://www.demo.guru99.com/V4");		
		$(By.name("uid")).setValue("mngr271609");
		$(By.name("password")).setValue("YzunEzA");
		$(By.xpath("//*[@type='submit']")).click();
		//Configuration.browser = Driver.class.getName();

		/*driver =  WebDriverRunner.driver().getWebDriver();
		StoreCookieInfo.StoreCookie(driver); */
		$(By.xpath("//*[@class='heading3']"))
		.shouldHave(text("Welcome To Manager's Page of Guru99 Bank"),text("Welcome To Manager's Page of Guru99 Bank"));
		SelenideElement a = $(By.xpath("//*[@class='heading3']"));
				a.should(exist);
		
	}
	@Parameters({})
	@Test
	public void CreateNewCustomer() {
		
	}
}
