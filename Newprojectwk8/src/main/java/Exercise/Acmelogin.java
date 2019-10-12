package Exercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Acmelogin {
@Test
	public  void ACME()
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://acme-test.uipath.com/account/login");
		driver.findElementById("email").sendKeys("Kumar.testleaf@gmail.com");
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementByXPath("//*[@id=\'buttonLogin\']").click();
		WebElement elmt = driver.findElementByXPath("//*[@id='dashmenu']/div[5]/button");
		
Actions actions = new Actions(driver);
actions.moveToElement(elmt).perform();
driver.findElementByLinkText("Search for Vendor").click();
		driver.findElementByXPath("//*[@id=\'vendorName\']").sendKeys("Blue Lagoon");
		driver.findElementByXPath("//*[@id='buttonSearch']").click();
		String countryname = driver.findElementByXPath("//*[contains(text(),'Blue')]/following-sibling::td[4]").getText();
		System.out.println(countryname);
driver.findElementByLinkText("Log Out").click();
		
}}
