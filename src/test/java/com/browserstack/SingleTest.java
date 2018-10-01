package com.browserstack;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SingleTest extends BrowserStackJUnitTest {

  @Test
  public void test() throws Exception {
    driver.get("https://browserstack.com");

	// Go To Login Page
    WebElement element = driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[6]/a"));
    element.sendKeys("BrowserStack");
    element.click();
    Thread.sleep(5000);

    assertEquals("Sign into the Best Browser Testing Tool", driver.getTitle());

	// Enter Details on Login Page
	WebElement email_input = driver.findElement(By.id("user_email_login"));
	email_input.sendKeys("dakshu.goyal@gmail.com");

	WebElement password_input = driver.findElement(By.id("user_password"));
	password_input.sendKeys("password");

	WebElement login_button = driver.findElement(By.id("user_submit"));
	login_button.click();



	// # check if the green top bar exists
	WebElement green_bar_exists = driver.findElement(By.xpath("//*[@id=\"content\"]/div[5]/a"));
	green_bar_exists.click();


	// ## Go to Product Menu
	WebElement product_menu = driver.findElement(By.id("product-menu-toggle"));
	product_menu.click();

	// # click on automate product
	WebElement automate_option = driver.findElement(By.xpath("//*[@id=\"product-menu-dropdown\"]/div[1]/ul[1]/li[3]/a/div[2]"));
	automate_option.click();


	// # check if the green top bar exists
	WebElement green_bar_exists_2 = driver.findElement(By.xpath("/html/body/div[3]/a"));
	green_bar_exists_2.click();


	WebElement element_name = driver.findElement(By.xpath("//*[@id=\"header\"]/header/div/div/div/nav/ul/li/a"));
	String elementText = element_name.getText();

	assertTrue(elementText.contains("Automate"));

  }
}
