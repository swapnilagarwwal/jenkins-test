package com.browserstack;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SingleScenario2Test extends BrowserStackJUnitTest {

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
	if(green_bar_exists.isDisplayed()) {
		green_bar_exists.click();	
	}
	
	// # check if the geo location is displayed
	// WebElement geo_location = driver.findElement(By.xpath("/html/body/div[1]/div/a"));
	// if(geo_location.isDisplayed() && geo_location.isVisible()) {
	// 	geo_location.click();	
	// }

	// ## Go to Product Menu
	WebElement product_menu = driver.findElement(By.id("product-menu-toggle"));
	product_menu.click();

	// # click on Live product
	WebElement live_option = driver.findElement(By.xpath("//*[@id=\"product-menu-dropdown\"]/div[1]/ul[1]/li[2]/a/div[1]"));
	live_option.click();


	// # check if the cross button for local testing popup appreas
	WebElement skip_local_installation = driver.findElement(By.id("skip-local-installation"));
	if(skip_local_installation.isDisplayed()) {
		skip_local_installation.click();
	}

	WebElement galaxy_tab_4_10_1 = driver.findElement(By.xpath("//*[@id=\"rf-browsers\"]/div[1]/div[2]/div[1]/div/ul/li[13]/a"));
	galaxy_tab_4_10_1.click();

	WebElement uc_browser = driver.findElement(By.xpath("//*[@id=\"rf-browsers\"]/div[1]/div[2]/div[1]/div/ul/li[13]/a/div[2]/button[4]/span[2]"));
	uc_browser.click();

	WebElement set_size = driver.findElement(By.xpath("//*[@id=\"getScreenSize\"]/div/div/a"));
	set_size.click();

	Thread.sleep(25000);

	WebElement dock = driver.findElement(By.id("dockHandle"));
	WebElement canvas = driver.findElement(By.id("flashlight-overlay-native"));
	assertTrue(canvas.isDisplayed() && canvas.isDisplayed());


  }
}
