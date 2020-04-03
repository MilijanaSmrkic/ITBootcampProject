package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objects.Registration;
import objects.SelectDress;
import utility.ExcelUtils;

public class LogIn_main_method {

	public static void main(String[] args) {
		// Purpose of this method is to sign in previously registrated users from excel
		// file

		// Purpose of this method is to input registration data from provided excel file

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver wd = new ChromeDriver();

		wd.get(Registration.registration_URL);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		ExcelUtils.setExcell("Registration_Data.xls");
		ExcelUtils.setWorkSheet(0);

		for (int i = 1; i < ExcelUtils.getRowNumber(); i++) {

			wd.get(Registration.registration_URL);
			wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			Registration.sendkeysEmailLogin(wd, ExcelUtils.getData(i, 0));
			Registration.sendkeysPasswordLogin(wd, ExcelUtils.getData(i, 3));
			Registration.clickSignIn(wd);
			Registration.clickSignOut(wd);

		}

		wd.quit();

	}

}
