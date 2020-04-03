package tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objects.Registration;
import utility.ExcelUtils;

public class Registration_main_method {

	public static void main(String[] args) {
		// Purpose of this method is to input registration data from provided excel file

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver wd = new ChromeDriver();

		wd.get(Registration.registration_URL);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		ExcelUtils.setExcell("Registration_Data.xls");
		ExcelUtils.setWorkSheet(0);

		for (int i = 1; i < ExcelUtils.getRowNumber(); i++) {
			wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			wd.get(Registration.registration_URL);

			Registration.sendkeysEmail(wd, ExcelUtils.getData(i, 0));
			Registration.clickCreateAcc(wd);

			Registration.clickGender(wd);
			Registration.sendkeysFirstname1(wd, ExcelUtils.getData(i, 1));
			Registration.sendkeysLastname1(wd, ExcelUtils.getData(i, 2));
			Registration.sendkeysPassword(wd, ExcelUtils.getData(i, 3));
			Registration.selectDay(wd, "5");
			Registration.selectMonth(wd, "1");
			Registration.selectYear(wd, 1990);
			Registration.sendkeysAddress(wd, ExcelUtils.getData(i, 4));
			Registration.sendkeysCity(wd, ExcelUtils.getData(i, 5));
			Registration.selectState(wd, "Massachusetts");
			String zip = ExcelUtils.getData(i, 6);
			Registration.sendkeysPostalCode(wd, zip);
			Registration.selectCountry(wd, "United States");
			Registration.sendkeysMobile(wd, ExcelUtils.getData(i, 7));
			Registration.sendkeysAlias(wd, ExcelUtils.getData(i, 8));
			Registration.clickRegister(wd);
			Registration.clickSignOut(wd);

		}

		wd.quit();

	}

}