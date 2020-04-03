package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	// Registration fields- preceed to check out
	public static final String registration_URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
	public static final String PROCEED_TO_CHECKOUT_BTN_XPATH = "//span[contains(text(),'Proceed to checkout')]";
	public static final String PROCEED_BTN2_XPATH = "//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]";
	public static final String EMAIL1 = "//input[@id='email_create']";
	public static final String CREATEACC_BTN_XPATH = "//form[@id='create-account_form']//span[1]";
	// Registration fields
	public static final String MR_XPATH = "//input[@id='id_gender1']";
	public static final String MRS_XPATH = "//input[@id='id_gender2']";
	public static final String FIRSTNAME1_ID = "customer_firstname";
	public static final String LASTNAME1_NAME = "customer_lastname";
	public static final String PASSWORD_ID = "passwd";
	public static final String DATE_OF_BIRTH_DAYS_ID = "days";
	public static final String DATE_OF_BIRTH_MONTH_ID = "months";
	public static final String DATE_OF_BIRTH_YEARS_ID = "years";
	public static final String ADDRESS1_ID = "address1";
	public static final String CITY_ID = "city";
	public static final String STATE_ID = "id_state";
	public static final String POSTAL_CODE_ID = "postcode";
	public static final String COUNTRY_ID = "id_country";
	public static final String MOBILE_PHONE_ID = "phone_mobile";
	public static final String ALIAS_ID = "alias";
	public static final String REGISTER_XPATH = "//span[contains(text(),'Register')]";
	// Log in fields
	public static final String HOMEP_SIGNIN_XPATH = "//a[@class='login']";
	public static final String EMAIL_LOGIN_XPATH = "//input[@id='email']";
	public static final String PASSWORD_LOGIN_XPATH = "//input[@id='passwd']";
	public static final String SIGN_IN_XPATH = "//p[@class='submit']//span[1]";
	public static final String SIGN_OUT_LINK = "Sign out";

	// Method to click on Proceed to checkout button
	public static void clickProceed1(WebDriver wd) {
		wd.findElement(By.xpath(PROCEED_TO_CHECKOUT_BTN_XPATH)).click();

	}

	// Method to click on Proceed to checkout button2
	public static void clickProceed2(WebDriver wd) {
		wd.findElement(By.xpath(PROCEED_BTN2_XPATH)).click();

	}

	// Method to input email
	public static void sendkeysEmail(WebDriver wd, String email) {
		wd.findElement(By.xpath(EMAIL1)).sendKeys(email);
	}

	// Method to click on create account button
	public static void clickCreateAcc(WebDriver wd) {
		wd.findElement(By.xpath(CREATEACC_BTN_XPATH)).click();
	}

	// Method to click on gender
	public static void clickGender(WebDriver wd) {
		wd.findElement(By.xpath(MR_XPATH)).click();
	}

	// Method to input firstname
	public static void sendkeysFirstname1(WebDriver wd, String name) {
		wd.findElement(By.id(FIRSTNAME1_ID)).sendKeys(name);
	}

	// Method to input last name
	public static void sendkeysLastname1(WebDriver wd, String lastname) {
		wd.findElement(By.name(LASTNAME1_NAME)).sendKeys(lastname);
	}

	// Method to input password
	public static void sendkeysPassword(WebDriver wd, String pswd) {
		wd.findElement(By.id(PASSWORD_ID)).sendKeys(pswd);
	}

	// Method to select date of birth-day
	public static void selectDay(WebDriver wd, String number) {
		Select day = new Select(wd.findElement(By.id(DATE_OF_BIRTH_DAYS_ID)));
		day.selectByValue(number);

	}

	// Method to select date of birth-month
	public static void selectMonth(WebDriver wd, String numOfMonth) {
		Select month = new Select(wd.findElement(By.id(DATE_OF_BIRTH_MONTH_ID)));
		month.selectByValue(numOfMonth);

	}

	// Method to select date of birth-year
	public static void selectYear(WebDriver wd, int Year) {
		Select month = new Select(wd.findElement(By.id(DATE_OF_BIRTH_YEARS_ID)));
		month.selectByIndex(17);
	}

	// Method to input address
	public static void sendkeysAddress(WebDriver wd, String address) {
		wd.findElement(By.id(ADDRESS1_ID)).sendKeys(address);
	}

	// Method to input city
	public static void sendkeysCity(WebDriver wd, String city) {
		wd.findElement(By.id(CITY_ID)).sendKeys(city);
	}

	// Method to select state
	public static void selectState(WebDriver wd, String nameOfState) {
		Select state = new Select(wd.findElement(By.id(STATE_ID)));
		state.selectByVisibleText(nameOfState);
	}

	// Method to input postal code
	public static void sendkeysPostalCode(WebDriver wd, String zip) {
		wd.findElement(By.id(POSTAL_CODE_ID)).sendKeys(zip);
	}

	// Method to select country
	public static void selectCountry(WebDriver wd, String name) {
		Select country = new Select(wd.findElement(By.id(COUNTRY_ID)));
		country.selectByVisibleText(name);
	}

	// Method to input mobile phone
	public static void sendkeysMobile(WebDriver wd, String mobile) {
		wd.findElement(By.id(MOBILE_PHONE_ID)).sendKeys(mobile);
	}

	// Method to input alias
	public static void sendkeysAlias(WebDriver wd, String alias) {
		wd.findElement(By.id(ALIAS_ID)).clear();
		wd.findElement(By.id(ALIAS_ID)).sendKeys(alias);
	}

	// Method to click on REGISTER button
	public static void clickRegister(WebDriver wd) {
		wd.findElement(By.xpath(REGISTER_XPATH)).click();
	}

	// Method to log out
	public static void clickSignOut(WebDriver wd) {
		wd.findElement(By.linkText(SIGN_OUT_LINK)).click();
	}

	// Method to input email- Log in
	public static void sendkeysEmailLogin(WebDriver wd, String email) {
		wd.findElement(By.xpath(EMAIL_LOGIN_XPATH)).sendKeys(email);
	}

	// Method to input password- Log in
	public static void sendkeysPasswordLogin(WebDriver wd, String pass) {
		wd.findElement(By.xpath(PASSWORD_LOGIN_XPATH)).sendKeys(pass);
	}

	// Method to click sign in- Log in
	public static void clickSignIn(WebDriver wd) {
		wd.findElement(By.xpath(SIGN_IN_XPATH)).click();
	}

}
