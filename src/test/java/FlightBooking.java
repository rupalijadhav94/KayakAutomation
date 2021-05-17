import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlightBooking {
	WebDriver driver;
	@BeforeMethod
	public void startup() {
		 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver&browser\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.kayak.com/flights");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().deleteAllCookies();
		  
	}
@Test
public void Fbooking() throws InterruptedException {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	WebElement flight=driver.findElement(By.xpath("(//a[@href=\"/flights\"])[1]"));
	flight.click();
	driver.findElement(By.cssSelector("svg.vvTc-item-icon")).click();
	
	WebElement from=driver.findElement(By.xpath("//input[@placeholder=\"From?\"]"));
	from.sendKeys("Miami, Florida");
	WebElement startcity=driver.findElement(By.xpath("//span[contains(text(),\"Miami, Florida\")]"));
	startcity.click();
	WebElement to = driver.findElement(By.xpath("(//div[@class='d_E3']/div)[2]"));
	
	to.click();
	
	
	driver.findElement(By.xpath("//input[@class='k_my-input']")).sendKeys("mum");
      WebElement  dest= driver.findElement(By.xpath("(//span[contains(text(),'Mumbai, India')])"));
	   // WebElement mumbai=dest.get(11);
	   dest.click();
	 // WebElement start= driver.findElement(By.xpath("(//span[@aria-label=\"Decrement date by one day\"])[1]"));
	  //start.click();
	  //start.click();
	  driver.findElement(By.xpath("(//span[@class=\"cQtq-value\"])[1]")).click();
	  driver.findElement(By.xpath("//div[@aria-label=\"June 11, 2021\"]"));
	/*//driver.findElement(By.xpath("//div[@class=\"PDPe-from\"]")).click();
	  // WebElement startdate=driver.findElement(By.xpath("//div[@aria-label=\"June 11, 2021\"]"));
	  // startdate.sendKeys("11/06/2021");
		//js.executeScript("arguments[0].click();",startdate);
	   //driver.findElement(By.xpath("//div[@class=\"PDPe-to\"]")).click();

		//WebElement returndate=driver.findElement(By.id("\"aNK4-reurnDate\")"));
		///returndate.sendKeys("18/06/2021");
		//js.executeScript("arguments[0].click();",returndate);
	  WebElement end= driver.findElement(By.xpath("(//span[@aria-label=\"Decrement date by one day\"])[2]"));
	  end.click();
	  end.click(); */ 
    WebElement passengers=driver.findElement(By.xpath("(//*[@class=\"S9tW-chevron\"])[1]"));
    passengers.click();
   List<WebElement>st= driver.findElements(By.xpath("//button[@class=\"bCGf-mod-button-disabled\"]//following-sibling::button"));
	WebElement adult=st.get(0);
	adult.click();
	WebElement student=st.get(1);
	student.click();
	//step 3
	WebElement bag=driver.findElement(By.xpath("//div[@class='PLU8'][2]//span[2]"));
		
	
	js.executeScript("arguments[0].click();",bag);
	WebElement carryonbag=driver.findElement(By.xpath("(//div[@class=\"c7jfI-dropdownOptions\"]//button[@aria-disabled=\"false\"])[1]"));
	carryonbag.click();
	WebElement CheckedBag=driver.findElement(By.xpath("(//div[@class=\"c7jfI-dropdownOptions\"]//button[@aria-disabled=\"false\"])[2]"));
	CheckedBag.click();
	 WebElement search=driver.findElement(By.xpath("(//button[@type=\"submit\"])[1]"));
	 search.click();
 //
//	driver.findElement(By.cssSelector("(//button[@class=\"Button-No-Standard-Style close inside darkIcon \"])[2]")).click();
Thread.sleep(3000);
js.executeScript("window.scrollBy(300,500)");
	driver.findElement(By.xpath("//label[@id=\"c8c1i-info-leg-0-select-leg-checkbox-label\"]")).click();

	driver.findElement(By.xpath("(//div[@class=\"col-dropdown whisky-provider\"]//a)[1]")).click();
	//driver.switchTo().alert().dismiss();
    WebDriverWait wait=new WebDriverWait(driver, 50);
    //driver.navigate().refresh();
	//WebElement svg=driver.findElement(By.xpath("(//*[local-name()=\"path\"])[392]"));
	//driver.navigate().to("https://www.kayak.com/flightreservation?providerId=125&searchId=LdCCOPAlqm&resultId=2759c13f8662e80d9f8c22b809e383d4&clickId=PfT7MS7hnLvTR0LZ1GXUxg&subOptId=E-1560a1847f0&searchTime=1621018438298&providerCode=BA&adults=3&children=0&lapInfants=0&cabin=Economy&totalPrice=2478.96&curr=USD&_kw_pbranded=true");
	//js.executeScript("arguments[0].click();", svg);
	//wait.until(ExpectedConditions.elementToBeClickable(svg));
	//Actions action=new Actions(driver);
	//action.moveToElement(svg).click().build().perform();
	//svg.click();
	//driver.findElement(By.xpath("//a[@id='c4Vr_-mb-dd-E-1318a936e2b-booking-link']/span[2]")).click();
	
	//WebElement dropd=driver.findElement(By.xpath("//*[@id=\"u3U0-mb-dropdown\"]/div[3]"));
	//dropd.click();
	//driver.findElement(By.xpath("//a[@id=\"snUI-mb-dropdown\"]")).click();
	//THIS CODE IS FOR NEXT PAGE AFTER CLICKING ON THAT DROPDOWN
/*	WebElement contineuto=driver.findElement(By.xpath("(//span[text()=\"Continue to checkout\"])[1]"));
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
	*/
}
}
