package com.TestNG;

import org.testng.annotations.Test;

public class TestNgBasics {
	
	
    @Test
	public void gmailAccount()
	{  
	System.out.println("RAM JI");
	}
    @Test(groups="facebook")
    public void facebook()
    {
    System.out.println("Shiv Shambho Ji");
    }
    @Test(groups="facebook")
    public void whatsapp() 
    {
    System.out.println("Om Sai Nath Ji");
    }
}
