package WeRPlayAssignemnts;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Task1Arabic {
	
	WebDriver driver = null;
	String Email = "test0180@assignemnt.com";
	@BeforeTest
	
	public void setuptest()
	{
		
	     System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bilal's\\eclipse-workspace\\TestNG-Automation-Assignemnt\\geckodriver.exe");
	     driver = new FirefoxDriver();
	}
	
/*		@Test(priority=0)
	public void Signup() throws InterruptedException
	
	{
		
		driver.get("https://ar.ounass.ae/customer/register");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("onesignal-slidedown-cancel-button")).click();
		driver.findElement(By.name("firstName")).sendKeys("Test");
		driver.findElement(By.name("lastName")).sendKeys("Customer");
		driver.findElement(By.name("email")).sendKeys(Email);
		driver.findElement(By.name("password")).sendKeys("Asdf1@34");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[3]/div/div[2]/div[1]/form/button")).click();
		Thread.sleep(8000);
		
		
	}
	
	
	
	@Test(priority=1)
	public void EmailVerification() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.get("https://ar.ounass.ae/customer");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/div[2]/div[2]/div[4]/a")).click();
		Thread.sleep(5000);
		String text =	driver.findElement(By.name("email")).getAttribute("value");
		System.out.println(text);
		Assert.assertTrue(text.contains(Email));
	}
		
	@Test(priority=2)
public void FieldVerification()
	
	{
	String disable =	driver.findElement(By.name("email")).getAttribute("disabled");
		Assert.assertTrue(disable.contains(""));
		
	}*/
	
	
	
	@Test(priority=3)
	public void CartTask() throws InterruptedException
	
	{
		
		driver.get("https://ar.ounass.ae//men");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("onesignal-slidedown-cancel-button")).click();
		
		//((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 900)");
		
		//Opening First Product
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[4]/div/div[9]/div/div/div[1]/div[2]/div/a/img[2]")).click();
		
		//Getting Product Name
				String productname = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/div/div[2]/div[2]/div[2]")).getText();
				 System.out.println(productname);
		//Selecting Size
		WebElement selectMyElement = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/div/div[2]/div[2]/div[6]/div[1]/div/div[2]"));
		selectMyElement.click();
		Thread.sleep(4000);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN, Keys.ENTER)).perform();
		//Clicking on Add to Bag
		WebElement  element=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/div/div[2]/div[2]/div[6]/div[3]/button[1]"));  
	      JavascriptExecutor ex=(JavascriptExecutor)driver;
	      ex.executeScript("arguments[0].click()", element);
	      
	      
	      //Second Product
	      
	      driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/nav/a[4]")).click();
	      driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/div/div[3]/div[2]/div[3]/div[1]/div/a/img[2]")).click();
	      Thread.sleep(4000);
	      
	    //Getting Product Name
			String secondproductname = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/div/div[2]/div[2]/div[2]")).getText();
			 System.out.println(secondproductname);
	      
	      //Selecting Color
	      WebElement  element1=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/div/div[2]/div[2]/div[6]/div[1]/div[1]/div[2]/button[1]"));  
	      JavascriptExecutor ex1=(JavascriptExecutor)driver;
	      ex1.executeScript("arguments[0].click()", element1);
	      //Selecting Size
	      WebElement selectSize = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/div/div[2]/div[2]/div[6]/div[1]/div[2]/div[2]/div"));
			selectSize.click();
			Thread.sleep(4000);
			Actions keyDown1 = new Actions(driver); keyDown1.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN, Keys.ENTER)).perform();
			//Scrolling Down to view button
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 900)");
			//Adding Second Product to Bag
			WebElement  Bag2=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/div/div[2]/div[2]/div[6]/div[4]/button[1]"));  
		      JavascriptExecutor b2=(JavascriptExecutor)driver;
		      b2.executeScript("arguments[0].click()", Bag2);	
	      
	      
	      //OpeningCart Page
	      Thread.sleep(5000);
	      driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[4]/div/a")).click();
	      
	      //Checking if product 1 is in cart
	      
	      String productnamecart = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/div[2]/div/div[1]/div[2]/div/div[2]/h4/a")).getText();
	      System.out.println(productnamecart);
	      Assert.assertTrue(productnamecart.contains(productname));
	      
	      
	      //Checking if product 2 is in cart
	      
	      String secondproductnamecart = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/div[2]/div/div[1]/div[3]/div/div[2]/h4/a")).getText();
	      System.out.println(secondproductnamecart);
	      Assert.assertTrue(secondproductnamecart.contains(secondproductname));
	      
	      
	      
	}
	@Test(priority=4)
	public void Checkout() throws InterruptedException
	
	{
		//Going to Checkout
	      
	      WebElement  checkout=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/div[2]/div/div[2]/div[5]/div/div[2]/div[3]/a"));  
	      JavascriptExecutor chk=(JavascriptExecutor)driver;
	      chk.executeScript("arguments[0].click()", checkout);
	      Thread.sleep(7000);
	      
		//Filling out the Checkout Form
	      
		//driver.findElement(By.id("firstName")).sendKeys("Bilal");
		//driver.findElement(By.id("lastName")).sendKeys("Haider");
		//driver.findElement(By.id("email")).sendKeys(Email);
		driver.findElement(By.id("mobileNumber")).sendKeys("67324238");
		WebElement selectstate = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div[1]/form/section[1]/label[6]/div[1]/div"));
		selectstate.click();
		Thread.sleep(4000);
		Actions keyDown1 = new Actions(driver); keyDown1.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN, Keys.ENTER)).perform();
		driver.findElement(By.name("city")).sendKeys("Business Bay");
		driver.findElement(By.id("street")).sendKeys("Main Street");
		driver.findElement(By.id("additionalInformation")).sendKeys("appartment # 721");
		
		Thread.sleep(4000);
		
		//Clicked on Continue Button
		
		WebElement  chkcont=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div[1]/form/button"));  
	      JavascriptExecutor chkc=(JavascriptExecutor)driver;
	      chkc.executeScript("arguments[0].click()", chkcont);
		
	}
	
	@AfterMethod
	
	//Method to Take Screenshot in case of test Failure
	
	public void invokeScreenshotMethod(ITestResult res)
	{
	if (ITestResult.FAILURE==res.getStatus()){
	try{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);

	//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("./Screenshots/"+System.currentTimeMillis()+".png"));
	System.out.println("Screenshot taken");
	}
	
	catch (IOException e)
	 
	{
	 
	System.out.println(e.getMessage());
	 
	    }
	
	
	
	}}
	

 }
