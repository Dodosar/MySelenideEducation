package org.selenide;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.codeborne.selenide.Browser;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;

import Utils.LoadCookieInfo;

public class CookieLogIn {
	WebDriver driver;
	
	@Test
	public void LogInByCookie() {
	Configuration.browserSize = "1920x1080";
	open("http://www.demo.guru99.com/V4");	
	driver =  WebDriverRunner.driver().getWebDriver();
	LoadCookieInfo.LoadCookie(driver);
	WebDriverRunner.setWebDriver(driver);
	open("http://www.demo.guru99.com/V4/manager/Managerhomepage.php");
	$(By.xpath("//*[@class='heading3']"))
	.shouldHave(text("Welcome To Manager's Page of Guru99 Bank"),text("Welcome To Manager's Page of Guru99 Bank"));
	}
}
