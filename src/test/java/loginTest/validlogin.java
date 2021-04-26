package loginTest;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import common.lib.browser;
import inputs.URL;
import locators.loginElements;

public class validlogin {
	//public static WebDriver driver;
	browser br=new browser();
	URL url=new URL();
	loginElements log= new loginElements();
	//TS1
	@Test(priority = 1)
	public void verify_URL_is_working_or_not() {
		
		br.chromeBrowser(url.amazon_URL);
		//verify
		assertEquals( br.driver.getCurrentUrl(),url.amazon_URL);
		
		
	}
	
	@Test(priority=2)
		public void without_username() throws InterruptedException 
		{
			String expetcedResult="Enter your email or mobile phone number";
			Thread.sleep(1000);
			
			br.driver.findElement(By.xpath(log.emailID)).sendKeys(url.withoutusername);//enter username
			Thread.sleep(1000);

			br.driver.findElement(By.xpath(log.continue_btn)).click();//click on login button
			
			WebElement actualResult_result =br.driver.findElement(By.xpath(log.without_username));//get web element content
			String actualResult=actualResult_result.getText().toString();// convert content into string
			System.out.println("Error Message"+actualResult);//print result
			Thread.sleep(200);
			
			Assert.assertEquals(actualResult , expetcedResult);//verify result
			
		}
	@Test(priority=3)
	  public void without_password() throws InterruptedException 
		{
			String expetcedResult="Enter your password";
			Thread.sleep(1000);
			br.driver.findElement(By.xpath(log.emailID)).sendKeys(url.username);//enter username
			Thread.sleep(1000);
			br.driver.findElement(By.xpath(log.continue_btn)).click();//click on login button
			Thread.sleep(1000);
			br.driver.findElement(By.xpath(log.password)).sendKeys(url.withoutpassword);//enter password
			Thread.sleep(1000);
			br.driver.findElement(By.xpath(log.login_Btn)).click();//click on login button
			
			WebElement actualResult_result =br.driver.findElement(By.xpath(log.without_password));//get web element content
			String actualResult=actualResult_result.getText().toString();// convert content into string
			System.out.println("Error Message"+actualResult);//print result
			Thread.sleep(200);
			
			Assert.assertEquals(actualResult , expetcedResult);//verify result
			
		}
	
//	 public void wrong_username() throws InterruptedException 
//		{
//			String expetcedResult="We cannot find an account with that email address";
//			Thread.sleep(1000);
//			br.driver.findElement(By.xpath(log.back)).click();//enter username
//			Thread.sleep(1000);
//			br.driver.findElement(By.xpath(log.emailID)).sendKeys(url.username);//enter username
//			Thread.sleep(1000);
//			br.driver.findElement(By.xpath(log.continue_btn)).click();//click on login button
//			Thread.sleep(1000);
//			
//			WebElement actualResult_result =br.driver.findElement(By.xpath(log.wrong_username));//get web element content
//			String actualResult=actualResult_result.getText().toString();// convert content into string
//			System.out.println("Error Message"+actualResult);//print result
//			Thread.sleep(200);
//			
//			Assert.assertEquals(actualResult , expetcedResult);//verify result
//			br.driver.close();
//		}
	
	@Test(priority=4)
	public void Verify_valid_cred() throws InterruptedException
	{
		String expectedResult="Your Account";//expected results
		Thread.sleep(1000);
//		br.driver.findElement(By.xpath(log.back)).click();//enter username
//		Thread.sleep(1000);
//		br.driver.findElement(By.xpath(log.emailID)).sendKeys(url.username);//enter username
//		Thread.sleep(1000);
//		br.driver.findElement(By.xpath(log.continue_btn)).click();//click continue button
//		Thread.sleep(1000);
		br.driver.findElement(By.xpath(log.password)).sendKeys(url.password);//enter password
		Thread.sleep(1000);
		br.driver.findElement(By.xpath(log.login_Btn)).click();//click on login button
		
		WebElement actualResult_result =br.driver.findElement(By.xpath(log.verificationText));//get web element content
		String actualResult=actualResult_result.getText().toString();// convert content into string
		System.out.println(actualResult);//print result
		Thread.sleep(200);
		
		Assert.assertEquals(actualResult, expectedResult);
		
	}
//	TS2
	@Test(priority=5)
	public void dashboard()throws InterruptedException
	{
	//checking whether dashboard button works
		String expetcedResult="Trending";
		Thread.sleep(1000);
		br.driver.findElement(By.xpath(log.dashboard_btn)).click();//click on dashboard button
		
		WebElement actualResult_result =br.driver.findElement(By.xpath(log.Trending));//get web element content
		String actualResult=actualResult_result.getText().toString();// convert content into string
		System.out.println("Error Message"+actualResult);//print result
		Thread.sleep(200);
		
		Assert.assertEquals(actualResult , expetcedResult);//verify result
		
	}
	//checking Amazon bestsellers page
	@Test(priority=6)
	public void dashboard1()throws InterruptedException
	{
		String expetcedResult="Amazon Bestsellers";
		Thread.sleep(1000);
		br.driver.findElement(By.xpath(log.bestseller_btn)).click();//click on bestsellers button
		Thread.sleep(1000);
		WebElement actualResult_result =br.driver.findElement(By.xpath(log.bestsellerverify));//get web element content
		String actualResult=actualResult_result.getText().toString();// convert content into string
		System.out.println("Error Message"+actualResult);//print result
		Thread.sleep(200);
		
		Assert.assertEquals(actualResult , expetcedResult);//verify result
		
	}
	//checking Amazons new release page
	@Test(priority=7)
	public void dashboard2()throws InterruptedException
	{
		String expetcedResult="Amazon Hot New Releases";
		Thread.sleep(1000);
		br.driver.findElement(By.xpath(log.dashboard_btn)).click();//click on login button
		Thread.sleep(1000);
		br.driver.findElement(By.xpath(log.newrelease_btn)).click();
		Thread.sleep(1000);
		WebElement actualResult_result =br.driver.findElement(By.xpath(log.newreleaseverify));//get web element content
		String actualResult=actualResult_result.getText().toString();// convert content into string
		System.out.println("Error Message"+actualResult);//print result
		Thread.sleep(200);
		
		Assert.assertEquals(actualResult , expetcedResult);//verify result
		
	}
	@Test(priority=8)
	//checking movers and shakers page
	public void dashboard3()throws InterruptedException
	{
		String expetcedResult="Amazon Movers & Shakers";
		Thread.sleep(1000);
		br.driver.findElement(By.xpath(log.dashboard_btn)).click();//click on login button
		Thread.sleep(1000);
		br.driver.findElement(By.xpath(log.movershaker_btn)).click();
		Thread.sleep(1000);
		WebElement actualResult_result =br.driver.findElement(By.xpath(log.movershakerverify));//get web element content
		String actualResult=actualResult_result.getText().toString();// convert content into string
		System.out.println("Error Message"+actualResult);//print result
		Thread.sleep(200);
		
		Assert.assertEquals(actualResult , expetcedResult);//verify result
		
	}
	@Test(priority=9)
	//checking your Account page
	public void dashboard4()throws InterruptedException
	{
		String expetcedResult="Your Account";
		Thread.sleep(1000);
		br.driver.findElement(By.xpath(log.dashboard_btn)).click();//click on login button
		Thread.sleep(1000);
		br.driver.findElement(By.xpath(log.youraccount_btn)).click();
		Thread.sleep(1000);
		WebElement actualResult_result =br.driver.findElement(By.xpath(log.youraccountverify));//get web element content
		String actualResult=actualResult_result.getText().toString();// convert content into string
		System.out.println("Error Message"+actualResult);//print result
		Thread.sleep(200);
		
		Assert.assertEquals(actualResult , expetcedResult);//verify result
		
	}
	//TS3	//verifying search button
	@Test(priority=10)
	public void search1() throws InterruptedException
//	//verify search for furniture
	{
		String expetcedResult="Lapdesks";
		
		Thread.sleep(1000);
		br.driver.findElement(By.xpath(log.search_btn)).click();//click on login button
		Thread.sleep(1000);
		br.driver.findElement(By.xpath(log.search_btn)).sendKeys(url.furniture);//enter phone
		Thread.sleep(1000);
		br.driver.findElement(By.xpath(log.search_icon)).click();//click on login button
		Thread.sleep(1000);
		WebElement actualResult_result =br.driver.findElement(By.xpath(log.furnitureverify));//get web element content
		String actualResult=actualResult_result.getText().toString();// convert content into string
		System.out.println("Error Message"+actualResult);//print result
		Thread.sleep(200);
		
		Assert.assertEquals(actualResult , expetcedResult);//verify result
			
	}
	@Test(priority=11)
	//verify search for bottles
	public void search2() throws InterruptedException
	{
		String expetcedResult="Water Bottles";
		
		Thread.sleep(1000);
		br.driver.findElement(By.xpath(log.search_btn)).click();//click on login button
		Thread.sleep(1000);
		br.driver.findElement(By.xpath(log.search_btn)).clear();
		br.driver.findElement(By.xpath(log.search_btn)).sendKeys(url.bottle);//enter phone
		Thread.sleep(1000);
		br.driver.findElement(By.xpath(log.search_icon)).click();//click on login button
		Thread.sleep(1000);
		WebElement actualResult_result =br.driver.findElement(By.xpath(log.bottleverify));//get web element content
		String actualResult=actualResult_result.getText().toString();// convert content into string
		System.out.println("Error Message"+actualResult);//print result
		Thread.sleep(200);
		
		Assert.assertEquals(actualResult , expetcedResult);//verify result
			
	}
	@Test(priority=12)
	//verify search for bags
	public void search3() throws InterruptedException
	{
		String expetcedResult="Laptop Backpacks";
		
		Thread.sleep(1000);
		br.driver.findElement(By.xpath(log.search_btn)).click();//click on login button
		Thread.sleep(1000);
		br.driver.findElement(By.xpath(log.search_btn)).clear();
		br.driver.findElement(By.xpath(log.search_btn)).sendKeys(url.bag);//enter phone
		Thread.sleep(1000);
		br.driver.findElement(By.xpath(log.search_icon)).click();//click on login button
		Thread.sleep(1000);
		WebElement actualResult_result =br.driver.findElement(By.xpath(log.bagverify));//get web element content
		String actualResult=actualResult_result.getText().toString();// convert content into string
		System.out.println("Error Message"+actualResult);//print result
		Thread.sleep(200);
		
		Assert.assertEquals(actualResult , expetcedResult);//verify result
			
	}
	@Test(priority=13)
	//verify search for books
	public void search4() throws InterruptedException
	{
		String expetcedResult="Books";
		
		Thread.sleep(1000);
		br.driver.findElement(By.xpath(log.search_btn)).click();//click on login button
		Thread.sleep(1000);
		br.driver.findElement(By.xpath(log.search_btn)).clear();
		br.driver.findElement(By.xpath(log.search_btn)).sendKeys(url.book);//enter phone
		Thread.sleep(1000);
		br.driver.findElement(By.xpath(log.search_icon)).click();//click on login button
		Thread.sleep(1000);
		WebElement actualResult_result =br.driver.findElement(By.xpath(log.bookverify));//get web element content
		String actualResult=actualResult_result.getText().toString();// convert content into string
		System.out.println("Error Message"+actualResult);//print result
		Thread.sleep(200);
		
		Assert.assertEquals(actualResult , expetcedResult);//verify result
			
	}
	@Test(priority=14)
	//verifying mobile phones
	public void search5() throws InterruptedException
	{
		String expetcedResult="Department";
		
		Thread.sleep(1000);
		br.driver.findElement(By.xpath(log.search_btn)).click();//click on login button
		Thread.sleep(1000);
		br.driver.findElement(By.xpath(log.search_btn)).clear();
		Thread.sleep(1000);
		br.driver.findElement(By.xpath(log.search_btn)).sendKeys(url.mobile);//enter phone
		Thread.sleep(1000);
		br.driver.findElement(By.xpath(log.search_icon)).click();//click on login button
		Thread.sleep(1000);
		WebElement actualResult_result =br.driver.findElement(By.xpath(log.mobileverify));//get web element content
		String actualResult=actualResult_result.getText().toString();// convert content into string
		System.out.println("Error Message"+actualResult);//print result
		Thread.sleep(200);
		
		Assert.assertEquals(actualResult , expetcedResult);//verify result
			
	}
	
	//TS4
	//verify orders and returns page
	@Test(priority=15)
	public void ordersandreturns() throws InterruptedException
	//verifying the orders and returns page
	{
		String expetcedResult="Your Orders";
		Thread.sleep(1000);
		br.driver.findElement(By.xpath(log.ordersnreturns_btn)).click();//click on login button
		WebElement actualResult_result =br.driver.findElement(By.xpath(log.ordersnreturnsverify));//get web element content
		String actualResult=actualResult_result.getText().toString();// convert content into string
		System.out.println("Error Message"+actualResult);//print result
		Thread.sleep(200);
		
		Assert.assertEquals(actualResult , expetcedResult);//verify result
	}
	@Test(priority=15)
	//archiving a cancelled order
	public void archiving() throws InterruptedException
	{
		String expetcedResult="Your order has been archived.";
		Thread.sleep(1000);
		br.driver.findElement(By.xpath(log.ordersnreturns_btn)).click();//click on login button
		Thread.sleep(1000);
		br.driver.findElement(By.xpath(log.cancelledorders)).click();
		Thread.sleep(1000);
		br.driver.findElement(By.xpath(log.archiveorder)).click();
		Thread.sleep(1000);
		br.driver.findElement(By.xpath(log.archive)).click();
		WebElement actualResult_result =br.driver.findElement(By.xpath(log.archiveverify));//get web element content
		String actualResult=actualResult_result.getText().toString();// convert content into string
		System.out.println("Error Message"+actualResult);//print result
		Thread.sleep(200);
		
		Assert.assertEquals(actualResult , expetcedResult);//verify result
		br.driver.close();	
	}
}

