package com.syntax.test;

import java.util.List;

import javax.xml.soap.Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class asosTest {

	public static void main(String[] args) {
		
		int totalLinkQuantity = 0;
		int count = 0;
		String linkText = "";
	
		System.setProperty("webdriver.chrome.driver", "/Users/natalia/eclipse-workspace/recapSelenium/src/test/resources/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.asos.com/us/women/");
		driver.manage().window().maximize();
		
		//add all links in to List
		List<WebElement> linkList =  driver.findElements(By.tagName("a"));
		
		totalLinkQuantity = linkList.size();
		
		//loop each link
		for(WebElement link: linkList) {
			
			linkText = link.getText();
			if(linkText.isEmpty()) {
				count ++;
			}else {
				System.out.println(link.getText());
			}
			
		}
		
		System.out.println("Total links quantity: " + totalLinkQuantity);
		System.out.println("Total broken links: " + count);
		
		driver.quit();

	}

}
