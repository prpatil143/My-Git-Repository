package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG1 {


@Test(expectedExceptions=NumberFormatException.class)
public void facebookTest()
{
	int a=10;
	int b=5;
	int c=a+b;
	{System.out.println(c);
}

}
}
