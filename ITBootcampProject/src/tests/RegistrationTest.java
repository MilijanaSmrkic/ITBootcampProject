package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import objects.HomePage;
import objects.Registration;
import objects.SelectDress;

public class RegistrationTest {

	private static WebDriver wd;
	SoftAssert sa = new SoftAssert();

	@BeforeTest
	public static void createDriver() {
		System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
		wd = new ChromeDriver();
	}

	@AfterClass
	public static void closeDriver() {
		wd.close();
	}

	// Test to register customer
	@Test
	public void testRegistration() {
		HomePage.openHomeP(wd);
		wd.manage().window().maximize();
		HomePage.getWomenBtn(wd);
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		HomePage.clickSummerDW(wd);

		SelectDress.clickFirstDress(wd);
		SelectDress.clickFieldPlus(wd);
		SelectDress.selectSize(wd, "M");
		SelectDress.clickColor(wd);
		SelectDress.clickAddToCart(wd);
		SelectDress.clickOnProceed(wd);

		Registration.clickProceed2(wd);
		Registration.sendkeysEmail(wd, "liiaraperic@gmail.com");
		Registration.clickCreateAcc(wd);

		Registration.clickGender(wd);
		Registration.sendkeysFirstname1(wd, "sara");
		Registration.sendkeysLastname1(wd, "peric");
		Registration.sendkeysPassword(wd, "1234567");
		Registration.selectDay(wd, "5");
		Registration.selectMonth(wd, "1");
		Registration.selectYear(wd, 1990);
		Registration.sendkeysAddress(wd, "Ojkj street, 123, Boston");
		Registration.sendkeysCity(wd, "Boston");
		Registration.selectState(wd, "Massachusetts");
		Registration.sendkeysPostalCode(wd, "00000");
		Registration.selectCountry(wd, "United States");
		Registration.sendkeysMobile(wd, "12345678");
		Registration.sendkeysAlias(wd, "Boston");
		Registration.clickRegister(wd);

		wd.findElement(By.linkText("Sign out")).click();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String actual = wd.findElement(By.xpath(Registration.HOMEP_SIGNIN_XPATH)).getText();
		Assert.assertEquals(actual, "Sign in");
	}

	// Test to log in customer
	@Test
	public static void testLogIn() {
		wd.navigate().to(HomePage.HOMEPAGE_URL);
		wd.manage().window().maximize();
		wd.findElement(By.xpath(Registration.HOMEP_SIGNIN_XPATH)).click();

		Registration.sendkeysEmailLogin(wd, "baraperic@gmail.com");
		Registration.sendkeysPasswordLogin(wd, "12345678");
		Registration.clickSignIn(wd);

	}

}
