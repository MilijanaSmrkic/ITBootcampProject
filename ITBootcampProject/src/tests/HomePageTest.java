package tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import objects.HomePage;

public class HomePageTest {

	public static WebDriver wd;
	public static String current1;
	public static String current2;

	@BeforeClass
	public static void createDriver() {
		System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
		wd = new ChromeDriver();

	}

	// Test if the mouse on the homepage of the site stay on the WOMEN button and
	// then selects SummerDresses go to the correct page.
	@Test
	public void testCorrectPage1() {
		HomePage.openHomeP(wd);
		wd.manage().window().maximize();
		HomePage.getWomenBtn(wd);
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		HomePage.clickSummerDW(wd);

		current1 = wd.getTitle();
		String expected = HomePage.SUMMERDRESS_TITLE;
		Assert.assertEquals(current1, expected);

	}

	// Test if the mouse on the homepage of the site stay on the DRESSES button and
	// then selects SummerDresses to go to the correct page.
	@Test
	public static void testCorrectPage2() {
		HomePage.openHomeP(wd);
		wd.manage().window().maximize();
		HomePage.getDressesBtn(wd);
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		HomePage.clickSummerDD(wd);

		current2 = wd.getTitle();
		String expected = HomePage.SUMMERDRESS_TITLE;
		Assert.assertEquals(current2, expected);

	}

	// Test to check if two these point go to on the same page
	@Test
	public static void testCheckTwoPoint() {
		Assert.assertEquals(current1, current2);

	}

	@AfterClass
	public static void closeDriver() {
		wd.close();
	}

}
