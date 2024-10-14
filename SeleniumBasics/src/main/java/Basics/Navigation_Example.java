package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASHEENA-\\Desktop\\ChromeDriverFile\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.flipkart.com/"); // driver.get -> history is not saved,then waiting for page load
        // navigate will store the history
        driver.navigate().to("https://www.amazone.com/"); //to is method overloading
        //--> first loading the first url and loading to the second url
        driver.navigate().back();//back to the first url
        driver.navigate().forward();
        driver.navigate().refresh(); 
        driver.quit(); // terminate full
        driver.close();// terminate/close with the current tab only

	}

}
