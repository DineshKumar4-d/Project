package org.adac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KARTHIAKA-DINESH\\eclipse-workspace\\Junit\\driver\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("https://www.adactin.com/HotelApp/index.php");
	d.manage().window().maximize();
	WebElement email = d.findElement(By.id("username"));
	email.sendKeys("Dineshkumar95");
	WebElement pass = d.findElement(By.id("password"));
	pass.sendKeys("Welcome@1");
	WebElement login = d.findElement(By.id("login"));
	login.click();
	
	WebElement loc = d.findElement(By.id("location"));
	Actions a = new Actions(d);
	a.moveToElement(loc);
	WebElement location = d.findElement(By.xpath("//option[text()='Melbourne']"));
	location.click();
	WebElement htls = d.findElement(By.id("hotels"));
	a.moveToElement(htls);
	WebElement hotels = d.findElement(By.xpath("//option[text()='Hotel Hervey']"));
	hotels.click();
	WebElement rType = d.findElement(By.id("room_type"));
	a.moveToElement(rType);
	WebElement room = d.findElement(By.xpath("//option[text()='Deluxe']"));
	room.click();
	WebElement rNos = d.findElement(By.id("room_nos"));
	a.moveToElement(rNos);
	WebElement ppl = d.findElement(By.xpath("//option[text()='4 - Four']"));
	ppl.click();
	//WebElement date = d.findElement(By.id("datepick_in"));
	WebElement adl = d.findElement(By.xpath("//select[@id='adult_room']"));
	Select sec = new Select(adl);
	sec.selectByVisibleText("3 - Three");
	WebElement cRoom = d.findElement(By.xpath("//select[@id='child_room']"));
	Select sec2 = new Select(cRoom);
	sec2.selectByVisibleText("2 - Two");
	WebElement btnSearch = d.findElement(By.xpath("//input[@id='Submit']"));
	btnSearch.click();
	
	WebElement radBtn = d.findElement(By.id("radiobutton_0"));
	radBtn.click();
	
	WebElement cntnue = d.findElement(By.id("continue"));
	cntnue.click();
   WebElement fName = d.findElement(By.id("first_name"));
   fName.sendKeys("Dinesh Kumar");
   WebElement lName = d.findElement(By.id("last_name"));
   lName.sendKeys("GN");
   WebElement address = d.findElement(By.id("address"));
   address.sendKeys("No.1, new street,Washington,New York, 43215");
   WebElement ccNum = d.findElement(By.id("cc_num"));
   ccNum.sendKeys("6123456789101236");
   WebElement ccType = d.findElement(By.id("cc_type"));
   Select sec3 = new Select(ccType);
   sec3.selectByIndex(2);
   WebElement mnth = d.findElement(By.id("cc_exp_month"));
   Select sec4 = new Select(mnth);
   sec4.selectByIndex(9);
   WebElement year = d.findElement(By.id("cc_exp_year"));
   Select sec5 = new Select(year);
   sec5.selectByIndex(5);
   WebElement cvv = d.findElement(By.id("cc_cvv"));
   cvv.sendKeys("536");
   WebElement btnBook = d.findElement(By.id("book_now"));
   btnBook.click();
   WebElement orderNumber = d.findElement(By.id("order_no"));
   String text = orderNumber.getText();
   System.out.println(text);
}
}
