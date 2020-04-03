package objects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDress {

	public static final String FIRST_DRESS_XPATH = "//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line']//a[@class='product-name'][contains(text(),'Printed Summer Dress')]";
	public static final String QUANTITY_XPATH = "//input[@id='quantity_wanted']";
	public static final String MINUS_XPATH = "//a[@class='btn btn-default button-minus product_quantity_down']//span";
	public static final String PLUS_XPATH = "//a[@class='btn btn-default button-plus product_quantity_up']//span";
	public static final String SIZE_XPATH = "//select[@id='group_1']";
	public static final String COLOR_BLUE_XPATH = "//a[@id='color_14']";
	public static final String ADD_TO_CART_XPATH = "//span[contains(text(),'Add to cart')]";
	public static final String PROCEED_XPATH = "//span[contains(text(),'Proceed to checkout')]";

	public static final String NAME_OF_DRESS_Link = "Printed Summer Dress";
	public static final String COLOR_AND_SIZE_Link = "Color : Blue, Size : M";
	public static final String NUMBER_XPATH = "//span[@id='summary_products_quantity']";

	// Method to click on first dress
	public static void clickFirstDress(WebDriver wd) {
		wd.findElement(By.xpath(FIRST_DRESS_XPATH)).click();

	}

	// Method to set Quantity field
	public static void sendKeysQuantityField(WebDriver wd, String n) {
		wd.findElement(By.xpath(QUANTITY_XPATH)).click();
		wd.findElement(By.xpath(QUANTITY_XPATH)).clear();
		wd.findElement(By.xpath(QUANTITY_XPATH)).sendKeys(n);

	}

	// Method to set Quantity field- minus
	public static void clickFieldMinus(WebDriver wd) {
		wd.findElement(By.xpath(MINUS_XPATH)).click();

	}

	// Method to set Quantity field- plus
	public static void clickFieldPlus(WebDriver wd) {
		wd.findElement(By.xpath(PLUS_XPATH)).click();

	}

	// Method to select size
	public static void selectSize(WebDriver wd, String s) {
		Select size = new Select(wd.findElement(By.xpath(SIZE_XPATH)));
		size.selectByVisibleText(s);

	}

	// Method to click color
	public static void clickColor(WebDriver wd) {
		wd.findElement(By.xpath(COLOR_BLUE_XPATH)).click();
	}

	// Method to add to cart
	public static void clickAddToCart(WebDriver wd) {
		wd.findElement(By.xpath(ADD_TO_CART_XPATH)).click();
	}

	// Method to click on proceed to check out
	public static void clickOnProceed(WebDriver wd) {
		wd.findElement(By.xpath(PROCEED_XPATH)).click();
	}

}
