package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundCheckboxes {

	public static void main(String[] args) {
		
				// call WDM
				WebDriverManager.chromedriver().setup();
						
						
				//launch URL
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://leafground.com/pages/checkbox.html");
				driver.manage().window().maximize();
				
				//Select the languages you know

				driver.findElement(By.xpath("//label[text()='Select the languages that you know?']/following::input")).click();
				
				//Confirm selenium is checked
				
				boolean isSelenium = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input")).isSelected();
				 if(isSelenium == true) {
					 System.out.println("Selenium is selected");
				 }
				 
				//Deselect only checked
				 driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following::input[2]")).click();
				
				
				//select all checkboxes
				 driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[1]")).click();
				 driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[2]")).click();
				 driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[3]")).click();
				 driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[4]")).click();
				 driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[5]")).click();
				 driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[6]")).click();						

				 
	}

}