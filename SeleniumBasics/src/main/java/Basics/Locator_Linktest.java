package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Linktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASHEENA-\\Desktop\\ChromeDriverFile\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
       /* WebElement forgottenpwsd = driver.findElement(By.linkText("Forgotten password?"));
        forgottenpwsd.click();*/
        WebElement password = driver.findElement(By.partialLinkText("Hai"));
        password.click();
	}

}
