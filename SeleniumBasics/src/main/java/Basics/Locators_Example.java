package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASHEENA-\\Desktop\\ChromeDriverFile\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        //driver.get("https://amazon.in");
        //Locator : Id
        WebElement emailid = driver.findElement(By.id("email"));  //by is a class, declare the web element
        emailid.click();// to identify the webelemt
        emailid.sendKeys("anju");
        
        //Locator : Name -> password field of facebook
        WebElement pwd=driver.findElement(By.name("password"));
		pwd.click();
		pwd.sendKeys("12333666");
        pwd.clear(); // to clear the field (password)
        
        //Locator : ClassName  -> Login button of facebook
        WebElement classfield=driver.findElement(By.className("class"));
		classfield.click();
		classfield.sendKeys("abchjk");
		
		/*WebElement username=driver.findElement(By.className("input field"));
		username.click();
		username.sendKeys("abchjk");*/
		
		//Locator : TagName
		

	}

}
