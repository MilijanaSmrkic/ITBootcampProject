package objects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

	public static final String HOMEPAGE_URL = "http://automationpractice.com/index.php";
	public static final String SUMMERDRESS_TITLE = "Summer Dresses - My Store";
	public static final String WOMEN_BTN_XPATH = "//a[@class='sf-with-ul'][contains(text(),'Women')]";
	public static final String SUMMER_DRESSES_XPATH_women = "//li[@class='sfHover']//a[contains(text(),'Summer Dresses')]";
	public static final String DRESSES_BTN_XPATH = "//body[@id='index']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a[1]";
	public static final String SUMMER_DRESSES_XPATH_dresses = "//li[@class='sfHover']//a[contains(text(),'Summer Dresses')]";

	// Method to open HomePage
	public static void openHomeP(WebDriver wd) {
		wd.get(HOMEPAGE_URL);

	}

	// Method to navigate HomePage if other page is opened
	public static void navigateToHomeP(WebDriver wd) {
		wd.navigate().to(HOMEPAGE_URL);

	}

	// Method to find WOMEN button
	public static WebElement getWomenBtn(WebDriver wd) {
		Actions ac = new Actions(wd);
		WebElement wb = wd.findElement(By.xpath(WOMEN_BTN_XPATH));
		ac.moveToElement(wb).build().perform();
		return wb;

	}

	// Method to find Summer Dresses button (when find Women button)
	public static WebElement getSummerDressesW(WebDriver wd) {
		WebElement driver = getWomenBtn(wd).findElement(By.xpath(SUMMER_DRESSES_XPATH_women));
		return driver;
	}

	// Method to click on Summer Dresses button (when find WOMAN button)
	public static void clickSummerDW(WebDriver wd) {
		getSummerDressesW(wd).click();

	}

	// Method to find DRESSES button
	public static WebElement getDressesBtn(WebDriver wd) {
		Actions ac = new Actions(wd);
		WebElement wb = wd.findElement(By.xpath(DRESSES_BTN_XPATH));
		ac.moveToElement(wb).build().perform();
		return wb;
	}

	// Method to find Summer Dresses button (when find DRESSES button)
	public static WebElement getSummerDressesD(WebDriver wd) {
		WebElement driver = getDressesBtn(wd).findElement(By.xpath(SUMMER_DRESSES_XPATH_dresses));
		return driver;
	}

	// Method to click Summer Dresses button (when find DRESSES button)
	public static void clickSummerDD(WebDriver wd) {
		getSummerDressesD(wd).click();

	}

}
