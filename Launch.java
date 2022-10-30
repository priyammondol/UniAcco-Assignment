package seleniumwork;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.dataloader.impl.Assertions;

public class Launch {
@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\Java\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://unicreds.com/contact-us");
	      String ActualTitle = driver.getTitle();
	      String ExpectedTitle = "Contact Us | UniCreds";
	      Assert.assertEquals(ExpectedTitle, ActualTitle);
	      System.out.println("Title Matched");
	      boolean firstname = driver.findElement(By.xpath("//input[@placeholder=\"Full Name\"]")).isDisplayed();
	      Assert.assertEquals(firstname, true);
	      System.out.println("First name is present");
	      WebElement firstname1= driver.findElement(By.xpath("//input[@placeholder=\"Full Name\"]"));
	      firstname1.sendKeys("Alex Ryan");
	      boolean email = driver.findElement(By.xpath("//input[@placeholder=\"Email\"]")).isDisplayed();
	      Assert.assertEquals(email, true);
	      System.out.println("Email is present");
	      WebElement email1= driver.findElement(By.xpath("//input[@placeholder=\"Email\"]"));
	      email1.sendKeys("abc@xyz.com");
	      boolean countrycode = driver.findElement(By.xpath("//select[@class=\"p-2 pl-4 pr-4 m-2 mt-2 mb-2 form-control form-control-md\"]")).isEnabled();
	      Assert.assertEquals(countrycode, true);
	      System.out.println("Country Code is present");
	      boolean phone = driver.findElement(By.xpath("//input[@placeholder=\"Phone\"]")).isDisplayed();
	      Assert.assertEquals(phone, true);
	      System.out.println("Phone is present");
	      WebElement phone1= driver.findElement(By.xpath("//input[@placeholder=\"Phone\"]"));
	      phone1.sendKeys("1234567890");
	      boolean message = driver.findElement(By.xpath("//textarea[@placeholder=\"Message\"]")).isDisplayed();
	      Assert.assertEquals(message, true);
	      System.out.println("Message is present");
	      WebElement message1= driver.findElement(By.xpath("//textarea[@placeholder=\"Message\"]"));
	      message1.sendKeys("Hello");
	      boolean submit = driver.findElement(By.id("contactButton")).isEnabled();
	      Assert.assertEquals(submit, true);
	      System.out.println("Submit is present");
	      WebElement submit1= driver.findElement(By.id("contactButton"));
	      submit1.click();
	      String success = driver.findElement(By.xpath("//div[@id=\"formMessage\"]")).getText();
	      String ExpectedTitle2= "Message sent successfully!";
	      Assert.assertEquals(success, ExpectedTitle2);
	      System.out.println("Message sent successfully!");
	      driver.quit();
	      
	      
	      
	}

}
