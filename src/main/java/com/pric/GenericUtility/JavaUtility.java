package com.pric.GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;

public class JavaUtility {
	
	public String logindata() throws IOException 
	{
		Properties p=new Properties();
		FileInputStream fid=new FileInputStream(".\\PricTechnology.properties");
		p.load(fid);
		String data=p.getProperty("Key");
		return data;
	}
	
}
