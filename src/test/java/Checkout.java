import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Checkout{
	WebDriver driver;
	@BeforeMethod
	public void initialize()
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver&browser\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.kayak.com/flightreservation?providerId=125&searchId=ITHiNW78YZ&resultId=fdb4f762231b11c1d9073355d420020d&clickId=RohRhT2Uw627Q6%24qOV8P5g&subOptId=E-15276ab8669&searchTime=1621259736392&providerCode=BA&adults=3&children=0&lapInfants=0&cabin=Economy&totalPrice=2410.26&curr=USD&_kw_pbranded=true");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().deleteAllCookies();
		  
	}
	  @Test
	  public void DetailsOfPassangers()
	  {
		  WebElement contineuto=driver.findElement(By.xpath("(//span[text()=\"Continue to checkout\"])[1]"));
			contineuto.click();
			
			WebElement firstname=driver.findElement(By.xpath("//input[@id=\"travelers[0].firstName\"]"));
			firstname.sendKeys("Rupali");
			WebElement middletname=driver.findElement(By.xpath("//input[@id=\"travelers[0].middleName\"]"));
			middletname.sendKeys("Venkatrao");
			WebElement lastname=driver.findElement(By.xpath("//input[@id=\"travelers[0].lastName\"]"));
			lastname.sendKeys("Venkatrao");
			WebElement DOB=driver.findElement(By.xpath("//input[@id=\"travelers[0].dobFull\"]"));
			DOB.sendKeys("11/11/1994");
			WebElement radiofemale=driver.findElement(By.xpath("(//span[@role=\"radio\"])[2]"));
			radiofemale.click();
			
			WebElement email=driver.findElement(By.xpath("//input[@id=\travelers[0].emailAddress\"]"));
			email.sendKeys("rupali@gmail.com");
			WebElement dropdown=driver.findElement(By.xpath("//select[@id=\"travelers[0].phoneCountryCodeISO\"]"));
			
			Select selectcode=new Select(dropdown);
			selectcode.selectByVisibleText("India +91");
			
			WebElement MobNo=driver.findElement(By.xpath("//input[@id=\"travelers[0].shortPhoneNumber\"]"));
			email.sendKeys("7754879878");
			
			WebElement Redress=driver.findElement(By.xpath("//input[@id=\"travelers[0].tsaRedressOptin\"]"));
			email.click();
			WebElement country=driver.findElement(By.xpath("//select[@id=\"travelers[0].countryOfResidence\"]"));

			Select selectcountry=new Select(country);
			selectcountry.selectByVisibleText("India");

	  }
}
