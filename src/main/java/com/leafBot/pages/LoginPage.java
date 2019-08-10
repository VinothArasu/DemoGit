package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	public LoginPage enterUserName(String data) {
		
		WebElement ele =  locateElement("Id","username");
		clearAndType(ele,data);
		return this;
//		click(ele);
	}
public LoginPage enterPassword(String data) {
		
		WebElement ele =  locateElement("Id","password");
		clearAndType(ele,data);
		return this;
//		click(ele);
	}

public HomePage clickSubmit() {
	
	WebElement ele =  locateElement("class","decorativeSubmit");
//	clearAndType(ele,data);
	click(ele);
	return new HomePage();
}



}
