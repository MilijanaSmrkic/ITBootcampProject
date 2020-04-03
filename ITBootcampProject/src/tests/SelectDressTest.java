package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import objects.HomePage;
import objects.SelectDress;

public class SelectDressTest {

	private static WebDriver wd;
	SoftAssert sa = new SoftAssert();

	@BeforeClass
	public static void createDriver() {
		System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
		wd = new ChromeDriver();
	}

	// Check to see if there are actually two dresses in the basket called Printed
	// Summer Dress in blue, M size.

	@Test
	public void test() {
		HomePage.openHomeP(wd);
		wd.manage().window().maximize();
		HomePage.getWomenBtn(wd);
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		HomePage.clickSummerDW(wd);

		SelectDress.clickFirstDress(wd);
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		SelectDress.clickFieldPlus(wd);
		SelectDress.selectSize(wd, "M");
		SelectDress.clickColor(wd);
		SelectDress.clickAddToCart(wd);
		SelectDress.clickOnProceed(wd);

		String name = wd.findElement(By.linkText(SelectDress.NAME_OF_DRESS_Link)).getText();
		sa.assertEquals(name, "Printed Summer Dress");
		String colorSize = wd.findElement(By.linkText(SelectDress.COLOR_AND_SIZE_Link)).getText();
		sa.assertEquals(colorSize, "Color : Blue, Size : M");
		String number = wd.findElement(By.xpath(SelectDress.NUMBER_XPATH)).getText();
		sa.assertEquals(number, "2 Products");
		sa.assertAll();
	}

	@AfterClass
	public static void closeDriver() {
		wd.close();
	}

}
