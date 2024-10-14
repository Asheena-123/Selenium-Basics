package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class simple_Launge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASHEENA-\\Desktop\\ChromeDriverFile\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        String title=driver.getTitle();// pick the title -> application tab title
        System.out.println("Title");
        String currenturl=driver.getCurrentUrl(); //to get current url 
        System.out.println(currenturl);
        driver.get(currenturl); //refresh the current url 
        }

}
