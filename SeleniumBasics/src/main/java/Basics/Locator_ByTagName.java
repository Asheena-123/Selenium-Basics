package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_ByTagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASHEENA-\\Desktop\\ChromeDriverFile\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://amazon.in");
        WebElement AllDropdown = driver.findElement(By.tagName("Select")); 
        AllDropdown.click();

	}

}
